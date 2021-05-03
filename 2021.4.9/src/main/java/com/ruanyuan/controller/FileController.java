package com.ruanyuan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/** @author 陈钰 @Date 2021/4/8 7:30 @Description 文件上传控制层 @Version 1.0 */
@RestController
public class FileController {
  /**
   * 批量上传
   *
   * @param
   * @param request 请求参数
   * @return 成功页面
   */
  @RequestMapping("/upload")
  public String fileUpload(
      @RequestParam("name") String name,
      @RequestParam("uploadFile") List<MultipartFile> uploadFile,
      HttpServletRequest request) {
    //
    // 获取文件名
    // 如果文件名为空，直接跳转首页
    if (!uploadFile.isEmpty() && uploadFile.size() > 0) {
      // 循环输出上传文件
      for (MultipartFile file : uploadFile) {
        // 获取上传文件的原始名称
        String originalFilename = file.getOriginalFilename();
        // 设置上传文件的保存地址目录
        String realPath = request.getSession().getServletContext().getRealPath("/upload/");
        File filePath = new File(realPath);
        // 如果保存文件的地址不存在，就先创建目录
        if (!filePath.exists()) {
          filePath.mkdirs();
        }
        // 使用UUID重新命名上传文件的名称
        String newFileName = name + "_" + UUID.randomUUID() + "_" + originalFilename;
        try {
          file.transferTo(new File(realPath + File.separator + newFileName));
        } catch (IOException e) {
          e.printStackTrace();
          return "error";
        }
      }
      // 跳转到成功页面
      return "success";
    }
    return "error";
  }
}
