-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: login
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
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(50) DEFAULT NULL,
  `lastname` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKr43af9ap4edm43mmtq01oddj6` (`username`),
  UNIQUE KEY `UK6dotkott2kjsp8vw4d0m25fb7` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'geerthana65@gmail.com','Raveendran','Keerthana','$2a$10$kSj1wrkyDxSmD3ePUe99/.XjET4GWpIGMUeKN0rxkqi40Nmesi1oC','Keerthana'),(2,'romipraveen8@gmail.com','Praveen','RompiPraveen','$2a$10$Waa7V8t3FjCOUgrBYV5VgumHCC59uvzYr6YjkVeQ7ztAbyhlkv33.','RompiPraveen'),(3,'comadmin@gmail.com','comadmin','comadmin','$2a$10$O0wzQ3CjtQ919ztD.dXjs.sAZ5nkIAESskyZ8beKxmmSPAKAftcFq','comadmin'),(4,'keerthanaraveen@gmail.com','Rammiya','Rammiya','$2a$10$TTutofcr0yWs1s3SYvcnL.TsAXBw0Ivhw0TpjMysjwwVnJpJLnUTm','Narayanan'),(5,'codepanthers2018@gmail.com','Hariloyan','Hariloyan','$2a$10$TVqoDB076g7ZbOYr3iKoMOOWg3t1ijt4P7Zfb.Twdb6shqUfPT2Ai','Niththiyananthan'),(6,'ravilavanjan23@gmail.com','Lavanjan','Lavanjan','$2a$10$VSLL.lADZOmj.2JRrP7qYutgregHBSV3goi7G4qeRycwj.50uN9EC','Ravichchanthiran'),(7,'devadmin@gmail.com','devadmin','devadmin','$2a$10$J.3N042djTufwbfHaztMWOGu.hy55DiKBbzr78Jq1JMDBKwxejH7i','devadmin');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-04 12:01:12
