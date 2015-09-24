package com.woods.myoa.modules.sys.controller;

import com.woods.myoa.modules.sys.entity.User;
import com.woods.myoa.modules.sys.srevice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lin on 2015/9/24.
 */

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "findUserById")
    public String findUserById(){

        User user = userService.getUserById(1);

        System.out.println(user.getName());

        return "userInfo";
    }

}
