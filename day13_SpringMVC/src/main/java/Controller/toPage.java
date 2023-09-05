package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Descrip:
 * @Date :2023-06-02
 * @Time :10:56
 * @Author :Coder_Q
 */
@Controller
public class toPage {
    @RequestMapping(value = "/index")
    public String toIndex(){
        System.out.println("toPage.toIndex");
        System.out.println(2/0);
//        返回值为网页的逻辑视图
        return "index";
    }
    @RequestMapping(value = "/test1")
    public String toTest1(){
        return "test1";
    }
    @RequestMapping(value = "/test2")
    public String toTest2(){
        return "test2";
    }
}
