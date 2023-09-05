package Controller;

import Bean.Address;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Descrip:
 * @Date :2023-06-14
 * @Time :21:45
 * @Author :Coder_Q
 */
@Controller
@RequestMapping(value = "/typeConverter")
public class TypeConverter {
    @RequestMapping(value = "/test1")
    @ResponseBody
    public String test1(@RequestParam Address addr){
        System.out.println("addr = " + addr);
        return "ok";
    }

}
