package Dao.Impl;

import Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Descrip:
 * @Date :2023-05-26
 * @Time :10:32
 * @Author :Coder_Q
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = false)
    @Override
    public void updateUsername(Integer id1, String username) {
        String sql = "update test1 set username = ? where id = ?";
        jdbcTemplate.update(sql,username,id1);
    }
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    @Override
    public int updatePwd(Integer id2, String pwd) {
        String sql = "update test1 set pwd = ? where id = ?";
        return jdbcTemplate.update(sql,pwd,id2);
    }

//    验证以下方法是以非事务方式执行，只会插入一条数据
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Override
    public void insertUser(String username, String pwd) {
        String sql =   "insert into test1 values (3,?,?)";
        jdbcTemplate.update(sql,username,pwd);
        System.out.println(1/0);
        jdbcTemplate.update(sql,username,pwd);
    }
}
