package com.ruanyuan.pojo;

import java.math.BigInteger;
import java.util.List;

/**
 * 订单表
 * @author 陈钰
 *
 */
public class Order {
	/**
	 * 主键编号
	 */
	private BigInteger id;
	/**
	 * 订单编号
	 */
	private String number;
	/**
	 * 用户外键
	 */
	private User user;
	/**
	 * 产品外键对象集合
	 */
	private List<Product> productList;
	/**
	 *getter & setter
	 */
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", number=" + number + ", user=" + user + ", productList=" + productList + "]";
	}
	
	
}
