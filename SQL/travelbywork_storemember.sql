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
-- Table structure for table `storemember`
--

DROP TABLE IF EXISTS `storemember`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `storemember` (
  `storememberid` int NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `createtime` datetime(6) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `ownername` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `storename` varchar(255) DEFAULT NULL,
  `role` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`storememberid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storemember`
--

LOCK TABLES `storemember` WRITE;
/*!40000 ALTER TABLE `storemember` DISABLE KEYS */;
INSERT INTO `storemember` VALUES (1,'test123','testaddress','2023-08-14 10:12:35.168000','test@gmail.com','123','test','test','1234','test',NULL),(2,'A123','AAAaddress','2023-08-14 10:13:58.461000','AAA@gmail.com','0800','ownerA','AAAAAA','0989','Astore',NULL),(3,'B123','BBBaddress','2023-08-14 10:14:38.042000','BBB@gmail.com','0987','ownerB','BBBBBB','9999','Bstore',NULL),(4,'C123','CCCaddress','2023-08-14 10:15:10.295000','CCC@gmail.com','6543','ownerC','CCCCCC','8888','Cstore',NULL),(5,'D123','DDDaddress','2023-08-14 10:15:39.830000','DDD@gmail.com','4321','ownerD','DDDDDD','1111','Dstore',NULL),(11,'qwe123','光武街110巷23號1樓',NULL,'rainy57091224@gmail.com','0912345678',NULL,'$2a$10$qKs4OsfgAW19cLst8gHcHuCifQBsfRr0p5e0Uk/upsacvSO5/pIBG','0222522018',NULL,'ROLE_ADMIN'),(14,'ASD123','新北市新莊區中平街49號2樓','2023-08-24 00:00:00.000000','1347865v@gmail.com','0983621413','ASD123','$2a$10$WtqbO6nJpS3CC8HwVX237uoWIkn3x5jIjx2PCNXhyuXXiuzLXtDju','00000000','ASD123','ROLE_ADMIN'),(15,'ZXCVBN','新北市林口區文化一路103號1樓','2023-08-24 00:00:00.000000','craigchen510@gmail.com','0918521333','ZXCVBN','$2a$10$0dHTxpIafZuAdqSwLuSSze1jHLwZ8AhYXycaJ83e1yPBkBoRn66lO','22222222','ASD123','ROLE_ADMIN');
/*!40000 ALTER TABLE `storemember` ENABLE KEYS */;
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
