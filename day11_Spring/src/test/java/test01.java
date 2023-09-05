import Service.GeneralService;
import Service.Impl.GeneralServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Descrip:
 * @Date :2023-05-28
 * @Time :17:54
 * @Author :Coder_Q
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class test01 {
    @Autowired
    private GeneralService generalService;

    @Test
    public void name() {
        generalService.serviceOne();
        System.out.println("============");
        generalService.serviceTwo();
    }
}
