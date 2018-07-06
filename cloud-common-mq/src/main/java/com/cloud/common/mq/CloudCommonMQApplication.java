package com.cloud.common.mq;

import com.cloud.common.util.EmptyChecker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Jon_China
 * @create 2018/7/6
 */
@SpringBootApplication
public class CloudCommonMQApplication {

    public static void main(String[] args) {
        if(EmptyChecker.isEmpty(System.getProperty("spring.profiles.active"))){
            System.setProperty("spring.profiles.active","dev");
        }
        SpringApplication.run(CloudCommonMQApplication.class, args);
    }
}
