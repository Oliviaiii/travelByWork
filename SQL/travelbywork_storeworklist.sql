-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeworklist`
--

LOCK TABLES `storeworklist` WRITE;
/*!40000 ALTER TABLE `storeworklist` DISABLE KEYS */;
INSERT INTO `storeworklist` VALUES (2,'桃園',NULL,'25歲','n不限one','來電詢問',NULL,'2023-07-31','2023-08-30','兩週','無休息日','不超過五小時','大夜班（晚上8點前上班）','\n要給你麼檔案','腳踏車','三餐','一週1000','\n要給你麼檔案',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,'新竹',NULL,'25歲','n不限one','簡訊詢問',NULL,'2023-07-31','2023-08-24','兩週','無休息日','不超過五小時','晚班（傍晚6點前上班）','講冷笑話','電動摩托車','兩餐','一週2000','沒錢',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,'台北','2023-08-18 15:14:06.042000','18歲','男性','簡訊詢問','TEST','2023-08-18','2023-08-26','一天','一週兩天','不超過三小時','午班（下午1點前上班）','TEST','一般摩托車','一餐','一週200','TEST',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,'台北','2023-08-18 15:17:32.878000','18歲','男性','簡訊詢問','aa','2023-08-08','2023-08-30','一天','一週一天','不超過三小時','午班（下午1點前上班）','aa','一般摩托車','兩餐','另議','aa',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'台北','2023-08-18 15:21:56.916000','18歲','女性','簡訊詢問','aa','2023-08-12','2023-08-30','一週','一週一天','不超過三小時','早班（早上9點前上班）','aa','電動摩托車','兩餐','一週2000','aa',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,'台北','2023-08-18 15:24:55.717000','20歲','不限','簡訊詢問','ww','2023-08-02','2023-09-01','一週','一週一天','不超過三小時','早班（早上9點前上班）','ww','一般摩托車','一餐','另議','ww',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,'台北','2023-08-18 15:51:02.940000','18歲','男性','來電詢問','cfaf','2023-08-16','2023-08-30','一天','一週一天','不超過三小時','早班（早上9點前上班）','ewgwg','一般摩托車','兩餐','無供零用金','erwsgw','test@gmail.com','test','test',1,'testaddress','123','1234');
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

-- Dump completed on 2023-08-25  9:01:19
