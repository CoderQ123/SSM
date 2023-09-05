package Bean;

import lombok.Data;

/**
 * @Descrip:
 * @Date :2023-06-14
 * @Time :10:15
 * @Author :Coder_Q
 */
@Data
public class Address {
    private String province;
    private String city;

    private String street;

    public Address(String province, String city) {
        this.province = province;
        this.city = city;
    }

    public Address(String province, String city, String street) {
        this.province = province;
        this.city = city;
        this.street = street;
    }

    public Address() {
    }
}
