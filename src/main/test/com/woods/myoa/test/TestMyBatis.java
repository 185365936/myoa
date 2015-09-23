package com.woods.myoa.test;

import com.woods.myoa.modules.sys.entity.User;
import com.woods.myoa.modules.sys.srevice.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.annotation.security.RunAs;

/**
 * Created by lin on 2015/9/23.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {

    private static Logger logger = Logger.getLogger(TestMyBatis.class);

    @Resource
    private IUserService userService = null;

    @Test
    public void Test1(){

        User user = userService.getUserById(1);
        System.out.println("222");
        System.out.println("222");
        System.out.println("222");
        System.out.println("222");
        System.out.println("222");
        System.out.println("222");
        System.out.println("222");



        logger.info(user);

    }

    @Test
    public void Test(){
        System.out.println("222");
        System.out.println("222");
    }

}
