package com.ruanyuan.pojo;

import java.math.BigInteger;

/** @author 陈钰 @Date 2021/4/7 16:47 @Description 用户实体类 @Version 1.0 */
public class User {
  /** 用户编号 */
  private BigInteger userId;
  /** 用户用于登录的用户名 */
  private String userCode;
  /** 用户真实姓名 */
  private String userName;
  /** 用户密码 */
  private String userPassword;
  /** 用户权限 */
  private String userState;

  public BigInteger getUserId() {
    return userId;
  }

  public void setUserId(BigInteger userId) {
    this.userId = userId;
  }

  public String getUserCode() {
    return userCode;
  }

  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  public String getUserState() {
    return userState;
  }

  public void setUserState(String userState) {
    this.userState = userState;
  }

  @Override
  public String toString() {
    return "User [userId="
        + userId
        + ", userCode="
        + userCode
        + ", userName="
        + userName
        + ", userPassword="
        + userPassword
        + ", userState="
        + userState
        + "]";
  }
}
