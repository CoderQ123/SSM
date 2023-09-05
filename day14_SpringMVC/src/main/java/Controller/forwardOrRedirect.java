package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Descrip:
 * @Date :2023-06-03
 * @Time :22:31
 * @Author :Coder_Q
 */
@Controller
public class forwardOrRedirect {
    @RequestMapping(value = "/A/**")//注意**代表多层或者没有0层路径
    public String A(HttpServletRequest request){
        String username = request.getParameter("username");
        System.out.println("username = " + username);
        System.out.println("forwardOrRedirect.A");
        return "forward:" + "/B";
    }
    @RequestMapping(value = "/B")
    public String B(){
        System.out.println("forwardOrRedirect.B");
        return "redirect:" + "/C";
    }

    @RequestMapping(value = "/C")
    public String C(){
        System.out.println("forwardOrRedirect.C");
        return "index";
    }

}
