import Dao.UserDao;
import Service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Descrip:
 * @Date :2023-05-26
 * @Time :10:45
 * @Author :Coder_Q
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:applicationContext.xml"})
public class test02 {
    @Autowired
    private UserService userService;
    @Autowired
    private UserDao userDao;
    @Test
    public void show1() {
//        userService.update(1,"tttttt",2,"tttttt");
//
//        userDao.insertUser("aaaa","aaaa");
        int asdfasdf = userDao.updatePwd(3, "fdaf ");
        System.out.println(asdfasdf);
        System.out.println("=============");
    }
}
