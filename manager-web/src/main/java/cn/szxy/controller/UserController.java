package cn.szxy.controller;

import cn.szxy.pojo.Users;
import cn.szxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:wzer
 * @Date:2019/5/28
 * @Description:cn.szxy.controller
 * @Version:1.0
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    public String addUser(Users user){
        this.userService.addUser(user);
        return "ok";
    }
}
