package com.ruanyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/** @author 陈钰 @Date 2021/3/30 16:47 @Description 控制层类 @Version 1.0 */
@Controller
@RequestMapping("/user2")
public class UserController2 {
  @GetMapping("/toAddUser2")
  public String toAddUser() {
    return "user1";
  }

  @RequestMapping(value = "/toSuccess", method = RequestMethod.GET)
  public String toSuccess() {
    return "success";
  }

  @PostMapping("/addUser2")
  public String addUser(String username, String password) {
    // 输出接收到的值
    System.out.println("用户名：" + username + "密码：" + password);
    // 接收值
    String content = "用户名：" + username + "密码：" + password + "\n";
    // 创建文件
    File file = new File("E://userList.txt");
    if (!file.exists()) {
      try {
        file.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    } else {
      // 使用true，即进行append file
      FileWriter fileWriter = null;
      try {
        fileWriter = new FileWriter("E://" + file.getName(), true);
      } catch (IOException e) {
        e.printStackTrace();
      }
      // 写入文件
      try {
        fileWriter.write(content);
      } catch (IOException e) {
        e.printStackTrace();
      }
      // 刷新
      try {
        fileWriter.flush();
      } catch (IOException e) {
        e.printStackTrace();
      }
      // 关闭
      try {
        fileWriter.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    return "redirect:toSuccess";
  }
}
