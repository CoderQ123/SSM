import Service.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Descrip:
 * @Date :2023-05-25
 * @Time :10:58
 * @Author :Coder_Q
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:applicationContext.xml"})
public class test03 {
    @Autowired
    private Calculator calculator;
    @Test
    public void show(){
        calculator.add(1,0);
    }
}
