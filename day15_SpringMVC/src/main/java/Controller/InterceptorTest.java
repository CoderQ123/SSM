package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Descrip:
 * @Date :2023-06-14
 * @Time :16:46
 * @Author :Coder_Q
 */
@Controller
@RequestMapping(value = "/Interceptor")
public class InterceptorTest {
    @RequestMapping ("/test1")
    public String test1(Map map){
        map.put("message","你是个傻逼！");
        return "index";
    }
}
