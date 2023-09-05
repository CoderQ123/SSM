import Service.addUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Descrip:
 * @Date :2023-06-05
 * @Time :20:50
 * @Author :Coder_Q
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class test {
    @Autowired
    private addUser add;

    @Test
    public void show1() {
        add.addUser();
    }
}
