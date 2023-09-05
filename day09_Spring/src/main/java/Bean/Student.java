package Bean;

import lombok.Data;

/**
 * @Descrip:
 * @Date :2023-05-28
 * @Time :16:01
 * @Author :Coder_Q
 */
@Data
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    public Student(Integer id, String name,Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
