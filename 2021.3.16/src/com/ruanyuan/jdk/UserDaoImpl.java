package com.ruanyuan.jdk;
/**
 * 定义接口实现类
 * @author 陈钰
 *
 */
public class UserDaoImpl implements UserDao{
	
	@Override
	public void addUser() {
		System.out.println("添加用户");
	}

	@Override
	public void deleteUser() {
		System.out.println("删除用户");
	}

}
