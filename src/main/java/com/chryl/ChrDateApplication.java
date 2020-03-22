package com.chryl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.chryl.mapper")
@SpringBootApplication
public class ChrDateApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChrDateApplication.class, args);
    }

}
