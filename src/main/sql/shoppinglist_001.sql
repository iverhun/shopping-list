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
CREATE DATABASE IF NOT EXISTS `shoppinglist` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `shoppinglist`;


-- Dumping structure for таблиця shoppinglist.assa
CREATE TABLE IF NOT EXISTS `assa` (
  `Id` int(11) DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL,
  KEY `Id` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table shoppinglist.assa: ~1 rows (приблизно)
DELETE FROM `assa`;
/*!40000 ALTER TABLE `assa` DISABLE KEYS */;
INSERT INTO `assa` (`Id`, `Name`) VALUES
	(20, 'assa');
/*!40000 ALTER TABLE `assa` ENABLE KEYS */;


-- Dumping structure for таблиця shoppinglist.sortable_object
CREATE TABLE IF NOT EXISTS `sortable_object` (
  `Id` int(11) DEFAULT NULL,
  `Column` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table shoppinglist.sortable_object: ~2 rows (приблизно)
DELETE FROM `sortable_object`;
/*!40000 ALTER TABLE `sortable_object` DISABLE KEYS */;
INSERT INTO `sortable_object` (`Id`, `Column`) VALUES
	(1, 'test_varchar_string_alter'),
	(1, 'test_varchar_string_alter');
/*!40000 ALTER TABLE `sortable_object` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
