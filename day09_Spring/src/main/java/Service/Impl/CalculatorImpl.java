package Service.Impl;

import Annotation.Lock;
import Service.Calculator;
import org.springframework.stereotype.Service;

/**
 * @Descrip:
 * @Date :2023-05-24
 * @Time :17:07
 * @Author :Coder_Q
 */
@Service(value = "cc")
public class CalculatorImpl implements Calculator{
    @Lock(releaseTime = 2)
    @Override
    public int add(int i, int j) throws ArithmeticException{
        System.out.println("CalculatorImpl.add");
        return i+j;
    }

    @Override
    public int sub(int i, int j) throws ArithmeticException{
        System.out.println("CalculatorImpl.sub");
        return i - j;
    }

    @Override
    public int div(int i, int j) throws ArithmeticException{
        System.out.println("CalculatorImpl.div");
        return i / j;
    }

    @Override
    public int mul(int i, int j) throws ArithmeticException{
        System.out.println("CalculatorImpl.mul");
        return i * j;
    }
}
