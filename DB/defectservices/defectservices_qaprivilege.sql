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
-- Table structure for table `qaprivilege`
--

DROP TABLE IF EXISTS `qaprivilege`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `qaprivilege` (
  `id` bigint(20) NOT NULL,
  `privilege_name` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qaprivilege`
--

LOCK TABLES `qaprivilege` WRITE;
/*!40000 ALTER TABLE `qaprivilege` DISABLE KEYS */;
INSERT INTO `qaprivilege` VALUES (97,'AddDefect','1'),(98,'EditDefect','1'),(99,'ManageDefect','1'),(100,'DefectDashboard','1'),(101,'AddModule','0'),(102,'DeleteDefect','0'),(103,'EditModule','0'),(104,'ManageModule','0'),(105,'AddSubModule','0'),(106,'EditSubModule','0'),(107,'ManageSubModule','0'),(108,'QADashboard','1'),(109,'QAPrivilage','0'),(142,'PMAddAllocation','0'),(143,'DeveloperDashboard','1'),(283,'CompanyAdministration','0'),(284,'ProductAdministration','0'),(286,'privilege','0'),(288,'CompanyDashboard','0'),(289,'ManageCompany','0'),(290,'ManageProject','0'),(291,'ProjectAllocation','0'),(292,'PMDashboard','0'),(293,'LookAndFeel','0'),(333,'GeneralConfiguration','0'),(334,'ProfileSetting','0');
/*!40000 ALTER TABLE `qaprivilege` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-20 11:08:24
