package com.hesen.usercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.hesen")
public class UsercenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsercenterApplication.class, args);
    }

}
