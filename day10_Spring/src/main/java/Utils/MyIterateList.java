package Utils;

import java.util.List;

/**
 * @Descrip:
 * @Date :2023-05-21
 * @Time :17:58
 * @Author :Coder_Q
 */
public class MyIterateList {
    public static <T> void iterateList(List<T> list){
        for (T o : list) {
            System.out.println(o);
            System.out.println("=================================");
        }
    }
}
