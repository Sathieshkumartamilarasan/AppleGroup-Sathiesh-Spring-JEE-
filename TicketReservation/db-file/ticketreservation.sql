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
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movie` (
  `movie_id` int(11) NOT NULL AUTO_INCREMENT,
  `movie_name` varchar(45) NOT NULL,
  `release_date` date DEFAULT NULL,
  `no_of_shows` int(11) DEFAULT NULL,
  `created_date` varchar(45) DEFAULT NULL,
  `updated_date` varchar(45) DEFAULT NULL,
  `active` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`movie_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie`
--

LOCK TABLES `movie` WRITE;
/*!40000 ALTER TABLE `movie` DISABLE KEYS */;
INSERT INTO `movie` VALUES (1,'kili','2016-01-10',1,'2015-12-07-05.24.46','2015-12-07-05.24.46',1),(2,'vaalu','2016-02-21',3,'2015-12-07-05.20.59','2015-12-07-05.20.59',1),(3,'kathi','2016-01-01',2,'2015-12-07-05.21.39','2015-12-07-05.21.39',1),(4,'puli','2015-11-26',1,'2015-12-07-05.22.21','2015-12-07-05.22.21',1);
/*!40000 ALTER TABLE `movie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movies_list_has_timings`
--

DROP TABLE IF EXISTS `movies_list_has_timings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movies_list_has_timings` (
  `movie_id` int(11) NOT NULL,
  `timings_id` int(11) NOT NULL,
  KEY `fk_movies_list_has_timings_timings1_idx` (`timings_id`),
  KEY `fk_movies_list_has_timings_movies_list1_idx` (`movie_id`),
  CONSTRAINT `fk_movies_list_has_timings_movies_list1` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`movie_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_movies_list_has_timings_timings1` FOREIGN KEY (`timings_id`) REFERENCES `timings` (`timings_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movies_list_has_timings`
--

LOCK TABLES `movies_list_has_timings` WRITE;
/*!40000 ALTER TABLE `movies_list_has_timings` DISABLE KEYS */;
INSERT INTO `movies_list_has_timings` VALUES (2,2),(2,3),(3,4),(4,3),(1,4);
/*!40000 ALTER TABLE `movies_list_has_timings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservation` (
  `reservation_id` int(11) NOT NULL,
  `reservation_count` int(11) NOT NULL DEFAULT '1',
  `reservation_date` datetime DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `reservation_status` int(11) NOT NULL,
  `reserved_by` int(11) NOT NULL,
  `movie_id` int(11) NOT NULL,
  `timings_id` int(11) NOT NULL,
  PRIMARY KEY (`reservation_id`),
  KEY `fk_reservation_reservation_status1_idx` (`reservation_status`),
  KEY `fk_reservation_user1_idx` (`reserved_by`),
  KEY `fk_reservation_movie1_idx` (`movie_id`),
  KEY `fk_reservation_timings1_idx` (`timings_id`),
  CONSTRAINT `fk_reservation_movie1` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`movie_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_reservation_reservation_status1` FOREIGN KEY (`reservation_status`) REFERENCES `reservation_status` (`reservation_status_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_reservation_timings1` FOREIGN KEY (`timings_id`) REFERENCES `timings` (`timings_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_reservation_user1` FOREIGN KEY (`reserved_by`) REFERENCES `userdata` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation`
--

