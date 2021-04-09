package com.ruanyuan.service;

import com.ruanyuan.pojo.Customer;

/**
 * 业务逻辑层接口
 * 
 * @author 陈钰
 *
 */
public interface CustomerService {
	 /**
     * 	添加客户信息
     * @param customer 客户实体类
     */
    void insertCustomer(Customer customer);
    /* 修改客户信息
    * @param customer
    * @return
    */
  int updateCustomerById(Customer customer);
	/**
	 * 删除客户信息
	 * @param id 客户编号
	 * @return
	 */
	int deleteCustomerById(Integer id); 
}