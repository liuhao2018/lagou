/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50637
 Source Host           : localhost
 Source Database       : lagou

 Target Server Type    : MySQL
 Target Server Version : 50637
 File Encoding         : utf-8

 Date: 04/26/2018 17:54:14 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `banner`
-- ----------------------------
DROP TABLE IF EXISTS `banner`;
CREATE TABLE `banner` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `img_url` varchar(255) DEFAULT NULL,
  `desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `category`
-- ----------------------------
BEGIN;
INSERT INTO `category` VALUES ('1', '技术'), ('2', '产品'), ('3', '设计'), ('4', '运营'), ('5', '市场与销售'), ('6', '职能'), ('7', '金融');
COMMIT;

-- ----------------------------
--  Table structure for `city`
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `pinyin` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `city`
-- ----------------------------
BEGIN;
INSERT INTO `city` VALUES ('1', '北京', 'beijing'), ('2', '上海', 'shanghai'), ('3', '广州', 'guangzhou'), ('4', '深圳', 'shenzhen'), ('5', '杭州', 'hangzhou'), ('6', '成都', 'chengdu');
COMMIT;

-- ----------------------------
--  Table structure for `company`
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `full_name` varchar(255) DEFAULT NULL,
  `simple_name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `www` varchar(255) DEFAULT NULL,
  `city` int(11) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `boss` varchar(255) DEFAULT NULL,
  `employee_count` int(11) DEFAULT NULL,
  `describe` varchar(255) DEFAULT NULL,
  `finance_status` varchar(255) DEFAULT NULL,
  `service` varchar(255) DEFAULT NULL,
  `check` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `company`
-- ----------------------------
BEGIN;
INSERT INTO `company` VALUES ('1', '小米科技有限责任公司', '小米', '60606666-1234', 'chenchongwei@xiaomi.com', 'www.mi.com', '1', '北京市海淀区清河中街68号华润五彩城购物中心二期13层', '雷军', '2000', '小米团队 小米公司由著名天使投资人雷军带领创建。小米公司共计七名创始人，分别为创始人、董事长兼CEO雷军，联合创始人兼总裁林斌，联合创始人及副总裁黎万强、周光平、黄江吉、刘德、洪锋。 小米人主要由来自微软、谷歌、金山、MOTO等国内外IT公司的资深员工所组成，小米人都喜欢创新、快速的互联网文化。小米拒绝平庸，小米人任何时候都能让你感受到他们的创意。在小米团队中，没有冗长无聊的会议和流程，每一位小米人都在平等、轻松的伙伴式工作氛围中，享受与技术、产品、设计等各领域顶尖人才共同创业成长的快意。', 'D轮及以上', '手机硬件 互联网文化出版', '1');
COMMIT;

-- ----------------------------
--  Table structure for `education`
-- ----------------------------
DROP TABLE IF EXISTS `education`;
CREATE TABLE `education` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `level` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `education`
-- ----------------------------
BEGIN;
INSERT INTO `education` VALUES ('1', '大专'), ('2', '本科'), ('3', '硕士'), ('4', '博士'), ('5', '博士后');
COMMIT;

-- ----------------------------
--  Table structure for `item`
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `job` int(11) DEFAULT NULL,
  `education` int(11) DEFAULT NULL,
  `company` int(11) DEFAULT NULL,
  `describe_info` varchar(255) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  `require_info` varchar(255) DEFAULT NULL,
  `create_by` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `item`
-- ----------------------------
BEGIN;
INSERT INTO `item` VALUES ('1', '3', '1', '1', '熟悉c++', '20000', '五年以上技术经验', '1'), ('2', '1', '2', '1', '精通java，熟悉Spring生态圈', '25000', '五年以上技术经验', '1');
COMMIT;

-- ----------------------------
--  Table structure for `job`
-- ----------------------------
DROP TABLE IF EXISTS `job`;
CREATE TABLE `job` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `parent` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `job`
-- ----------------------------
BEGIN;
INSERT INTO `job` VALUES ('1', 'java', '1'), ('2', 'php', '1'), ('3', 'c++', '1'), ('4', 'nodejs', '1'), ('5', 'go', '1'), ('6', 'android', '2'), ('7', 'ios', '2'), ('8', 'web前端', '3'), ('9', 'html5', '3'), ('10', '算法工程师', '4'), ('11', '自然语言处理', '4'), ('12', '测试工程师', '5'), ('13', '运维工程师', '6'), ('14', '移动产品经理', '12'), ('15', 'ui设计师', '15'), ('16', '交互设计师', '16'), ('17', '用户运营', '19'), ('18', '内容运营', '19'), ('19', '活动运营', '19'), ('20', '商务渠道', '23'), ('21', '薪酬福利经理', '30'), ('22', '前台', '31'), ('23', '法务', '37');
COMMIT;

-- ----------------------------
--  Table structure for `news`
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `type`
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `parent` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `type`
-- ----------------------------
BEGIN;
INSERT INTO `type` VALUES ('1', '后端开发', '1'), ('2', '移动开发', '1'), ('3', '前端开发', '1'), ('4', '人工智能', '1'), ('5', '测试', '1'), ('6', '运维', '1'), ('7', 'DBA', '1'), ('8', '高端职位', '1'), ('9', '项目管理', '1'), ('10', '硬件开发', '1'), ('11', '企业软件', '1'), ('12', '产品经理', '2'), ('13', '产品设计师', '2'), ('14', '高端职位', '2'), ('15', '视觉设计', '3'), ('16', '交互设计', '3'), ('17', '用户研究', '3'), ('18', '高端职位', '3'), ('19', '运营', '4'), ('20', '编辑', '4'), ('21', '客服', '4'), ('22', '高级职位', '4'), ('23', '市场/营销', '5'), ('24', '公关', '5'), ('25', '销售', '5'), ('26', '供应链', '5'), ('27', '采购', '5'), ('28', '投资', '5'), ('29', '高端职位', '5'), ('30', '人力资源', '6'), ('31', '行政', '6'), ('32', '财务', '6'), ('33', '法务', '6'), ('34', '高端职位', '6'), ('35', '投融资', '7'), ('36', '风控', '7'), ('37', '审计税务', '7'), ('38', '高端职位', '7');
COMMIT;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `sex` tinyint(4) DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  `city` int(4) DEFAULT NULL,
  `job` int(11) DEFAULT NULL,
  `resume` varchar(255) DEFAULT NULL,
  `super` tinyint(4) unsigned zerofill DEFAULT '0000',
  `company` int(11) DEFAULT NULL,
  `education` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('1', '张三', '1', '13659840537', '111111', '0a3ed67a71e173643f54d19531696fbf', '1', '1', null, '1', '1', '2'), ('2', '李思思', '2', '13177019415', '123456', '5b3fcd207a7cdeb88b3e1634f5a928e0', '2', '15', null, '0', null, '3');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
