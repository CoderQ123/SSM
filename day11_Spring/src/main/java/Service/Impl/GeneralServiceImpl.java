package Service.Impl;

import Service.GeneralService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Descrip:
 * @Date :2023-05-28
 * @Time :17:53
 * @Author :Coder_Q
 */
@Service
public class GeneralServiceImpl implements GeneralService {
    @Override
    public void serviceOne() {
        System.out.println("业务一......");
    }

    @Override
    public void serviceTwo() {
        System.out.println("业务二......");
    }
}