LOCK TABLES `reservation` WRITE;
/*!40000 ALTER TABLE `reservation` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservation_status`
--

DROP TABLE IF EXISTS `reservation_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservation_status` (
  `reservation_status_id` int(11) NOT NULL AUTO_INCREMENT,
  `reservation_status` varchar(45) NOT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `created_by` int(11) DEFAULT NULL,
  `updated_by` int(11) DEFAULT NULL,
  PRIMARY KEY (`reservation_status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation_status`
--

LOCK TABLES `reservation_status` WRITE;
/*!40000 ALTER TABLE `reservation_status` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservation_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reserved_seat`
--

DROP TABLE IF EXISTS `reserved_seat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reserved_seat` (
  `reserved_seat_id` int(11) NOT NULL AUTO_INCREMENT,
  `reserved_seat_no` varchar(45) NOT NULL,
  `reservation_id` int(11) NOT NULL,
  PRIMARY KEY (`reserved_seat_id`),
  KEY `fk_reserved_seat_reservation1_idx` (`reservation_id`),
  CONSTRAINT `fk_reserved_seat_reservation1` FOREIGN KEY (`reservation_id`) REFERENCES `reservation` (`reservation_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reserved_seat`
--

LOCK TABLES `reserved_seat` WRITE;
/*!40000 ALTER TABLE `reserved_seat` DISABLE KEYS */;
/*!40000 ALTER TABLE `reserved_seat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `RoleId` int(11) NOT NULL AUTO_INCREMENT,
  `Role` varchar(45) NOT NULL,
  PRIMARY KEY (`RoleId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'user'),(2,'admin');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

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

--
-- Table structure for table `ticket_type`
--

DROP TABLE IF EXISTS `ticket_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticket_type` (
  `ticket_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `ticket_type` varchar(45) NOT NULL,
  `ticket_type_count` int(11) NOT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  PRIMARY KEY (`ticket_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket_type`
--

LOCK TABLES `ticket_type` WRITE;
/*!40000 ALTER TABLE `ticket_type` DISABLE KEYS */;
INSERT INTO `ticket_type` VALUES (1,'First Class',50,'2015-12-07 10:50:23','2015-12-07 10:50:23'),(2,'second class',50,'2015-12-07 10:50:38','2015-12-07 10:50:38');
/*!40000 ALTER TABLE `ticket_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `timings`
--

DROP TABLE IF EXISTS `timings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `timings` (
  `timings_id` int(11) NOT NULL AUTO_INCREMENT,
  `timings` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  PRIMARY KEY (`timings_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `timings`
--

LOCK TABLES `timings` WRITE;
/*!40000 ALTER TABLE `timings` DISABLE KEYS */;
INSERT INTO `timings` VALUES (1,'10.00am-1.00pm','2015-12-07 10:48:03','2015-12-07 10:48:03'),(2,'1.30pm-4.30pm','2015-12-07 10:45:00','2015-12-07 10:45:00'),(3,'5.00pm-8.00pm','2015-12-07 10:46:42','2015-12-07 10:46:42'),(4,'11.00pm-3.00am','2015-12-07 10:47:21','2015-12-07 10:47:21');
/*!40000 ALTER TABLE `timings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userdata`
--

DROP TABLE IF EXISTS `userdata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userdata` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `address` varchar(250) NOT NULL,
  `contact` varchar(45) NOT NULL,
  `createdby` varchar(45) NOT NULL,
  `updatedby` varchar(45) NOT NULL,
  `createddate` varchar(45) NOT NULL,
  `updateddate` varchar(45) NOT NULL,
  `role_RoleId` int(11) NOT NULL,
  PRIMARY KEY (`id`,`role_RoleId`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  KEY `fk_userdata_role1_idx` (`role_RoleId`),
  CONSTRAINT `fk_userdata_role1` FOREIGN KEY (`role_RoleId`) REFERENCES `role` (`RoleId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userdata`
--

LOCK TABLES `userdata` WRITE;
/*!40000 ALTER TABLE `userdata` DISABLE KEYS */;
INSERT INTO `userdata` VALUES (1,'admin','admin','sat@wwq.qyteqwe','xXz','adds','xzczx','1234','admin','admin','2015-12-07-09.42.43','2015-12-07-09.42.43',2),(2,'aaa','aaa','aasdsda@ffsfsf.fsfsdf','adsasn','adsda','xzczx','1223455','aaa','aaa','2015-12-07-02.46.30','2015-12-07-02.46.30',1);
/*!40000 ALTER TABLE `userdata` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-22 18:46:02
