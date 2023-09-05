import Bean.Student;
import ConfigClass.applicationContext;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * @Descrip:
 * @Date :2023-05-28
 * @Time :16:04
 * @Author :Coder_Q
 */
public class test04 {
    @Test
    public void name() {
        //AnnotationConfigApplicationContext,注解类配置方式的容器
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(applicationContext.class);
        Object coderA = annotationConfigApplicationContext.getBean("student");
        System.out.println(coderA);
        annotationConfigApplicationContext.close();

    }

    @Test
    public void name1(){
        Integer a = 100;
        Integer b = 100;
        Integer c = 150;
        Integer d = 150;

        System.out.println(a == b);
        System.out.println(c == d);
    }
}
