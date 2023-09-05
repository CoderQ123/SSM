import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @Descrip:
 * @Date :2023-05-17
 * @Time :10:11
 * @Author :Coder_Q
 */
@Slf4j
public class test04 {
    @Test
    public void show1() {
        log.debug("debug信息");
        log.info("info信息");
        log.warn("warn信息");
        log.error("error信息");
        System.out.println("===========");
    }
}

