CREATE DATABASE `ds0` ;
CREATE DATABASE `ds1` ;
CREATE TABLE `user_info` (
  `user_id` BIGINT(128) NOT NULL,
  `user_name` VARCHAR(45) DEFAULT NULL,
  `account` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `t_order_item` (
  `order_id` BIGINT(19) NOT NULL,
  `user_name` VARCHAR(45) DEFAULT NULL,
  `account` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `t_order` (
  `order_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

truncate table t_order;
truncate table t_order_item;
truncate table user_info;