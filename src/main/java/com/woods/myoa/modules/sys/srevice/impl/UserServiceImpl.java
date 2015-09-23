package com.woods.myoa.modules.sys.srevice.impl;

import com.woods.myoa.modules.sys.dao.IUserDao;
import com.woods.myoa.modules.sys.entity.User;
import com.woods.myoa.modules.sys.srevice.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lin on 2015/9/23.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User getUserById(Integer id) {

        System.out.println("222");
        System.out.println("111");
        System.out.println("333");
        System.out.println("444");

        return this.userDao.selectByPrimaryKey(id);
    }
}
