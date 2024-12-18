-- MySQL dump 10.13  Distrib 8.0.40, for Linux (x86_64)
--
-- Host: localhost    Database: hackerrank
-- ------------------------------------------------------
-- Server version	8.0.40-0ubuntu0.22.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `city`
--

DROP TABLE IF EXISTS `city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `city` (
  `id` int NOT NULL,
  `name` varchar(100) NOT NULL,
  `country` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  `population` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `city`
--

LOCK TABLES `city` WRITE;
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` VALUES (1,'Mumbai','India','Maharashtra',20411000),(2,'Pune','India','Maharashtra',3124458),(3,'Nagpur','India','Maharashtra',2405665),(4,'Nashik','India','Maharashtra',1486053),(5,'Aurangabad','India','Maharashtra',1175116),(6,'Delhi','India','Delhi',16787941),(7,'New Delhi','India','Delhi',142004),(8,'Dwarka','India','Delhi',110000),(9,'Rohini','India','Delhi',860000),(10,'Saket','India','Delhi',120000),(11,'Bengaluru','India','Karnataka',8443675),(12,'Mysuru','India','Karnataka',920550),(13,'Mangaluru','India','Karnataka',623841),(14,'Hubballi','India','Karnataka',943857),(15,'Belagavi','India','Karnataka',610189),(16,'Chennai','India','Tamil Nadu',7090000),(17,'Coimbatore','India','Tamil Nadu',1615710),(18,'Madurai','India','Tamil Nadu',1561129),(19,'Tiruchirappalli','India','Tamil Nadu',916857),(20,'Salem','India','Tamil Nadu',831038),(21,'Kolkata','India','West Bengal',4486679),(22,'Howrah','India','West Bengal',1077075),(23,'Durgapur','India','West Bengal',580990),(24,'Asansol','India','West Bengal',563917),(25,'Siliguri','India','West Bengal',513264);
/*!40000 ALTER TABLE `city` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `country`
--

DROP TABLE IF EXISTS `country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `country` (
  `country_id` int NOT NULL,
  `name` varchar(100) NOT NULL,
  `continent` varchar(100) NOT NULL,
  `region` varchar(100) NOT NULL,
  `population` int NOT NULL,
  PRIMARY KEY (`country_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `country`
--

LOCK TABLES `country` WRITE;
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` VALUES (1,'China','Asia','East Asia',1409517397),(2,'India','Asia','South Asia',1339180127),(3,'Indonesia','Asia','Southeast Asia',263991379),(4,'Pakistan','Asia','South Asia',197015955),(5,'Bangladesh','Asia','South Asia',164669751),(6,'Japan','Asia','East Asia',127484450),(7,'Philippines','Asia','Southeast Asia',104918090),(8,'Vietnam','Asia','Southeast Asia',95540800),(9,'Turkey','Asia','Western Asia',80745020),(10,'Iran','Asia','Western Asia',81162788),(11,'Nigeria','Africa','West Africa',190886311),(12,'Ethiopia','Africa','East Africa',104957438),(13,'Egypt','Africa','North Africa',97553151),(14,'DR Congo','Africa','Central Africa',81339988),(15,'Tanzania','Africa','East Africa',57310019),(16,'South Africa','Africa','Southern Africa',56717156),(17,'Kenya','Africa','East Africa',49699862),(18,'Uganda','Africa','East Africa',42862958),(19,'Algeria','Africa','North Africa',41318142),(20,'Sudan','Africa','North Africa',40533330),(21,'United States','North America','Northern America',324459463),(22,'Mexico','North America','Central America',129163276),(23,'Canada','North America','Northern America',36624199),(24,'Guatemala','North America','Central America',16913503),(25,'Honduras','North America','Central America',9265067),(26,'El Salvador','North America','Central America',6377853),(27,'Nicaragua','North America','Central America',6217581),(28,'Costa Rica','North America','Central America',4905769),(29,'Panama','North America','Central America',4098587),(30,'Jamaica','North America','Caribbean',2890299),(31,'Brazil','South America','South America',209288278),(32,'Colombia','South America','South America',49065615),(33,'Argentina','South America','South America',44271041),(34,'Peru','South America','South America',32165485),(35,'Venezuela','South America','South America',31977065),(36,'Chile','South America','South America',18054726),(37,'Ecuador','South America','South America',16624858),(38,'Bolivia','South America','South America',11051600),(39,'Paraguay','South America','South America',6811297),(40,'Uruguay','South America','South America',3456750),(41,'Germany','Europe','Western Europe',82114224),(42,'France','Europe','Western Europe',65273511),(43,'United Kingdom','Europe','Northern Europe',66181585),(44,'Italy','Europe','Southern Europe',60589445),(45,'Spain','Europe','Southern Europe',46354321),(46,'Ukraine','Europe','Eastern Europe',44222947),(47,'Poland','Europe','Eastern Europe',38170712),(48,'Romania','Europe','Eastern Europe',19679306),(49,'Netherlands','Europe','Western Europe',17035938),(50,'Belgium','Europe','Western Europe',11429336);
/*!40000 ALTER TABLE `country` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-15 23:32:11
