package Converters;

import Bean.Address;
import org.springframework.core.convert.converter.Converter;

/**
 * @Descrip:
 * @Date :2023-06-14
 * @Time :21:51
 * @Author :Coder_Q
 */
public class AddrConverter implements Converter<String,Address> {

    @Override
    public Address convert(String source) {
        System.out.println("source = " + source);
        String[] addr = source.split(",");
        Address address = new Address();
        address.setProvince(addr[0]);
        address.setCity(addr[1]);
        address.setStreet(addr[2]);
        return address;
    }
}
