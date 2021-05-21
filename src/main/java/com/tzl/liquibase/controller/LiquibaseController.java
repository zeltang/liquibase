package com.tzl.liquibase.controller;

import com.tzl.liquibase.dao.LiquibaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping
@RestController
public class LiquibaseController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Resource
    private LiquibaseDao liquibaseDao;

    @RequestMapping("haha")
    public String test01 () {
//        Long count = jdbcTemplate.queryForObject("SELECT COUNT(1) FROM brand", Long.class);
        int i = liquibaseDao.selectCount();
        return String.valueOf(1)+"TZL";
    }
}
