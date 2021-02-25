CREATE TABLE `ananke`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(100) NOT NULL,
  `first_name` VARCHAR(45) NULL,
  `second_name` VARCHAR(45) NULL,
  `pasword` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE);



CREATE TABLE `ananke`.`product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `desc` VARCHAR(255) NULL,
  `price` DOUBLE NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`));
  
  
CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `amount` double NOT NULL,
  `state` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
  
  
CREATE TABLE `ananke`.`order_item` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `order_id` INT NOT NULL,
  `product_id` INT NOT NULL,
  `quantity` INT NOT NULL DEFAULT 1,
  `amount` DOUBLE NULL,
  PRIMARY KEY (`id`));
  
  
ALTER TABLE `ananke`.`orders` 
ADD INDEX `fk_user_idx` (`user_id` ASC) VISIBLE;

ALTER TABLE `ananke`.`orders` 
ADD CONSTRAINT `fk_user`
  FOREIGN KEY (`user_id`)
  REFERENCES `ananke`.`user` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `ananke`.`order_item` 
ADD INDEX `fk_order_idx` (`order_id` ASC) VISIBLE,
ADD INDEX `fk_product_idx` (`product_id` ASC) VISIBLE;
;
ALTER TABLE `ananke`.`order_item` 
ADD CONSTRAINT `fk_order`
  FOREIGN KEY (`order_id`)
  REFERENCES `ananke`.`order` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_product`
  FOREIGN KEY (`product_id`)
  REFERENCES `ananke`.`product` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
