package Advice;
import Annotation.Lock;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


/**
 * @Descrip:
 * @Date :2023-08-04
 * @Time :7:17
 * @Author :Coder_Q
 */
@Aspect
@Component
public class LockAdvice {
    @Around(value = "@annotation(Annotation.Lock)")
    public Object lock(ProceedingJoinPoint joinPoint){
        Object result = null;
        try{
            System.out.println("尝试加锁");
            Object[] args = joinPoint.getArgs();
            if(args[0].equals(0)){
                throw new Exception("加锁失败");
            }


            Class<?> clazz = joinPoint.getTarget().getClass();
            String methodName = joinPoint.getSignature().getName();
            Class<?>[] parameterTypes = ((MethodSignature) joinPoint.getSignature()).getMethod().getParameterTypes();
            Method method = clazz.getMethod(methodName, parameterTypes);
            Lock lock = method.getAnnotation(Lock.class);

            System.out.println("lock = " + lock);
            int i = lock.releaseTime();
            System.out.println(" releaseTime = " + i);
            result = joinPoint.proceed(args);


        }catch (Throwable e){
            e.printStackTrace();
        }finally {
            System.out.println("释放锁");
        }
        return result;
    }


}
