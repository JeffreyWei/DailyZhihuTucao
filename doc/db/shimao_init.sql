/*
 Navicat Premium Data Transfer

 Source Server         : 意真45_mysql
 Source Server Type    : MySQL
 Source Server Version : 50624
 Source Host           : 192.168.220.45
 Source Database       : shimao

 Target Server Type    : MySQL
 Target Server Version : 50624
 File Encoding         : utf-8

 Date: 06/04/2015 14:39:52 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `t_bill_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_bill_info`;
CREATE TABLE `t_bill_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customerid` int(11) DEFAULT NULL COMMENT '客户ID',
  `publicid` int(11) DEFAULT NULL COMMENT '发布ID',
  `paycount` int(11) DEFAULT NULL COMMENT '购买份数',
  `paytime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '购买时间',
  `state` int(11) DEFAULT '1' COMMENT '状态（1正常，0无效）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单';

-- ----------------------------
--  Table structure for `t_class_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_class_info`;
CREATE TABLE `t_class_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '分类名称',
  `parentid` int(11) DEFAULT NULL COMMENT '父类ID',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `state` int(11) DEFAULT '1' COMMENT '状态（0无效，1有效）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品分类信息';

-- ----------------------------
--  Table structure for `t_customer_account`
-- ----------------------------
DROP TABLE IF EXISTS `t_customer_account`;
CREATE TABLE `t_customer_account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customerid` int(11) DEFAULT NULL COMMENT '客户ID',
  `balance` decimal(10,2) DEFAULT NULL COMMENT '资金余额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户虚拟账户';

-- ----------------------------
--  Table structure for `t_customer_accountlog`
-- ----------------------------
DROP TABLE IF EXISTS `t_customer_accountlog`;
CREATE TABLE `t_customer_accountlog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customerid` int(11) DEFAULT NULL COMMENT '客户ID',
  `billid` int(11) DEFAULT NULL COMMENT '发布ID',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `amount` decimal(10,2) DEFAULT NULL COMMENT '资金变化（正为增加，负为减少）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户虚拟账户日志';

-- ----------------------------
--  Table structure for `t_customer_address`
-- ----------------------------
DROP TABLE IF EXISTS `t_customer_address`;
CREATE TABLE `t_customer_address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customerid` int(11) DEFAULT NULL COMMENT '客户ID',
  `post` varchar(10) DEFAULT NULL COMMENT '邮编',
  `address` varchar(50) DEFAULT NULL COMMENT '地址',
  `linkephone` varchar(20) DEFAULT NULL COMMENT '收货电话',
  `linkman` varchar(20) DEFAULT NULL COMMENT '收货人',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户收货地址';

-- ----------------------------
--  Table structure for `t_customer_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_customer_info`;
CREATE TABLE `t_customer_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '账号名称',
  `password` varchar(50) DEFAULT NULL COMMENT '账号密码',
  `state` int(11) DEFAULT '1' COMMENT '状态（1正常，0无效）',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户信息';

-- ----------------------------
--  Table structure for `t_customer_shoppingcart`
-- ----------------------------
DROP TABLE IF EXISTS `t_customer_shoppingcart`;
CREATE TABLE `t_customer_shoppingcart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customerid` int(11) DEFAULT NULL COMMENT '客户ID',
  `publicid` int(11) DEFAULT NULL COMMENT '发布ID',
  `addtime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户购物车';

-- ----------------------------
--  Table structure for `t_goods_images`
-- ----------------------------
DROP TABLE IF EXISTS `t_goods_images`;
CREATE TABLE `t_goods_images` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `goodsid` int(11) DEFAULT NULL COMMENT '商品ID',
  `filename` varchar(50) DEFAULT NULL COMMENT '文件名称',
  `filepath` varchar(100) DEFAULT NULL COMMENT '文件存储路径',
  `linkpath` varchar(100) DEFAULT NULL COMMENT '图片跳转地址',
  `state` int(11) DEFAULT '1' COMMENT '状态（1正常，0无效）',
  `index` int(11) DEFAULT NULL COMMENT '图片显示顺序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品图片';

-- ----------------------------
--  Table structure for `t_goods_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_goods_info`;
CREATE TABLE `t_goods_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '商品名称',
  `classid` int(11) DEFAULT NULL COMMENT '分类ID',
  `description` varchar(1000) DEFAULT NULL COMMENT '描述信息',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `state` int(11) DEFAULT '1' COMMENT '状态（1正常，0无效）',
  `createtime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `price` int(8) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品信息';

-- ----------------------------
--  Table structure for `t_message_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_message_info`;
CREATE TABLE `t_message_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customerid` int(11) DEFAULT NULL COMMENT '来源客户ID',
  `createtime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `origintype` varchar(20) DEFAULT NULL COMMENT '来源类型',
  `state` int(11) DEFAULT '0' COMMENT '状态（0未发送，1已发送）',
  `context` varchar(100) DEFAULT NULL COMMENT '发送内容',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='短信';

-- ----------------------------
--  Table structure for `t_public_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_public_info`;
CREATE TABLE `t_public_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `goodsid` int(11) DEFAULT NULL COMMENT '商品ID',
  `topicid` int(11) DEFAULT NULL COMMENT '主题ID',
  `state` int(11) DEFAULT '1',
  `createtime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `customerid` int(11) DEFAULT NULL COMMENT '中奖客户ID',
  `lucytime` datetime DEFAULT NULL COMMENT '抽奖时间',
  `isdeliver` int(11) DEFAULT NULL COMMENT '是否发货（0未发货，1已发货）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品发布信息';

-- ----------------------------
--  Table structure for `t_topic_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_topic_info`;
CREATE TABLE `t_topic_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '主题名称',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `state` int(11) DEFAULT '1' COMMENT '状态（1正常，0无效）',
  `createtime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='主题信息';

SET FOREIGN_KEY_CHECKS = 1;
