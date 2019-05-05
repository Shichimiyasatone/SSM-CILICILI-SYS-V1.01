/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50622
Source Host           : localhost:3306
Source Database       : hi

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2019-04-30 10:14:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_admin`
-- ----------------------------
DROP TABLE IF EXISTS `tb_admin`;
CREATE TABLE `tb_admin` (
  `ADMINID` varchar(20) NOT NULL,
  `PASSWORD` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ADMINID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_admin
-- ----------------------------
INSERT INTO `tb_admin` VALUES ('18867210351', 'e10adc3949ba59abbe56e057f20f883e');

-- ----------------------------
-- Table structure for `tb_barrage`
-- ----------------------------
DROP TABLE IF EXISTS `tb_barrage`;
CREATE TABLE `tb_barrage` (
  `BARRAGEID` int(10) NOT NULL AUTO_INCREMENT,
  `VIDEOID` int(10) DEFAULT NULL,
  `USERID` varchar(20) DEFAULT NULL,
  `CONTENT` varchar(200) DEFAULT NULL,
  `VIDEOTIME` varchar(100) DEFAULT NULL,
  `BARRAGETIME` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`BARRAGEID`),
  KEY `FK_BARRAGE_USERID` (`USERID`),
  KEY `FK_BARRAGE_VIDEOID` (`VIDEOID`),
  CONSTRAINT `FK_BARRAGE_USERID` FOREIGN KEY (`USERID`) REFERENCES `tb_user` (`USERID`),
  CONSTRAINT `FK_BARRAGE_VIDEOID` FOREIGN KEY (`VIDEOID`) REFERENCES `tb_video` (`VIDEOID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_barrage
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_submission`
-- ----------------------------
DROP TABLE IF EXISTS `tb_submission`;
CREATE TABLE `tb_submission` (
  `SUBMISSIONID` int(10) NOT NULL AUTO_INCREMENT,
  `USERID` varchar(20) DEFAULT NULL,
  `VIDEONAME` varchar(200) DEFAULT NULL,
  `IMGURL` varchar(4000) DEFAULT NULL,
  `FILEURL` varchar(4000) DEFAULT NULL,
  `FILESIZE` varchar(10) DEFAULT NULL,
  `FORMAT` varchar(20) DEFAULT NULL,
  `SUBMISSIONTIME` varchar(100) DEFAULT NULL,
  `STATE` varchar(10) DEFAULT NULL,
  `TYPEID` int(10) DEFAULT NULL,
  `VIDEOLENGTH` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`SUBMISSIONID`),
  KEY `FK_SUBMISSION_USERID` (`USERID`),
  CONSTRAINT `FK_SUBMISSION_USERID` FOREIGN KEY (`USERID`) REFERENCES `tb_user` (`USERID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_submission
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `USERID` varchar(20) NOT NULL,
  `PASSWORD` varchar(100) DEFAULT NULL,
  `USERNAME` varchar(20) DEFAULT NULL,
  `IMGURL` varchar(4000) DEFAULT NULL,
  `SEX` varchar(10) DEFAULT NULL,
  `BIRTHDAY` varchar(10) DEFAULT NULL,
  `ADDRESS` varchar(20) DEFAULT NULL,
  `EMOTION` varchar(20) DEFAULT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  `SIGN` varchar(200) DEFAULT NULL,
  `REGISTERTIME` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`USERID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('18867210351', 'e10adc3949ba59abbe56e057f20f883e', 'satone', 'user_pic\\user.jpg', null, '2019-04-01', null, null, '1500973619@qq.com', '这个人很懒...', '2019-04-29 16:13:18');

-- ----------------------------
-- Table structure for `tb_usercollection`
-- ----------------------------
DROP TABLE IF EXISTS `tb_usercollection`;
CREATE TABLE `tb_usercollection` (
  `USERID` varchar(20) NOT NULL DEFAULT '',
  `COLLECTION` varchar(4000) DEFAULT NULL,
  PRIMARY KEY (`USERID`),
  CONSTRAINT `FK_COLLECTIONID` FOREIGN KEY (`USERID`) REFERENCES `tb_user` (`USERID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_usercollection
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_video`
-- ----------------------------
DROP TABLE IF EXISTS `tb_video`;
CREATE TABLE `tb_video` (
  `VIDEOID` int(10) NOT NULL AUTO_INCREMENT,
  `VIDEONAME` varchar(200) DEFAULT NULL,
  `AUTHOR` varchar(100) DEFAULT NULL,
  `IMGURL` varchar(4000) DEFAULT NULL,
  `FILEURL` varchar(4000) DEFAULT NULL,
  `FILESIZE` varchar(10) DEFAULT NULL,
  `FORMAT` varchar(20) DEFAULT NULL,
  `PLAY` int(10) DEFAULT NULL,
  `COLLECTION` int(10) DEFAULT NULL,
  `UPTIME` varchar(100) DEFAULT NULL,
  `TYPEID` int(10) DEFAULT NULL,
  `VIDEOLENGTH` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`VIDEOID`),
  KEY `FK_TYPEID` (`TYPEID`),
  CONSTRAINT `FK_TYPEID` FOREIGN KEY (`TYPEID`) REFERENCES `tb_videotype` (`TYPEID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_video
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_videocomment`
-- ----------------------------
DROP TABLE IF EXISTS `tb_videocomment`;
CREATE TABLE `tb_videocomment` (
  `COMMENTID` int(10) NOT NULL,
  `VIDEOID` int(10) DEFAULT NULL,
  `USERID` varchar(20) DEFAULT NULL,
  `CONTENT` varchar(200) DEFAULT NULL,
  `COMMENTTIME` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`COMMENTID`),
  KEY `FK_COMMENT_USERID` (`USERID`),
  KEY `FK_COMMENT_VIDEOID` (`VIDEOID`),
  CONSTRAINT `FK_COMMENT_USERID` FOREIGN KEY (`USERID`) REFERENCES `tb_user` (`USERID`),
  CONSTRAINT `FK_COMMENT_VIDEOID` FOREIGN KEY (`VIDEOID`) REFERENCES `tb_video` (`VIDEOID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_videocomment
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_videotype`
-- ----------------------------
DROP TABLE IF EXISTS `tb_videotype`;
CREATE TABLE `tb_videotype` (
  `TYPEID` int(10) NOT NULL,
  `TYPENAME` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`TYPEID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_videotype
-- ----------------------------
INSERT INTO `tb_videotype` VALUES ('1', '娱乐');
INSERT INTO `tb_videotype` VALUES ('2', '游戏');
INSERT INTO `tb_videotype` VALUES ('3', '动画');
INSERT INTO `tb_videotype` VALUES ('4', '音乐');
INSERT INTO `tb_videotype` VALUES ('5', '舞蹈');
