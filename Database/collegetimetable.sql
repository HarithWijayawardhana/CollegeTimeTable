-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: collegetimetable
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `batch`
--

DROP TABLE IF EXISTS `batch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `batch` (
  `BATCH_ID` varchar(20) NOT NULL,
  `BATCH_YEAR` varchar(20) DEFAULT NULL,
  `BATCH_SEMESTER` varchar(20) DEFAULT NULL,
  `BATCH_GROUP` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`BATCH_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `batch`
--

LOCK TABLES `batch` WRITE;
/*!40000 ALTER TABLE `batch` DISABLE KEYS */;
INSERT INTO `batch` VALUES ('Y1-S1-G1','Year 1','Semester 1','Group 1'),('Y1-S1-G2','Year 1','Semester 1','Group 2'),('Y1-S2-G1','Year 1','Semester 2','Group 1'),('Y1-S2-G2','Year 1','Semester 2','Group 2'),('Y2-S1-G1','Year 2','Semester 1','Group 1'),('Y2-S1-G2','Year 2','Semester 1','Group 2'),('Y2-S2-G1','Year 2','Semester 2','Group 1'),('Y2-S2-G2','Year 2','Semester 2','Group 2'),('Y3-S1-G1','Year 3','Semester 1','Group 1'),('Y3-S1-G2','Year 3','Semester 1','Group 2'),('Y3-S2-G1','Year 3','Semester 2','Group 1'),('Y3-S2-G2','Year 3','Semester 2','Group 2');
/*!40000 ALTER TABLE `batch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lecturehall`
--

DROP TABLE IF EXISTS `lecturehall`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lecturehall` (
  `HID` varchar(20) NOT NULL,
  `HNAME` varchar(20) DEFAULT NULL,
  `BNAME` varchar(20) DEFAULT NULL,
  `CAPACITY` int DEFAULT NULL,
  PRIMARY KEY (`HID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lecturehall`
--

LOCK TABLES `lecturehall` WRITE;
/*!40000 ALTER TABLE `lecturehall` DISABLE KEYS */;
/*!40000 ALTER TABLE `lecturehall` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lecturer`
--

DROP TABLE IF EXISTS `lecturer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lecturer` (
  `lecturerID` varchar(20) NOT NULL,
  `fname` varchar(35) DEFAULT NULL,
  `lname` varchar(40) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `contactNum` varchar(10) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  `position` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`lecturerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lecturer`
--

LOCK TABLES `lecturer` WRITE;
/*!40000 ALTER TABLE `lecturer` DISABLE KEYS */;
INSERT INTO `lecturer` VALUES ('L1','John','Smith','Male','0771234567','jsmith@gmail.com','Lecturer'),('L10','Shaun','Mendis','Male','0784634567','shMen12@gmail.com','Lecturer'),('L2','Harris','Jackle','Male','0711234567','harrisj@yahoo.com','Assistant Lecturer'),('L3','Gwen','Tennison','Female','0775234567','gten@hotmail.com','Senior Lecturer'),('L4','Frank','Jonson','Male','0717834567','frankjon@gmail.com','Senior Lecturer'),('L5','Jakie','Bolt','Female','0775634567','jbolt@gmail.com','Dean'),('L6','David','Finis','Male','0717374567','davfin@gmail.com','Assistant Lecturer'),('L7','Amenda','Francis','Female','0714234567','amend@yahoo.com','Lecturer'),('L8','Micheal','Block','Male','0765234567','micblock@gmail.com','SeniorLecturer'),('L9','Windie','Clara','Female','0741534567','windie123@gmail.com','Dean');
/*!40000 ALTER TABLE `lecturer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lecturerhallmanagement`
--

DROP TABLE IF EXISTS `lecturerhallmanagement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lecturerhallmanagement` (
  `hallId` varchar(45) NOT NULL,
  `hallName` varchar(45) NOT NULL,
  `buildingName` varchar(45) NOT NULL,
  `capacity` int NOT NULL,
  PRIMARY KEY (`hallId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lecturerhallmanagement`
--

LOCK TABLES `lecturerhallmanagement` WRITE;
/*!40000 ALTER TABLE `lecturerhallmanagement` DISABLE KEYS */;
INSERT INTO `lecturerhallmanagement` VALUES ('1','ABIT','A400',500),('2','CMIT','A400',400),('3','ASAP','A510',200),('4','BSIT','A400',200),('5','CDN','A400',125),('6','BM','A510',120),('7','DSM','B500',200),('8','UTF','A400',100);
/*!40000 ALTER TABLE `lecturerhallmanagement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lecturerinfo`
--

DROP TABLE IF EXISTS `lecturerinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lecturerinfo` (
  `L_ID` varchar(45) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Gender` varchar(45) DEFAULT NULL,
  `ContactNo` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Subject` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`L_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lecturerinfo`
--

LOCK TABLES `lecturerinfo` WRITE;
/*!40000 ALTER TABLE `lecturerinfo` DISABLE KEYS */;
INSERT INTO `lecturerinfo` VALUES ('L001','K.Smith ela','Male','0774865623','smith@gmail.com','HCI'),('L002','M.kelly','Female','0784562536','kelly@gmail.com','BMI'),('L003','N.Jerry','Male','0714569632','jerry@gmail.com','IAS');
/*!40000 ALTER TABLE `lecturerinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `timetableinfo`
--

DROP TABLE IF EXISTS `timetableinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `timetableinfo` (
  `Time_Table_ID` text,
  `Time_Table_Name` text,
  `Subject` text,
  `Action` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `timetableinfo`
--

LOCK TABLES `timetableinfo` WRITE;
/*!40000 ALTER TABLE `timetableinfo` DISABLE KEYS */;
INSERT INTO `timetableinfo` VALUES ('IT1203011','IT Year 3 Semester 1','Information Technology',NULL),('IT1203012','BIO Year 2 Semester 2','Biology',NULL),('IT1203015','ENG Year 1 Semester 1','Engineering',NULL),('IT1203016','BNM Year 1 Semester 2','Business Management',NULL),('IT1203017','MS Year 2 Semester 1','Music',NULL);
/*!40000 ALTER TABLE `timetableinfo` ENABLE KEYS */;
UNLOCK TABLES;

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `timetables`
--

