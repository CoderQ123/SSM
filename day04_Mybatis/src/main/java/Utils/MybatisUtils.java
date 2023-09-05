package Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Descrip:
 * @Date :2023-05-15
 * @Time :8:24
 * @Author :Coder_Q
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    }
    public static SqlSession openSession(){
        return sqlSessionFactory.openSession();
    }
    public static SqlSession openAutoSession(){
        return sqlSessionFactory.openSession(true);
    }
}
