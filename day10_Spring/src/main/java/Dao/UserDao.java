package Dao;

/**
 * @Descrip:
 * @Date :2023-05-26
 * @Time :10:31
 * @Author :Coder_Q
 */
public interface UserDao {
    void updateUsername(Integer id1, String username);

    int updatePwd(Integer id2, String pwd);

    void insertUser(String username, String pwd);

}
