-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 26, 2022 at 04:43 AM
-- Server version: 8.0.28
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dpo2`
--

-- --------------------------------------------------------

--
-- Table structure for table `empleados`
--

CREATE TABLE `empleados` (
  `idempleados` int NOT NULL,
  `NombreEmpleado` varchar(35) NOT NULL,
  `ApellidoPaterno` varchar(45) NOT NULL,
  `ApellidoMaterno` varchar(45) DEFAULT NULL,
  `Departamento` varchar(45) DEFAULT NULL,
  `Sucursal` varchar(45) DEFAULT NULL,
  `NivelAcademico` varchar(45) DEFAULT NULL,
  `Puesto` varchar(45) DEFAULT NULL,
  `SueldoBruto` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `empleados`
--

INSERT INTO `empleados` (`idempleados`, `NombreEmpleado`, `ApellidoPaterno`, `ApellidoMaterno`, `Departamento`, `Sucursal`, `NivelAcademico`, `Puesto`, `SueldoBruto`) VALUES
(25, 'Maria', 'Guadalupe', 'Lopez', 'Compras', 'Baja California', 'Universidad', 'Asistente', 6481),
(26, 'Milo', 'Burkhart', 'na', 'Almacen', 'Baja California', 'Universidad', 'Recursos humanos', 6452),
(27, 'Florian', 'Mata', 'Gutierrez', 'Marketing', 'Baja California', 'Universidad', 'Promotora en ventas', 6849),
(29, 'Dulce', 'Gomez', 'Torres', 'RRHH', 'Baja California', 'Posgrado', 'Operador', 5544),
(30, 'Atenas', 'Perez', 'Lopez', 'Logística y operaciones', 'Ciudad de Mexico', 'Bachillerato', 'Puesto de instructor interno', 6445),
(31, 'Zaira', 'Trejo', 'Luna', 'RRHH', 'Ciudad de Mexico', 'Bachillerato', 'Operador', 6445),
(32, 'Rodrigo', 'Navarro', 'Infante', 'Compras', 'Baja California', 'Universidad', 'Asistente', 6445),
(33, 'Michelle', 'Luna', 'Rodriguez', 'Administracion', 'Baja California', 'Universidad', 'Puesto de instructor interno', 6445),
(34, 'Manuel', 'Fuentes', 'Hernandez', 'Compras', 'Ciudad de Mexico', 'Secundaria', 'Asistente', 6445),
(35, 'Sofia', 'Victoria', 'Gomez', 'Finanzas', 'Baja California', 'Universidad', 'Asistente', 6845);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`idempleados`),
  ADD UNIQUE KEY `idempleados_UNIQUE` (`idempleados`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `empleados`
--
ALTER TABLE `empleados`
  MODIFY `idempleados` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
