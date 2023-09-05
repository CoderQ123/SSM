package Service.Service;

import Dao.UserDao;
import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Descrip:
 * @Date :2023-05-26
 * @Time :10:32
 * @Author :Coder_Q
 */
//组件名字默认为类名首字母小写
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Transactional
    @Override
    public void update(Integer id1, String username, Integer id2, String pwd) {
        userDao.updateUsername( id1,username);

        userDao.updatePwd(id2,pwd);
    }
}
