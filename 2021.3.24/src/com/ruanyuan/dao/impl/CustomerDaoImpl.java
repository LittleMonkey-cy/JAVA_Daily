package com.ruanyuan.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.ruanyuan.dao.CustomerDao;
import com.ruanyuan.pojo.Customer;

/**
 * 定义接口实现类
 * @author 陈钰
 *
 */
public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao{
	/**
	 * 根据id查询客户信息
	 */
	@Override
	public Customer getCustomerById(Integer id) {
		String xmlPath="com.ruanyuan.pojo.CustomerMapper.getCustomerById";
		Customer customer = this.getSqlSession().selectOne(xmlPath, id);
		return customer;
	}

}
