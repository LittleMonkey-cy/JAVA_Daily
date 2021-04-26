package com.ruanyuan.pojo;

import java.math.BigInteger;

/** @author 陈钰 @Date 2021/4/2 11:07 @Description 用户实体类 @Version 1.0 */
public class User {
  /** 用户编号 */
  private BigInteger id;
  /** 用户名 */
  private String username;
  /** 密码 */
  private String password;
  /** 手机号 */
  private String phone;

  public User() {}

  public User(BigInteger id, String username, String password, String phone) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.phone = phone;
  }

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

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "User{"
        + "id="
        + id
        + ", username='"
        + username
        + '\''
        + ", password='"
        + password
        + '\''
        + ", phone='"
        + phone
        + '\''
        + '}';
  }
}
