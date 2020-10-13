-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: collegetimetable
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `timetables`
--

DROP TABLE IF EXISTS `timetables`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `timetables` (
  `TABLE_ID` int NOT NULL AUTO_INCREMENT,
  `TABLE_LOCATION` varchar(200) NOT NULL,
  `LECTURER_ID` varchar(20) DEFAULT NULL,
  `HALL_ID` varchar(20) DEFAULT NULL,
  `BATCH_ID` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`TABLE_ID`),
  KEY `LECTURER_ID` (`LECTURER_ID`),
  KEY `HALL_ID` (`HALL_ID`),
  KEY `BATCH_ID` (`BATCH_ID`),
  CONSTRAINT `timetables_ibfk_1` FOREIGN KEY (`LECTURER_ID`) REFERENCES `lecturer` (`lecturerID`),
  CONSTRAINT `timetables_ibfk_2` FOREIGN KEY (`HALL_ID`) REFERENCES `lecturehall` (`HID`),
  CONSTRAINT `timetables_ibfk_3` FOREIGN KEY (`BATCH_ID`) REFERENCES `batch` (`BATCH_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `timetables`
--

LOCK TABLES `timetables` WRITE;
/*!40000 ALTER TABLE `timetables` DISABLE KEYS */;
INSERT INTO `timetables` VALUES (1,'../../TimeTables/Y1-S1-G2',NULL,NULL,'Y1-S1-G2'),(2,'C:\\Users\\Isuru\\Desktop\\hci2\\TimeTablesL1','L1',NULL,NULL),(3,'C:\\Users\\Isuru\\Desktop\\hci2\\TimeTables\\Y1-S2-G1',NULL,NULL,'Y1-S2-G1');
/*!40000 ALTER TABLE `timetables` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-13 17:25:22
