package Mapper;

import Bean.*;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-19
 * @Time :10:56
 * @Author :Coder_Q
 */
public interface QuestionMapper {
    List<userProfile> getDetailByUniversity();
    List<questionPracticeDetail> getAllByDeviceId();

    List<questionPracticeDetail> getUserProfiles();


}
