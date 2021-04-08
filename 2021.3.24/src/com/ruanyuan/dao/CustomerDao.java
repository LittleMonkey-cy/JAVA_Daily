package com.ruanyuan.dao;

import com.ruanyuan.pojo.Customer;

/**
 * @author 陈钰
 * @Date 2021/3/24 16:45
 * @Description 接口
 * @Version 1.0
 */
public interface CustomerDao {
    /**
     *根据id查询客户信息
     * @param id
     * @return
     */
    Customer getCustomerById(Integer id);
}
