import Bean.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Descrip:
 * @Date :2023-05-23
 * @Time :10:18
 * @Author :Coder_Q
 */
public class test01 {
    @Test
    public void show1() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext
                = new ClassPathXmlApplicationContext("appContext_01.xml");
        User user = classPathXmlApplicationContext.getBean("user", User.class);
        System.out.println(user);
        classPathXmlApplicationContext.close();
        System.out.println("============");
    }
}
