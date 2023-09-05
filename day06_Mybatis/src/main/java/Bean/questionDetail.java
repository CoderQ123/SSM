package Bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-21
 * @Time :16:59
 * @Author :Coder_Q
 */
@Data
public class questionDetail implements Serializable {
    private static final long serialVersionUID = -6849797542342467720L;
    private Integer id;
    private Integer questionId;
    private String difficultLevel;

    private List<questionPracticeDetail> questionPracticeDetails;
}
