package com.ruanyuan.pojo;

import java.math.BigInteger;

/**
 * @author 陈钰
 * @Date 2021/4/2 10:54
 * @Description 客户实体类
 * @Version 1.0
 */
public class Customer {
    /**
     * 编号
     */
    private BigInteger custId;
    /**
     * 客户姓名
     */
    private String custName;
    /**
     * 客户密码
     */
    private String custPassword;

    /**
     * 用户对象
     *
     */
    private User user;

    public BigInteger getCustId() {
        return custId;
    }

    public void setCustId(BigInteger custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustPassword() {
        return custPassword;
    }

    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custPassword='" + custPassword + '\'' +
                ", user=" + user +
                '}';
    }
}
