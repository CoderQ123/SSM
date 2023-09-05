package Bean;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @Descrip:
 * @Date :2023-05-22
 * @Time :22:28
 * @Author :Coder_Q
 */
@Data
public class Test {
    private User user;
    private String[] data1;
    private List<User> data2;
    private Map<String,User> data3;

}
