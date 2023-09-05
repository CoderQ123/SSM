package Bean;

import lombok.Data;

/**
 * @Descrip:
 * @Date :2023-05-16
 * @Time :8:05
 * @Author :Coder_Q
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String pwd;
    private String email;

    public User() {
    }

    public User(String username, String pwd, String email) {
        this.username = username;
        this.pwd = pwd;
        this.email = email;
    }
}
