-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 27, 2023 at 04:08 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `topupgo`
--

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `ID` int(3) NOT NULL,
  `username` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `salt` varchar(10) NOT NULL,
  `userActivation` int(1) NOT NULL,
  `registCode` varchar(10) DEFAULT NULL,
  `forgotPassCode` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`ID`, `username`, `email`, `password`, `salt`, `userActivation`, `registCode`, `forgotPassCode`) VALUES
(1, 'komang', 'anotherox7@gmail.com', 'R3LZbt/uzuxI4gmyjQ5elw==', 'BxV6EY', 1, NULL, NULL),
(2, 'abi', 'komangdev@gmail.com', 'xlBE6z6q2Q1oTWEd3ghPqQ==', 'O56LAT', 1, NULL, '501792'),
(3, 'dian', 'purnamasarid724@gmail.com', 'XkcUxTu5am+Bgup1xCrsxA==', 'LZff80', 1, NULL, NULL),
(5, 'komang', 'komangdev@gmail.com', 'dbR5mxxxTa3L/VhU83FOhA==', 'HkrvK2', 0, '999396', '501792'),
(6, 'IlalB41', 'bilalhakkulm@gmail.com', 'pqG+XEZdrMJOjUxf6m0ddQ==', 'QmoqX1', 0, '855165', NULL),
(7, 'xnxx', 'koma@gmail.com', 'Nr0pzt4qIKVB6oaZWoQzmw==', 'N87t1x', 1, NULL, NULL),
(8, 'komangabi', 'komangdev7@gmail.com', 'qq3HvgUCyOE12m5CI8yyFA==', 'GiVNUs', 1, NULL, NULL),
(9, 'marsy', 'faradilah15@gmail.com', 'iQwK24eKnJ+E1IYvwHQ69w==', 'tLzeDL', 1, NULL, NULL),
(11, 'marsya', 'marsya.faradilah15@gmail.com', 'gGbPQ50F07w3Ygf7VVKWJA==', 'ggPlUI', 1, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `ID` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
