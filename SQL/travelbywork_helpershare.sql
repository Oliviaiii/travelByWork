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
-- Table structure for table `helpershare`
--

DROP TABLE IF EXISTS `helpershare`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `helpershare` (
  `helpershareid` int NOT NULL AUTO_INCREMENT,
  `helpmemberid` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `account` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `username` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `startdate` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `enddate` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `place` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `storename` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `worktype` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `workdetail` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `grade` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `content` varchar(300) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `updatedate` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  PRIMARY KEY (`helpershareid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `helpershare`
--

LOCK TABLES `helpershare` WRITE;
/*!40000 ALTER TABLE `helpershare` DISABLE KEYS */;
INSERT INTO `helpershare` VALUES (1,'001','a001','LeeSeungHyub','2023/01/08','2023/10/31','Seoul','FNC','餐廳','駐唱','10','好極了','2023/12/1'),(2,NULL,NULL,NULL,'2023-08-10','2023-08-16','NewTaipei',NULL,'hostol',NULL,'five',NULL,'2023-08-16 23:20:36'),(3,NULL,NULL,NULL,'2023-08-07','2023-08-16','Changhua',NULL,'bistro',NULL,'five',NULL,'2023-08-16 23:26:32'),(4,NULL,NULL,NULL,'2023-08-08','2023-08-16','Keelung',NULL,'bistro',NULL,'four',NULL,'2023-08-17 00:24:44'),(5,NULL,NULL,NULL,'2023-08-08','2023-08-16','Keelung',NULL,'bistro',NULL,'four',NULL,'2023-08-17 00:24:44'),(6,NULL,NULL,NULL,'2023-08-02','2023-08-15','Hsinchu',NULL,'brunch',NULL,'four',NULL,'2023-08-17 00:25:38'),(7,NULL,NULL,NULL,'2023-08-02','2023-08-16','Nantou',NULL,'farm',NULL,'eight',NULL,'2023-08-17 00:27:12'),(8,NULL,NULL,NULL,'2023-08-01','2023-08-16','Nantou',NULL,'bistro','hvhk','seven',NULL,'2023-08-17 00:51:05'),(9,NULL,NULL,NULL,'2023-08-01','2023-08-16','Taoyuan',NULL,'divestore','hj','eight',NULL,'2023-08-17 00:55:34'),(10,NULL,NULL,NULL,'2023-08-01','2023-08-16','Yunlin',NULL,'ohmiyaga','madvl','six',NULL,'2023-08-17 09:31:29'),(11,NULL,NULL,NULL,'2023-08-01','2023-08-17','Keelung',NULL,'divestore','NKL','seven','NKXZL','2023-08-17 09:42:28'),(12,NULL,NULL,NULL,'2023-08-01','2023-08-17','Tainan',NULL,'brunch','nksl','six','nakl','2023-08-17 09:43:33'),(13,NULL,NULL,NULL,'2023-08-01','2023-08-17','Taoyuan','cnals','bistro','nsal','five','ncsI','2023-08-17 09:47:32'),(14,NULL,NULL,'test1','2023-08-02','2023-08-22','Taipei','s','restuarant','wqd','whatthefuck','dqwdq','2023-08-18 15:25:37'),(15,NULL,NULL,'test1','2023-08-18','2023-09-07','NewTaipei','d','restuarant','wdadad','one','awdawda','2023-08-18 15:29:12'),(16,NULL,NULL,'test1','2023-08-19','2023-08-30','Taipei','d','hostol','dawda','three','dawda','2023-08-18 15:39:14'),(17,NULL,NULL,'test1','2023-08-09','2023-08-23','Taipei','s','hostol','erhgrwe','two','wergwg','2023-08-18 15:51:57'),(18,NULL,NULL,'test1','2023-08-18','2023-08-31','NewTaipei','s','restuarant','wdadq','two','dawda','2023-08-18 16:03:12');
/*!40000 ALTER TABLE `helpershare` ENABLE KEYS */;
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
