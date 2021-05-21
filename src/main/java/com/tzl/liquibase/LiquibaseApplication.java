package com.tzl.liquibase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tzl.liquibase.dao")
@SpringBootApplication
public class LiquibaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiquibaseApplication.class, args);
    }

}
