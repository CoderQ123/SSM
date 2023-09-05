package Interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Descrip:
 * @Date :2023-06-14
 * @Time :16:50
 * @Author :Coder_Q
 */

public class sensitiveWord implements HandlerInterceptor {
    /**
     * 调用时机：当Handler方法被调用时执行
     * @param request current HTTP request  请求对象
     * @param response current HTTP response  响应对象
     * @param handler chosen handler to execute, for type and/or instance evaluation  当前方法对象
     * @return  true表示放行，false表示拦截
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("request = " + request + ", response = " + response + ", handler = " + handler);
        System.out.println("sensitiveWord.preHandle");
//        if(request.getParameter("User")==null)
//        {
//            request.getRequestDispatcher("/Ajax").forward(request,response);
//            return false;
//        }
        return true;
    }

    /**
     * 执行时机：当Handler方法执行完毕的时候
     * @param request current HTTP request  请求对象
     * @param response current HTTP response  响应对象
     * @param handler the handler (or {@link HandlerMethod}) that started asynchronous
     * execution, for type and/or instance examination  当前方法对象
     * @param modelAndView the {@code ModelAndView} that the handler returned
     * (can also be {@code null})   请求域的数据和逻辑视图名
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("request = " + request + ", response = " + response + ", handler = " + handler + ", modelAndView = " + modelAndView);
        System.out.println("sensitiveWord.postHandle");
        String message = (String) modelAndView.getModel().get("message");
        String newMessage = message.replaceAll("傻逼", "**");
        modelAndView.addObject("message",newMessage);
    }

    /**
     * 调用时机：当Handler方法执行完，视图解析器页面渲染完毕后，返回物理视图时候
     * @param request current HTTP request
     * @param response current HTTP response
     * @param handler the handler (or {@link HandlerMethod}) that started asynchronous
     * execution, for type and/or instance examination
     * @param ex any exception thrown on handler execution, if any; this does not
     * include exceptions that have been handled through an exception resolver
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("request = " + request + ", response = " + response + ", handler = " + handler + ", ex = " + ex);
        System.out.println("sensitiveWord.afterCompletion");
    }
}
