package Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @Descrip:
 * @Date :2023-05-24
 * @Time :8:10
 * @Author :Coder_Q
 */
@Repository(value = "addr")
public class Address {
    @Value("hb")
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}
