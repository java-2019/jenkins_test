package com.myboot.remote.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by majf
 * 2019/1/22 11:10
 */
@RestController
@RequestMapping(value = "/test")
public class Controller {


    /**
     * 测试jenkins构建
     */
    @RequestMapping(value = "/jenkins")
    public String test(){
        return "jenkins build SUCCESS";
    }
    }
