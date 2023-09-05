package Bean;

import lombok.Data;

/**
 * @Descrip:
 * @Date :2023-05-17
 * @Time :10:21
 * @Author :Coder_Q
 */
@Data
public class OrderItem {
    private Integer itemId;
    private String bookName;
    private Double price;
    private String imgPath;
    private Integer itemCount;
    private Double itemAmount;
    private Integer orderId;
}
