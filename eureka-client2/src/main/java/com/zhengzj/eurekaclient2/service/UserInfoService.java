package com.zhengzj.eurekaclient2.service;

import com.zhengzj.eurekaclient2.service.impl.UserInfoFallBack;
import com.zhengzj.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Package com.zhengzj.eurekaclient2.service
 * @Author zheng.zhijian
 * @Date 2019/1/24 15:45
 * @Description
 */
@FeignClient(name = "eureka-client",fallback = UserInfoFallBack.class)
@Service
public interface UserInfoService {
    /**
     * 功能描述:登录验证
     * @param
     * @return java.lang.String
     * @author zheng.zhijian
     * @date: 2019/1/24 15:47
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    String login();
}
