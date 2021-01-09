package com.sgzs.jetkins.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2021/1/5 14:38
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "test";
    }


}
