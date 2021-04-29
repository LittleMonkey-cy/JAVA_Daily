package com.ruanyuan.service;

import com.ruanyuan.pojo.User;

/**
 * @author 陈钰
 * @Date 2021/4/7 19:01
 * @Description
 * @Version 1.0
 */
public interface UserService {
    /**
     * 登录查询用户
     * @param user 用户对象
     * @return 对象集合
     */
    User login(User user);
}
