package com.ruanyuan.test;

import com.ruanyuan.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * @author 陈钰
 * @Date 2021/3/24 9:00
 * @Description 测试类
 * @Version 1.0
 */
public class MyTest {
    /**
     * 测试方法
     */
    @Test
    public void test() {
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        // 获取AccountService实例
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        // 调用实例化中的转账方法
        accountService.transfer("张三", "李四", BigDecimal.valueOf(200));
        // 输出提示信息
        System.out.println("转账成功");
    }
}
