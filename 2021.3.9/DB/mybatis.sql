/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50732
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50732
File Encoding         : 65001

Date: 2021-03-09 19:19:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for idcode
-- ----------------------------
DROP TABLE IF EXISTS `idcode`;
CREATE TABLE `idcode` (
  `id` bigint(32) unsigned NOT NULL AUTO_INCREMENT,
  `code` varchar(32) DEFAULT NULL COMMENT '身份证号',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of idcode
-- ----------------------------
INSERT INTO `idcode` VALUES ('1', '1303565589665493122', null, '2021-03-09 14:37:45');
INSERT INTO `idcode` VALUES ('2', '13022320025659965544', null, '2021-03-09 14:37:55');
INSERT INTO `idcode` VALUES ('3', '110233565468985552', null, '2021-03-09 14:38:09');
INSERT INTO `idcode` VALUES ('4', '110236554698555421', null, '2021-03-09 14:38:24');
INSERT INTO `idcode` VALUES ('5', '120336597445668552', null, '2021-03-09 14:38:37');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` bigint(32) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `Address` varchar(100) DEFAULT NULL COMMENT '住址',
  `code_id` int(32) DEFAULT NULL COMMENT '身份证编号，身份证表外键',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', '张三', '石家庄', '1', '2021-03-09 14:38:44', null);
INSERT INTO `person` VALUES ('2', '李四', '石家庄', '2', '2021-03-09 14:39:07', null);
INSERT INTO `person` VALUES ('3', '王五', '北京', '3', '2021-03-09 14:39:32', null);
INSERT INTO `person` VALUES ('4', '赵六', '天津', '4', '2021-03-09 14:40:16', null);
INSERT INTO `person` VALUES ('5', '赵云', '河南', '5', '2021-03-09 14:40:36', null);
INSERT INTO `person` VALUES ('6', '去去去', '北京', null, '2021-03-09 18:52:03', null);
