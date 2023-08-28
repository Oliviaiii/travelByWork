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
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `helpermember`
--

LOCK TABLES `helpermember` WRITE;
/*!40000 ALTER TABLE `helpermember` DISABLE KEYS */;
INSERT INTO `helpermember` VALUES (31,'女孩','林依晨','asd12301','$2a$10$tapdb0ZuijbPROmyMSqs2OYcIsSkGV4qANiJVNFTojhA8kbttq6mi','rainy57091224@gmail.com','0911111111','台灣','2023-08-25','2023-08-01','female','ROLE_USER'),(33,'承協老婆','棠伽灰','zsx12303','$2a$10$R87JZL5LqDtLtfVc51siIuUZdSyncFJcvkVXbxa1rCc3qCP0JFO.m','pipi870108@gmail.com','0933333333','韓國','2023-08-25','2023-08-30','female','ROLE_USER'),(34,'烏來山道神','金城武','asd12304','$2a$10$xxKi49czgpJBVEazCZV3MeFraKhpjwyRcn0akSZwdt/cRvAvjWaR6','1347865v@gmail.com','0927361837','台灣','2023-08-25','2023-08-30','male','ROLE_USER'),(35,'研究生讓你研究生','吳康仁','asd12305','$2a$10$5KlFo1kEflaoKHZhCKDNcOtI/Gw..QqVlGX2Js3ighxH9kXmvPcde','craigchen510@gmail.com','0935343221','台灣','2023-08-25','2023-09-07','male','ROLE_USER'),(36,'不吃早餐的帥哥','大熱狗','asd12306','$2a$10$SMt8dkTOoZKjza9E895N7OBePDaFSW3r1wOv2Cy5ooayxOUYo2e7.','pij2baa34kan@gmail.com','0924235635','台灣','2023-08-25','2023-08-24','male','ROLE_USER');
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

-- Dump completed on 2023-08-28 14:19:06
