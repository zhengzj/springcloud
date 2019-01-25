package com.zhengzj.eurekaclient2.controller;

import com.zhengzj.eurekaclient2.service.UserInfoService;
import com.zhengzj.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

/**
 * @Package com.zhengzj.eurekaclient2.controller
 * @Author zheng.zhijian
 * @Date 2019/1/24 15:49
 * @Description
 */
@RestController
public class LoginController {
    @Autowired
    private UserInfoService userInfoService;
  /*  @RequestMapping(value = "login",method = RequestMethod.GET)
    public String userLogin(){
        return "收到结果为："+userInfoService.login();
    }*/

    @RequestMapping(value = "/login2",method = RequestMethod.GET)
    public String userLogin(@RequestParam("userName")String userName,@RequestParam("password")String password){
        if("admin".equals(userName)&&"123456".equals(password)){
            return "Hello admin"+userInfoService.login();
        }else{
            return "fail"+userName;
        }
    }
    @RequestMapping(value = "/userLogin",method = RequestMethod.POST)
    public String userLogin2(@RequestBody User user){
        if("admin".equals(user.getUserName())&&"123456".equals(user.getPassword())){
            return "Hello"+user.getUserName()+userInfoService.login();
        }else{
            return "fail"+user.getUserName();
        }
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String userLogin2(){
        return userInfoService.login();
    }
}
