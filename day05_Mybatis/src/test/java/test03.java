import Bean.userProfile;
import Mapper.UserProfile;
import Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-19
 * @Time :21:39
 * @Author :Coder_Q
 */
public class test03 {
    @Test
    public void show1() {
        SqlSession sqlSession = MybatisUtils.openSession();
        UserProfile mapper = sqlSession.getMapper(UserProfile.class);
        List<userProfile> userProfile = mapper.getUserProfile();
        System.out.println(userProfile);
        sqlSession.close();
        System.out.println("=========");
    }
}
