drop schema ims;

CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;

CREATE TABLE IF NOT EXISTS customers (
    id INT(11) NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(40) DEFAULT NULL,
    surname VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS items (
    item_id INT(11) NOT NULL AUTO_INCREMENT,
    item_name VARCHAR(40) DEFAULT NULL,
    item_description VARCHAR(200) DEFAULT NULL,
    item_price FLOAT DEFAULT NULL,
    PRIMARY KEY (item_id)
);

CREATE TABLE IF NOT EXISTS orders (
	order_id INT(11) NOT NULL AUTO_INCREMENT,
    customer_id INT(11) NOT NULL,
    PRIMARY KEY(order_id),
    FOREIGN KEY(customer_id) REFERENCES customers(id)
    );
    
CREATE TABLE IF NOT EXISTS order_items (
	order_id INT (11) NOT NULL,
    item_id INT (11) NOT NULL,
    quantity INT(5) DEFAULT(1),
    PRIMARY KEY(order_id, item_id),
    FOREIGN KEY(order_id) REFERENCES orders (order_id),
    FOREIGN KEY(item_id) REFERENCES items (item_id)
    );
    
show tables;