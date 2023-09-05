package Bean;

import lombok.Data;

/**
 * @Descrip:
 * @Date :2023-05-16
 * @Time :9:00
 * @Author :Coder_Q
 */
@Data
public class Test {
    private String id;
    private String username;
    private String pwd;

    public Test(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }
}
