package com.ruanyuan.mapper;
/**
 * 部门信息数据访问层
 */
import com.ruanyuan.pojo.Department;

public interface DepartmentMapper {
	/**
	 * 根据部门编号查询
	 * @param id 部门编号
	 * @return
	 */
	Department getDepartmentByID(int id);
}
