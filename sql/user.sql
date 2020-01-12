/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : mydb

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2020-01-12 20:06:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(255) DEFAULT NULL,
  `u_pwd` varchar(255) DEFAULT NULL,
  `u_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
