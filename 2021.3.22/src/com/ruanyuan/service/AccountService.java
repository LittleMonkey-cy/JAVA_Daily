package com.ruanyuan.service;

import java.math.BigDecimal;

/**
 * @author 陈钰
 * @Date 2021/3/24 8:50
 * @Description
 * @Version 1.0
 */
public interface AccountService {
    /**
     * 转账
     * @param outUser 汇款人
     * @param inUser 收款人
     * @param money 收款金额
     */
    void transfer(String outUser, String inUser, BigDecimal money);
}
