import Pojo.soldier;
import Utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-14
 * @Time :10:06
 * @Author :Coder_Q
 */
public class Test01 {
    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<soldier> soldiers = sqlSession.selectList("soldierMapper.getAll");
        System.out.println(soldiers);
        System.out.println("========");
    }
    @Test
    public void test2() throws IOException {
        SqlSession sqlSession = MybatisUtils.openAutoSession();
        sqlSession.insert("soldierMapper.addSoldier",new soldier(null,"coderH","步枪"));
//        sqlSession.commit();

        System.out.println("=======");
    }

    @Test
    public void test3() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        sqlSession.delete("soldierMapper.deleteSoldier",8);
        sqlSession.commit();
        System.out.println("=============");
    }

    @Test
    public void test4() throws Exception{
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        sqlSession.update("soldierMapper.updateSoldier",new soldier(5,"CoderA","坦克"));
        sqlSession.commit();
    }
}
