package com.ruanyuan.controller;

import com.ruanyuan.pojo.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigInteger;

/**
 * @author 陈钰
 * @Date 2021/4/2 10:48
 * @Description
 * @Version 1.0
 */
@Controller
public class CustomerController {
    /**
     * 访问该页面
     * @return 注册页面
     */
    @RequestMapping("/register.html")
    public String toRegisther(){
        return "register";
    }

    /**
     * 接收数据
     * @param customer 客户对象
     * @return 成功界面
     */
    @PostMapping("/registerCustomer")
    public String registerCustomer(Customer customer){
    System.out.println(customer);
    return "success";
    }

    /**
     * 注册页
     * @return 成功页面
     */
    @RequestMapping("/tofindCustWithUser")
    public String tofindCustWithUser(){
        return "orderWithUser";
    }

    /**
     * 输出所接收的数据
     * @param customer
     * @return 成功页面
     */
    @PostMapping("/findCustWithUser")
    public String finCustWithUser(Customer customer){
        BigInteger custId = customer.getCustId();
        String username = customer.getUser().getUsername();
        System.out.println("客户编号："+custId+",用户名称"+username);
        return "success";
    }
}
