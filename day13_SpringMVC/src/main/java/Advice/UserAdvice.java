package Advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Descrip:
 * @Date :2023-06-05
 * @Time :20:47
 * @Author :Coder_Q
 */
@Aspect
@Component
public class UserAdvice {
    @Before(value = "execution(* Service.addUserImpl.*(..))")
    public void before(){
        System.out.println("lkjklfds");
    }
    @After(value = "execution(* Service.addUserImpl.*(..))")
    public void after(){
        System.out.println("lkjdflsaj");
    }
}
