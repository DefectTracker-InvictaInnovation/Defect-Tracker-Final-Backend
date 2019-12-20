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
-- Table structure for table `developer_privilege`
--

DROP TABLE IF EXISTS `developer_privilege`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `developer_privilege` (
  `id` bigint(20) NOT NULL,
  `privilege_name` varchar(255) DEFAULT NULL,
  `status` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `developer_privilege`
--

LOCK TABLES `developer_privilege` WRITE;
/*!40000 ALTER TABLE `developer_privilege` DISABLE KEYS */;
INSERT INTO `developer_privilege` VALUES (182,'DeleteProject',_binary '\0'),(183,'EditProject',_binary '\0'),(184,'AddProject',_binary '\0'),(185,'AddDefect',_binary ''),(186,'EditDefect',_binary ''),(187,'DeleteDefect',_binary ''),(318,'ManageModule',_binary '\0'),(319,'ProductAdministration',_binary '\0'),(320,'CompanyDashboard',_binary '\0'),(321,'ManageDefect',_binary ''),(322,'ManageSubModule',_binary '\0'),(323,'ManageProject',_binary '\0'),(324,'DefectDashboard',_binary ''),(325,'PMManageAllocation',_binary '\0'),(326,'PMDashboard',_binary '\0'),(327,'QADashboard',_binary '\0'),(328,'DeveloperDashboard',_binary ''),(329,'CompanyAdministration',_binary '\0'),(330,'ManageCompany',_binary '\0'),(331,'GeneralConfiguration',_binary '\0'),(333,'Generalsetting',_binary '\0'),(334,'LookAndFeel',_binary '\0'),(335,'ProfileSetting',_binary ''),(337,'TroubleshootAndSupport',_binary '\0'),(338,'privilege',_binary '\0'),(339,'ProjectAllocation',_binary '\0'),(340,'DefectStatusFlow',_binary '\0');
/*!40000 ALTER TABLE `developer_privilege` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-20 11:08:25
