import Bean.User;
import Utils.MyIterateList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-26
 * @Time :9:50
 * @Author :Coder_Q
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:applicationContext.xml"})
public class test01 {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void show1() {
        String sql  = "select * from test1";
        List<User> query = jdbcTemplate.query(sql,
            (ResultSet resultSet, int i) -> {
                User user = new User();
                user.setId(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));
                user.setPwd(resultSet.getString(3));
                return user;
            }
        );
        MyIterateList.iterateList(query);
        System.out.println("===========");
    }
}
