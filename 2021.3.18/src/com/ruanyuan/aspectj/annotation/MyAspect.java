package com.ruanyuan.aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 切面类
 * 
 * @author 陈钰
 *
 */
@Aspect
@Component
public class MyAspect {
	// 定义切入点表达式
	@Pointcut("execution(* com.ruanyuan.aspectj.xml.*.*(..))")
	// 命名切入点
	private void myPointCut() {
	};

	/**
	 * 前置通知
	 * 
	 * @param joinPoint
	 */
	@Before("myPointCut")
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("模拟权限检查");
		System.out.println("目标类是:" + joinPoint.getTarget());
		System.out.println("增强处理的目标方法为：" + joinPoint.getSignature().getName());
	}

	/**
	 * 后置通知
	 */
	@After("myPointCut()")
	public void myAfterReturning(JoinPoint joinPoint) {
		System.out.println("模拟记录日志");
		System.out.println("目标类是:" + joinPoint.getTarget());
		System.out.println("增强处理的目标方法为：" + joinPoint.getSignature().getName());
	}
	/**
	 * 环绕通知
	 * @throws Throwable 
	 */
	@Around("myPointCut()")
	public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		// 开始
		System.out.println("环绕开始，模拟开启事务...");
		// 执行当前目标方法
		Object obj = proceedingJoinPoint.proceed();
		// 结束
		System.out.println("环绕结束模拟关闭事务");
		return obj;
	}
	/**
	 * 异常通知
	 */
	@AfterThrowing(value="myPointCut()",throwing="e")
	public void myAfterThrowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("异常通知："+"出错了"+e.getMessage());
	}
	/**
	 * 最终通知
	 */
	@After("myPointCut()")
	public void myAfter() {
		System.out.println("最终通知：模拟方法结束后的释放资源");
	}
}
