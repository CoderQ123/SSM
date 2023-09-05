import Bean.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-22
 * @Time :22:44
 * @Author :Coder_Q
 */
public class test04 {
    @Test
    public void name() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext_07.xml");
        Bean.Test test = classPathXmlApplicationContext.getBean("test", Bean.Test.class);
        System.out.println(test.getData2() instanceof LinkedList);
        System.out.println("test = " + test);
        System.out.println("===========");
    }
}
