package com.ruanyuan.pojo;

import java.math.BigInteger;
import java.util.List;

/**
 * 用户实体类
 * @author 陈钰
 *
 */
public class User {
	/**
	 * 主键
	 */
	private BigInteger id;
	/**
	 * 用户名
	 */
	private	 String username;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 用户订单
	 */
	private List<Order> orderList;
	/**
	 * getter 和setter
	 */
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", address=" + address + ", orderList=" + orderList + "]";
	}
	
	
}
