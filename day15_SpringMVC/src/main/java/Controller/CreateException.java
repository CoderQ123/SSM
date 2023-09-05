package Controller;

import com.sun.media.jfxmediaimpl.HostUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Descrip:
 * @Date :2023-06-15
 * @Time :14:48
 * @Author :Coder_Q
 */
@Controller
@RequestMapping("/Exception")
public class CreateException {
    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        System.out.println(12/0);
        return "ok";
    }
    @RequestMapping("/test2")
    @ResponseBody
    public String test2(){
        String s = null;
        s.toString();
        return "ok";
    }
}
