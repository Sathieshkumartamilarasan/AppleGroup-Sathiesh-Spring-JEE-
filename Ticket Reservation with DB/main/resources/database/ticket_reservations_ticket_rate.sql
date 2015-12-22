CREATE DATABASE  IF NOT EXISTS `ticket_reservations` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `ticket_reservations`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win64 (x86_64)
--
-- Host: localhost    Database: ticket_reservations
-- ------------------------------------------------------
-- Server version	5.6.24-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ticket_rate`
--

DROP TABLE IF EXISTS `ticket_rate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticket_rate` (
  `ticket_rate_id` int(11) NOT NULL AUTO_INCREMENT,
  `ticket_rate` int(11) NOT NULL,
  `movie_id` int(11) NOT NULL,
  `ticket_type` int(11) NOT NULL,
  PRIMARY KEY (`ticket_rate_id`),
  KEY `fk_ticket_rates_movies_list1_idx` (`movie_id`),
  KEY `fk_ticket_rate_ticket_type1_idx` (`ticket_type`),
  CONSTRAINT `fk_ticket_rate_ticket_type1` FOREIGN KEY (`ticket_type`) REFERENCES `ticket_type` (`ticket_type_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ticket_rates_movies_list1` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`movie_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket_rate`
--

LOCK TABLES `ticket_rate` WRITE;
/*!40000 ALTER TABLE `ticket_rate` DISABLE KEYS */;
INSERT INTO `ticket_rate` VALUES (1,120,1,1),(2,100,1,2),(3,150,2,1),(4,100,2,2),(5,120,1,1),(6,100,1,2),(7,150,2,1),(8,100,2,2),(9,120,3,1),(10,100,3,2),(11,120,4,1),(12,130,4,2),(13,120,2,1),(14,100,2,2),(15,120,4,1),(16,100,4,2),(17,120,1,1),(18,100,1,2),(19,1500,3,1),(20,1000,3,2),(21,150,2,1),(22,80,2,2),(23,120,1,1),(24,13,1,2),(25,150,1,1),(26,100,1,2),(27,120,2,1),(28,100,2,2),(29,150,3,1),(30,100,3,2),(31,120,4,1),(32,100,4,2),(33,140,1,1),(34,130,1,2);
/*!40000 ALTER TABLE `ticket_rate` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-21 12:39:11
