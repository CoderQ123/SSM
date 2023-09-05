package PointCut;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @Descrip:
 * @Date :2023-05-24
 * @Time :17:58
 * @Author :Coder_Q
 */
public class CalculatorPointCut {
    @Pointcut(value = "execution(* Service.Impl.CalculatorImpl.*(..))")
    public void calculatorPointCut(){}
}
