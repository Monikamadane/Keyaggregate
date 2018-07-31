-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 30, 2017 at 07:04 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `keyaggpropose`
--

-- --------------------------------------------------------

--
-- Table structure for table `integritycheckingrequest`
--

CREATE TABLE `integritycheckingrequest` (
  `OriginalClientName` varchar(50) DEFAULT NULL,
  `FileName` varchar(50) DEFAULT NULL,
  `Status` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `integritycheckingrequest`
--

INSERT INTO `integritycheckingrequest` (`OriginalClientName`, `FileName`, `Status`) VALUES
('Krishna', 'a.txt', 'Pending'),
('Krishna', 'd.txt', 'Pending'),
('Krishna', 'e.txt', 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `keygeneration`
--

CREATE TABLE `keygeneration` (
  `DataOnwerName` varchar(50) DEFAULT NULL,
  `SymmetricKey` varchar(32000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `keygeneration`
--

INSERT INTO `keygeneration` (`DataOnwerName`, `SymmetricKey`) VALUES
('admin', 'LQeMlpgFNBuWDgpi5ykc1g==');

-- --------------------------------------------------------

--
-- Table structure for table `keyrequest`
--

CREATE TABLE `keyrequest` (
  `RequesterName` varchar(50) DEFAULT NULL,
  `DataOwnerName` varchar(50) DEFAULT NULL,
  `SymmetricKey` text,
  `Docname` varchar(32000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `keyrequest`
--

INSERT INTO `keyrequest` (`RequesterName`, `DataOwnerName`, `SymmetricKey`, `Docname`) VALUES
('Krishna', 'admin', 'JZkrNm8WhibBLpLdq0EA8IH+C+31Oiqfl+IN2Wjzatg=', 'a.txt#d.txt#e.txt');

-- --------------------------------------------------------

--
-- Table structure for table `keyrequest1`
--

CREATE TABLE `keyrequest1` (
  `RequesterName` varchar(50) DEFAULT NULL,
  `DataOwnerName` varchar(50) DEFAULT NULL,
  `SymmetricKey` text,
  `Docname` varchar(32000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `keyrequest1`
--

INSERT INTO `keyrequest1` (`RequesterName`, `DataOwnerName`, `SymmetricKey`, `Docname`) VALUES
('Krishna', 'admin', '770724196,1625240184,1469458920,368140791,1625240184,359553037,462533597,770724196,1625240184,1469458920,1625240184,359553037,770724196', 'a.txt#e.txt');

-- --------------------------------------------------------

--
-- Table structure for table `key_generation`
--

CREATE TABLE `key_generation` (
  `user` text NOT NULL,
  `public` text NOT NULL,
  `private` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `key_generation`
--

INSERT INTO `key_generation` (`user`, `public`, `private`) VALUES
('Krishna', '566269973,1899652189', '1286917037,1899652189');

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
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
('priyanka', 'Priyanka@12', 'Priyanka', 'priyankaupalanchi94@gmail.com', 'user'),
('krishnna', 'Krishna@12', 'Krishna', 'krishna42r@gmail.com', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `upload`
--

CREATE TABLE `upload` (
  `DataOwnerName` varchar(50) DEFAULT NULL,
  `DocumentName` varchar(50) DEFAULT NULL,
  `EncryptedDocument` varchar(32000) DEFAULT NULL,
  `Index` varchar(32000) DEFAULT NULL,
  `sign` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `upload`
--

INSERT INTO `upload` (`DataOwnerName`, `DocumentName`, `EncryptedDocument`, `Index`, `sign`) VALUES
('admin', 'a.txt', '-', '253654', 'e8ca1a1d2cfbfe2804eee26e8fd5f23d4c10a830'),
('admin', 'b.txt', '-', '253654', '634293871807c33d56e96c3b9b2c43f0418c15ee'),
('admin', 'c.txt', '-', '253654', '9c184d549acf4d66236bc510ae7602c2c1c11572'),
('admin', 'd.txt', '-', '253542', '5aceedd22068d6e18ce73d9bbfd59d175db09ef1'),
('admin', 'e.txt', '-', '253542', 'e27e601f8889ed1f8014132c02555e21472dadf1');

-- --------------------------------------------------------

--
-- Table structure for table `usersignature`
--

CREATE TABLE `usersignature` (
  `DataOwnerName` varchar(50) DEFAULT NULL,
  `DocumentName` varchar(50) DEFAULT NULL,
  `sign` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usersignature`
--

INSERT INTO `usersignature` (`DataOwnerName`, `DocumentName`, `sign`) VALUES
('Krishna', 'a.txt', 'e8ca1a1d2cfbfe2804eee26e8fd5f23d4c10a830'),
('Krishna', 'e.txt', 'e27e601f8889ed1f8014132c02555e21472dadf1'),
('Krishna', 'a.txt', 'e8ca1a1d2cfbfe2804eee26e8fd5f23d4c10a830'),
('Krishna', 'd.txt', '5aceedd22068d6e18ce73d9bbfd59d175db09ef1'),
('Krishna', 'a.txt', 'e8ca1a1d2cfbfe2804eee26e8fd5f23d4c10a830'),
('Krishna', 'd.txt', '5aceedd22068d6e18ce73d9bbfd59d175db09ef1'),
('Krishna', 'a.txt', 'e8ca1a1d2cfbfe2804eee26e8fd5f23d4c10a830'),
('Krishna', 'a.txt', 'e8ca1a1d2cfbfe2804eee26e8fd5f23d4c10a830'),
('Krishna', 'e.txt', 'e27e601f8889ed1f8014132c02555e21472dadf1'),
('Krishna', 'd.txt', '5aceedd22068d6e18ce73d9bbfd59d175db09ef1'),
('Krishna', 'a.txt', 'e8ca1a1d2cfbfe2804eee26e8fd5f23d4c10a830'),
('Krishna', 'd.txt', '5aceedd22068d6e18ce73d9bbfd59d175db09ef1');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
