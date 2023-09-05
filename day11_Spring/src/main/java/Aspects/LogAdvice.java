package Aspects;

import org.springframework.stereotype.Component;

/**
 * @Descrip:
 * @Date :2023-05-28
 * @Time :17:38
 * @Author :Coder_Q
 */
@Component
public class LogAdvice {
    public void BeforeLog(){
        System.out.println("日志前置打印.....");
    }
    public void AfterReturn(){
        System.out.println("日志结束打印.....");
    }
}
