package Bean;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-06-02
 * @Time :16:11
 * @Author :Coder_Q
 */
@Component
@Data
public class User {
    private String username;
    private String pwd;
    private List<String> hobby;
}
