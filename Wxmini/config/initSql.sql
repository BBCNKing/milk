CREATE TABLE `User` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(50) NOT NULL ,
  `open_id` varchar(20) NOT NULL ,
  `nickname` varchar(20) DEFAULT NULL COMMENT '�û��ǳ�',
  `email` varchar(128) DEFAULT NULL COMMENT '����|��¼�ʺ�',
  `pwd` varchar(32) DEFAULT NULL COMMENT '����',
  `create_time` datetime DEFAULT NULL COMMENT '����ʱ��',
  `UPDATE_time` datetime DEFAULT NULL COMMENT '����¼ʱ��',
  `status` bigint(1) DEFAULT '1' COMMENT '1:��Ч��0:��ֹ��¼',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8


CREATE TABLE `Order` (
  `order_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(50) NOT NULL ,
  `goods_name` varchar(20) DEFAULT NULL ,
  `price` decimal(12,0) DEFAULT NULL ,
  `order_seq` varchar(50) DEFAULT NULL ,
  `bank_seq` varchar(50) DEFAULT NULL ,
  `create_time` datetime DEFAULT NULL ,
  `UPDATE_time` datetime DEFAULT NULL ,
  `status` bigint(1) DEFAULT '0' COMMENT '0:��ʼ��',
  `batch_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8



CREATE TABLE `Goods` (
  `goods_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `png_url` varchar(50) NOT NULL ,
  `goods_name` varchar(20) DEFAULT NULL ,
  `price` decimal(12,0) DEFAULT NULL ,   
  `create_time` datetime DEFAULT NULL ,  
  `state` varchar(1) DEFAULT 'U' ,
   PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8


CREATE TABLE `Shopping_cart` (
  `order_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(50) NOT NULL ,
  `goods_name` varchar(20) DEFAULT NULL ,
  `price` decimal(12,0) DEFAULT NULL ,
  `count` int DEFAULT '0' ,
  `create_time` datetime DEFAULT NULL ,
  `goods_id` bigint(20) DEFAULT NULL ,
  `state` VARCHAR(1) DEFAULT 'U',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8

