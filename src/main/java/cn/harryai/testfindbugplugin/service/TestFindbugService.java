package cn.harryai.testfindbugplugin.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestFindbugService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestFindbugService.class);

    public void print(String data) {
        String a_b = "a_b";
        LOGGER.info(a_b);
        LOGGER.info(data);

    }

    public void HE_ha() {
        String ABc = "1";
        System.out.println(ABc);
    }

    public void test1() {
        String a = "bob";
        a.replace('b', 'p');


        if (a.equals("pop")) {

            System.out.println(a);

        }

    }


}
