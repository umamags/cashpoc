INSERT INTO `account` (`account_no`, `customer_id`, `ifsc_code`, `account_type`, `account_balance`, `account_creation_date`, `account_status`) VALUES
(355230,	556677,	'DBSB234',	'5',	5000,	'2016-11-08',	CONV('1', 2, 10) + 0),
(355245,	556677,	'DBSB238',	'5',	25000,	'2016-11-12',	CONV('0', 2, 10) + 0),
(355650,	556677,	'DBSB274',	'5',	50000,	'2016-12-03',	CONV('1', 2, 10) + 0),
(355680,	556678,	'DBSB244',	'5',	50000,	'2016-01-03',	CONV('1', 2, 10) + 0),
(3557230,	556678,	'DBSB294',	'5',	50000,	'2016-11-11',	CONV('1', 2, 10) + 0);

INSERT INTO `account_tansaction` (`transaction_id`, `tx_date`, `tx_details`, `tx_type`, `account_no`, `tx_value`, `tx_description`) VALUES
(1,	'2018-04-04 06:25:38',	'Credit ref no 123456',	'CR',	556677,	1200,	'Credit by Cash'),
(2,	'2018-04-04 06:26:20',	'Debit ATM ref No 1234564',	'DR',	556677,	1600,	'Debit at ATM'),
(3,	'2018-04-04 06:26:58',	'Credit ref No 324234',	'CR',	556677,	1500,	'Credti by Netbanking');

INSERT INTO `customer` (`customer_id`, `customer_name`, `password`, `last_login`, `mobile_no`, `email_id`) VALUES
(556677,	'Raja',	'capg123',	NULL,	NULL,	NULL),
(556678,	'Mahesh',	'capg123',	NULL,	NULL,	NULL);