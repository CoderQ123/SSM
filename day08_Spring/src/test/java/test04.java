import Bean.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Descrip:
 * @Date :2023-05-23
 * @Time :22:05
 * @Author :Coder_Q
 */
public class test04 {
    @Test
    public void show1() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("appContext_03.xml");
        Student student = classPathXmlApplicationContext.getBean("student", Student.class);
        System.out.println(student);
        classPathXmlApplicationContext.close();
        System.out.println("===========");
    }
}
