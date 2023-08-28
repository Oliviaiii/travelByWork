-- MySQL dump 10.13  Distrib 8.0.31, for macos12 (x86_64)
--
-- Host: localhost    Database: travelbywork
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `storeworklist`
--

DROP TABLE IF EXISTS `storeworklist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `storeworklist` (
  `storeworklistid` int NOT NULL AUTO_INCREMENT,
  `location` varchar(45) DEFAULT NULL,
  `workupdatetime` datetime(6) DEFAULT NULL,
  `workage` varchar(45) DEFAULT NULL,
  `worksexual` varchar(45) DEFAULT NULL,
  `howtoapply` varchar(800) DEFAULT NULL,
  `others` varchar(800) DEFAULT NULL,
  `changedatebegin` varchar(45) DEFAULT NULL,
  `changedateeend` varchar(45) DEFAULT NULL,
  `aleastdays` varchar(45) DEFAULT NULL,
  `breaktime` varchar(800) DEFAULT NULL,
  `workhours` varchar(45) DEFAULT NULL,
  `atwhattime` varchar(255) DEFAULT NULL,
  `workdetails` varchar(800) DEFAULT NULL,
  `scooters` varchar(45) DEFAULT NULL,
  `meals` varchar(45) DEFAULT NULL,
  `money` varchar(45) DEFAULT NULL,
  `workbonus` varchar(800) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `ownername` varchar(255) DEFAULT NULL,
  `storename` varchar(255) DEFAULT NULL,
  `storememberid` int DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`storeworklistid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeworklist`
--

LOCK TABLES `storeworklist` WRITE;
/*!40000 ALTER TABLE `storeworklist` DISABLE KEYS */;
INSERT INTO `storeworklist` VALUES (10,'綠島','2023-08-25 16:24:20.447000','25歲','不限','簡訊詢問','不怕曬黑','2023-07-30','2023-09-09','兩週','無休息日','不超過五小時','午班（下午1點前上班）','幫忙炒菜','無','三餐','一週2000','很多錢','rainy57091224@gmail.com','林小萍','釣漁人',17,'台東綠島鄉南寮村111號','0955555555','089671029'),(11,'基隆','2023-08-28 13:59:39.003000','25歲','男性','簡訊詢問','樂觀積極向上','2023-08-09','2024-09-17','一個月','一週兩天','不超過五小時','其他','依情況而定','無','兩餐','一週1000','無','1347865v@gmail.com','ZXC','ZXC',22,'基隆市中山區中華路131號4樓','0911555555','0000000000'),(12,'桃園','2023-08-28 14:01:44.558000','20歲','女性','信箱','hello','2023-07-31','2023-09-09','一天','一週一天','不超過四小時','午班（下午1點前上班）','work','腳踏車','兩餐','另議','no','craigchen510@gmail.com','老闆Ｂ','Lawa衝浪工作室',20,'屏東縣恆春鎮恆公路716-13號','0923456432',''),(13,'台東','2023-08-28 14:05:27.045000','25歲','不限','來電詢問','HELLO','2023-01-09','2023-08-28','一週','無休息日','不超過三小時','晚班（傍晚6點前上班）','HELLO','一般摩托車','兩餐','一週1000','000000','pij2baa34kan@gmail.com','老闆Ａ','金樽衝浪小屋 Jinzun surf house',19,'台東縣東河鄉17號','0924123413',''),(14,'台東','2023-08-28 14:07:05.972000','18歲','男性','來電詢問','無','2023-08-01','2023-09-09','兩週','一週兩天','不超過五小時','晚班（傍晚6點前上班）','另議','無','三餐','一週200','無','rainy57091224@gmail.com','林小萍','釣漁人',17,'台東綠島鄉南寮村111號','0955555555','089671029'),(15,'台東','2023-08-28 14:10:19.819000','25歲','男性','來電詢問','無','2023-06-14','2023-09-09','一週','一週兩天','不超過五小時','午班（下午1點前上班）','打掃','腳踏車','三餐','一週1000','無福利','pipi870108@gmail.com','小美','小琉球酒吧Bar Second',16,'台東蘭嶼⁣鄉椰油村298-4號','0944444444','');
/*!40000 ALTER TABLE `storeworklist` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-28 14:19:06
