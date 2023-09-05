package Bean;

import lombok.Data;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-18
 * @Time :15:30
 * @Author :Coder_Q
 */
@Data
public class Student {
    private Integer sId;
    private String sName;
    private Integer sAge;
    private String  sSex;
    private List<Course> courses;
    private List<Score> scores;
}
