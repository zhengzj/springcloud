package com.zhengzj.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package com.zhengzj.eurekaserver.controller
 * @Author zheng.zhijian
 * @Date 2019/1/24 15:23
 * @Description
 */
@RestController
public class UserInfoController {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "用户已验证";
    }
}
