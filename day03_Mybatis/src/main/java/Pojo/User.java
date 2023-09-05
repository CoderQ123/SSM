package Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Descrip:
 * @Date :2023-05-15
 * @Time :17:08
 * @Author :Coder_Q
 */
@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String pwd;
    private String email;
}
