package com.ruanyuan.service.impl;

import com.ruanyuan.dao.UserDao;
import com.ruanyuan.pojo.User;
import com.ruanyuan.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author 陈钰
 * @Date 2021/4/7 19:01
 * @Description
 * @Version 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public User login(User user) {
        User user1 = userDao.login(user);
        return user1;
    }
}
