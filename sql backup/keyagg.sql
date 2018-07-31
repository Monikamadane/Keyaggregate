-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 31, 2017 at 03:43 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `keyagg`
--

-- --------------------------------------------------------

--
-- Table structure for table `index`
--

CREATE TABLE IF NOT EXISTS `index` (
  `owner` text NOT NULL,
  `fileid` text NOT NULL,
  `FLW` text NOT NULL,
  `Word` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `keygeneration`
--

CREATE TABLE IF NOT EXISTS `keygeneration` (
  `DataOnwerName` varchar(50) DEFAULT NULL,
  `SymmetricKey` varchar(32000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `keygeneration`
--

INSERT INTO `keygeneration` (`DataOnwerName`, `SymmetricKey`) VALUES
('admin', 'rLavR3N4/nE6/ngQwM9gEQ==');

-- --------------------------------------------------------

--
-- Table structure for table `keyrequest`
--

CREATE TABLE IF NOT EXISTS `keyrequest` (
  `RequesterName` varchar(50) DEFAULT NULL,
  `DataOwnerName` varchar(50) DEFAULT NULL,
  `SymmetricKey` text,
  `Docname` varchar(32000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `keyrequest`
--

INSERT INTO `keyrequest` (`RequesterName`, `DataOwnerName`, `SymmetricKey`, `Docname`) VALUES
('ramesh', 'admin', '1272673770,671089476,854942935,1476174042,589881144,1178956430,1476174042,589881144,639185115,870630473,283486210,1178956430,671089476,1272673770,1476174042,854942935,589881144,1178956430,154443495,1272673770,671089476,854942935,283486210', 'build.xml#Keyaggregate.java#manifest.mf#ViewDocument.java');

-- --------------------------------------------------------

--
-- Table structure for table `keywordsearchrequest`
--

CREATE TABLE IF NOT EXISTS `keywordsearchrequest` (
  `SearchUserName` varchar(50) DEFAULT NULL,
  `DataOwnerName` varchar(50) DEFAULT NULL,
  `Keywords` varchar(100) DEFAULT NULL,
  `Trapdoor` varchar(32000) DEFAULT NULL,
  `Operation` varchar(50) DEFAULT NULL,
  `MatchedDocuments` varchar(32000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `keywordsearchrequest1`
--

CREATE TABLE IF NOT EXISTS `keywordsearchrequest1` (
  `SearchUserName` varchar(50) DEFAULT NULL,
  `DataOwnerName` varchar(50) DEFAULT NULL,
  `Keywords` varchar(100) DEFAULT NULL,
  `Trapdoor` varchar(32000) DEFAULT NULL,
  `MatchedDocuments` varchar(32000) DEFAULT NULL,
  `flw` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `key_generation`
--

CREATE TABLE IF NOT EXISTS `key_generation` (
  `user` text NOT NULL,
  `public` text NOT NULL,
  `private` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `key_generation`
--

INSERT INTO `key_generation` (`user`, `public`, `private`) VALUES
('ramesh', '650203993,1586747531', '267388585,1586747531');

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE IF NOT EXISTS `register` (
  `Username` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `MobileNo` varchar(50) DEFAULT NULL,
  `Role` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`Username`, `Password`, `Name`, `MobileNo`, `Role`) VALUES
('ramesh', 'srt@10GOC', 'ramesh', '8899007766', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `searchtime`
--

CREATE TABLE IF NOT EXISTS `searchtime` (
  `NOK` text NOT NULL,
  `process` text NOT NULL,
  `time` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `upload`
--

CREATE TABLE IF NOT EXISTS `upload` (
  `DataOwnerName` varchar(50) DEFAULT NULL,
  `DocumentName` varchar(50) DEFAULT NULL,
  `EncryptedDocument` varchar(32000) DEFAULT NULL,
  `Index` varchar(32000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `upload`
--

INSERT INTO `upload` (`DataOwnerName`, `DocumentName`, `EncryptedDocument`, `Index`) VALUES
('admin', 'build.xml', '-', '23456'),
('admin', 'manifest.mf', '-', '32546'),
('admin', 'Keyaggregate.java', '-', '56789'),
('admin', 'ViewDocument.java', '-', '12349');

-- --------------------------------------------------------

--
-- Table structure for table `upload1`
--

CREATE TABLE IF NOT EXISTS `upload1` (
  `DataOwnerName` varchar(50) DEFAULT NULL,
  `DocumentName` varchar(50) DEFAULT NULL,
  `EncryptedDocument` varchar(32000) DEFAULT NULL,
  `Index` varchar(32000) DEFAULT NULL,
  `system` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
