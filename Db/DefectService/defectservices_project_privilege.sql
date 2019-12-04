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
-- Table structure for table `project_privilege`
--

DROP TABLE IF EXISTS `project_privilege`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `project_privilege` (
  `id` bigint(20) NOT NULL,
  `privilege_name` varchar(255) DEFAULT NULL,
  `status` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project_privilege`
--

LOCK TABLES `project_privilege` WRITE;
/*!40000 ALTER TABLE `project_privilege` DISABLE KEYS */;
INSERT INTO `project_privilege` VALUES (156,'AddProject',_binary ''),(157,'EditProject',_binary ''),(158,'DeleteProject',_binary ''),(159,'AddDefect',_binary ''),(160,'EditDefect',_binary ''),(161,'DeleteDefect',_binary ''),(162,'AddModule',_binary ''),(163,'EditModule',_binary ''),(164,'DeleteModule',_binary ''),(165,'ManageModule',_binary ''),(166,'ManageProject',_binary ''),(167,'ManageDefect',_binary ''),(168,'ManageSubModule',_binary ''),(169,'AddSubModule',_binary ''),(170,'EditSubModule',_binary ''),(171,'DeleteSubModule',_binary ''),(172,'DefectDashboard',_binary ''),(173,'PMManageAllocation',_binary ''),(174,'PMEditAllocation',_binary ''),(175,'PMAddAllocation',_binary ''),(176,'PMDashboard',_binary ''),(177,'QADashboard',_binary ''),(178,'DeveloperDashboard',_binary ''),(179,'DeveloperPrivilege',_binary ''),(180,'QAPrivilege',_binary ''),(181,'TecLeadPrivilege',_binary ''),(212,'CompanyDashboard',_binary ''),(213,'ProductAdministration',_binary ''),(214,'CompanyAdministration',_binary ''),(215,'ManageCompany',_binary ''),(216,'Generalsetting',_binary ''),(217,'LookAndFeel',_binary ''),(218,'ProfileSetting',_binary ''),(219,'GeneralConfiguration',_binary ''),(220,'TroubleshootAndSupport',_binary ''),(221,'ManageAuditLog',_binary ''),(222,'privilege',_binary ''),(223,'CompanyPrivilege',_binary ''),(224,'ProjectPrivilege',_binary ''),(225,'DeveloperPrivilege',_binary ''),(226,'ProjectConfigurePrivilege',_binary ''),(227,'DeveloperConfigurePrivilege',_binary ''),(228,'ProjectManagerConfigurePrivilege',_binary '\0'),(229,'HRConfigurePrivilege',_binary ''),(230,'DefectRolesFlow',_binary ''),(231,'DefectStatusFlow',_binary '\0'),(252,'ProjectAllocation',_binary ''),(355,'HRAllocation',_binary '\0'),(356,'ManageEmployee',_binary '\0'),(357,'AddEmployee',_binary '\0'),(358,'EditEmployee',_binary '\0'),(359,'DeleteEmployee',_binary '\0'),(360,'PriorityConfig',_binary '\0'),(361,'SeverityConfig',_binary '\0'),(362,'DefectStatusConfig',_binary '\0'),(363,'DefectTypeConfig',_binary '\0'),(364,'DefectTypeConfigcom',_binary '\0'),(365,'PriorityConfigcom',_binary '\0'),(366,'SeverityConfigcom',_binary '\0'),(367,'DefectStatusConfigcom',_binary '\0'),(368,'PMPrivilege',_binary '\0'),(369,'HRPrivilege',_binary '');
/*!40000 ALTER TABLE `project_privilege` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-04 14:29:07
