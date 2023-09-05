import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

/**
 * @Descrip:
 * @Date :2023-06-04
 * @Time :18:10
 * @Author :Coder_Q
 */
public class test {
    @Test
    public void show(){
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("1","jl");
        stringStringHashMap.put("2","jjj");
        System.out.println("stringStringHashMap = " + stringStringHashMap);
        System.out.println("===");
    }
}
