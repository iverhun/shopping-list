-- --------------------------------------------------------
-- Сервер:                       127.0.0.1
-- Версія сервера:               5.6.15-log - MySQL Community Server (GPL)
-- ОС сервера:                   Win32
-- HeidiSQL Версія:              8.2.0.4692
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for shoppinglist
DROP DATABASE IF EXISTS `shoppinglist`;
CREATE DATABASE IF NOT EXISTS `shoppinglist` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `shoppinglist`;


-- Dumping structure for таблиця shoppinglist.sortable_object
DROP TABLE IF EXISTS `sortable_object`;
CREATE TABLE IF NOT EXISTS `sortable_object` (
  `id` bigint(20) NOT NULL,
  `value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table shoppinglist.sortable_object: ~0 rows (приблизно)
DELETE FROM `sortable_object`;
/*!40000 ALTER TABLE `sortable_object` DISABLE KEYS */;
INSERT INTO `sortable_object` (`id`, `value`) VALUES
	(123, 'Хліб'),
	(100, 'Сир'),
	(8, 'Халва'),
	(55, 'Риба'),
	(890, 'Горох'),
	(1, 'Ковбаса'),
	(16, 'Печиво'),
	(13, 'Макарони'),
	(99, 'Молоко'),
	(2, 'Масло');
/*!40000 ALTER TABLE `sortable_object` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
