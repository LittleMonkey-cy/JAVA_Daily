package com.ruanyuan.dao;

import java.math.BigDecimal;

public interface AccountDao {
	/**
	 * 转账
	 * @param outUser 汇款人
	 * @param inUser 收款人
	 * @param money 收款金额
	 */
	void transfer(String outUser,String inUser,BigDecimal money);
}
