package Service;

import org.springframework.stereotype.Component;

/**
 * @Descrip:
 * @Date :2023-06-05
 * @Time :20:46
 * @Author :Coder_Q
 */
@Component
public class addUserImpl implements addUser {
    @Override
    public void addUser() {
        System.out.println("添加成员");
    }
}
