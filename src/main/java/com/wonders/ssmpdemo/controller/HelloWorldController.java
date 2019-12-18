package com.wonders.ssmpdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：zj
 * @date ：Created in 2019/12/18 16:48
 * @description：测试springboot项目是否能正常启动
 * @modified By：
 * @version: $
 */

@Slf4j
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public Object index() {
        Map map = new HashMap();
        map.put("name","jack");
        map.put("pass","12345");

        log.info("==============>>注解方式打印日志<<===========");
        return map;
    }

}
