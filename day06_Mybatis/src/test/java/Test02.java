import Mapper.TestMapper;
import Utils.MyIterateList;
import Utils.MybatisUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-21
 * @Time :21:47
 * @Author :Coder_Q
 */
public class Test02 {
    @Test
    public void show1() {
        SqlSession sqlSession = MybatisUtils.openSession();
        TestMapper mapper = sqlSession.getMapper(TestMapper.class);
        List<Bean.Test> all = mapper.getAll();
        MyIterateList.iterateList(all);
        sqlSession.close();
        System.out.println("=========");
    }

    @Test
    public void show2() {
        SqlSession sqlSession = MybatisUtils.openSession();
        TestMapper mapper = sqlSession.getMapper(TestMapper.class);
        //分页本质就是字符串追加limit
        PageHelper.startPage(2,3);
        List<Bean.Test> all = mapper.getAll();
        PageInfo<Bean.Test> testPageInfo = new PageInfo<>(all);
        System.out.println("==========");
        System.out.println(testPageInfo.getPageNum());
        MyIterateList.iterateList(all);
        sqlSession.close();
        System.out.println("==========");
    }
}