LOCK TABLES `timetables` WRITE;
/*!40000 ALTER TABLE `timetables` DISABLE KEYS */;
INSERT INTO `timetables` VALUES (1,'../../TimeTables/Y1-S1-G2',NULL,NULL,'Y1-S1-G2'),(2,'C:\\Users\\Isuru\\Desktop\\hci2\\TimeTablesL1','L1',NULL,NULL),(3,'C:\\Users\\Isuru\\Desktop\\hci2\\TimeTables\\Y1-S2-G1',NULL,NULL,'Y1-S2-G1'),(4,'H:\\NetBeans Project\\CTT\\CollegeTimeTable\\timetables\\Y1-S1-G1',NULL,NULL,'Y1-S1-G1');
/*!40000 ALTER TABLE `timetables` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `visitinglecturer`
--

DROP TABLE IF EXISTS `visitinglecturer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `visitinglecturer` (
  `temporyId` varchar(45) NOT NULL,
  `lecturerName` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `contactNumber` int NOT NULL,
  `subjectVenue` varchar(45) NOT NULL,
  PRIMARY KEY (`temporyId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visitinglecturer`
--

LOCK TABLES `visitinglecturer` WRITE;
/*!40000 ALTER TABLE `visitinglecturer` DISABLE KEYS */;
INSERT INTO `visitinglecturer` VALUES ('BM1237928','Sam wilson','sam123@gmail.com',74353454,'N3B'),('BM1237978','Hiruni ','hiru123@gmail.com',71263576,'N4B'),('IT12328756','Rupasinghe ','madurox@gmail.com',72368223,'B02'),('IT18027716','Kushan','kushanrox@gmail.com',76234236,'A01');
/*!40000 ALTER TABLE `visitinglecturer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-16 22:27:23
