package Mapper;

import Pojo.User;

/**
 * @Descrip:
 * @Date :2023-05-15
 * @Time :17:09
 * @Author :Coder_Q
 */
public interface UserMapper {
    /**
     * 通过#{}方式传入参数
     * @param id
     * @return
     */
    User getUser(int id);

    /**
     * 通过${}方式传入参数
     * @param id
     * @return
     */
    User getUserById(int id);
    User addUser(User user);
}
