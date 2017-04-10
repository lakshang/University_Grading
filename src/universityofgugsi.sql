-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 10, 2017 at 05:24 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.0.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `universityofgugsi`
--

-- --------------------------------------------------------

--
-- Table structure for table `Login`
--

CREATE TABLE `Login` (
  `Username` varchar(10) NOT NULL,
  `Password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Login`
--

INSERT INTO `Login` (`Username`, `Password`) VALUES
('admin', 'admin'),
('student', 'student');

-- --------------------------------------------------------

--
-- Table structure for table `Marks Sheet`
--

CREATE TABLE `Marks Sheet` (
  `Name` text NOT NULL,
  `Student Id` varchar(6) NOT NULL,
  `Module 1` int(3) NOT NULL,
  `Module 2` int(3) NOT NULL,
  `Module 3` int(3) NOT NULL,
  `Module 4` int(3) NOT NULL,
  `Module 5` int(3) NOT NULL,
  `Module 6` int(3) NOT NULL,
  `Module 7` int(3) NOT NULL,
  `Module 8` int(3) NOT NULL,
  `Module 9` int(3) NOT NULL,
  `Module 10` int(3) NOT NULL,
  `Module 11` int(3) NOT NULL,
  `Module 12` int(3) NOT NULL,
  `Module 13` int(3) NOT NULL,
  `Module 14` int(3) NOT NULL,
  `Module 15` int(3) NOT NULL,
  `Module 16` int(3) NOT NULL,
  `Module 17` int(3) NOT NULL,
  `Module 18` int(3) NOT NULL,
  `Module 19` int(3) NOT NULL,
  `Module 20` int(3) NOT NULL,
  `Module 21` int(3) NOT NULL,
  `Module 22` int(3) NOT NULL,
  `Module 23` int(3) NOT NULL,
  `Module 24` int(3) NOT NULL,
  `Module 25` int(3) NOT NULL,
  `Module 26` int(3) NOT NULL,
  `Module 27` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
