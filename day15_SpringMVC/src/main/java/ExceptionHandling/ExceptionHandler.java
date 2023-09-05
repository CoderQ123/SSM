package ExceptionHandling;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.constraints.Null;

/**
 * @Descrip:
 * @Date :2023-06-15
 * @Time :15:02
 * @Author :Coder_Q
 */
@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(value = ArithmeticException.class)
    @ResponseBody
    public String byZero(Exception e, Model model){
        System.out.println(e.getMessage());
        return e.getMessage();
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public String nullPointer(Exception e,Model model){
        System.out.println("ExceptionHandler.nullPointer");
        System.out.println(e);
        System.out.println(model.getAttribute("exception"));
        return e.getMessage();
    }
}
