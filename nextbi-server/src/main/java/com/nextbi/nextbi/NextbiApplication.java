package com.nextbi.nextbi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nextbi.nextbi.dao")
public class NextbiApplication {
    public static void main(String[] args) {
        SpringApplication.run(NextbiApplication.class, args);
    }
}
