package com.wonders.ssmpdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * org.n3r.idworker 包 为源码导入
 */
@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan("com.wonders.ssmpdemo.mapper")
//扫描 所有需要的包, 包含一些自用的工具类包 所在的路径
@ComponentScan(basePackages = {"com.wonders.ssmpdemo","org.n3r.idworker"})
public class SsmpdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmpdemoApplication.class, args);
    }

}
