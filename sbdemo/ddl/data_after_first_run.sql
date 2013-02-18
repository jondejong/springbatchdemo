-- MySQL dump 10.13  Distrib 5.6.10, for osx10.7 (x86_64)
--
-- Host: localhost    Database: sbdemo
-- ------------------------------------------------------
-- Server version	5.6.10

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
-- Table structure for table `game`
--

DROP TABLE IF EXISTS `game`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `game` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `home_score` int(11) NOT NULL,
  `home_team_id` bigint(20) NOT NULL,
  `time` datetime NOT NULL,
  `visitor_score` int(11) NOT NULL,
  `visitor_team_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK304BF2F9F26946` (`home_team_id`),
  KEY `FK304BF28E1EA9D5` (`visitor_team_id`),
  CONSTRAINT `FK304BF28E1EA9D5` FOREIGN KEY (`visitor_team_id`) REFERENCES `team` (`id`),
  CONSTRAINT `FK304BF2F9F26946` FOREIGN KEY (`home_team_id`) REFERENCES `team` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `game`
--

LOCK TABLES `game` WRITE;
/*!40000 ALTER TABLE `game` DISABLE KEYS */;
INSERT INTO `game` VALUES (1,33,2,'2013-09-14 12:00:00',3,3),(2,45,2,'2013-09-21 15:00:00',10,4),(3,23,1,'2013-09-14 15:00:00',17,4),(4,54,1,'2013-09-21 15:00:00',0,3),(5,32,9,'2013-09-14 15:00:00',17,10),(6,27,8,'2013-09-21 15:00:00',23,9),(7,14,6,'2013-09-14 15:00:00',3,8),(8,14,7,'2013-09-21 15:00:00',7,6),(9,6,7,'2013-09-14 15:00:00',17,5),(10,14,5,'2013-09-21 15:00:00',21,11),(11,45,12,'2013-09-14 15:00:00',32,11),(12,17,10,'2013-09-21 15:00:00',33,12);
/*!40000 ALTER TABLE `game` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `team`
--

DROP TABLE IF EXISTS `team`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `team` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `losses` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `nick_name` varchar(255) NOT NULL,
  `win_percentage` decimal(19,2) NOT NULL,
  `wins` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team`
--

LOCK TABLES `team` WRITE;
/*!40000 ALTER TABLE `team` DISABLE KEYS */;
INSERT INTO `team` VALUES (1,0,'Iowa','Hawkeyes',1.00,2),(2,0,'Nebraska','Cornhuskers',1.00,2),(3,2,'Minnesota','Golden Gophers',0.00,0),(4,2,'Illinois','Illini',0.00,0),(5,1,'Purdue','Boilermakers',0.50,1),(6,1,'Indiana','Hoosiers',0.50,1),(7,1,'Northwestern','Wildcats',0.50,1),(8,1,'Wisconsin','Badgers',0.50,1),(9,1,'Michigan','Wolverines',0.50,1),(10,2,'Michigan State','Spartans',0.00,0),(11,1,'Penn State','Nittany Lions',0.50,1),(12,0,'Ohio State','Buckeyes',1.00,2);
/*!40000 ALTER TABLE `team` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-02-18 14:37:51
