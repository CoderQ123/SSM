package FactoryBean;

import Bean.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Descrip:
 * @Date :2023-05-23
 * @Time :10:13
 * @Author :Coder_Q
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return User.getUser();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
