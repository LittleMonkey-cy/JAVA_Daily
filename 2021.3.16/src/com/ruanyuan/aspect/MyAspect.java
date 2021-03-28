package com.ruanyuan.aspect;

/**
 * 切面类，可以同时存在多个通知Advice（增强方法）
 * 
 * @author 陈钰
 *
 */
public class MyAspect {
	/**
	 * 检查权限
	 */
	public void check_Permissions() {
		System.out.println("模拟前检查权限操作");
	}
	/**
	 * 日志
	 */
	public void log() {
		System.out.println("模拟日志操作");
	}

}
