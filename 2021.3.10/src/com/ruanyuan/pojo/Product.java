package com.ruanyuan.pojo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/**
 * 产品实体类
 * @author 陈钰
 *
 */
public class Product {
	/**
	 * 编号id 主键
	 */
	private BigInteger id;
	/**
	 * 产品名称
	 */
	private String name;
	/**
	 * 价格 保留两位小数
	 */
	private BigDecimal price;
	/**
	 * 订单外键对象集合
	 */
	private List<Order> orderList;
	/**
	 * getter 和 setter
	 * @return
	 */
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	/**
	 * tostring
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", orderList=" + orderList + "]";
	}
	
	
}
