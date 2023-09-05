import Mapper.TestMapper;
import Mapper.UserMapper;
import Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @Descrip:
 * @Date :2023-05-16
 * @Time :9:05
 * @Author :Coder_Q
 */
public class test02 {
    @Test
    public void show1() {
        SqlSession sqlSession = MybatisUtils.openSession();
        TestMapper mapper = sqlSession.getMapper(TestMapper.class);
        Bean.Test test = new Bean.Test("hello", "jll");
        mapper.addTest(test);
        System.out.println(test.getId());
        sqlSession.commit();
        sqlSession.close();
    }
}
