package com.ruanyuan.controller;

import com.ruanyuan.pojo.User;
import com.ruanyuan.service.UserService;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;

/** @author 陈钰 @Date 2021/4/9 14:50 @Description @Version 1.0 */
@Controller
public class FileController {
 @Resource
 UserService userService;
  /**
   * 批量上传
   *
   * @param
   * @param request 请求参数
   * @return 成功页面
   */
  @RequestMapping("/upload")
  public String upload(User user, HttpServletRequest request, Model model) throws Exception {
    System.out.println(request.getParameter("userName"));
    // 保存数据库的路径
    String sqlPath = null;
    // 定义文件保存的本地路径
    String localPath = "D:\\File\\";
    // 定义 文件名
    String filename = null;
    if (!user.getFile().isEmpty()) {
      // 生成uuid作为文件名称
      String uuid = UUID.randomUUID().toString().replaceAll("-", "");
      // 获得文件类型（可以判断如果不是图片，禁止上传）
      String contentType = user.getFile().getContentType();
      // 获得文件后缀名
      String suffixName = contentType.substring(contentType.indexOf("/") + 1);
      // 得到 文件名
      filename = uuid + "." + suffixName;
      System.out.println(filename);
      // 文件保存路径
      user.getFile().transferTo(new File(localPath + filename));
    }
    // 把图片的相对路径保存至数据库
    sqlPath = "/images/" + filename;
    System.out.println(sqlPath);
    user.setHeaderImage(sqlPath);
    user.setAddress(request.getParameter("address"));
    user.setUserName(request.getParameter("userName"));
    user.setPhone(request.getParameter("phone"));
    user.setUserPassword(request.getParameter("userPassword"));
    user.setUserCode(request.getParameter("userCode"));
    userService.saveUserInfo(user);
    model.addAttribute("user", user);
    return "success";
  }

  /**
   * 文件下载
   *
   * @param request 请求参数
   * @param filename 文件名
   * @return
   * @throws IOException
   */
  @RequestMapping("/download")
  public ResponseEntity<byte[]> fileDownLoad(HttpServletRequest request, String filename)
      throws IOException {
    // 定义文件上传的真实路径
    String realPath = request.getSession().getServletContext().getRealPath("/upload");
    // 创建文件对象
    File file = new File(realPath + File.separator + filename);
    // 对文件名进行编码，防止中文乱码
    filename = this.getFilename(request, filename);
    // 设置响应头
    HttpHeaders headers = new HttpHeaders();
    // 通知浏览器以下载的方式打开文件
    headers.setContentDispositionFormData("attachment", filename);
    // 定义以流的形式下载返回文件数据
    headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
    // 使用框架对象返回下载数据
    return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.OK);
  }

  public String getFilename(HttpServletRequest request, String filename)
      throws UnsupportedEncodingException {
    // IE不同版本User-Agent中出现关键字
    String[] IEBrowsKeyWords = {"MSIE", "Trident", "Edge"};
    // 获取请求头代理信息
    String userAgent = request.getHeader("User-Agent");
    for (String ieBrowsKeyWord : IEBrowsKeyWords) {
      // 循环遍历
      if (userAgent.contains(ieBrowsKeyWord)) {
        return URLEncoder.encode(filename, "UTF-8");
      }
    }
    // 谷歌等其他浏览器
    return new String(filename.getBytes("UTF-8"), "ISO-8859-1");
  }
}
