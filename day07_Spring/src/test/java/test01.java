import Bean.User;
import Service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Descrip:
 * @Date :2023-05-22
 * @Time :15:40
 * @Author :Coder_Q
 */
public class test01 {
    @Test
    public void show1() {
        //1.创建容器对象
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext_01.xml");
        //2.获取容器中存储的对象
        User user = classPathXmlApplicationContext.getBean("user", User.class);
        System.out.println(user);
        //3.容器关闭
        classPathXmlApplicationContext.close();

        System.out.println("===========");
    }

    @Test
    public void show2() {
        //1.创建容器对象
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext_01.xml");
        //2.获取容器中bean
        /**
         * 三种方式获取容器中Bean对象
         * 当接口中有多个实现类，推荐第二种，
         *          第二种，通过name找到bean对象，并且强转成需要类型
         * 当接口中有一个实现类，推荐第三种
         *          第三种，通过接口的实现类类型去找Bean对象
         * 总结：使用第二种，可以应付任何场景,不管哪种方式获取Bean，前提是能获取唯一一个Bean，不能产生ambiguous
         */
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
        UserService userService1 = classPathXmlApplicationContext.getBean("userService", UserService.class);
        UserService userService2 = classPathXmlApplicationContext.getBean(UserService.class);

        //3.容器对象的关闭
        classPathXmlApplicationContext.close();
    }
}
