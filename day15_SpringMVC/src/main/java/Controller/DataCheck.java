package Controller;

import Bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Descrip:
 * @Date :2023-06-15
 * @Time :10:13
 * @Author :Coder_Q
 */
@Controller
@RequestMapping("/DataCheck")
public class DataCheck {
    @RequestMapping("/test1")
    @ResponseBody
    public String test1(@Validated User user, BindingResult bindingResult){

        System.out.println("user = " + user);
        if(bindingResult.hasErrors())return "error";
        return "ok";
    }
}
