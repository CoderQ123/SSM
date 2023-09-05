import Mapper.UserMapper;
import Pojo.User;
import Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-15
 * @Time :17:13
 * @Author :Coder_Q
 */
public class Test02 {
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //通过#{} 方式传入参数
        User user = mapper.getUser(2);
//        List<User> user = sqlSession.selectList("Mapper.UserMapper.getUser", "5 or 2 = 2");
        System.out.println(user);
        System.out.println("============");
        //通过${} 方式传入参数
//        User userById = mapper.getUserById(2);
        List<User> list = sqlSession.selectList("Mapper.UserMapper.getUserById", "2 or 2 = 2");
        System.out.println(list);
        sqlSession.close();
    }

    @Test
    public void testInsert(){
        SqlSession sqlSession = MybatisUtils.openAutoSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User b = mapper.addUser(new User(0, "CoderA", "lksdfk", "klsjdla"));
        System.out.println(b);
        sqlSession.close();
    }
}
