package com.imooc;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @Author: 赵广来
 * @CreateDate: 2020/4/27 10:47
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test() {
        String name = "owen";
        String password = "123456";
        log.info("name:{},password:{}",name,password);
        log.debug("debug----------");
        log.info("info---------------");
        log.error("error-----------");
        log.warn("warn——---------");
    }

}
