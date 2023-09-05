package Bean;

import lombok.Data;

/**
 * @Descrip:
 * @Date :2023-05-21
 * @Time :16:59
 * @Author :Coder_Q
 */
@Data
public class questionPracticeDetail {
    private Integer id;
    private Integer deviceId;
    private Integer questionId;
    private String result;
    /**
     * 为什么，定义对象不定义集合，因为question表中的一条记录，对应userProfile中一条记录，取两表的deviceId;
     */
    private userProfile up;


}
