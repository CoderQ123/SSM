package pojo;

import lombok.Data;

/**
 * @Descrip:
 * @Date :2023-05-15
 * @Time :9:59
 * @Author :Coder_Q
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
}
