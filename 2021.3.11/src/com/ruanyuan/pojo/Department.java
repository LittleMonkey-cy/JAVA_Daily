package com.ruanyuan.pojo;

import java.io.Serializable;

/**
 * 部门表
 * @author 陈钰
 *
 */
public class Department implements Serializable{
	/**
	 * 实现序列化接口，为后续使用二级缓存做准备
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 部门编号
	 */
	private Integer did;
	/**
	 * 部门名称
	 */
	private Integer departName;
	/**
	 * getter和setter
	 */
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public Integer getDepartName() {
		return departName;
	}
	public void setDepartName(Integer departName) {
		this.departName = departName;
	}
	/**
	 * tostring
	 */
	@Override
	public String toString() {
		return "Department [did=" + did + ", departName=" + departName + "]";
	}
	
	
}
