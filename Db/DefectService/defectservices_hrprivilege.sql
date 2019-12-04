-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: defectservices
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
-- Table structure for table `hrprivilege`
--

DROP TABLE IF EXISTS `hrprivilege`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hrprivilege` (
  `id` bigint(20) NOT NULL,
  `privilege_name` varchar(255) DEFAULT NULL,
  `status` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hrprivilege`
--

LOCK TABLES `hrprivilege` WRITE;
/*!40000 ALTER TABLE `hrprivilege` DISABLE KEYS */;
INSERT INTO `hrprivilege` VALUES (208,'ManageDefect',_binary '\0'),(209,'ManageProject',_binary ''),(232,'AddProject',_binary ''),(233,'DeleteProject',_binary ''),(234,'EditProject',_binary ''),(236,'ManageModule',_binary '\0'),(237,'DefectDashboard',_binary '\0'),(238,'PMDashboard',_binary '\0'),(239,'QADashboard',_binary '\0'),(240,'DeveloperDashboard',_binary '\0'),(241,'DeveloperPrivilege',_binary ''),(242,'QAPrivilege',_binary ''),(243,'TecLeadPrivilege',_binary ''),(244,'CompanyDashboard',_binary ''),(245,'ManageCompany',_binary ''),(246,'privilege',_binary ''),(247,'CompanyPrivilege',_binary '\0'),(248,'ProjectPrivilege',_binary ''),(249,'DeveloperConfigurePrivilege',_binary ''),(250,'ProjectManagerConfigurePrivilege',_binary ''),(251,'HRConfigurePrivilege',_binary '\0'),(253,'ProjectAllocation',_binary '\0'),(254,'ProductAdministration',_binary '\0'),(255,'CompanyAdministration',_binary '\0');
/*!40000 ALTER TABLE `hrprivilege` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-04 14:29:04
