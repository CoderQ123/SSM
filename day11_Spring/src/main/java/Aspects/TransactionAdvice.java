package Aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Descrip:
 * @Date :2023-05-28
 * @Time :22:06
 * @Author :Coder_Q
 */
@Aspect
@Component
public class TransactionAdvice {
    @Pointcut(value = "execution(* Service.Impl.GeneralServiceImpl.*(..))")
    public void pointCut(){}
    @Before(value = "execution(* Service.Impl.GeneralServiceImpl.*(..))")
    public void beforeTransaction(){
        System.out.println("事务开启...");
    }
    @AfterReturning(value = "pointCut()")
    public void transactionSubmit(){
        System.out.println("事务提交...");
    }
    @AfterThrowing(value = "pointCut()")
    public void transactionRollback(){
        System.out.println("事务回滚...");
    }
    @After(value = "pointCut()")
    public void close(){
        System.out.println("资源关闭...");
    }
}
