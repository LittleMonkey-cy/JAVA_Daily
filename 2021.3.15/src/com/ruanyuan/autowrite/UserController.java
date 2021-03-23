package com.ruanyuan.autowrite;



/**
 * 控制层
 * @author 陈钰
 *
 */
public class UserController {
	/**
	 * 添加私有属性
	 */	
	private UserService userService;
	/**
	 * 添加setter方法
	 * @param userService
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * 创建save()方法
	 */
	public void save() {
		// 调用service中方法
		userService.save();
		System.out.println("userController....save");
	}
}
