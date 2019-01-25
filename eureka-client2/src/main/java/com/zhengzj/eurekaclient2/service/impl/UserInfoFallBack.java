package com.zhengzj.eurekaclient2.service.impl;

import com.zhengzj.eurekaclient2.service.UserInfoService;
import org.springframework.stereotype.Component;

/**
 * @Package com.zhengzj.eurekaclient2.service.impl
 * @Author zheng.zhijian
 * @Date 2019/1/25 14:15
 * @Description
 */
@Component
public class UserInfoFallBack implements UserInfoService {
    @Override
    public String login() {
        return "登录异常";
    }
}
