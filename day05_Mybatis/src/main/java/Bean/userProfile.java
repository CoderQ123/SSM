package Bean;

import lombok.Data;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-19
 * @Time :10:46
 * @Author :Coder_Q
 */
@Data
public class userProfile {
    private Integer id;
    private Integer deviceId;
    private String gender;
    private Integer age;
    private String university;
    private Double gpa;
    private Integer activeDaysWithin30;
    private Integer questionCnt;
    private Integer answerCnt;
    private List<questionPracticeDetail> qPD;
}
