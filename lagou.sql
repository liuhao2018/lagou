/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50557
Source Host           : localhost:3306
Source Database       : lagou

Target Server Type    : MYSQL
Target Server Version : 50557
File Encoding         : 65001

Date: 2018-04-26 07:24:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '技术');
INSERT INTO `category` VALUES ('2', '产品');
INSERT INTO `category` VALUES ('3', '设计');
INSERT INTO `category` VALUES ('4', '运营');
INSERT INTO `category` VALUES ('5', '市场与销售');
INSERT INTO `category` VALUES ('6', '职能');
INSERT INTO `category` VALUES ('7', '金融');

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `pinyin` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES ('1', '北京', 'beijing');
INSERT INTO `city` VALUES ('2', '上海', 'shanghai');
INSERT INTO `city` VALUES ('3', '广州', 'guangzhou');
INSERT INTO `city` VALUES ('4', '深圳', 'shenzhen');
INSERT INTO `city` VALUES ('5', '杭州', 'hangzhou');
INSERT INTO `city` VALUES ('6', '成都', 'chengdu');

-- ----------------------------
-- Table structure for company
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
-- Records of company
-- ----------------------------
INSERT INTO `company` VALUES ('1', '小米科技有限责任公司', '小米', '60606666-1234', 'chenchongwei@xiaomi.com', 'www.mi.com', '1', '北京市海淀区清河中街68号华润五彩城购物中心二期13层', '雷军', '2000', '小米团队 小米公司由著名天使投资人雷军带领创建。小米公司共计七名创始人，分别为创始人、董事长兼CEO雷军，联合创始人兼总裁林斌，联合创始人及副总裁黎万强、周光平、黄江吉、刘德、洪锋。 小米人主要由来自微软、谷歌、金山、MOTO等国内外IT公司的资深员工所组成，小米人都喜欢创新、快速的互联网文化。小米拒绝平庸，小米人任何时候都能让你感受到他们的创意。在小米团队中，没有冗长无聊的会议和流程，每一位小米人都在平等、轻松的伙伴式工作氛围中，享受与技术、产品、设计等各领域顶尖人才共同创业成长的快意。', 'D轮及以上', '手机硬件 互联网文化出版', '1');

-- ----------------------------
-- Table structure for education
-- ----------------------------
DROP TABLE IF EXISTS `education`;
CREATE TABLE `education` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `level` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of education
-- ----------------------------
INSERT INTO `education` VALUES ('1', '大专');
INSERT INTO `education` VALUES ('2', '本科');
INSERT INTO `education` VALUES ('3', '硕士');
INSERT INTO `education` VALUES ('4', '博士');
INSERT INTO `education` VALUES ('5', '博士后');

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `id` bigint(20) NOT NULL,
  `job` int(11) DEFAULT NULL,
  `company` int(11) DEFAULT NULL,
  `education` int(11) DEFAULT NULL,
  `describe` varchar(255) DEFAULT NULL,
  `require` varchar(255) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of item
-- ----------------------------

