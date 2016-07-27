package com.woods.myoa.shiro.chapter2;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lin on 2015/9/27.
 */
public class LoingLogoutTest {

    @Test
    public void testCustomReal(){

        //1.SecurityManager工厂，此处用ini文件舒适化SecurityManger
        Factory<SecurityManager> securityManagerFactory = new IniSecurityManagerFactory("classpath:shiro/shiro.ini");
        //2.得到SecurityManager实例，并绑定SecurityUtils
        SecurityManager securityManager = securityManagerFactory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        //3.得到subject及创建用户名/密码身份验证Token（即用户身份验证）
        Subject subject = SecurityUtils.getSubject();
        AuthenticationToken token = new UsernamePasswordToken("zhang", "123456");
        //4.登陆验证身份
        subject.login(token);
        //5.测试
        Assert.assertEquals(true, subject.isAuthenticated());
        //6.退出
        subject.logout();
    }

    @Test
    public void testHelloWorld(){

        //1.SecurityManager工厂，此处用ini文件初始化SecurityManager
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro/shiro.ini");
        //2.得到SecurityManager实例，并绑定给SecurityUtils
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        //3.得到Subject及创建用户名/密码身份验证Token（即用户身份验证）
        Subject subject = SecurityUtils.getSubject();
//        UsernamePasswordToken token = new UsernamePasswordToken("zhang", "");
        AuthenticationToken token = new UsernamePasswordToken("wang", "123456");
        try {
            //4、登录，即身份验证
            subject.login(token);

        } catch (AuthenticationException e) {
            //5、身份验证失败
        }

//        System.out.println(subject.isAuthenticated());
        Assert.assertEquals(true, subject.isAuthenticated());

        subject.logout();

    }


}
