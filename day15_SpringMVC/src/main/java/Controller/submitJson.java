package Controller;

import Bean.Address;
import Bean.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Descrip:
 * @Date :2023-06-14
 * @Time :9:40
 * @Author :Coder_Q
 */
@Controller
@RequestMapping("/submit")
public class submitJson {
    @RequestMapping("/Json")
    @ResponseBody

    //接受前端发来的json数据，三种方式接受
    //①直接接受请求体的内容 @RequestBody
    //②用Map接受，必须加上@RequestBody  否则会出现自动装入的是请求对象 request
    //③用实体类接受，必须加上@RequestBody
    public void Json(@RequestBody String json){
        System.out.println("json = " + json);
        System.out.println("submitJson.Json");
    }


    @RequestMapping("/Json2")
    @ResponseBody
    public Address  Json2(@RequestBody Map map) throws JsonProcessingException {
        System.out.println("submitJson.Json2");
        String simpleName = map.getClass().getSimpleName();
        System.out.println("simpleName = " + simpleName);


        String addr = map.get("addr").getClass().getSimpleName();
        System.out.println("addr = " + addr);
        System.out.println("map     = " + map);

        Address address = new Address("江苏省","南京市");

        String s = new ObjectMapper().writeValueAsString(address);
        System.out.println("s = " + s);

        return address;
    }


    @RequestMapping("/Json3")
    @ResponseBody
    public void Json3(@RequestBody User user){
        System.out.println("user = " + user);
    }

}
