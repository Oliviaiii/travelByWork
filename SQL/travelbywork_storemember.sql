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
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storemember`
--

LOCK TABLES `storemember` WRITE;
/*!40000 ALTER TABLE `storemember` DISABLE KEYS */;
INSERT INTO `storemember` VALUES (16,'qwe12301','台東蘭嶼⁣鄉椰油村298-4號','2023-08-25 00:00:00.000000','pipi870108@gmail.com','0944444444','小美','$2a$10$gEuATfuhtZ2/ANC3zu9mneNHpVV53TT7TV.8tKd55fvBGxA4a8jiO','','小琉球酒吧Bar Second','ROLE_ADMIN'),(17,'qwe12302','台東綠島鄉南寮村111號','2023-08-25 00:00:00.000000','rainy57091224@gmail.com','0955555555','林小萍','$2a$10$CcgmgrFYPYYMIaN6mflfV.hSOhhVp0ZA7x/5BLU18cxQadQoCDUta','089671029','釣漁人','ROLE_ADMIN'),(19,'qwe12304','台東縣東河鄉17號','2023-08-25 00:00:00.000000','pij2baa34kan@gmail.com','0924123413','老闆Ａ','$2a$10$TIyTgygHHL0jMArusuStoudhG00vLmxW4fEbbg6LLM2nLpqmG5Fpq','','金樽衝浪小屋 Jinzun surf house','ROLE_ADMIN'),(20,'qwe12305','屏東縣恆春鎮恆公路716-13號','2023-08-25 00:00:00.000000','craigchen510@gmail.com','0923456432','老闆Ｂ','$2a$10$R9BuJG7n/0bTFrk3KamY/.d6.Fmig0VsKGhQy5bhmqvizJbkA6iKK','','Lawa衝浪工作室','ROLE_ADMIN'),(21,'qwe12306','宜蘭縣頭城鎮烏石港路103-6號','2023-08-25 00:00:00.000000','1347865v@gmail.com','0963583953','董事長','$2a$10$skKCBzj/7EQw/XvAyE5FnuBYQbBGLILdNsKGzdR.HNV4QQ0M7zmz6','','菜鳥衝浪','ROLE_ADMIN');
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

-- Dump completed on 2023-08-28 14:19:07
