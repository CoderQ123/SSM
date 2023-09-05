package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Descrip:
 * @Date :2023-06-03
 * @Time :21:29
 * @Author :Coder_Q
 */
@Controller
public class ShareData {
    @Autowired
    private ServletContext servletContext;
    @RequestMapping(value = "/Request")
    public String requestData(HttpServletRequest req,
                              HttpSession session){
        req.setAttribute("request","请求域中的数据");
        session.setAttribute("session","会话域中的数据");
        servletContext.setAttribute("servletContext","全局域中的数据");
        return "ShareData";
    }
    @RequestMapping(value = "/Model")
    public String requestData(Model model,
                              HttpSession session){
        model.addAttribute("request","请求域中的数据");
        session.setAttribute("session","会话域中的数据");
        servletContext.setAttribute("servletContext","全局域中的数据");
        return "ShareData";
    }
    @RequestMapping(value = "/Map")
    public String requestData(Map map,
                              HttpSession session){
        map.put("request","请求域中的数据");
        session.setAttribute("session","会话域中的数据");
        servletContext.setAttribute("servletContext","全局域中的数据");
        return "ShareData";
    }
    @RequestMapping(value = "/ModelMap")
    public String requestData(ModelMap modelMap,
                              HttpSession session){
        modelMap.addAttribute("request","请求域中的数据");
        session.setAttribute("session","会话域中的数据");
        servletContext.setAttribute("servletContext","全局域中的数据");
        return "ShareData";
    }


    @RequestMapping(value = "/ModelAndView")
    public ModelAndView requestData(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("request","请求域中的数据");
        modelAndView.setViewName("ShareData");
        session.setAttribute("session","会话域中的数据");
        servletContext.setAttribute("servletContext","全局域中的数据");
        return modelAndView;
    }
}
