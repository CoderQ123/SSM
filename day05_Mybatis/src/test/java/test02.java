import Bean.questionPracticeDetail;
import Bean.userProfile;
import Mapper.QuestionMapper;
import Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-19
 * @Time :11:10
 * @Author :Coder_Q
 */
public class test02 {
    @Test
    public void show1() {
        SqlSession sqlSession = MybatisUtils.openSession();
        QuestionMapper mapper = sqlSession.getMapper(QuestionMapper.class);
        List<userProfile> detailByUniversity = mapper.getDetailByUniversity();
        for(userProfile q : detailByUniversity){
            System.out.println(q);
            System.out.println();
        }
        sqlSession.close();
    }
}
