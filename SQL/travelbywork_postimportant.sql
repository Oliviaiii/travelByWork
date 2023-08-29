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
-- Table structure for table `postimportant`
--

DROP TABLE IF EXISTS `postimportant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `postimportant` (
  `postimportantid` int NOT NULL AUTO_INCREMENT,
  `adminmemberid` int DEFAULT NULL,
  `postdate` varchar(255) DEFAULT NULL,
  `postwhat` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `words` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`postimportantid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `postimportant`
--

LOCK TABLES `postimportant` WRITE;
/*!40000 ALTER TABLE `postimportant` DISABLE KEYS */;
INSERT INTO `postimportant` VALUES (3,4,'2023-08-25','早安','amy','現在我有冰激凌'),(5,4,'2023-08-25','我快死了','amy','怎麼那們多bug'),(6,4,'2023-08-25','店家請注意','amy','沒有符合貼文格式的店家，麻煩檢視一下，立即更改，若遲不更改，將刪掉您的貼文，不再另行通知！\n你貼的徵文一直沒有出現嗎？\n是不是你自己沒看板規，導致你的貼文一直沒有審批呢？\n煩請各位業者，詳讀置頂貼文貼文規定，也請按照貼文格式貼文，拜託大家！');
/*!40000 ALTER TABLE `postimportant` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-28 16:00:08
