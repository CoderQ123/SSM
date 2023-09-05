package Controller;

import Bean.Product;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-06-14
 * @Time :17:55
 * @Author :Coder_Q
 */
@Controller
@RequestMapping(value = "/binding")
public class BindingTest {
    @RequestMapping(value = "/test1")
    public String test1(Product product, BindingResult bindingResult){
        System.out.println("product = " + product);
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                String defaultMessage = fieldError.getDefaultMessage();
                System.out.println("defaultMessage = " + defaultMessage);
            }
        }
        return "error";
    }

}
