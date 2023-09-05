import com.mysql.cj.log.LogFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Descrip:
 * @Date :2023-05-17
 * @Time :10:06
 * @Author :Coder_Q
 */
public class test03 {
    public Logger logger = LoggerFactory.getLogger(test03.class);
    @Test
    public void show1() {
        logger.debug("debug信息");
        logger.info("Info信息");
        logger.warn("Warn信息");
        logger.error("Error信息");
        System.out.println("=============");
    }
}
