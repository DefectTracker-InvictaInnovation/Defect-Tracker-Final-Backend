-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: employeeservice
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `emp_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `availability` int(11) NOT NULL,
  `bench` bit(1) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `employee_id` varchar(255) DEFAULT NULL,
  `firstname` varchar(30) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `profile_pic_path` varchar(255) DEFAULT NULL,
  `designationid` bigint(20) NOT NULL,
  PRIMARY KEY (`emp_id`),
  UNIQUE KEY `UKq7qfpr8knheb8my2sglnwp52c` (`employee_id`,`email`),
  UNIQUE KEY `UK_fopic1oh5oln2khj8eat6ino0` (`email`),
  UNIQUE KEY `UK_mc5x07dj0uft9opsxchp0uwji` (`employee_id`),
  KEY `FKs0vvq2yvptotq0qhtpla8mfd4` (`designationid`),
  CONSTRAINT `FKs0vvq2yvptotq0qhtpla8mfd4` FOREIGN KEY (`designationid`) REFERENCES `designation` (`designationid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,100,_binary '\0','geerthana65@gmail.com','EMP001','Raveendran','Keerthana',NULL,4),(2,100,_binary '\0','romipraveen8@gmail.com','EMP002','Praveen','Romipraveen','http://DESKTOP-EICKTE8:8084/employeeservice/downloadFile/1575448181420_thumb-1920-313767.jpg',2),(3,100,_binary '\0','Keerthanaraveen@gmail.com','EMP003','Narayanan','Rammiya','http://DESKTOP-EICKTE8:8084/employeeservice/downloadFile/1575448211312_Full-HD-1080p-Wallpaper-HD-Nature.jpg',3),(4,100,_binary '\0','codepanthers2018@gmail.com','EMP004','Nithiyananthan','Hariloyan','http://DESKTOP-EICKTE8:8084/employeeservice/downloadFile/1575448259222_1080p-Wallpapers-Full-HD-Download.jpg',2);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-04 14:29:11
