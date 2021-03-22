package com.ruanyuan.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

/**
 * 控制层
 * @author 陈钰
 *
 */
@Controller("userController")
public class UserController {
	/**
	 * 定义userService对象，使用注解@Resource注入
	 */
	@Resource(name="userService")
	private UserService userService;
	/**
	 * 重写userService接口中的保存方法
	 */
	public void save() {
		// 调用service中方法
		userService.save();
		System.out.println("userController....save");
	}
}
