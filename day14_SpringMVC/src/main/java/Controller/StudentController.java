package Controller;

import Bean.Student;
import Bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Descrip:
 * @Date :2023-06-03
 * @Time :17:23
 * @Author :Coder_Q
 */
@Controller
@RequestMapping(value = "/Student")
public class StudentController {
    @GetMapping (value = "/{Id}")
    //①当使用路径传参的时候，需指明路径中哪个位置是参数,且需指定请求方式
    //②在形参中接受客户端传来的路径参数时，必须使用@PathVariable注解，当参数名和形参名不同时，需自己指定
    public String getStudent(@PathVariable(value = "Id") Integer id){
        System.out.println("StudentController.getStudent");
        System.out.println("id = " + id);
        return "index";
    }
    @PostMapping
    public String addUser(Student student){
        System.out.println("student = " + student);
        System.out.println("StudentController.addUser");
        return "index";
    }

    @PutMapping
    public String updateUser(Student student){
        System.out.println("StudentController.updateUser");
        return "index";
    }
}
