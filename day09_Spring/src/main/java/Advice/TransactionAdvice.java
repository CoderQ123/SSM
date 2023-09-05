package Advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Descrip:  使用SpringAop主要就是设计切面类，切面类的设计有以下几个注意点
 *          ①声明该类为切面类，@Aspect
 *          ②声明通知（非业务逻辑代码所在的函数）类型，即该段非业务逻辑代码插入到切入点前面还是后面
 *          前置通知，还是返回通知，异常通知，后置通知，@Before @AfterReturning @AfterThrowing  @After
 *          ③声明切入点，即该通知插入到哪段业务代码
 *          ④切面注解的开启
 *
 *
 * @Date :2023-05-25
 * @Time :10:38
 * @Author :Coder_Q
 */
//@Aspect
@Component
@Order(value = 1)
public class TransactionAdvice {
    @Around(value = "execution(* Service.Impl.CalculatorImpl.*(..))")
    public Object transaction(ProceedingJoinPoint proceedingJoinPoint){
        Object[] args = proceedingJoinPoint.getArgs();
        Object result = null;
        try{
            System.out.println("事务开启");
             result = proceedingJoinPoint.proceed(args);
             System.out.println("事务提交");
        }catch (Throwable e){
            System.out.println("事务回滚");
        }finally {
            System.out.println("资源关闭");
            if(result == null)return 0;
            else return result;
        }
    }

    public void transactionOpen(){
        System.out.println("事务开启");
    }
    public void transactionClose(){
        System.out.println("事务关闭");
    }
    public void transactionRollback(){
        System.out.println("事务回滚");
    }
    public void resourceClose(){
        System.out.println("资源关闭");
    }
}
