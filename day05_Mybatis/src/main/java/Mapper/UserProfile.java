package Mapper;
import Bean.*;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-19
 * @Time :11:25
 * @Author :Coder_Q
 */
public interface UserProfile {
    List<userProfile> getUserProfile();
    List<userProfile> getUserByDeviceId(Integer deviceId);
}
