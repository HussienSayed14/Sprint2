-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: my_db
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `driverfavareas`
--

DROP TABLE IF EXISTS `driverfavareas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driverfavareas` (
  `UserName` varchar(50) DEFAULT NULL,
  `FavArea` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driverfavareas`
--

LOCK TABLES `driverfavareas` WRITE;
/*!40000 ALTER TABLE `driverfavareas` DISABLE KEYS */;
INSERT INTO `driverfavareas` VALUES ('hussien','mokkatam'),('sayed','tagamo3'),('hussien','fr'),('hussien','tagamo3'),('hussien','rehab');
/*!40000 ALTER TABLE `driverfavareas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driverinfo`
--

DROP TABLE IF EXISTS `driverinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driverinfo` (
  `UserName` varchar(50) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Phone` int NOT NULL,
  `License` varchar(45) DEFAULT NULL,
  `ID` int NOT NULL,
  `Balance` int DEFAULT NULL,
  PRIMARY KEY (`UserName`,`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driverinfo`
--

LOCK TABLES `driverinfo` WRITE;
/*!40000 ALTER TABLE `driverinfo` DISABLE KEYS */;
INSERT INTO `driverinfo` VALUES ('hussien','1234',1065530064,' ak47',55,150),('sayed','1234',56,' ghhy',89,0);
/*!40000 ALTER TABLE `driverinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ridereq`
--

DROP TABLE IF EXISTS `ridereq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ridereq` (
  `UserName` varchar(50) DEFAULT NULL,
  `Source` varchar(45) DEFAULT NULL,
  `Dest` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ridereq`
--

LOCK TABLES `ridereq` WRITE;
/*!40000 ALTER TABLE `ridereq` DISABLE KEYS */;
INSERT INTO `ridereq` VALUES ('hussien','mokkatam','tagamo3'),('seka','mokktam','erak'),('seka','mokkatam','erak'),('sayed','mokkatam','erak'),('sayed','tagamo3','erak'),('hussien','cairo','lp');
/*!40000 ALTER TABLE `ridereq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rides_offer`
--

DROP TABLE IF EXISTS `rides_offer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rides_offer` (
  `UserName` varchar(50) NOT NULL,
  `DriverName` varchar(45) DEFAULT NULL,
  `Source` varchar(45) DEFAULT NULL,
  `Dest` varchar(45) DEFAULT NULL,
  `Offer` int DEFAULT NULL,
  `RideStat` varchar(50) DEFAULT NULL,
  `Rate` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rides_offer`
--

LOCK TABLES `rides_offer` WRITE;
/*!40000 ALTER TABLE `rides_offer` DISABLE KEYS */;
INSERT INTO `rides_offer` VALUES (' seka','hussien','mokkatam','erak',500,'Waiting',NULL),('hussien','hussien','mokkatam','erak',100,'Ended',5),('sayed','hussien','mokkatam','tagamo3',50,'Ended',5),('hussien','hussien','mokkatam','tagamo3',250,'Ended',20);
/*!40000 ALTER TABLE `rides_offer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userinfo`
--

DROP TABLE IF EXISTS `userinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userinfo` (
  `UserName` varchar(50) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Phone` int NOT NULL,
  PRIMARY KEY (`UserName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userinfo`
--

LOCK TABLES `userinfo` WRITE;
/*!40000 ALTER TABLE `userinfo` DISABLE KEYS */;
INSERT INTO `userinfo` VALUES ('hussien','1234',1065530064),('lol','1234',76),('sayed','1234',900),('seka','1234',10655);
/*!40000 ALTER TABLE `userinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-29 19:38:34
