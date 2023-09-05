import Bean.employee;
import Mapper.EmployeeMapper;
import Utils.MyIterateList;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-23
 * @Time :10:38
 * @Author :Coder_Q
 */
public class test02 {
    @Test
    public void show1() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("appContext_01.xml");
        SqlSessionFactory sqlSessionFactory = classPathXmlApplicationContext.getBean("sqlSessionFactory", SqlSessionFactory.class);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<employee> all = mapper.getAll();
        MyIterateList.iterateList(all);
        sqlSession.close();
        classPathXmlApplicationContext.close();
        System.out.println("test02.show1");
    }
}
