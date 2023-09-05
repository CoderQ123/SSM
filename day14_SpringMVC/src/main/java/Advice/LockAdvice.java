package Advice;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Descrip:
 * @Date :2023-08-04
 * @Time :7:17
 * @Author :Coder_Q
 */
@Aspect
@Component
public class LockAdvice {
    @Around("@annotation(Annotation.Lock)")
    public Object lock(ProceedingJoinPoint joinPoint){
        Object result = null;
        try{
            System.out.println("尝试加锁");
            Object[] args = joinPoint.getArgs();
            if(args[0].equals(0)){
                throw new Exception("加锁失败");
            }
            result = joinPoint.proceed(args);
            return result;


        }catch (Throwable e){
            return "lock fail";
        }finally {
            System.out.println("释放锁");
        }

    }


}
