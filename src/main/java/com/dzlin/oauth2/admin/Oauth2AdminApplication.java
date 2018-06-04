package com.dzlin.oauth2.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dzlin.oauth2.admin.mapper")
public class Oauth2AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2AdminApplication.class, args);
    }
}
