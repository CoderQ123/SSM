import Bean.Student;
import Mapper.StudentMapper;
import Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @Descrip:
 * @Date :2023-05-18
 * @Time :16:31
 * @Author :Coder_Q
 */
public class test01 {
    @Test
    public void show1() {
        SqlSession sqlSession = MybatisUtils.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student studentInfo = mapper.getStudentInfo(2);
        System.out.println(studentInfo);
        sqlSession.close();
    }
}
