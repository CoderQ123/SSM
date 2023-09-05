import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Descrip:
 * @Date :2023-06-15
 * @Time :16:51
 * @Author :Coder_Q
 */
public class test1 {
    @Test
    public void show1() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\DELL\\Desktop\\SSM\\day15_SpringMVC\\src\\main\\webapp\\imgs\\picture1.png");
        byte[] bytes = new byte[]{1,2,3,4,5};
        fileOutputStream.write(bytes);
        fileOutputStream.close();
        System.out.println("hello");
    }

    @Test

    public void dummy() {
        System.out.println("hello");
        System.out.println("hello");
    }
}
