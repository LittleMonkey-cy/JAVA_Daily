/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50732
Source Host           : localhost:3306
Source Database       : systop_crm

Target Server Type    : MYSQL
Target Server Version : 50732
File Encoding         : 65001

Date: 2021-04-08 08:31:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for base_dict
-- ----------------------------
DROP TABLE IF EXISTS `base_dict`;
CREATE TABLE `base_dict` (
  `dict_id` bigint(32) unsigned NOT NULL AUTO_INCREMENT,
  `dict_type_code` varchar(10) DEFAULT NULL,
  `dict_type_name` varchar(50) DEFAULT NULL,
  `dict_item_name` varchar(50) DEFAULT NULL,
  `dict_item_code` varchar(10) DEFAULT NULL,
  `dict_sort` int(10) DEFAULT NULL,
  `is_enable` char(1) DEFAULT NULL,
  `dict_memo` varchar(100) DEFAULT NULL,
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`dict_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of base_dict
-- ----------------------------
INSERT INTO `base_dict` VALUES ('1', 's1001', '类型', '惊悚', null, null, null, null, '2021-03-31 08:55:16', null);

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `cust_id` bigint(32) unsigned NOT NULL AUTO_INCREMENT,
  `cust_name` varchar(50) NOT NULL,
  `cust_userId` int(32) DEFAULT NULL,
  `cust_create_id` int(32) DEFAULT NULL,
  `cust_sourrce` varchar(50) DEFAULT NULL,
  `cust_industry` varchar(50) DEFAULT NULL,
  `cust_level` varchar(32) DEFAULT NULL,
  `cust_linkman` varchar(50) DEFAULT NULL,
  `cust_phone` varchar(64) DEFAULT NULL,
  `cust_mobile` varchar(16) DEFAULT NULL,
  `cust_zipcode` varchar(10) DEFAULT NULL,
  `cust_address` varchar(100) DEFAULT NULL,
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`cust_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('2', '关公', '3', null, null, null, '高级', null, null, null, null, null, '2021-03-09 20:37:48', null);
INSERT INTO `customer` VALUES ('3', '张飞', '2', null, null, null, '中等', null, null, null, null, null, '2021-03-09 20:38:05', null);
INSERT INTO `customer` VALUES ('4', '嘻哈', '2', null, null, null, '中等', null, null, null, null, null, '2021-03-10 13:28:37', null);

-- ----------------------------
-- Table structure for interview
-- ----------------------------
DROP TABLE IF EXISTS `interview`;
CREATE TABLE `interview` (
  `inter_id` bigint(32) unsigned NOT NULL AUTO_INCREMENT,
  `inter_custId` int(32) DEFAULT NULL,
  `inter_userId` int(32) DEFAULT NULL,
  `inter_record` varchar(255) DEFAULT NULL,
  `inter_datetime` datetime NOT NULL,
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`inter_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of interview
-- ----------------------------
INSERT INTO `interview` VALUES ('2', null, null, null, '2021-03-26 00:00:00', '2021-03-27 07:44:51', '2021-03-27 10:04:51');

-- ----------------------------
-- Table structure for login_user
-- ----------------------------
DROP TABLE IF EXISTS `login_user`;
CREATE TABLE `login_user` (
  `user_id` bigint(32) unsigned NOT NULL AUTO_INCREMENT,
  `user_code` varchar(32) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `user_password` varchar(50) NOT NULL,
  `is_state` char(1) NOT NULL,
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login_user
-- ----------------------------
INSERT INTO `login_user` VALUES ('1', '1003', '赵云', '123456', '0', '2021-03-02 23:15:16', '2021-03-08 11:58:24');
INSERT INTO `login_user` VALUES ('2', '1004', '李峰', '66666', '1', '2021-03-09 20:38:59', null);
INSERT INTO `login_user` VALUES ('3', '1005', '嘻哈', '456789', '0', '2021-03-09 20:39:24', null);
INSERT INTO `login_user` VALUES ('4', 'u011', 'Mary', '1223', '0', '2021-04-01 15:06:52', null);
