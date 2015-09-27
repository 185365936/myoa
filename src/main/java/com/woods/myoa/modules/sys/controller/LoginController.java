package com.woods.myoa.modules.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lin on 2015/9/25.
 */

@Controller
public class LoginController {

    @RequestMapping(value = "a")
    public String a(){

        return "/modules/sys/userInfo";
    }

}
