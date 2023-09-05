import Bean.User;
import Mapper.UserMapper;
import Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-16
 * @Time :8:12
 * @Author :Coder_Q
 */
public class test01 {
    @Test
    public void show(){
        SqlSession sqlSession = MybatisUtils.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser = userMapper.getAllUser();
        System.out.println(allUser);
        sqlSession.close();
    }
    @Test
    public void show1(){
        SqlSession sqlSession = MybatisUtils.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUser("username", "admin1");
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void show2() {
        SqlSession sqlSession = MybatisUtils.openAutoSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User("CC","2222","lkjlf@lkcom"));
        sqlSession.close();
    }

    @Test
    public void show3() {
        SqlSession sqlSession = MybatisUtils.openAutoSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User("AA","222","se@llj.com");
        mapper.addUserRetKey(user);
        System.out.println(user.getId());
        sqlSession.close();
    }
}
