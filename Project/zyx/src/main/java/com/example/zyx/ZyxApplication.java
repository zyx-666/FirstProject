package com.example.zyx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan
@SpringBootApplication
public class ZyxApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZyxApplication.class, args);
    }

}
