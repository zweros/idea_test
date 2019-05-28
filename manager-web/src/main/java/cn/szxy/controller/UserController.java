package cn.szxy.controller;

import cn.szxy.pojo.Users;
import cn.szxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    // 测试 工具 Tools -> HTTP Client ->  Test RESTful Client Web Service
    /**
     *  doGet 方法
     */
    @RequestMapping(value = "/doGet/{id}" , method=RequestMethod.GET)
    public String doGet(@PathVariable  String id){
        System.out.println("ok....."+id);
        return "ok";
    }

    /**
     *  doPost 方法
     */
    @RequestMapping(value="/doPost",method=RequestMethod.POST)
    public String doPost(Users user){
        System.out.println("ok...."+user);
        return "ok";
    }

    /**
     *  doPut 方法，用于更新某些信息
     */
    @RequestMapping(value="/doPut/{id}",method=RequestMethod.PUT)
    public String doPut(@PathVariable String id){
        System.out.println("ok..... put: "+id);
        return "ok";
    }

    /**
     *  doDelete 方法，用于删除某些信息
     */
    @RequestMapping(value="/doDelete/{id}",method=RequestMethod.DELETE)
    public String doDelete(@PathVariable String id){
        System.out.println("ok..... delete:"+id);
        return "ok";
    }
}


