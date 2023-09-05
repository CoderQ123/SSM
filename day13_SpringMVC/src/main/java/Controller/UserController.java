package Controller;

import Bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


/**
 * @Descrip:
 * @Date :2023-06-02
 * @Time :12:27
 * @Author :Coder_Q
 */
@Controller
@RequestMapping(value = "/User")
public class UserController {

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    //测试一名多值，例如爱好
    //记住前端多选框提交的，后端用list接受，必须使用注解
    public String  demo1(List<String>  hobby, BindingResult bindingResult){
        System.out.println("UserController.test11111");
        if(bindingResult.hasErrors()){
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                String defaultMessage = fieldError.getDefaultMessage();
                System.out.println("defaultMessage = " + defaultMessage);
            }
        }

//        for (String s : hobby) {
//            System.out.println("s = " + s);
//        }
        System.out.println("hobby = " + hobby);
        return "index";
    }
    @RequestMapping(value = "/test2")
//    实体类接值，必须要求实体类中属性名 等于   请求参数名
    public String demo1(User user){
        System.out.println("user = " + user);

        return "index";
    }
}
