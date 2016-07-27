package com.woods.myoa.shiro.chapter2.realm.myrealm1;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * Created by lin on 2015/9/29.
 */
public class MyRealm1 implements Realm {

    @Override
    public String getName() {
        return "MyRealm1";
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        //仅支持UsernamePasswordToken类型的token
        return token instanceof UsernamePasswordToken;
    }

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String)token.getPrincipal();//得到用户名
        String password = new String((char[]) token.getCredentials());//得到用户密码
        if(!"zhang".equals(username)){
            throw new UnknownAccountException();//如果用户名不对
        }
        if(!"123456".equals(password)){
            throw new IncorrectCredentialsException();
        }
        //如果身份认证成功，返回AuthenticationInfo实现
        return new SimpleAuthenticationInfo(username, password, getName());
    }
}
