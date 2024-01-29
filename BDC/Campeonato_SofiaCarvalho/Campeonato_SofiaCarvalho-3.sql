-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jan 25, 2024 at 12:35 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Campeonato_SofiaCarvalho`
--

-- --------------------------------------------------------

--
-- Table structure for table `bola`
--

CREATE TABLE `bola` (
  `id_bola` int(11) NOT NULL,
  `id_equipa` int(11) DEFAULT NULL,
  `fabricante` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bola`
--

INSERT INTO `bola` (`id_bola`, `id_equipa`, `fabricante`) VALUES
(1, 1, 'Adidas'),
(2, 1, 'Reebok'),
(3, 1, 'Adidas'),
(4, 2, 'Adidas'),
(5, 2, 'Olimpic'),
(6, 2, 'Nike'),
(7, 3, 'Reebok'),
(8, 3, 'Olimpic');

-- --------------------------------------------------------

--
-- Table structure for table `equipa`
--

CREATE TABLE `equipa` (
  `id_equipa` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `diretor` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `equipa`
--

INSERT INTO `equipa` (`id_equipa`, `nome`, `cidade`, `diretor`) VALUES
(1, 'Académico', 'Porto', 'Mário'),
(2, 'Universitário', 'Coimbra', 'João'),
(3, 'Juventude', 'Braga', 'Silva'),
(4, 'Tigres', 'Espinho', 'Cardoso');

-- --------------------------------------------------------

--
-- Table structure for table `escalao`
--

CREATE TABLE `escalao` (
  `id_escalao` int(11) NOT NULL,
  `descricao` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `escalao`
--

INSERT INTO `escalao` (`id_escalao`, `descricao`) VALUES
(1, 'iniciados'),
(2, 'juvenis'),
(3, 'juniores'),
(4, 'seniores');

-- --------------------------------------------------------

--
-- Table structure for table `experiencia`
--

CREATE TABLE `experiencia` (
  `id_experiencia` int(11) NOT NULL,
  `id_equipa` int(11) DEFAULT NULL,
  `id_treinador` int(11) DEFAULT NULL,
  `id_escalao` int(11) DEFAULT NULL,
  `anos` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `experiencia`
--

INSERT INTO `experiencia` (`id_experiencia`, `id_equipa`, `id_treinador`, `id_escalao`, `anos`) VALUES
(8, 1, 1, 3, 10),
(9, 1, 1, 4, 5),
(10, 1, 2, 1, 2),
(11, 1, 2, 3, 3),
(12, 1, 2, 2, 4),
(13, 2, 3, 3, 15),
(14, 4, 5, 2, 12);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ex_a`
-- (See below for the actual view)
--
CREATE TABLE `ex_a` (
`id_treinador` int(11)
,`nome` varchar(50)
,`idade` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ex_b`
-- (See below for the actual view)
--
CREATE TABLE `ex_b` (
`id_experiencia` int(11)
,`id_equipa` int(11)
,`id_treinador` int(11)
,`id_escalao` int(11)
,`anos` int(11)
,`nome` varchar(50)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ex_b2`
-- (See below for the actual view)
--
CREATE TABLE `ex_b2` (
`id_experiencia` int(11)
,`id_equipa` int(11)
,`id_treinador` int(11)
,`id_escalao` int(11)
,`anos` int(11)
,`Treinador` varchar(50)
,`Escalão` varchar(50)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ex_c`
-- (See below for the actual view)
--
CREATE TABLE `ex_c` (
`id_treinador` int(11)
,`nome` varchar(50)
,`idade` int(11)
,`telefone` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ex_d`
-- (See below for the actual view)
--
CREATE TABLE `ex_d` (
`id_treinador` int(11)
,`nome` varchar(50)
,`idade` int(11)
,`telefone` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ex_e`
-- (See below for the actual view)
--
CREATE TABLE `ex_e` (
`Total de Equipas` bigint(21)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ex_f`
-- (See below for the actual view)
--
CREATE TABLE `ex_f` (
`Total de Treinadores idade maior 40` bigint(21)
,`Media idades maior 40` decimal(11,0)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ex_g`
-- (See below for the actual view)
--
CREATE TABLE `ex_g` (
`Treinador mais velho` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ex_h`
-- (See below for the actual view)
--
CREATE TABLE `ex_h` (
`id_equipa` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ex_i`
-- (See below for the actual view)
--
CREATE TABLE `ex_i` (
`id_equipa` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ex_j`
-- (See below for the actual view)
--
CREATE TABLE `ex_j` (
`Media idades dos treinadores dos juvenis` decimal(11,0)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ex_k`
-- (See below for the actual view)
--
CREATE TABLE `ex_k` (
`nome` varchar(50)
,`telefone` int(11)
,`nome da equipa` varchar(50)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ex_l`
-- (See below for the actual view)
--
CREATE TABLE `ex_l` (
`id_equipa` int(11)
,`nome` varchar(50)
,`cidade` varchar(50)
,`diretor` varchar(50)
,`nome do treinador` varchar(50)
,`escalão` varchar(50)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ex_m`
-- (See below for the actual view)
--
CREATE TABLE `ex_m` (
`Equipa` varchar(50)
,`nome do treinador` varchar(50)
,`idade treinador mais velho` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ex_m2`
-- (See below for the actual view)
--
CREATE TABLE `ex_m2` (
`idade treinador mais velho` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ex_n`
-- (See below for the actual view)
--
CREATE TABLE `ex_n` (
`anos experiência António no Académico` decimal(32,0)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ex_n2`
-- (See below for the actual view)
--
CREATE TABLE `ex_n2` (
`Equipa` varchar(50)
,`Treinador` varchar(50)
,`anos experiência` decimal(32,0)
);

-- --------------------------------------------------------

--
-- Table structure for table `treinador`
--

CREATE TABLE `treinador` (
  `id_treinador` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `idade` int(11) DEFAULT NULL,
  `telefone` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `treinador`
--

INSERT INTO `treinador` (`id_treinador`, `nome`, `idade`, `telefone`) VALUES
(1, 'António', 34, 922424561),
(2, 'Barbosa', 45, 965552936),
(3, 'Tavares', 48, 933332267),
(4, 'Joaquim', 57, 918638465),
(5, 'Alberto', 33, 966785309),
(6, 'Duarte', 54, 912773446);

-- --------------------------------------------------------

--
-- Structure for view `ex_a`
--
DROP TABLE IF EXISTS `ex_a`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `campeonato_sofiacarvalho`.`ex_a`  AS SELECT `campeonato_sofiacarvalho`.`treinador`.`id_treinador` AS `id_treinador`, `campeonato_sofiacarvalho`.`treinador`.`nome` AS `nome`, `campeonato_sofiacarvalho`.`treinador`.`idade` AS `idade` FROM `campeonato_sofiacarvalho`.`treinador` WHERE `campeonato_sofiacarvalho`.`treinador`.`idade` < 40 ;

-- --------------------------------------------------------

--
-- Structure for view `ex_b`
--
DROP TABLE IF EXISTS `ex_b`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `campeonato_sofiacarvalho`.`ex_b`  AS SELECT `e`.`id_experiencia` AS `id_experiencia`, `e`.`id_equipa` AS `id_equipa`, `e`.`id_treinador` AS `id_treinador`, `e`.`id_escalao` AS `id_escalao`, `e`.`anos` AS `anos`, `t`.`nome` AS `nome` FROM (`campeonato_sofiacarvalho`.`experiencia` `e` join `campeonato_sofiacarvalho`.`treinador` `t` on(`e`.`id_treinador` = `t`.`id_treinador`)) WHERE `e`.`id_escalao` = 3 OR `e`.`anos` > 10 ;

-- --------------------------------------------------------

--
-- Structure for view `ex_b2`
--
DROP TABLE IF EXISTS `ex_b2`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `campeonato_sofiacarvalho`.`ex_b2`  AS SELECT `ex`.`id_experiencia` AS `id_experiencia`, `ex`.`id_equipa` AS `id_equipa`, `ex`.`id_treinador` AS `id_treinador`, `ex`.`id_escalao` AS `id_escalao`, `ex`.`anos` AS `anos`, `t`.`nome` AS `Treinador`, `esc`.`descricao` AS `Escalão` FROM ((`campeonato_sofiacarvalho`.`experiencia` `ex` join `campeonato_sofiacarvalho`.`treinador` `t` on(`ex`.`id_treinador` = `t`.`id_treinador`)) join `campeonato_sofiacarvalho`.`escalao` `esc` on(`ex`.`id_escalao` = `esc`.`id_escalao`)) WHERE `esc`.`descricao` = 'juniores' OR `ex`.`anos` > 10 ;

-- --------------------------------------------------------

--
-- Structure for view `ex_c`
--
DROP TABLE IF EXISTS `ex_c`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `campeonato_sofiacarvalho`.`ex_c`  AS SELECT `campeonato_sofiacarvalho`.`treinador`.`id_treinador` AS `id_treinador`, `campeonato_sofiacarvalho`.`treinador`.`nome` AS `nome`, `campeonato_sofiacarvalho`.`treinador`.`idade` AS `idade`, `campeonato_sofiacarvalho`.`treinador`.`telefone` AS `telefone` FROM `campeonato_sofiacarvalho`.`treinador` WHERE `campeonato_sofiacarvalho`.`treinador`.`idade` between 45 and 53 ORDER BY `campeonato_sofiacarvalho`.`treinador`.`idade` DESC ;

-- --------------------------------------------------------

--
-- Structure for view `ex_d`
--
DROP TABLE IF EXISTS `ex_d`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `campeonato_sofiacarvalho`.`ex_d`  AS SELECT `campeonato_sofiacarvalho`.`treinador`.`id_treinador` AS `id_treinador`, `campeonato_sofiacarvalho`.`treinador`.`nome` AS `nome`, `campeonato_sofiacarvalho`.`treinador`.`idade` AS `idade`, `campeonato_sofiacarvalho`.`treinador`.`telefone` AS `telefone` FROM `campeonato_sofiacarvalho`.`treinador` WHERE `campeonato_sofiacarvalho`.`treinador`.`nome` like 'A%' ;

-- --------------------------------------------------------

--
-- Structure for view `ex_e`
--
DROP TABLE IF EXISTS `ex_e`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `campeonato_sofiacarvalho`.`ex_e`  AS SELECT count(`campeonato_sofiacarvalho`.`equipa`.`nome`) AS `Total de Equipas` FROM `campeonato_sofiacarvalho`.`equipa` ;

-- --------------------------------------------------------

--
-- Structure for view `ex_f`
--
DROP TABLE IF EXISTS `ex_f`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `campeonato_sofiacarvalho`.`ex_f`  AS SELECT count(`campeonato_sofiacarvalho`.`treinador`.`idade`) AS `Total de Treinadores idade maior 40`, round(avg(`campeonato_sofiacarvalho`.`treinador`.`idade`),0) AS `Media idades maior 40` FROM `campeonato_sofiacarvalho`.`treinador` WHERE `campeonato_sofiacarvalho`.`treinador`.`idade` > 40 ;

-- --------------------------------------------------------

--
-- Structure for view `ex_g`
--
DROP TABLE IF EXISTS `ex_g`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `campeonato_sofiacarvalho`.`ex_g`  AS SELECT max(`campeonato_sofiacarvalho`.`treinador`.`idade`) AS `Treinador mais velho` FROM `campeonato_sofiacarvalho`.`treinador` ;

-- --------------------------------------------------------

--
-- Structure for view `ex_h`
--
DROP TABLE IF EXISTS `ex_h`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `campeonato_sofiacarvalho`.`ex_h`  AS SELECT `campeonato_sofiacarvalho`.`bola`.`id_equipa` AS `id_equipa` FROM `campeonato_sofiacarvalho`.`bola` WHERE `campeonato_sofiacarvalho`.`bola`.`fabricante` = 'Adidas' ;

-- --------------------------------------------------------

--
-- Structure for view `ex_i`
--
DROP TABLE IF EXISTS `ex_i`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `campeonato_sofiacarvalho`.`ex_i`  AS SELECT `campeonato_sofiacarvalho`.`bola`.`id_equipa` AS `id_equipa` FROM `campeonato_sofiacarvalho`.`bola` WHERE `campeonato_sofiacarvalho`.`bola`.`fabricante` = 'Adidas' GROUP BY `campeonato_sofiacarvalho`.`bola`.`id_equipa` ;

-- --------------------------------------------------------

--
-- Structure for view `ex_j`
--
DROP TABLE IF EXISTS `ex_j`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `campeonato_sofiacarvalho`.`ex_j`  AS SELECT round(avg(`t`.`idade`),0) AS `Media idades dos treinadores dos juvenis` FROM (`campeonato_sofiacarvalho`.`treinador` `t` join `campeonato_sofiacarvalho`.`experiencia` `e` on(`t`.`id_treinador` = `e`.`id_treinador`)) WHERE `e`.`id_escalao` = 2 ;

-- --------------------------------------------------------

--
-- Structure for view `ex_k`
--
DROP TABLE IF EXISTS `ex_k`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `campeonato_sofiacarvalho`.`ex_k`  AS SELECT `t`.`nome` AS `nome`, `t`.`telefone` AS `telefone`, `eq`.`nome` AS `nome da equipa` FROM ((`campeonato_sofiacarvalho`.`treinador` `t` join `campeonato_sofiacarvalho`.`experiencia` `e` on(`t`.`id_treinador` = `e`.`id_treinador`)) join `campeonato_sofiacarvalho`.`equipa` `eq` on(`e`.`id_equipa` = `eq`.`id_equipa`)) GROUP BY `t`.`nome` ;

-- --------------------------------------------------------

--
-- Structure for view `ex_l`
--
DROP TABLE IF EXISTS `ex_l`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `campeonato_sofiacarvalho`.`ex_l`  AS SELECT DISTINCT `eq`.`id_equipa` AS `id_equipa`, `eq`.`nome` AS `nome`, `eq`.`cidade` AS `cidade`, `eq`.`diretor` AS `diretor`, `t`.`nome` AS `nome do treinador`, `esc`.`descricao` AS `escalão` FROM (((`campeonato_sofiacarvalho`.`equipa` `eq` join `campeonato_sofiacarvalho`.`experiencia` `ex` on(`eq`.`id_equipa` = `ex`.`id_equipa`)) join `campeonato_sofiacarvalho`.`treinador` `t` on(`ex`.`id_treinador` = `t`.`id_treinador`)) join `campeonato_sofiacarvalho`.`escalao` `esc` on(`esc`.`id_escalao` = `ex`.`id_escalao`)) WHERE `eq`.`nome` = 'Académico' ;

-- --------------------------------------------------------

--
-- Structure for view `ex_m`
--
DROP TABLE IF EXISTS `ex_m`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `campeonato_sofiacarvalho`.`ex_m`  AS SELECT `eq`.`nome` AS `Equipa`, `t`.`nome` AS `nome do treinador`, `t`.`idade` AS `idade treinador mais velho` FROM ((`campeonato_sofiacarvalho`.`equipa` `eq` join `campeonato_sofiacarvalho`.`experiencia` `ex` on(`ex`.`id_equipa` = `eq`.`id_equipa`)) join `campeonato_sofiacarvalho`.`treinador` `t` on(`ex`.`id_treinador` = `t`.`id_treinador`)) WHERE `eq`.`nome` = 'Académico' ORDER BY `t`.`idade` DESC LIMIT 0, 1 ;

-- --------------------------------------------------------

--
-- Structure for view `ex_m2`
--
DROP TABLE IF EXISTS `ex_m2`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `campeonato_sofiacarvalho`.`ex_m2`  AS SELECT max(`t`.`idade`) AS `idade treinador mais velho` FROM (`campeonato_sofiacarvalho`.`experiencia` `ex` join `campeonato_sofiacarvalho`.`treinador` `t` on(`ex`.`id_treinador` = `t`.`id_treinador`)) WHERE `ex`.`id_equipa` = 1 ;

-- --------------------------------------------------------

--
-- Structure for view `ex_n`
--
DROP TABLE IF EXISTS `ex_n`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `campeonato_sofiacarvalho`.`ex_n`  AS SELECT sum(`ex`.`anos`) AS `anos experiência António no Académico` FROM (`campeonato_sofiacarvalho`.`experiencia` `ex` join `campeonato_sofiacarvalho`.`treinador` `t` on(`ex`.`id_treinador` = `t`.`id_treinador`)) WHERE `t`.`nome` = 'António' AND `ex`.`id_equipa` = 1 ;

-- --------------------------------------------------------

--
-- Structure for view `ex_n2`
--
DROP TABLE IF EXISTS `ex_n2`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `campeonato_sofiacarvalho`.`ex_n2`  AS SELECT `eq`.`nome` AS `Equipa`, `t`.`nome` AS `Treinador`, sum(`ex`.`anos`) AS `anos experiência` FROM ((`campeonato_sofiacarvalho`.`experiencia` `ex` join `campeonato_sofiacarvalho`.`treinador` `t` on(`ex`.`id_treinador` = `t`.`id_treinador`)) join `campeonato_sofiacarvalho`.`equipa` `eq` on(`ex`.`id_equipa` = `eq`.`id_equipa`)) WHERE `t`.`nome` = 'António' AND `eq`.`nome` = 'Académico' ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bola`
--
ALTER TABLE `bola`
  ADD PRIMARY KEY (`id_bola`),
  ADD KEY `id_equipa` (`id_equipa`);

--
-- Indexes for table `equipa`
--
ALTER TABLE `equipa`
  ADD PRIMARY KEY (`id_equipa`);

--
-- Indexes for table `escalao`
--
ALTER TABLE `escalao`
  ADD PRIMARY KEY (`id_escalao`);

--
-- Indexes for table `experiencia`
--
ALTER TABLE `experiencia`
  ADD PRIMARY KEY (`id_experiencia`),
  ADD KEY `id_equipa` (`id_equipa`),
  ADD KEY `id_treinador` (`id_treinador`),
  ADD KEY `id_escalao` (`id_escalao`);

--
-- Indexes for table `treinador`
--
ALTER TABLE `treinador`
  ADD PRIMARY KEY (`id_treinador`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bola`
--
ALTER TABLE `bola`
  MODIFY `id_bola` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `equipa`
--
ALTER TABLE `equipa`
  MODIFY `id_equipa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `escalao`
--
ALTER TABLE `escalao`
  MODIFY `id_escalao` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `experiencia`
--
ALTER TABLE `experiencia`
  MODIFY `id_experiencia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `treinador`
--
ALTER TABLE `treinador`
  MODIFY `id_treinador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bola`
--
ALTER TABLE `bola`
  ADD CONSTRAINT `bola_ibfk_1` FOREIGN KEY (`id_equipa`) REFERENCES `equipa` (`id_equipa`);

--
-- Constraints for table `experiencia`
--
ALTER TABLE `experiencia`
  ADD CONSTRAINT `experiencia_ibfk_1` FOREIGN KEY (`id_equipa`) REFERENCES `equipa` (`id_equipa`),
  ADD CONSTRAINT `experiencia_ibfk_2` FOREIGN KEY (`id_treinador`) REFERENCES `treinador` (`id_treinador`),
  ADD CONSTRAINT `experiencia_ibfk_3` FOREIGN KEY (`id_escalao`) REFERENCES `escalao` (`id_escalao`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
