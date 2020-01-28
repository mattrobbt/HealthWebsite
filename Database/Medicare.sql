
# Host: silva.computing.dundee.ac.uk (MySQL 5.1.37)
# Database: 19agileteam16db

# following conditional comments copied from SQLTutorialCreateDatabase.sql
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

#DROP DATABASE IF EXISTS `19agileteam16db`;

#CREATE DATABASE `19agileteam16db`;

USE `19agileteam16db`;

# Medicare

DROP TABLE IF EXISTS `Provider`;
# ------------------------------------------------------------

CREATE TABLE `Provider` (
  `ProviderID`  char(8) NOT NULL, 
  Name       	 varchar(255) NOT NULL, 
  StreetAddress  char(255) NOT NULL, 
  City         	 varchar(255) NULL, 
  State          varchar(255) NOT NULL, 
  ZipCode 		 char(8) NOT NULL, 
  HRR        	 varchar(255), 
  PRIMARY KEY (`ProviderID`)
  );

LOCK TABLES `Provider` WRITE;
/*!40000 ALTER TABLE `Provider` DISABLE KEYS */;
INSERT INTO `Provider` (`ProviderID`, Name, StreetAddress, City, State, ZipCode, HRR )
VALUES
	('10033','Uni of Alabama','619 South 19TH STREET','BIRMINGHAM','AL','35233','AL -Birmingham');
	
/*!40000 ALTER TABLE `Provider` ENABLE KEYS */;
UNLOCK TABLES;


# Procedures
# ------------------------------------------------------------

DROP TABLE IF EXISTS Procedures;

CREATE TABLE Procedures (
  `ProceduresID` 	  char(8) NOT NULL, 
  Description         varchar(255) NOT NULL,  
  PRIMARY KEY (`ProceduresID`)
  );
  

LOCK TABLES `Procedures` WRITE;
/*!40000 ALTER TABLE `Procedures` DISABLE KEYS */;
INSERT INTO `Procedures` (`ProceduresID`, Description)
VALUES 
	('1','Heart')
	;
/*!40000 ALTER TABLE `Procedures` ENABLE KEYS */;
UNLOCK TABLES;


# Treatment
# ------------------------------------------------------------
DROP TABLE IF EXISTS Treatment;

CREATE TABLE Treatment (
  `TreatmentID` 	char(8) NOT NULL, 
  ProviderID    	char(8) NOT NULL, 
  ProcedureID       char(8) NOT NULL, 
  AveragePayments   char(16), 
  TotalDischarges   char(8) NOT NULL, 
  PRIMARY KEY (`TreatmentID`)
  );
  

LOCK TABLES `Treatment` WRITE;
/*!40000 ALTER TABLE `Treatment` DISABLE KEYS */;
INSERT INTO `Treatment` (`TreatmentID`, ProviderID, ProcedureID, AveragePayments, TotalDischarges)
VALUES 
	('1111','089', '890', '8908','89');
	
	;
/*!40000 ALTER TABLE `Treatment` ENABLE KEYS */;
UNLOCK TABLES;