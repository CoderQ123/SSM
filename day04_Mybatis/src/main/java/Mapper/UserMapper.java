package Mapper;

import Bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-16
 * @Time :8:07
 * @Author :Coder_Q
 */
public interface UserMapper {
    List<User> getAllUser();
    User getUser(@Param("column") String column, @Param("value") String value);
    int addUser(User user);
    int addUserRetKey(User user);
}
