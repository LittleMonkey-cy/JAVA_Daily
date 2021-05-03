package com.ruanyuan.service.impl;

import com.ruanyuan.dao.UserDao;
import com.ruanyuan.pojo.User;
import com.ruanyuan.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author 陈钰
 * @Date 2021/4/9 19:01
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

    /**
     * 插入用户信息
     * @param user 用户对象
     * @return 插入条数记录
     */
    @Override
    public int saveUserInfo(User user) {
        int rows = userDao.insertUserInfo(user);
        return rows;
    }
}
