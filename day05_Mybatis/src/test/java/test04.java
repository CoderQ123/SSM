import Bean.questionPracticeDetail;
import Bean.userProfile;
import Mapper.QuestionMapper;
import Mapper.UserProfile;
import Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-20
 * @Time :18:39
 * @Author :Coder_Q
 */
public class test04 {
    @Test
    public void show1() {
        SqlSession sqlSession = MybatisUtils.openSession();
        QuestionMapper mapper = sqlSession.getMapper(QuestionMapper.class);
        List<questionPracticeDetail> userProfiles = mapper.getUserProfiles();
        userProfiles.get(0).getDeviceId();
        userProfiles.get(0).getUp();
//        List<questionPracticeDetail> userProfiles = mapper.getUserProfiles();
//        for (questionPracticeDetail userProfile : userProfiles) {
//            System.out.println(userProfile);
//            System.out.println();
//        }
        sqlSession.close();
    }

    @Test
    public void show2() {
        SqlSession sqlSession = MybatisUtils.openSession();
        UserProfile mapper = sqlSession.getMapper(UserProfile.class);
        List<userProfile> userByDeviceId = mapper.getUserByDeviceId(0);
        for (userProfile userProfile : userByDeviceId) {
            System.out.println(userProfile);
        }


        System.out.println("=============================");

        //一级缓存失效场景
        // 手动清空缓存    两个查询之间有DML语句   提交事务

//        sqlSession.clearCache();
        /*
        一级缓存：缓存在sqlSession对象中，范围：一次业务请求中，数据同sqlSession共存亡
        二级缓存：缓存在sqlSessionFactory对象中，范围：项目范围，数据同sqlSessionFactory共存亡
        查询以及load顺序：首先访问二级缓存，二级缓存没有，访问一级缓存，一级缓存没有访问数据库
        然后将数据库中的数据自动存在一级缓存中，当调用sqlSession.close()，一级缓存中的数据被同步到二级缓存


        * ==>  Preparing: select * from user_profile where device_id = ?
        ==> Parameters: 6543(Integer)
        <==    Columns: id, device_id, gender, age, university, gpa, active_days_within_30, question_cnt, answer_cnt
        <==        Row: 3, 6543, female, 20, 北京大学, 3.2, 12, 3, 30
        <==      Total: 1
        userProfile(id=3, deviceId=6543, gender=female, age=20, university=北京大学, gpa=3.2, activeDaysWithin30=12, questionCnt=3, answerCnt=30, qPD=null)
        =============================
        =============================
        userProfile(id=3, deviceId=6543, gender=female, age=20, university=北京大学, gpa=3.2, activeDaysWithin30=12, questionCnt=3, answerCnt=30, qPD=null)
        * */

        System.out.println("=============================");
        List<userProfile> userByDeviceId1 = mapper.getUserByDeviceId(0);
        for (userProfile userProfile : userByDeviceId1) {
            System.out.println(userProfile);
        }


        sqlSession.close();
    }
}
