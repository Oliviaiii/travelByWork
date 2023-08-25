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
-- Table structure for table `helpermember`
--

DROP TABLE IF EXISTS `helpermember`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `helpermember` (
  `helpermemberid` int NOT NULL AUTO_INCREMENT,
  `username` varchar(30) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `account` varchar(30) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobile` varchar(30) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `createtime` date DEFAULT NULL,
  `birth` varchar(45) DEFAULT NULL,
  `sexual` varchar(45) DEFAULT NULL,
  `role` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`helpermemberid`),
  UNIQUE KEY `personal` (`username`) /*!80000 INVISIBLE */,
  UNIQUE KEY `email` (`email`) /*!80000 INVISIBLE */,
  UNIQUE KEY `acc` (`account`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `helpermember`
--

LOCK TABLES `helpermember` WRITE;
/*!40000 ALTER TABLE `helpermember` DISABLE KEYS */;
INSERT INTO `helpermember` VALUES (8,'abc','test','test','example','test2','00001111','test','2023-08-16','test','test','ROLE_HELPER'),(17,'C','C','C','C12345','ccc@gmail.com','0979810510','台灣','2023-08-16','0860510','male','ROLE_HELPER'),(19,'pete','Ryan','a123','a123','aaa@gmail.com','0933112233','台灣','2023-08-19','50/02/05','male','ROLE_HELPER'),(20,'Loggin','try Loggin','account','Password','example@gmail.com','0925254433','台灣','2023-08-19','700801','female',''),(21,'test','demo','login','$2a$10$pJQbHNnRqgd6xQDQfbXmLORMQCO0/M8LtCvbXOaFXawXG082rndU2','tryagain@gmail.com','0983621413','台灣','2023-08-20','851021','male',NULL),(22,'SB','SBB','qwert','$2a$10$X0KyuKQRbTSctyEf.RC.HOr4gk0/dlDLEM/t.QoMv/avo39.y6GZC','aec@gmail.com','00000000','台灣','2023-08-20','800427','male','ROLE_USER'),(27,NULL,'換宿打工','travelbywork2023@gmail.com',NULL,'travelbywork2023@gmail.com',NULL,'zh-TW','2023-08-22',NULL,NULL,NULL),(28,NULL,'Olivia iii','rainy57091224@gmail.com',NULL,'rainy57091224@gmail.com',NULL,'zh-TW','2023-08-22',NULL,NULL,NULL),(29,'XDD','ZXC123','ZXC123','$2a$10$MD5TB.AfQnQLAHllcBS73eVSFMEOga0dlk48WjukJ3xy7bD26eIoy','1347865v@gmail.com','0985646133','台灣','2023-08-24','2023-08-01','male','ROLE_USER'),(30,'QAZ123','QAZ123','QAZ123','$2a$10$UcMEbjtMB.gt5Eq6jCgdP.NHEG.7IEUU4ib6eg68709T0UBURlnbK','craigchen510@gmail.com','0900111223','台灣','2023-08-24','2023-08-01','male','ROLE_USER');
/*!40000 ALTER TABLE `helpermember` ENABLE KEYS */;
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
