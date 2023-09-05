import Service.Calculator;
import Service.Impl.CalculatorImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import  Bean.*;
/**
 * @Descrip:
 * @Date :2023-05-24
 * @Time :15:10
 * @Author :Coder_Q
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:applicationContext.xml"})
public class test02 {
    @Autowired
    @Qualifier(value = "cc")
    //注意此处拿到的是目标类的代理对象，不能用实现类去接受，只能用接口去接受
    private Calculator calculator;

    @Test
    public void show1() {
        System.out.println("=============================");
        System.out.println("calculator = " + calculator);
        System.out.println(calculator.add(0, 2));
    }
}
