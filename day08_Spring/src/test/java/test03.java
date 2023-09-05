import Bean.employee;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Descrip:
 * @Date :2023-05-23
 * @Time :14:21
 * @Author :Coder_Q
 */
public class test03 {
    @Test
    public void show1() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("appContext_02.xml");
        employee employee = classPathXmlApplicationContext.getBean("employee", employee.class);
        System.out.println("employee = " + employee);
        System.out.println("==============");
        employee employee1 = classPathXmlApplicationContext.getBean("employee", employee.class);
        System.out.println("employee1 = " + employee1);
        classPathXmlApplicationContext.close();
    }
}
