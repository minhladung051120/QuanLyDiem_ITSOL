-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: qldsv
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bangdiem`
--

DROP TABLE IF EXISTS `bangdiem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bangdiem` (
  `ma_bd` int NOT NULL AUTO_INCREMENT,
  `ma_sv` varchar(10) NOT NULL,
  `ma_lop` varchar(10) NOT NULL,
  `diem_tl` float DEFAULT NULL,
  `diem_ck` float DEFAULT NULL,
  PRIMARY KEY (`ma_bd`),
  KEY `ma_sv` (`ma_sv`),
  KEY `ma_lop` (`ma_lop`),
  CONSTRAINT `bangdiem_ibfk_1` FOREIGN KEY (`ma_sv`) REFERENCES `sinhvien` (`ma_sv`),
  CONSTRAINT `bangdiem_ibfk_2` FOREIGN KEY (`ma_lop`) REFERENCES `lophoc` (`ma_lop`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bangdiem`
--

LOCK TABLES `bangdiem` WRITE;
/*!40000 ALTER TABLE `bangdiem` DISABLE KEYS */;
INSERT INTO `bangdiem` VALUES (1,'SV01','PT01',6,8),(2,'SV01','PT02',10,10);
/*!40000 ALTER TABLE `bangdiem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `giangvien`
--

DROP TABLE IF EXISTS `giangvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `giangvien` (
  `ma_gv` varchar(10) NOT NULL,
  `ma_tk` varchar(20) NOT NULL,
  PRIMARY KEY (`ma_gv`),
  KEY `ma_tk` (`ma_tk`),
  CONSTRAINT `giangvien_ibfk_1` FOREIGN KEY (`ma_tk`) REFERENCES `taikhoan` (`ma_tk`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `giangvien`
--

LOCK TABLES `giangvien` WRITE;
/*!40000 ALTER TABLE `giangvien` DISABLE KEYS */;
INSERT INTO `giangvien` VALUES ('GV001','Giangvien01'),('GV002','GV02');
/*!40000 ALTER TABLE `giangvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kyhoc`
--

DROP TABLE IF EXISTS `kyhoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kyhoc` (
  `ma_ky` varchar(10) NOT NULL,
  `ten_ky` varchar(50) NOT NULL,
  `thoi_gian` date NOT NULL,
  `thoi_gian_kt` date NOT NULL,
  PRIMARY KEY (`ma_ky`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kyhoc`
--

LOCK TABLES `kyhoc` WRITE;
/*!40000 ALTER TABLE `kyhoc` DISABLE KEYS */;
INSERT INTO `kyhoc` VALUES ('KH01','Summer ','2020-08-09','2020-12-09'),('KH02','Kỳ 2','2021-02-07','2021-05-07');
/*!40000 ALTER TABLE `kyhoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lophoc`
--

DROP TABLE IF EXISTS `lophoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lophoc` (
  `ma_lop` varchar(10) NOT NULL,
  `ten_lop` varchar(50) NOT NULL,
  `ma_mon` varchar(10) NOT NULL,
  `ma_gv` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ma_lop`),
  KEY `ma_mon` (`ma_mon`),
  KEY `ma_gv` (`ma_gv`),
  CONSTRAINT `lophoc_ibfk_1` FOREIGN KEY (`ma_mon`) REFERENCES `monhoc` (`ma_mon`),
  CONSTRAINT `lophoc_ibfk_2` FOREIGN KEY (`ma_gv`) REFERENCES `giangvien` (`ma_gv`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lophoc`
--

LOCK TABLES `lophoc` WRITE;
/*!40000 ALTER TABLE `lophoc` DISABLE KEYS */;
INSERT INTO `lophoc` VALUES ('LH01','Giải toán','GDTT','GV001'),('PT01','Web01','TCC01','GV001'),('PT02','Đồ họa','TH01','GV001');
/*!40000 ALTER TABLE `lophoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monhoc`
--

DROP TABLE IF EXISTS `monhoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `monhoc` (
  `ma_mon` varchar(10) NOT NULL,
  `ten_mon` varchar(50) NOT NULL,
  `ma_ky` varchar(10) NOT NULL,
  PRIMARY KEY (`ma_mon`),
  KEY `ma_ky` (`ma_ky`),
  CONSTRAINT `monhoc_ibfk_1` FOREIGN KEY (`ma_ky`) REFERENCES `kyhoc` (`ma_ky`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monhoc`
--

LOCK TABLES `monhoc` WRITE;
/*!40000 ALTER TABLE `monhoc` DISABLE KEYS */;
INSERT INTO `monhoc` VALUES ('GDQP01','Giáo dục quốc phòng','KH02'),('GDTT','Giáo dục thể chất','KH01'),('KTVM01','Kinh tế vĩ mô','KH02'),('NN01','Ngoại ngữ 1','KH01'),('NN02','Ngoại ngữ 2','KH02'),('PLDC01','Pháp luật đại cương','KH01'),('TCC01','Toán Cao cấp 1','KH01'),('TCC02','Toán Cao cấp 2','KH02'),('TH01','Triết học','KH01'),('THDC01','Tin học đại cương','KH02');
/*!40000 ALTER TABLE `monhoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sinhvien`
--

DROP TABLE IF EXISTS `sinhvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sinhvien` (
  `ma_sv` varchar(10) NOT NULL,
  `khoa` varchar(10) NOT NULL,
  `ma_tk` varchar(20) NOT NULL,
  PRIMARY KEY (`ma_sv`),
  KEY `ma_tk` (`ma_tk`),
  CONSTRAINT `sinhvien_ibfk_1` FOREIGN KEY (`ma_tk`) REFERENCES `taikhoan` (`ma_tk`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sinhvien`
--

LOCK TABLES `sinhvien` WRITE;
/*!40000 ALTER TABLE `sinhvien` DISABLE KEYS */;
INSERT INTO `sinhvien` VALUES ('SV01','14.3','Sinhvien01');
/*!40000 ALTER TABLE `sinhvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taikhoan`
--

DROP TABLE IF EXISTS `taikhoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `taikhoan` (
  `ma_tk` varchar(20) NOT NULL,
  `mat_khau` varchar(50) NOT NULL,
  `ho_ten` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `sdt` varchar(10) NOT NULL,
  `dia_chi` varchar(50) NOT NULL,
  `chuc_vu` varchar(10) NOT NULL,
  PRIMARY KEY (`ma_tk`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taikhoan`
--

LOCK TABLES `taikhoan` WRITE;
/*!40000 ALTER TABLE `taikhoan` DISABLE KEYS */;
INSERT INTO `taikhoan` VALUES ('DT02','1234567','Đào Văn Tạo','taodv@gmail.com','0374857687','Hà Nội','DT'),('Giangvien01','123456','Nguyễn Văn Viên','viennv@gmail.com','395768577','Hà Nội','GV'),('GV02','123456','Phan Van Vien','vienpv@gmail.com','0398576878','Hà Nội','GV'),('Sinhvien01','123456','Nguyễn Văn Sinh','sinhnv@gmail.com','395768558','Hà Nội','SV');
/*!40000 ALTER TABLE `taikhoan` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-12 15:15:54
