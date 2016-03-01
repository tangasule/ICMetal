/*
 Navicat Premium Data Transfer

 Source Server         : 本地mysql
 Source Server Type    : MySQL
 Source Server Version : 50624
 Source Host           : localhost
 Source Database       : icmetal

 Target Server Type    : MySQL
 Target Server Version : 50624
 File Encoding         : utf-8

 Date: 03/01/2016 16:34:49 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `ic_contactus`
-- ----------------------------
DROP TABLE IF EXISTS `ic_contactus`;
CREATE TABLE `ic_contactus` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL,
  `message` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ic_formability`
-- ----------------------------
DROP TABLE IF EXISTS `ic_formability`;
CREATE TABLE `ic_formability` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `material` varchar(255) DEFAULT NULL,
  `no_state` varchar(255) DEFAULT NULL,
  `total_strain` varchar(255) DEFAULT NULL,
  `stamping_speed` varchar(255) DEFAULT NULL,
  `cut_off_strain` varchar(255) DEFAULT NULL,
  `upload` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ic_toollife`
-- ----------------------------
DROP TABLE IF EXISTS `ic_toollife`;
CREATE TABLE `ic_toollife` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `material` varchar(255) DEFAULT NULL,
  `calculate` varchar(255) DEFAULT NULL,
  `no_state` varchar(255) DEFAULT NULL,
  `total_strain` varchar(255) DEFAULT NULL,
  `stamping_speed` varchar(255) DEFAULT NULL,
  `friction_coefficient` varchar(255) DEFAULT NULL,
  `upload` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
