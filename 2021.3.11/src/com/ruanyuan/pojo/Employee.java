package com.ruanyuan.pojo;

import java.io.Serializable;

/**
 * 员工表
 * @author 陈钰
 *
 */
public class Employee implements Serializable{
	/**
	 * 实现序列化接口
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 编号
	 */
	private Integer id;
	private String lastName;
	/**
	 *	
	 *薪资
	 */
	private Float salary;
	/**
	 * 所属部门外键
	 */
	private Department deptment;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	
	public Department getDeptment() {
		return deptment;
	}
	public void setDeptment(Department deptment) {
		this.deptment = deptment;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastName=" + lastName + ", salary=" + salary + ", deptment=" + deptment + "]";
	}

	
}
