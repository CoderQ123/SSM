package Bean;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;

/**
 * @Descrip:
 * @Date :2023-06-14
 * @Time :17:57
 * @Author :Coder_Q
 */
@Data
public class Product {
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;
    @NumberFormat(pattern = "###,###,###.###")
    private Double price;
}
