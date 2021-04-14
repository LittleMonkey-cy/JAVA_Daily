package com.ruanyuan.mapper;

import java.util.List;

import com.ruanyuan.pojo.Customer;

/**
 * 接口类
 * @author 陈钰
 *
 */
public interface CustomerMapper {
	/**
     *根据id查询客户信息
     * @param id
     * @return
     */
    Customer getCustomerById(Integer id);
    /**
     * 查询所有客户信息
     * @return
     */
    List<Customer> getCustomers();
    /**
     * 	添加客户信息
     * @param customer 客户实体类
     */
    void insertCustomer(Customer customer);
    /**
     * 修改客户信息
     * @param customer
     * @return
     */
   int updateCustomerById(Customer customer);
   /**
    * 删除客户信息
    * @return
    */
   int deleteCustomerById(Integer id);

}
