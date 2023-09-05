package Mapper;
import Bean.*;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-21
 * @Time :17:30
 * @Author :Coder_Q
 */
public interface questionDetailMapper {
    /**
     * 查看难度等级为"easy"的题目答错的用户信息
     * @return
     */
    public List<questionDetail> getEasyWrongUserInfo();
    public questionDetail getQuestionDetailById(Integer questionId);
}
