package com.rickie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Starter
 *
 * @author Frank Zhang
 * (scanBasePackages = {"com.rickie","com.alibaba.cola"})
 */
@SpringBootApplication
@MapperScan({"com.rickie.customer","com.rickie.dbsdk"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
