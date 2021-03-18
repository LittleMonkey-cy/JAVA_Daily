package com.ruanyuan.mapper;

import com.ruanyuan.pojo.Employee;
/**
 * 用户信息数据访问层
 * @author 陈钰
 *
 */
public interface EmployeeMapper {
	/**
	 * 根据员工编号查询员工信息
	 * @param id 员工编号
	 * @return
	 */
	 Employee getEmployeeByID(int id);
}
