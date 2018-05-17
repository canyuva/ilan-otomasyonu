-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 17, 2018 at 04:01 PM
-- Server version: 5.7.22-0ubuntu0.16.04.1
-- PHP Version: 7.0.30-1+ubuntu16.04.1+deb.sury.org+1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ilan`
--

-- --------------------------------------------------------

--
-- Table structure for table `Tbl_Araba`
--

CREATE TABLE `Tbl_Araba` (
  `ArabaID` int(11) NOT NULL,
  `Araba_Marka` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `Araba_Model` varchar(50) CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `Araba_VitesTuruID` int(11) DEFAULT NULL,
  `Araba_YakitTuruID` int(11) DEFAULT NULL,
  `Araba_RenkID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Tbl_Araba`
--

INSERT INTO `Tbl_Araba` (`ArabaID`, `Araba_Marka`, `Araba_Model`, `Araba_VitesTuruID`, `Araba_YakitTuruID`, `Araba_RenkID`) VALUES
(6, 'Land Rover', 'Range Rover', 2, 2, 8),
(8, 'Ford', 'Focus', 3, 2, 7),
(9, 'AUDI', 'A4', 2, 4, 13),
(10, 'BMW', '320d', 1, 1, 17),
(11, 'Seat', 'Leon', 2, 1, 13),
(12, 'Seat', 'Ibiza', 1, 1, 13),
(13, 'Ford', 'Fiesta', 2, 1, 14),
(14, 'Tofaş', 'Şahin', 1, 5, 14),
(15, 'Volvo', 'V50', 2, 4, 15),
(16, 'Honda', 'Civic', 1, 4, 16),
(17, 'Toyota', 'Corolla', 2, 4, 14),
(18, 'Toyota', 'Corolla', 2, 1, 14),
(19, 'Toyota', 'Avensis', 1, 5, 17),
(20, 'Hyundai', 'Accent Blue', 5, 1, 14),
(21, 'Peugeot', '206', 1, 5, 13),
(22, 'BMW', '318i', 1, 4, 15),
(23, 'Opel', 'Astra', 2, 1, 14),
(24, 'Opel', 'Astra', 2, 1, 15),
(25, 'Volkswagen', 'Passat', 2, 1, 17),
(26, 'Volkswagen', 'Passat', 5, 4, 15),
(27, 'Volkswagen', 'Golf', 5, 4, 15),
(28, 'BMW', '320i', 5, 4, 15),
(29, 'Porche', 'Panamera', 5, 4, 14),
(30, 'Volkswagen', 'Jetta', 2, 4, 14);

-- --------------------------------------------------------

--
-- Table structure for table `Tbl_Ilan`
--

CREATE TABLE `Tbl_Ilan` (
  `IlanID` int(11) NOT NULL,
  `Ilan_Adi` varchar(50) COLLATE utf8mb4_turkish_ci NOT NULL,
  `Ilan_Fiyat` int(11) DEFAULT NULL,
  `Ilan_Km` int(11) DEFAULT NULL,
  `Ilan_Tarih` date DEFAULT NULL,
  `Ilan_ArabaID` int(11) DEFAULT NULL,
  `Ilan_SehirID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Dumping data for table `Tbl_Ilan`
--

INSERT INTO `Tbl_Ilan` (`IlanID`, `Ilan_Adi`, `Ilan_Fiyat`, `Ilan_Km`, `Ilan_Tarih`, `Ilan_ArabaID`, `Ilan_SehirID`) VALUES
(7, 'özel şirket arabası', 254785, 95000, '2018-05-11', 5, 4),
(8, 'acil satılık', 950000, 560000, '2018-05-02', 5, 3),
(9, 'tertemiz az kullanılmış full ve kazasız', 92000, 36000, '2018-05-14', 27, 5),
(10, 'SAHİBİNDEN HATASIZ KUSURSUZ BORUSAN BAKIMLI', 137500, 36000, '2018-05-14', 28, 3),
(11, '2012 PANAMERA SPORT AİRMATİC+PUSULA', 345000, 143000, '2018-05-14', 29, 3),
(12, '2017 JETTA 1.2 TSİ 105 PS DSG COMFORTLİNE SIFIR KM', 102900, 0, '2018-05-14', 30, 3);

