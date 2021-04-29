package com.ruanyuan.dao;

import com.ruanyuan.pojo.User;

/**
 * @author 陈钰
 * @Date 2021/4/7 19:52
 * @Description 数据访问层接口
 * @Version 1.0
 */
public interface UserDao {
    /**
     * 根据用户名和密码进行查询
     * @param user 用户对象
     * @return 集合
     */
    User login(User user);
}
