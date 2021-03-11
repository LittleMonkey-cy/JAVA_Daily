/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50732
Source Host           : localhost:3306
Source Database       : shopdb

Target Server Type    : MYSQL
Target Server Version : 50732
File Encoding         : 65001

Date: 2021-03-11 13:54:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ordersitem
-- ----------------------------
DROP TABLE IF EXISTS `ordersitem`;
CREATE TABLE `ordersitem` (
  `id` bigint(32) unsigned NOT NULL AUTO_INCREMENT,
  `order_id` int(32) DEFAULT NULL COMMENT '订单编号，订单表外键',
  `product_id` int(32) DEFAULT NULL COMMENT '产品编号，产品表外键',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ordersitem
-- ----------------------------
INSERT INTO `ordersitem` VALUES ('1', '1', '3', '2021-03-10 14:49:05', null);
INSERT INTO `ordersitem` VALUES ('2', '2', '1', '2021-03-10 17:06:40', null);

-- ----------------------------
-- Table structure for order_master
-- ----------------------------
DROP TABLE IF EXISTS `order_master`;
CREATE TABLE `order_master` (
  `id` bigint(32) unsigned NOT NULL AUTO_INCREMENT,
  `number` varchar(50) DEFAULT NULL,
  `user_id` int(32) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_master
-- ----------------------------
INSERT INTO `order_master` VALUES ('1', '336250555', '2', '2021-03-10 07:09:07', null);
INSERT INTO `order_master` VALUES ('2', '659845566', '4', '2021-03-10 07:09:17', null);
INSERT INTO `order_master` VALUES ('3', '5896546464', '1', '2021-03-10 07:09:23', '2021-03-10 07:09:26');
INSERT INTO `order_master` VALUES ('4', '59786645321', '3', '2021-03-10 07:09:36', null);

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` bigint(32) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '拯救者Y7000p', '8750.00', '2021-03-10 14:14:16', null);
INSERT INTO `product` VALUES ('2', '面膜', '56.90', '2021-03-10 14:15:41', '2021-03-10 14:25:21');
INSERT INTO `product` VALUES ('3', '蛋糕', '35.00', '2021-03-10 14:16:05', '2021-03-10 14:16:05');
INSERT INTO `product` VALUES ('4', '甜点', '30.00', '2021-03-10 14:16:20', '2021-03-10 14:16:20');
INSERT INTO `product` VALUES ('5', '汽车', '865235.00', '2021-03-10 14:16:32', '2021-03-10 14:16:32');
INSERT INTO `product` VALUES ('6', '游戏机', '300.00', '2021-03-10 14:16:46', '2021-03-10 14:16:46');
INSERT INTO `product` VALUES ('7', '机箱', '200.00', '2021-03-10 14:17:16', '2021-03-10 14:17:16');
INSERT INTO `product` VALUES ('8', '显卡', '560.00', '2021-03-10 14:17:24', '2021-03-10 14:17:24');
INSERT INTO `product` VALUES ('9', '护肤用品', '1250.00', '2021-03-10 14:17:41', '2021-03-10 14:17:41');
INSERT INTO `product` VALUES ('10', '手套', '20.00', '2021-03-10 14:18:21', '2021-03-10 14:24:42');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(32) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '石家庄', '2021-03-10 06:45:25', null);
INSERT INTO `user` VALUES ('2', '李四', '北京', '2021-03-10 06:45:33', null);
INSERT INTO `user` VALUES ('3', '王五', '天津', '2021-03-10 06:45:49', null);
INSERT INTO `user` VALUES ('4', '赵六', '河南', '2021-03-10 06:46:12', null);
