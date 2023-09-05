import Bean.People;
import Bean.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Descrip:
 * @Date :2023-05-23
 * @Time :22:22
 * @Author :Coder_Q
 */
public class test05 {
    @Test
    public void show1() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("appContext_04.xml");
        People people = classPathXmlApplicationContext.getBean("people", People.class);
        System.out.println(people);
        classPathXmlApplicationContext.close();
        System.out.println("===========");
        System.out.println("========");
    }
}
