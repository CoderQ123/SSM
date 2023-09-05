import Bean.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Descrip:
 * @Date :2023-05-22
 * @Time :22:18
 * @Author :Coder_Q
 */
public class test03 {
    @Test
    public void show1() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext_05.xml");
        User user = classPathXmlApplicationContext.getBean("user", User.class);
        System.out.println("user = " + user);
        classPathXmlApplicationContext.close();

    }

    @Test
    public void show2() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext_06.xml");
        User user = classPathXmlApplicationContext.getBean("user", User.class);
        System.out.println("user = " + user);
        System.out.println("===========");
    }
}