-- --------------------------------------------------------

--
-- Table structure for table `Tbl_Renk`
--

CREATE TABLE `Tbl_Renk` (
  `RenkID` int(11) NOT NULL,
  `Renk` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Tbl_Renk`
--

INSERT INTO `Tbl_Renk` (`RenkID`, `Renk`) VALUES
(13, 'Kırmızı'),
(14, 'Beyaz'),
(15, 'Siyah'),
(16, 'Mavi'),
(17, 'Gri');

-- --------------------------------------------------------

--
-- Table structure for table `Tbl_Sehir`
--

CREATE TABLE `Tbl_Sehir` (
  `SehirID` int(11) NOT NULL,
  `Sehir` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Tbl_Sehir`
--

INSERT INTO `Tbl_Sehir` (`SehirID`, `Sehir`) VALUES
(1, 'Trabzon'),
(2, 'Sivas'),
(3, 'İstanbul'),
(4, 'Kocaeli'),
(5, 'Konya'),
(6, 'Yozgat'),
(7, 'Ankara'),
(8, 'Muğla');

-- --------------------------------------------------------

--
-- Table structure for table `Tbl_VitesTuru`
--

CREATE TABLE `Tbl_VitesTuru` (
  `VitesTuruID` int(11) NOT NULL,
  `Vites_Turu` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Tbl_VitesTuru`
--

INSERT INTO `Tbl_VitesTuru` (`VitesTuruID`, `Vites_Turu`) VALUES
(1, 'Manuel'),
(2, 'Otomatik'),
(5, 'Yarı-otomatik');

-- --------------------------------------------------------

--
-- Table structure for table `Tbl_YakitTuru`
--

CREATE TABLE `Tbl_YakitTuru` (
  `YakitTuruID` int(11) NOT NULL,
  `Yakit_Turu` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Tbl_YakitTuru`
--

INSERT INTO `Tbl_YakitTuru` (`YakitTuruID`, `Yakit_Turu`) VALUES
(1, 'Dizel'),
(4, 'Benzin'),
(5, 'LPG');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Tbl_Araba`
--
ALTER TABLE `Tbl_Araba`
  ADD PRIMARY KEY (`ArabaID`);

--
-- Indexes for table `Tbl_Ilan`
--
ALTER TABLE `Tbl_Ilan`
  ADD PRIMARY KEY (`IlanID`),
  ADD KEY `Ilan_SehirID` (`Ilan_SehirID`);

--
-- Indexes for table `Tbl_Renk`
--
ALTER TABLE `Tbl_Renk`
  ADD PRIMARY KEY (`RenkID`);

--
-- Indexes for table `Tbl_Sehir`
--
ALTER TABLE `Tbl_Sehir`
  ADD PRIMARY KEY (`SehirID`);

--
-- Indexes for table `Tbl_VitesTuru`
--
ALTER TABLE `Tbl_VitesTuru`
  ADD PRIMARY KEY (`VitesTuruID`);

--
-- Indexes for table `Tbl_YakitTuru`
--
ALTER TABLE `Tbl_YakitTuru`
  ADD PRIMARY KEY (`YakitTuruID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Tbl_Araba`
--
ALTER TABLE `Tbl_Araba`
  MODIFY `ArabaID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
--
-- AUTO_INCREMENT for table `Tbl_Ilan`
--
ALTER TABLE `Tbl_Ilan`
  MODIFY `IlanID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `Tbl_Renk`
--
ALTER TABLE `Tbl_Renk`
  MODIFY `RenkID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
--
-- AUTO_INCREMENT for table `Tbl_Sehir`
--
ALTER TABLE `Tbl_Sehir`
  MODIFY `SehirID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `Tbl_VitesTuru`
--
ALTER TABLE `Tbl_VitesTuru`
  MODIFY `VitesTuruID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `Tbl_YakitTuru`
--
ALTER TABLE `Tbl_YakitTuru`
  MODIFY `YakitTuruID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `Tbl_Ilan`
--
ALTER TABLE `Tbl_Ilan`
  ADD CONSTRAINT `Tbl_Ilan_ibfk_1` FOREIGN KEY (`Ilan_SehirID`) REFERENCES `Tbl_Sehir` (`SehirID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
