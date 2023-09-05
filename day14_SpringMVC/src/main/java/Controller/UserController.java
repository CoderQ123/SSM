package Controller;

import Annotation.Lock;
import Bean.User;
import lombok.val;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Descrip:
 * @Date :2023-06-03
 * @Time :16:23
 * @Author :Coder_Q
 */
@Controller
@RequestMapping(value = "/User")
public class UserController {
    @ResponseBody
    @RequestMapping(value = "/addUser")
    public String addUser( User user, @RequestHeader(value = "Cookie") String Cookie){
        System.out.println("UserController.addUser");
        System.out.println("user = " + user);
        System.out.println("Cookie = " + Cookie );
        return "index";
    }
    @RequestMapping(value = "/deleteUser")
    public String deleteUser(Integer id){
        System.out.println("UserController.deleteUser");
        System.out.println("id = " + id);
        return "index";
    }
    @RequestMapping(value = "/updateUser")
    public String updateUser(User user){
        System.out.println("UserController.updateUser");
        System.out.println("user = " + user);
        return "index";
    }
    @RequestMapping(value = "/getUser")
    public String getUser(@RequestParam Integer id){
        System.out.println("UserController.getUser");
        System.out.println("id = " + id);
        return "index";
    }

    @Lock
    @ResponseBody
    @RequestMapping(value = "/submit")
    public String DoubleSubmit(@RequestParam int arg){
        return "hello"+arg;
    }


}
