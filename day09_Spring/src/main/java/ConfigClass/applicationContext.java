package ConfigClass;

import Bean.Student;
import Bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Descrip:
 * @Date :2023-05-27
 * @Time :21:58
 * @Author :Coder_Q
 */
@Configuration
@ComponentScan (basePackages = {"Bean"})
public class applicationContext {
    /**
     * 配置类中声明bean对象采用定义方法的方式
     * ①返回值类型为bean类类型
     * ②方法名随意，形参列表为空
     * ③方法体内为创建对象的方法
     * ④方法上方加@Bean标签
     */
    @Bean(name = "student")
    public Student getStudent(){
        Student coderA = new Student(1, "CoderA", 22);
        return coderA;
    }

}
