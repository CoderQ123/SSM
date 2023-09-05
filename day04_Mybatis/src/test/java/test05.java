import Bean.OrderItem;
import Mapper.OrderItemMapper;
import Utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-17
 * @Time :10:36
 * @Author :Coder_Q
 */
public class test05 {
    /**
     * 验证第一个为null的时候
     */
    @Test
    public void show() {
        SqlSession sqlSession = MybatisUtils.openSession();
        OrderItemMapper mapper = sqlSession.getMapper(OrderItemMapper.class);
        List<OrderItem> orderItem = mapper.getOrderItem(null, 100.0);
        System.out.println(orderItem);
        sqlSession.close();
    }
    /**
     * 验证第二个为null
     */
    @Test
    public void show2() {
        SqlSession sqlSession = MybatisUtils.openSession();
        OrderItemMapper mapper = sqlSession.getMapper(OrderItemMapper.class);
        List<OrderItem> orderItem = mapper.getOrderItem(2, null);
        System.out.println(orderItem);
        sqlSession.close();
    }

    @Test
    public void show3() {
        SqlSession sqlSession = MybatisUtils.openSession();
        OrderItemMapper mapper = sqlSession.getMapper(OrderItemMapper.class);
        List<OrderItem> orderItem = mapper.getOrderItem(null, null);
        System.out.println(orderItem);
        sqlSession.close();
    }
}
