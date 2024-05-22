-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 08 Jun 2022 pada 21.28
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dataobat`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblkategori`
--

CREATE TABLE `tblkategori` (
  `KodeKategori` varchar(5) NOT NULL,
  `KategoriObat` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tblkategori`
--

INSERT INTO `tblkategori` (`KodeKategori`, `KategoriObat`) VALUES
('OB', 'Obat Bebas'),
('OBT', 'Obat Bebas Terbatas'),
('OGN', 'Obat Golongan Narkotika'),
('OH', 'Obat Herbal'),
('OK', 'Obat Keras'),
('OP', 'Obat Psikotropika'),
('OWA', 'Obat Wajib Apotek');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblobat`
--

CREATE TABLE `tblobat` (
  `KodeObat` varchar(5) NOT NULL,
  `NamaObat` varchar(15) NOT NULL,
  `KodeKategori` varchar(10) NOT NULL,
  `TanggalKadaluarsa` date NOT NULL,
  `Quantity` int(3) NOT NULL,
  `HargaBeli` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tblobat`
--

INSERT INTO `tblobat` (`KodeObat`, `NamaObat`, `KodeKategori`, `TanggalKadaluarsa`, `Quantity`, `HargaBeli`) VALUES
('KO001', 'Panadol', 'OB ', '2022-02-10', 10, 2500),
('KO002', 'Decolgen', 'OBT', '2022-06-30', 10, 5000),
('KO003', 'Tolak Angin', 'OH ', '2023-06-07', 3, 3500),
('KO004', 'Diazepam', 'OP ', '2022-02-01', 5, 60000),
('KO005', 'Omeprazole', 'OWA', '2024-12-11', 6, 70000),
('KO006', 'Opium', 'OGN', '2022-03-12', 10, 100000),
('KO007', 'Alprazolam', 'OK ', '2024-11-10', 6, 800000),
('KO008', 'Sanmol', 'OB ', '2022-10-10', 10, 1000),
('KO009', 'Antangin', 'OH ', '2021-04-06', 5, 4000),
('KO010', 'Antangin', 'OBT', '2022-10-02', 10, 3000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblpengguna`
--

CREATE TABLE `tblpengguna` (
  `ID` varchar(8) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `KataKunci` varchar(10) NOT NULL,
  `Alamat` varchar(75) NOT NULL,
  `NoTlp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tblpengguna`
--

INSERT INTO `tblpengguna` (`ID`, `Nama`, `KataKunci`, `Alamat`, `NoTlp`) VALUES
('32210000', 'Stella Virginia', 'stella', 'Jln. Kisah Kasih Di Sekolah', '089612345678');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tblkategori`
--
ALTER TABLE `tblkategori`
  ADD PRIMARY KEY (`KodeKategori`);

--
-- Indeks untuk tabel `tblobat`
--
ALTER TABLE `tblobat`
  ADD PRIMARY KEY (`KodeObat`);

--
-- Indeks untuk tabel `tblpengguna`
--
ALTER TABLE `tblpengguna`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
