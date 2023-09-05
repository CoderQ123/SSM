package Advice;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Descrip:
 * @Date :2023-06-05
 * @Time :19:08
 * @Author :Coder_Q
 */
@Aspect
@Component
public class ExceptionAdvice {
    @Before(value = "execution(* org.springframework.web.filter.CompositeFilter.doFilter(..))")
    public void test(){
        System.out.println("doFilter之前");
    }
    @AfterThrowing(value = "execution(* org.springframework.web.filter.CompositeFilter.doFilter(..))")
    public void exceptionHandler(){
        System.out.println("doFilter之后");
    }
}
