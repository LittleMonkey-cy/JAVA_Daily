package com.ruanyuan.autowrite;


/**
 * 接口实现类
 * @author 陈钰
 *
 */
public class UserDaoImpl implements UserDao{
	/**
	 * 	重写userDao中的保存方法
	 */
	@Override
	public void save() {
		System.out.println("userDaoImpl....save");
	}

}
