package Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * @Descrip:
 * @Date :2023-05-24
 * @Time :8:10
 * @Author :Coder_Q
 */
@Repository(value = "user")
//默认在IOC容器中调用空参构造器默认创建名为类名首字母小写的对象即  User user = new User();
//默认名为类名首字母小写，可以设置value属性自定义对象名
//等价于   <bean id = "user" class= "Bean.User">
public class User {
    //注意当采用注解的方式后，无需指定属性的getter和setter方法了，spring直接操作属性赋值
    @Value(value = "22")
    private Integer id;
    @Value("coderA")
    private String name;
    //@Resource注解是java提供的原生注解，
    // 当不指定参数的时候，默认通过byName方式自动装配，找不到的时候，通过byType方式自动装配，两种方式都找不到，报错
    //当指定参数的时候，根据参数查找，找不到报错
    @Resource(type = Address.class)
    private Address address;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
