SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `account_no` int(11) NOT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `ifsc_code` char(30) NOT NULL,
  `account_type` char(20) NOT NULL,
  `account_balance` double NOT NULL,
  `account_creation_date` date NOT NULL,
  `account_status` bit(1) NOT NULL,
  PRIMARY KEY (`account_no`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `account_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `account_tansaction`;
CREATE TABLE `account_tansaction` (
  `transaction_id` int(11) NOT NULL,
  `tx_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tx_details` varchar(200) NOT NULL,
  `tx_type` varchar(300) NOT NULL,
  `account_no` int(11) NOT NULL,
  `tx_value` decimal(10,0) NOT NULL,
  `tx_description` varchar(250) NOT NULL,
  PRIMARY KEY (`transaction_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL,
  `customer_name` char(20) NOT NULL,
  `password` char(20) NOT NULL,
  `last_login` date NOT NULL,
  `mobile_no` int(11) NOT NULL,
  `email_id` varchar(50) NOT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
