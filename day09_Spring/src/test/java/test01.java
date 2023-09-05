import Bean.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Descrip:
 * @Date :2023-05-24
 * @Time :8:24
 * @Author :Coder_Q
 */
public class test01 {
    @Test
    public void name() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = classPathXmlApplicationContext.getBean("uu", User.class);
        System.out.println("user = " + user);
        classPathXmlApplicationContext.close();
        System.out.println("=============");
    }
}
