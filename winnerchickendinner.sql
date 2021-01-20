-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 17, 2020 at 09:09 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.3.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `winnerchickendinner`
--

-- --------------------------------------------------------

--
-- Table structure for table `carttable`
--

CREATE TABLE `carttable` (
  `cartid` int(11) NOT NULL,
  `productName` varchar(255) NOT NULL,
  `weight` float NOT NULL,
  `quantity` int(11) NOT NULL,
  `category` varchar(255) NOT NULL,
  `amount` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `carttable`
--

INSERT INTO `carttable` (`cartid`, `productName`, `weight`, `quantity`, `category`, `amount`) VALUES
(10, 'potatoes', 10, 1, 'Vegetables', 500),
(11, 'Sensodyne', 75, 1, 'hygiene', 144.5),
(11, 'tomatoes', 20, 1, 'Vegetable', 1600),
(12, 'water', 2, 2, 'bottles', 50),
(12, 'tomatoes', 10, 1, 'Vegetable', 800);

-- --------------------------------------------------------

--
-- Table structure for table `loyalty`
--

CREATE TABLE `loyalty` (
  `loyaltyID` int(16) NOT NULL,
  `nic` varchar(16) NOT NULL,
  `Customerfirstname` varchar(255) NOT NULL,
  `Customerlastname` varchar(255) NOT NULL,
  `Phonenumber` int(13) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `loyaltycardid` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `loyalty_request`
--

CREATE TABLE `loyalty_request` (
  `loyaltyrequestID` int(9) NOT NULL,
  `orderID` varchar(255) NOT NULL,
  `customerfirstname` varchar(255) NOT NULL,
  `customerlastname` varchar(255) NOT NULL,
  `nic` varchar(50) NOT NULL,
  `Phonenumber` int(10) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `loyalty_request`
--

INSERT INTO `loyalty_request` (`loyaltyrequestID`, `orderID`, `customerfirstname`, `customerlastname`, `nic`, `Phonenumber`, `Email`, `Date`) VALUES
(10001, '25', 'khtitish', 'bhoodhoo', 'b25786cvjgf', 57886529, 'kamalbhoodhoo@gmail.com', '0000-00-00');

-- --------------------------------------------------------

--
-- Table structure for table `ordertable`
--

CREATE TABLE `ordertable` (
  `orderId` int(11) NOT NULL,
  `cartid` varchar(255) NOT NULL,
  `amount` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ordertable`
--

INSERT INTO `ordertable` (`orderId`, `cartid`, `amount`) VALUES
(1, '10', '500'),
(51, '10', '1744.5'),
(52, '12', '850.0');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `productId` int(16) NOT NULL,
  `productName` varchar(255) NOT NULL,
  `weight` float NOT NULL,
  `saleUnit` varchar(255) NOT NULL,
  `discount` float NOT NULL,
  `stock` int(16) NOT NULL,
  `price` float NOT NULL,
  `category` varchar(255) NOT NULL,
  `expiredate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`productId`, `productName`, `weight`, `saleUnit`, `discount`, `stock`, `price`, `category`, `expiredate`) VALUES
(1000, 'Garimaa Gold', 5, 'kg', 10, 1000, 1320, 'rice', '2021-08-28'),
(1001, 'Sensodyne', 75, 'ml', 2, 494, 146.5, 'hygiene', '2020-11-19'),
(1002, 'Twin cow', 250, 'g', 5, 589, 200, 'dairy', '2020-08-07'),
(1003, 'Red cow', 250, 'g', 0, 895, 230, 'dairy', '2020-06-19'),
(1004, 'Farm land', 250, 'g', 5, 800, 180, 'dairy', '2020-08-19'),
(1005, 'toliet paper', 10, 'g', 0, 1000, 50, 'hygiene', '0000-00-00'),
(1006, 'Gienryck', 15, 'g', 0, 300, 54, 'canfood', '2020-05-08'),
(1007, 'sandines', 30, 'g', 2, 300, 40, 'canfood', '2020-07-11'),
(1008, 'can tomato', 80, 'g', 5, 500, 70, 'camfood', '2020-12-11'),
(1009, 'kraft', 40, 'g', 10, 200, 80, 'diary', '2020-09-25'),
(1010, 'water', 2, 'Liters', 0, 298, 25, 'bottles', '2020-07-17'),
(1011, 'wine corona', 3, 'litres', 0, 200, 225, 'bottles', '2020-06-19'),
(1012, 'lucozade', 250, 'ml', 2, 50, 54, 'bottles', '2021-08-25'),
(1013, 'YOP', 100, 'ml', 0, 30, 50, 'bottles', '2020-10-20'),
(2000, 'fish', 1, 'kg', 0, 500, 100, 'fish', '2020-04-25'),
(2001, 'potatoes', 1, 'kg', 0, 727, 50, 'Vegetable', '2020-05-09'),
(2002, 'tomatoes', 1, 'kg', 0, 170, 80, 'Vegetable', '2020-05-23'),
(2003, 'pumpkin', 1, 'kg', 0, 16, 25, 'Vegetable', '2020-04-29'),
(2004, 'carrot', 1, 'kg', 0, 80, 50, 'Vegetable', '2020-04-28'),
(2005, 'Beetroot', 1, 'kg', 2, 100, 30, 'Vegetable', '2020-04-29'),
(2006, 'cauliflower', 1, 'kg', 3, 60, 70, 'Vegetable', '2020-06-02'),
(2007, 'cabbage', 1, 'kg', 1, 100, 35, 'Vegetable', '2020-05-11'),
(2008, 'maize', 1, 'kg', 0, 120, 29, 'Vegetable', '2020-05-14'),
(2009, 'ladyfinger', 1, 'kg', 5, 130, 70, 'Vegetable', '2020-05-26'),
(2010, 'chili', 1, 'kg', 2, 70, 20, 'Vegetable', '2020-06-29'),
(2014, 'Mauritian beer', 2, 'liters', 2, 300, 110, 'bottles', '2020-12-30'),
(3001, 'chicken', 1, 'kg', 0, 800, 120, 'Meat', '2020-08-13'),
(3002, 'fish', 1, 'kg', 3, 400, 150, 'Meat', '2020-07-21'),
(3003, 'lamb', 1, 'kg', 0, 500, 160, 'Meat', '2020-07-15'),
(3004, 'Beef', 1, 'g', 2, 300, 160, 'Meat', '2020-12-29'),
(4001, 'Red beans ', 0, 'g', 0, 470, 25, 'Grains', '2020-08-31'),
(4002, 'White beans', 1, 'g', 2, 400, 30, 'Grains', '2020-08-04'),
(4003, 'Black lentils', 1, 'g', 2, 592, 20, 'Grains', '2020-07-30'),
(4004, 'Red lentils', 1, 'g', 1, 400, 25, 'Grains', '2020-06-30'),
(5001, 'Apple', 1, 'g', 0, 500, 25, 'Fruits', '2020-06-11'),
(5002, 'Orange', 1, 'g', 2, 400, 30, 'Fruits', '2020-07-29'),
(5003, 'Grape', 1, 'kg', 2, 70, 65, 'Fruits', '2020-06-28'),
(5004, 'Goyave', 1, 'kg', 0, 80, 55, 'Fruits', '2020-07-09'),
(5005, 'Watermelon', 1, 'kg', 2, 100, 170, 'Fruit', '2020-06-15'),
(5006, 'Kiwi', 1, 'kg', 0, 200, 55, 'Fruit', '2020-06-18'),
(5007, 'Strawberry', 1, 'kg', 6, 300, 60, 'Fruit', '2020-06-08'),
(5008, 'Letchi', 1, 'kg', 3, 200, 200, 'Fruit', '2020-06-01');

-- --------------------------------------------------------

--
-- Table structure for table `refund`
--

CREATE TABLE `refund` (
  `RefundId` int(11) NOT NULL,
  `refundrequestId` int(11) NOT NULL,
  `Approve` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `refund_request`
--

CREATE TABLE `refund_request` (
  `refundrequestId` int(11) NOT NULL,
  `OrderId` int(255) NOT NULL,
  `Productname` varchar(255) NOT NULL,
  `Contact` int(12) NOT NULL,
  `Reason` varchar(255) NOT NULL,
  `Descriptionreasons` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `loyalty`
--
ALTER TABLE `loyalty`
  ADD PRIMARY KEY (`loyaltyID`);

--
-- Indexes for table `loyalty_request`
--
ALTER TABLE `loyalty_request`
  ADD PRIMARY KEY (`loyaltyrequestID`);

--
-- Indexes for table `ordertable`
--
ALTER TABLE `ordertable`
  ADD PRIMARY KEY (`orderId`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`productId`);

--
-- Indexes for table `refund`
--
ALTER TABLE `refund`
  ADD PRIMARY KEY (`RefundId`);

--
-- Indexes for table `refund_request`
--
ALTER TABLE `refund_request`
  ADD PRIMARY KEY (`refundrequestId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `loyalty`
--
ALTER TABLE `loyalty`
  MODIFY `loyaltyID` int(16) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `loyalty_request`
--
ALTER TABLE `loyalty_request`
  MODIFY `loyaltyrequestID` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10002;

--
-- AUTO_INCREMENT for table `ordertable`
--
ALTER TABLE `ordertable`
  MODIFY `orderId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `productId` int(16) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5009;

--
-- AUTO_INCREMENT for table `refund`
--
ALTER TABLE `refund`
  MODIFY `RefundId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `refund_request`
--
ALTER TABLE `refund_request`
  MODIFY `refundrequestId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
