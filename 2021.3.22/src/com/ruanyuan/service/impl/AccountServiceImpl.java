package com.ruanyuan.service.impl;

import com.ruanyuan.service.AccountService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author 陈钰
 * @Date 2021/3/24 8:53
 * @Description
 * @Version 1.0
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    /**
     * setter方法
     *
     * @param jdbcTemplate 模板
     */
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * 转账，使用@Transactional注解实现事务
     *
     * @param outUser 汇款人
     * @param inUser  收款人
     * @param money   收款金额
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
    @Override
    public void transfer(String outUser, String inUser, BigDecimal money) {
        // 收款时，收款用户的余额=现有余额+所汇金额
        jdbcTemplate.update("update customer set balance = balance + ? where username = ?", money, inUser);
        // 模拟系统运行时的突发性问题
//		 int i = 1/0;
        // 汇款是，汇款用户的鱼儿=现有金额-所汇金额
        jdbcTemplate.update("update customer set balance = balance - ? where username = ?", money, outUser);

    }
}