-- ----------------------------
-- Table structure for job
-- ----------------------------
DROP TABLE IF EXISTS `job`;
CREATE TABLE `job` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `parent` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of job
-- ----------------------------
INSERT INTO `job` VALUES ('1', 'java', '1');
INSERT INTO `job` VALUES ('2', 'php', '1');
INSERT INTO `job` VALUES ('3', 'c++', '1');
INSERT INTO `job` VALUES ('4', 'nodejs', '1');
INSERT INTO `job` VALUES ('5', 'go', '1');
INSERT INTO `job` VALUES ('6', 'android', '2');
INSERT INTO `job` VALUES ('7', 'ios', '2');
INSERT INTO `job` VALUES ('8', 'web前端', '3');
INSERT INTO `job` VALUES ('9', 'html5', '3');
INSERT INTO `job` VALUES ('10', '算法工程师', '4');
INSERT INTO `job` VALUES ('11', '自然语言处理', '4');
INSERT INTO `job` VALUES ('12', '测试工程师', '5');
INSERT INTO `job` VALUES ('13', '运维工程师', '6');
INSERT INTO `job` VALUES ('14', '移动产品经理', '12');
INSERT INTO `job` VALUES ('15', 'ui设计师', '15');
INSERT INTO `job` VALUES ('16', '交互设计师', '16');
INSERT INTO `job` VALUES ('17', '用户运营', '19');
INSERT INTO `job` VALUES ('18', '内容运营', '19');
INSERT INTO `job` VALUES ('19', '活动运营', '19');
INSERT INTO `job` VALUES ('20', '商务渠道', '23');
INSERT INTO `job` VALUES ('21', '薪酬福利经理', '30');
INSERT INTO `job` VALUES ('22', '前台', '31');
INSERT INTO `job` VALUES ('23', '法务', '37');

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `parent` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of type
-- ----------------------------
INSERT INTO `type` VALUES ('1', '后端开发', '1');
INSERT INTO `type` VALUES ('2', '移动开发', '1');
INSERT INTO `type` VALUES ('3', '前端开发', '1');
INSERT INTO `type` VALUES ('4', '人工智能', '1');
INSERT INTO `type` VALUES ('5', '测试', '1');
INSERT INTO `type` VALUES ('6', '运维', '1');
INSERT INTO `type` VALUES ('7', 'DBA', '1');
INSERT INTO `type` VALUES ('8', '高端职位', '1');
INSERT INTO `type` VALUES ('9', '项目管理', '1');
INSERT INTO `type` VALUES ('10', '硬件开发', '1');
INSERT INTO `type` VALUES ('11', '企业软件', '1');
INSERT INTO `type` VALUES ('12', '产品经理', '2');
INSERT INTO `type` VALUES ('13', '产品设计师', '2');
INSERT INTO `type` VALUES ('14', '高端职位', '2');
INSERT INTO `type` VALUES ('15', '视觉设计', '3');
INSERT INTO `type` VALUES ('16', '交互设计', '3');
INSERT INTO `type` VALUES ('17', '用户研究', '3');
INSERT INTO `type` VALUES ('18', '高端职位', '3');
INSERT INTO `type` VALUES ('19', '运营', '4');
INSERT INTO `type` VALUES ('20', '编辑', '4');
INSERT INTO `type` VALUES ('21', '客服', '4');
INSERT INTO `type` VALUES ('22', '高级职位', '4');
INSERT INTO `type` VALUES ('23', '市场/营销', '5');
INSERT INTO `type` VALUES ('24', '公关', '5');
INSERT INTO `type` VALUES ('25', '销售', '5');
INSERT INTO `type` VALUES ('26', '供应链', '5');
INSERT INTO `type` VALUES ('27', '采购', '5');
INSERT INTO `type` VALUES ('28', '投资', '5');
INSERT INTO `type` VALUES ('29', '高端职位', '5');
INSERT INTO `type` VALUES ('30', '人力资源', '6');
INSERT INTO `type` VALUES ('31', '行政', '6');
INSERT INTO `type` VALUES ('32', '财务', '6');
INSERT INTO `type` VALUES ('33', '法务', '6');
INSERT INTO `type` VALUES ('34', '高端职位', '6');
INSERT INTO `type` VALUES ('35', '投融资', '7');
INSERT INTO `type` VALUES ('36', '风控', '7');
INSERT INTO `type` VALUES ('37', '审计税务', '7');
INSERT INTO `type` VALUES ('38', '高端职位', '7');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `sex` tinyint(4) DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  `city` tinyint(4) DEFAULT NULL,
  `job` int(11) DEFAULT NULL,
  `resume` varchar(255) DEFAULT NULL,
  `super` tinyint(4) DEFAULT NULL,
  `company` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '刘昊', '1', '13659840537', null, null, '1', '1', null, null, null);
INSERT INTO `user` VALUES ('2', null, null, '13177019415', '123456', '5b3fcd207a7cdeb88b3e1634f5a928e0', null, null, null, null, null);
