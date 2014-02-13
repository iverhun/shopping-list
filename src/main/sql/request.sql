CREATE DATABASE `shoppinglist` /*!40100 COLLATE 'utf8_general_ci' */

CREATE USER 'shoppinglist_app'@'localhost' IDENTIFIED BY 'shoppinglist_app';
GRANT EXECUTE, PROCESS, SELECT, SHOW DATABASES, SHOW VIEW, ALTER, ALTER ROUTINE, CREATE, CREATE ROUTINE, CREATE TABLESPACE, CREATE TEMPORARY TABLES, CREATE VIEW, DELETE, DROP, EVENT, INDEX, INSERT, REFERENCES, TRIGGER, UPDATE, CREATE USER, FILE, LOCK TABLES, RELOAD, REPLICATION CLIENT, REPLICATION SLAVE, SHUTDOWN, SUPER  ON *.* TO 'shoppinglist_app'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;
SHOW GRANTS FOR 'shoppinglist_app'@'localhost';

REVOKE EXECUTE, PROCESS, SELECT, SHOW DATABASES, SHOW VIEW, ALTER, ALTER ROUTINE, CREATE, CREATE ROUTINE, CREATE TABLESPACE, CREATE TEMPORARY TABLES, CREATE VIEW, DELETE, DROP, EVENT, INDEX, INSERT, REFERENCES, TRIGGER, UPDATE, CREATE USER, FILE, GRANT OPTION, LOCK TABLES, RELOAD, REPLICATION CLIENT, REPLICATION SLAVE, SHUTDOWN, SUPER  ON *.* FROM 'shoppinglist_app'@'localhost';
GRANT SELECT, EXECUTE, SHOW VIEW, ALTER, ALTER ROUTINE, CREATE, CREATE ROUTINE, CREATE TEMPORARY TABLES, CREATE VIEW, DELETE, DROP, EVENT, INDEX, INSERT, REFERENCES, TRIGGER, UPDATE, LOCK TABLES  ON `shoppinglist`.* TO 'shoppinglist_app'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;
SHOW GRANTS FOR 'shoppinglist_app'@'localhost';


CREATE TABLE `sortable_object` (
	`Id` INT NULL,
	`Value` VARCHAR(50) NULL
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB;
SELECT `DEFAULT_COLLATION_NAME` FROM `information_schema`.`SCHEMATA` WHERE `SCHEMA_NAME`='shoppinglist';
SHOW TABLE STATUS FROM `shoppinglist`;
SHOW FUNCTION STATUS WHERE `Db`='shoppinglist';
SHOW PROCEDURE STATUS WHERE `Db`='shoppinglist';
SHOW TRIGGERS FROM `shoppinglist`;
SHOW EVENTS FROM `shoppinglist`;
SHOW CREATE TABLE `shoppinglist`.`sortable_object`;
/* Entering session "assa" */
SHOW CREATE TABLE `shoppinglist`.`sortable_object`;

INSERT INTO `shoppinglist`.`sortable_object` (`Id`, `Value`) VALUES (10, 'test_varchar_string');
SELECT `Id`, `Value` FROM `shoppinglist`.`sortable_object` WHERE  `Id`=10 AND `Value`='test_varchar_string' LIMIT 1;

UPDATE `shoppinglist`.`sortable_object` SET `Id`=1, `Value`='test_varchar_string_alter' WHERE  `Id`=10 AND `Value`='test_varchar_string' LIMIT 1;
UPDATE `shoppinglist`.`sortable_object` SET `Id`=1, `Value`='test_varchar_string_alter' WHERE  `Id`=10 AND `Value`='test_varchar_string';

USE shoppinglist;
SELECT * 
FROM `sortable_object`;
                       
ALTER TABLE `sortable_object`
	CHANGE COLUMN `Value` `Column` VARCHAR(50) NULL DEFAULT NULL AFTER `Id`;
SELECT `DEFAULT_COLLATION_NAME` FROM `information_schema`.`SCHEMATA` WHERE `SCHEMA_NAME`='shoppinglist';
SHOW TABLE STATUS FROM `shoppinglist`;
SHOW FUNCTION STATUS WHERE `Db`='shoppinglist';
SHOW PROCEDURE STATUS WHERE `Db`='shoppinglist';
SHOW TRIGGERS FROM `shoppinglist`;
SHOW EVENTS FROM `shoppinglist`;
SHOW CREATE TABLE `shoppinglist`.`sortable_object`;
/* Entering session "assa" */
SHOW CREATE TABLE `shoppinglist`.`sortable_object`;



USE shoppinglist;
INSERT INTO `sortable_object` (`Id`, `Column`) VALUES
	(133, 'test_varchar_string_alter'),
	(11, 'test_varchar_string_alter'),
	(12, 'test_varchar_string_alter'),
	(13, 'test_varchar_string_alter'),
	(10, 'test_varchar_string_alter'),
	(100, 'test_varchar_string_alter'),
	(10, 'test_varchar_string_alter'),
	(1, 'test_varchar_string_alter');



SELECT *
FROM `sortable_object` 
where (Id >= 10 AND Id <= 100)
order by Id desc;


RENAME TABLE `sortableobject` TO `sortable_object`;
