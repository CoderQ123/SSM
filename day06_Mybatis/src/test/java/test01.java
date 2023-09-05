import Bean.questionDetail;
import Mapper.questionDetailMapper;
import Utils.MyIterateList;
import Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-21
 * @Time :17:50
 * @Author :Coder_Q
 */
public class test01 {
    @Test
    public void show1() {
        SqlSession sqlSession = MybatisUtils.openSession();
        questionDetailMapper mapper = sqlSession.getMapper(questionDetailMapper.class);
        List<questionDetail> easyWrongUserInfo = mapper.getEasyWrongUserInfo();
        MyIterateList.iterateList(easyWrongUserInfo);
        System.out.println("===========");
        sqlSession.close();
    }

    @Test
    public void show2() {
        SqlSession sqlSession = MybatisUtils.openSession();
        questionDetailMapper mapper = sqlSession.getMapper(questionDetailMapper.class);
        questionDetail questionDetailById = mapper.getQuestionDetailById(113);
        System.out.println(questionDetailById);
        /**
         * 缓存机制：每次查询的时候，首先在二级缓存（sqlSessionFactory）中通过key查找结果，有，则返回结果
         *                      没有，在一级缓存（sqlSession）中通过key查找结果，有，则返回结果
         *                      没有，在数据库执行sql查询，然后（自动）将查找的结果保存到一级缓存，key值为当前的查询语句
         *                      当执行sqlSession.close()的时候，保存到二级缓存
         */
        sqlSession.close();
        System.out.println("=================");
        //此次执行是在二级级缓存中查找数据
        SqlSession sqlSession1 = MybatisUtils.openSession();
        questionDetailMapper mapper1 = sqlSession1.getMapper(questionDetailMapper.class);
        questionDetail questionDetailById1 = mapper1.getQuestionDetailById(113);
        System.out.println(questionDetailById1);
        questionDetailById1.setQuestionId(100);
        System.out.println(questionDetailById1);
        sqlSession1.close();
        System.out.println("============================");

        SqlSession sqlSession2 = MybatisUtils.openSession();
        questionDetailMapper mapper2 = sqlSession2.getMapper(questionDetailMapper.class);
        questionDetail questionDetailById2 = mapper2.getQuestionDetailById(113);
        System.out.println(questionDetailById2);
        sqlSession2.close();



    }
}
