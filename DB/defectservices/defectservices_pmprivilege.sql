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
-- Table structure for table `pmprivilege`
--

DROP TABLE IF EXISTS `pmprivilege`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pmprivilege` (
  `id` bigint(20) NOT NULL,
  `privilege_name` varchar(255) DEFAULT NULL,
  `status` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_3otd2copw6702ah3b2e435bhc` (`privilege_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pmprivilege`
--

LOCK TABLES `pmprivilege` WRITE;
/*!40000 ALTER TABLE `pmprivilege` DISABLE KEYS */;
INSERT INTO `pmprivilege` VALUES (188,'AddProject',_binary '\0'),(189,'EditDefect',_binary ''),(190,'DeleteProject',_binary '\0'),(191,'EditProject',_binary ''),(192,'DeleteDefect',_binary '\0'),(193,'AddDefect',_binary '\0'),(194,'ManageModule',_binary ''),(195,'EditModule',_binary ''),(196,'AddModule',_binary ''),(197,'DeleteModule',_binary ''),(256,'ManageProject',_binary ''),(257,'QADashboard',_binary '\0'),(258,'PMManageAllocation',_binary ''),(259,'PMDashboard',_binary ''),(260,'ManageDefect',_binary ''),(262,'ManageSubModule',_binary ''),(263,'DeveloperPrivilege',_binary '\0'),(264,'DefectDashboard',_binary '\0'),(265,'privilege',_binary '\0'),(266,'TroubleshootAndSupport',_binary ''),(267,'DeveloperDashboard',_binary '\0'),(268,'ManageAuditLog',_binary ''),(269,'QAPrivilege',_binary '\0'),(270,'ProfileSetting',_binary ''),(272,'CompanyPrivilege',_binary '\0'),(273,'CompanyAdministration',_binary '\0'),(274,'ProductAdministration',_binary '\0'),(275,'ManageCompany',_binary '\0'),(276,'DefectRolesFlow',_binary '\0'),(277,'GeneralConfiguration',_binary '\0'),(278,'HRConfigurePrivilege',_binary '\0'),(282,'LookAndFeel',_binary '\0'),(304,'CompanyDashboard',_binary '\0'),(313,'Generalsetting',_binary ''),(315,'ProjectAllocation',_binary ''),(347,'ProjectManagerConfigurePrivilege',_binary '\0'),(364,'PMAllocation',_binary '\0');
/*!40000 ALTER TABLE `pmprivilege` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-23 16:04:26
