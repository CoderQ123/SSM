package Advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Modifier;

/**
 * @Descrip: 1.切面类所涉及的注解@Aspect @Before @AfterReturning @AfterThrowing @After
 *          以及配置文件一个配置<aop:aspectj-autoproxy/>
 *          2.获取连接点（业务逻辑代码所在方法）的信息
 *          ①方法修饰符，方法名，形参列表，方法所属类
 *          ②返回值，抛的异常类型
 *          步骤，获取第①类的信息，在通知（非业务逻辑代码所在方法）的形参列表加入(JoinPoint joinPoint)[aspectJ包下的]
 *               获取第②类的信息，获取返回值，则在形参列表加入(JoinPoint joinPoint,Object result),且加入注解Returning = "result"
 *                              获取异常类型，则在形参列表加入(JoinPoint joinPoint,Throwable e),且加入注解Throwing = "e"
 *           使用SpringAOP关键点就是设计切面类
 * @Date :2023-05-24
 * @Time :17:09
 * @Author :Coder_Q
 */
//@Aspect  //声明这是一个切面类
@Component
public class LogAdvice {
    @Before(value = "PointCut.CalculatorPointCut.calculatorPointCut()")
    //表示该方法加在切入点方法之前
    public void logAfter(JoinPoint joinPoint){
        //1.获取权限修饰符
        int modifiers = joinPoint.getSignature().getModifiers();
        String modifier = Modifier.toString(modifiers);
        System.out.println("modifier = " + modifier);
        //2.获取方法名
        String methodName = joinPoint.getSignature().getName();
        System.out.println("methodName = " + methodName);
        //3.获取形参列表
        Object[] args = joinPoint.getArgs();
        System.out.println("arg0 = " + args[0]+"arg1 = " + args[1]);

        //4.获取方法所属的类
        String className = joinPoint.getTarget().getClass().getName();
        System.out.println("className = " + className);
        System.out.println("日志之前的工作");
    }
    @AfterReturning(value = "PointCut.CalculatorPointCut.calculatorPointCut()",returning = "result")
    //表示该方法加入切入点方法return之后
    public void logBefore(Object result){
        System.out.println("Result = "+ result);
        System.out.println("日志之后的工作");
    }
    @AfterThrowing(value = "PointCut.CalculatorPointCut.calculatorPointCut()",throwing = "e")
    public void logException(Throwable e){
        System.out.println("Throwable = "+e);
        System.out.println("异常日志信息");
    }
    @After(value = "PointCut.CalculatorPointCut.calculatorPointCut()")
    public void logFinal(){
        System.out.println("finally日志信息");
    }
}
