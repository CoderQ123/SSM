package Bean;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Descrip:
 * @Date :2023-06-14
 * @Time :10:05
 * @Author :Coder_Q
 */
@Data
public class User {
    @NotEmpty
    private String username;
    @Length(min = 6,max = 8)
    private String password;

    private Address addr;
    private List<String> hobby;
    private List<People> relatives;
}
