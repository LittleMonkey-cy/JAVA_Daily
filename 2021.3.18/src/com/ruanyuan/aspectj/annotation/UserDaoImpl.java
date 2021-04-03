package com.ruanyuan.aspectj.annotation;

public class UserDaoImpl implements UserDao{

	/**
	 * 添加方法
	 */
	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		// 检验错误异常
//		int i = 1/0
		System.out.println("添加方法");
	}
	/**
	 * 删除方法
	 */
	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("删除方法");
	}


}
