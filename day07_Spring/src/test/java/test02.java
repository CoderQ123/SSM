import Bean.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Descrip:
 * @Date :2023-05-22
 * @Time :17:25
 * @Author :Coder_Q
 */
public class test02 {
    @Test
    public void show1() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext_02.xml");
        User user1 = classPathXmlApplicationContext.getBean("user1", User.class);
        User user2 = classPathXmlApplicationContext.getBean("user2", User.class);
        User user3 = classPathXmlApplicationContext.getBean("user3", User.class);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        classPathXmlApplicationContext.close();
        System.out.println("===========");
    }

    @Test
    public void show2() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext_04.xml");
        User user = classPathXmlApplicationContext.getBean("user", User.class);
        System.out.println("user = " + user);
        User user1 = classPathXmlApplicationContext.getBean("user1", User.class);
        System.out.println("user1 = " + user1);
        classPathXmlApplicationContext.close();
        System.out.println("============");
    }
}
