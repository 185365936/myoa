package com.woods.myoa.modules.sys.controller;

import com.woods.myoa.modules.sys.entity.User;
import com.woods.myoa.modules.sys.srevice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import org.apache.log4j.Logger;

/**
 * Created by lin on 2015/9/24.
 */

@Controller
@RequestMapping(value = "/user")
public class UserController {

//    private static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "findUserById")
    public String findUserById(){

        User user = userService.getUserById(1);

        System.out.println(user.getName());
//        logger.info(JSON.toJSONString(user));
        return "/modules/sys/userInfo";

    }

}
