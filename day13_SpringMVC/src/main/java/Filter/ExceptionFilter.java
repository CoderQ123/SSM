package Filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Descrip:
 * @Date :2023-06-05
 * @Time :17:09
 * @Author :Coder_Q
 */
@Component
public class ExceptionFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter正在初始化....");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException {
        System.out.println("放行之前");
        try {
            filterChain.doFilter(servletRequest, servletResponse);
        } catch (Throwable e) {
            servletResponse.setContentType("text/html;charset=utf-8");
            servletResponse.getWriter().write("有异常产生@！");
            System.out.println(e.getMessage());
            System.out.println("产生了异常");
        }
        System.out.println("放行之后");
    }

    @Override
    public void destroy() {
        System.out.println("Filter正在销毁....");
    }
}
