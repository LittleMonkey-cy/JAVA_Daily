package com.ruanyuan.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * 业务逻辑层接口实现类
 * @author 陈钰
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService{
	/**
	 * 定义userDao对象，使用注解@Resource注入
	 */
	@Resource(name="userDao")
	private UserDao userDao;
	/**
	 * 重写userService中的save方法
	 */
	@Override
	public void save() {
		// 调用userDao中的save方法
		userDao.save();
		System.out.println("userServiceImpl....save");
	}

}
