package com.ruanyuan.autowrite;



/**
 * 业务逻辑层接口实现类
 * @author 陈钰
 *
 */
public class UserServiceImpl implements UserService{
	/**
	 * 添加私有属性userDao对象
	 */
	private UserDao userDao;
	/**
	 * 添加setter方法
	 * @param userDao
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

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
