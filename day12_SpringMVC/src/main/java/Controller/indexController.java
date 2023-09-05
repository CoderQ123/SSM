package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Descrip:
 * @Date :2023-05-30
 * @Time :13:01
 * @Author :Coder_Q
 */
@Controller
public class indexController {
    @RequestMapping(value = "/index")
    public String index(){
        System.out.println("indexController.index");
        return "index";
    }
}
