package Mapper;

import Bean.OrderItem;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-17
 * @Time :10:24
 * @Author :Coder_Q
 */
public interface OrderItemMapper {
    /**
     * 验证动态sql语句，有六种
     * 动态sql语句的执行本质就是sql拼接
     * ①where-if
     *      实现场景，查询where条件不定，根据接口传入参数判断选择
     * ②choose-when-otherWise
     * ③trim
     * ④set-if
     * ⑤forEach
     * ⑥sql片段
     */
     List<OrderItem> getOrderItem(Integer orderId, Double itemAmount);

}
