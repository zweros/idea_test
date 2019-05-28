package cn.szxy.controller;

import cn.szxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:wzer
 * @Date:2019/5/28
 * @Description:cn.szxy.controller
 * @Version:1.0
 **/
@Controller
public class PagesController  {

    @Autowired
    private UserService userService;

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

}
