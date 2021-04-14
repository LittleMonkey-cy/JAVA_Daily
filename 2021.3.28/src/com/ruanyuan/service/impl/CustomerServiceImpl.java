package com.ruanyuan.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ruanyuan.mapper.CustomerMapper;
import com.ruanyuan.pojo.Customer;
import com.ruanyuan.service.CustomerService;
import com.ruanyuan.service.InterviewService;
/**
 * 客户业务操作类
 * @author 陈钰
 *
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	/** 引用类型依赖注入，spring容器中的数据访问层对象 */
	@Resource
	private CustomerMapper customerMapper;
	@Autowired
	 private InterviewService interviewService;
	/**
	 * 删除客户信息
	 */
	@Override
	public int deleteCustomerById(Integer id) {
		int row;
		// 调用InterviewService中的方法，根据cust_id查找interview表中是否存在记录
		int row1 = interviewService.CountInterviewBycustId(id);
		// interview表中是否存在记录
		if (row1 > 0) {
			// 存在，先删除interview表中的记录
			System.out.println("interview表中存在记录");
			interviewService.deleteInterviewByCustId(id);
			System.out.println("根据cust_id成功删除interview表中的记录");
			// 再删除Customer表中的记录
			row = customerMapper.deleteCustomerById(id);
			System.out.println("根据cust_id成功删除Customer表中的记录");
		}else {
			System.out.println("interview表中无记录");
			// 删除Customer表中记录
			row = customerMapper.deleteCustomerById(id);
			System.out.println("根据cust_id成功删除Customer表中记录");
		}
		return row;
	}
	/**
	 * 添加客户信息
	 */
	@Override
	public void insertCustomer(Customer customer) {
		this.customerMapper.insertCustomer(customer);
		// 模拟异常
		 // int i=1/0;
	}
	/**
	 * 修改客户信息
	 */
	@Override
	public int updateCustomerById(Customer customer) {
		int row = this.customerMapper.updateCustomerById(customer);
		return row;
	}

}
