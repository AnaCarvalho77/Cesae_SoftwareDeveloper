-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Mar 03, 2024 at 12:31 PM
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
-- Database: `bandas_SofiaCarvalho`
--

-- --------------------------------------------------------

--
-- Table structure for table `albuns`
--

CREATE TABLE `albuns` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nome` varchar(255) NOT NULL,
  `imagem` varchar(1500) DEFAULT NULL,
  `data_lancamento` date DEFAULT NULL,
  `banda_id` bigint(20) UNSIGNED NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `albuns`
--

INSERT INTO `albuns` (`id`, `nome`, `imagem`, `data_lancamento`, `banda_id`, `created_at`, `updated_at`) VALUES
(1, 'Parachutes', 'https://www.vagalume.com.br/coldplay/discografia/parachutes.webp', '2000-07-10', 1, NULL, '2024-03-03 01:16:28'),
(2, 'A Rush of Blood to the Head', 'https://www.vagalume.com.br/coldplay/discografia/a-rush-of-blood-to-the-head.webp', '2002-08-26', 1, NULL, NULL),
(3, 'X&Y', 'https://www.vagalume.com.br/coldplay/discografia/x-y.webp', '2005-07-06', 1, NULL, NULL),
(4, 'Viva la Vida or Death and All His Friends', 'https://www.vagalume.com.br/coldplay/discografia/viva-la-vida.webp', '2008-06-12', 1, NULL, NULL),
(5, 'Mylo Xyloto', 'https://www.vagalume.com.br/coldplay/discografia/mylo-xyloto.webp', '2011-10-24', 1, NULL, NULL),
(6, 'Ghost Stories', 'https://www.vagalume.com.br/coldplay/discografia/ghost-stories.webp', '2014-05-16', 1, NULL, NULL),
(7, 'A Head Full of Dreams', 'https://www.vagalume.com.br/coldplay/discografia/a-head-full-of-dreams.webp', '2015-12-04', 1, NULL, NULL),
(8, 'Everyday Life', 'https://www.vagalume.com.br/coldplay/discografia/everyday-life.webp', '2019-11-22', 1, NULL, NULL),
(9, 'Music of the Spheres', 'https://www.vagalume.com.br/coldplay/discografia/music-of-the-spheres-11.webp', '2021-10-15', 1, NULL, NULL),
(10, 'Bleach', 'https://www.vagalume.com.br/nirvana/discografia/bleach-11.webp', '1989-06-15', 2, NULL, NULL),
(11, 'Nevermind', 'https://www.vagalume.com.br/nirvana/discografia/nevermind.webp', '1991-09-24', 2, NULL, NULL),
(12, 'In Utero', 'https://www.vagalume.com.br/nirvana/discografia/in-utero.webp', '1993-09-13', 2, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `bandas`
--

CREATE TABLE `bandas` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nome` varchar(255) NOT NULL,
  `foto` varchar(600) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `bandas`
--

INSERT INTO `bandas` (`id`, `nome`, `foto`, `created_at`, `updated_at`) VALUES
(1, 'Coldplay', 'https://media.gettyimages.com/id/53049468/pt/foto/new-york-jonny-buckland-chris-martin-guy-berryman-and-will-champion-of-coldplay-pose-at-a-studio.jpg?s=612x612&w=0&k=20&c=cNboMOjdjzQvnxLILfYNuKK9x-nEwBL4zql8bOFH_Hc=', NULL, '2024-03-03 02:34:31'),
(2, 'Nirvana', 'https://images.impresa.pt/expresso/2022-01-08-nirvana', NULL, NULL),
(7, '3DoorsDown', 'https://akamai.sscdn.co/letras/215x215/fotos/7/7/3/b/773b740c9789ac16629737732f20cade.jpg', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `failed_jobs`
--

CREATE TABLE `failed_jobs` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `uuid` varchar(255) NOT NULL,
  `connection` text NOT NULL,
  `queue` text NOT NULL,
  `payload` longtext NOT NULL,
  `exception` longtext NOT NULL,
  `failed_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `migrations`
--

CREATE TABLE `migrations` (
  `id` int(10) UNSIGNED NOT NULL,
  `migration` varchar(255) NOT NULL,
  `batch` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `migrations`
--

INSERT INTO `migrations` (`id`, `migration`, `batch`) VALUES
(1, '2014_10_12_000000_create_users_table', 1),
(2, '2014_10_12_100000_create_password_reset_tokens_table', 1),
(3, '2019_08_19_000000_create_failed_jobs_table', 1),
(4, '2019_12_14_000001_create_personal_access_tokens_table', 1),
(5, '2024_02_23_150250_add_user_type_to_users_table', 2),
(6, '2024_02_23_150734_create_bandas', 3),
(7, '2024_02_23_150802_create_albuns', 3),
(8, '2024_02_29_162440_add_address_to_users_table', 4),
(9, '2014_10_12_200000_add_two_factor_columns_to_users_table', 5),
(10, '2024_03_03_111051_add_foto_to_users_table', 6);

-- --------------------------------------------------------

--
-- Table structure for table `password_reset_tokens`
--

CREATE TABLE `password_reset_tokens` (
  `email` varchar(255) NOT NULL,
  `token` varchar(255) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `personal_access_tokens`
--

CREATE TABLE `personal_access_tokens` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `tokenable_type` varchar(255) NOT NULL,
  `tokenable_id` bigint(20) UNSIGNED NOT NULL,
  `name` varchar(255) NOT NULL,
  `token` varchar(64) NOT NULL,
  `abilities` text DEFAULT NULL,
  `last_used_at` timestamp NULL DEFAULT NULL,
  `expires_at` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `foto` blob DEFAULT NULL,
  `user_type` int(11) DEFAULT NULL,
  `email_verified_at` timestamp NULL DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `two_factor_secret` text DEFAULT NULL,
  `two_factor_recovery_codes` text DEFAULT NULL,
  `two_factor_confirmed_at` timestamp NULL DEFAULT NULL,
  `remember_token` varchar(100) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `email`, `address`, `phone`, `foto`, `user_type`, `email_verified_at`, `password`, `two_factor_secret`, `two_factor_recovery_codes`, `two_factor_confirmed_at`, `remember_token`, `created_at`, `updated_at`) VALUES
(1, 'Ana', 'ana@gmail.com', 'Rua XPTO', '919999998', NULL, 1, NULL, '$2y$12$0jE.yVWrtnLoSfTZNJ1HzuYDlkLk5hqN/cPM/Ijt2ylASK7btiiOi', NULL, NULL, NULL, NULL, NULL, '2024-03-03 09:19:25'),
(2, 'sofia', 'sofia@gmail.com', NULL, '918888888', NULL, NULL, NULL, '$2y$12$GOEEjXoH4SoN4R9V2jFuAu1R3M85IzUzZMiO/qtmUYOJaXocNruAi', NULL, NULL, NULL, NULL, NULL, '2024-03-03 02:32:13'),
(4, 'tiago', 'tiago@ola', NULL, NULL, NULL, NULL, NULL, '$2y$12$I7/UEgmv2BSRGyuSp2ApLOMjEdKDm21ig32hvhuhwMk0gSYDYKzGy', NULL, NULL, NULL, NULL, NULL, NULL),
(5, 'alice', 'alice@gmail.com', NULL, NULL, 0xffd8ffe000104a46494600010100000100010000ffdb0084000a0708151514181515151819181a1c1d1d1a191a181a1b231e1b1b1b1a1d1d1b1a1b1d242d24221d29201e20253725292e303434341d23393f39323e2d323430010b0b0b0f0f0f110f0f11301c181c303e323e323030323e323232323232323230303030303030303e3030323e3030303030303030303030303030303030303030ffc000110800de00e303012200021101031101ffc4001c0000010501010100000000000000000000050002030406070108ffc4004a1000020102030407040705060405050000010203001104122105314151061322617181915292a1d1071432b1c1d2f042536293f11523337282a21635b2e124435473b334446483c2ffc400160101010100000000000000000000000000000102ffc400161101010100000000000000000000000000001101ffda000c03010002110311003f00930b841a01caf44130e001cf8d7204da938dd3ca3ffd8ff3aebff45bb313158269310647712bae6334a3b2150816570389aa9138c3f136fd71af1a0075b0bef1c3854db6b13b3a194e1e3c3e2b1332819e3c3be224280eece73d97c3bea98c40e1b176879cf28f8759508b992c2c05f8ebf77855929c6de9421f6a431f6a7d95b4634e2e249dc28e6d6934144b1f8bd9d1e04e3e312cb0dd459713880d7660b621a4d082750684595846f36d79d4a22b0ffb56570bd26c3ca8248b65ed3910dece92621c1b1b1b32b91bc5aa3c5f4bb0b11512ecdda31963650f2ceb98f25cd20b9f0aa46bb2770a6c9850780b8e36e7beb3c36e47bffb1f6b7bd8afcf5530dd2ec2c8ed1a6cdda2ee9f69166c4332ff009944971e7508d961a016b1f5b52780770bd64f17d2686253249b2f69a20decf262500f125ec29e9b7919432ec8daaca402087c51041d41073ea2841d31d8f7510c3016b69f756297a5386694c2365ed03281731f5b88ce073299ee06bbea5c6f4863890bc9b2b6922aef769b10a078b17b0a11b12801e1fa153322d81f4f2ac77d6e2c44187c4c2b346b2194156c4ccc7b0caa2e7391befeb5ea29f6e5fe74bf9e846cd1395aaca4558948cfb72ff3a5fcf56523fe397f9d2fe7a11b0687ba98f871e759948bf8e5fe7cdf9ea4583f8e5fe7cdf9e8ad1083babc78b75044c2afb527f3a6fcf532e0d39c9fcf9bf3d010eae9861aacbb3e3e6ffce9bf3d4c36747fc7fce9bf3d07af0eef43e7514b87fd5aa71b2e2e4ffce9bf3d4836545c9ff9d37e7a016915ae2daf87c29a61bf007ca8caec687d97fe6cbf9e9cbb0e0f65ff009b2fe7a0cf4918b9d29568ff00b0203fb0ff00cd97f3d7941f2dad778fa15ff97bff00efc9ff004475c1d2bbcfd0affcbdff00f7dffe88e800f453a7782c1ae2167eb3ae93132bb9542d7bb90bdabf002a96cfe9fedbc5976c261a37456b7663272df50092fbed467a25b23158dc3b4cdb4f191b0924428ae2c3231006baeeb500d8d0f48306d2f57872e657ceeef91cb30d3306ce378a0e99d0cda18d96077da10ac2eac42d865ba650731058db5b8df5caa661fd97b5fabb755f5d531e5fb3632a6ee16cb93e15d2ba1ef8ec4c5326d4c346012a154aa10c08398325d86842efe75cd76aa08b0bb6f0b1e90c73c0c8bc14b4b6603dd51fe9a0bfb2a29a6d8d838f098d8f0f223ca5f3627aa254c8f6072ea781b11575f1eb86c3e0a3c6e322c44cb8e8e42cb2f5b92317ed331d4053adcf3a1504984c26c6c2629f0387c43c8ee8c64500fda90825ac6ff640a761860f68ecec74ab808b0f2619332bc57d4e566e007b24106fbe8096d1c163df1ed347b56118732abaafd708023041cbd58d37696dc7cead49b5a29e5dad1e171714534ad0f552190206091a2be59077ab8b8e77e342fa533e0b65a61625d9d879cbc41d9e51724e80ea413726e796bbaa3c7fd4a5d9d06d31818a164c4a2ba2a82af187b3295b00c08eeb822827c209f0b82da1f5eda114c25819224189331eb0ab819436ebdc6efc2a4e92edfc1aae1564c663d5861a3057052c6134041ce0b7dbbfc2d48f4630786da38bc5cd1a1c1450a48899415266b2a8553a1b157b0fe25aaafd18830726d5c44b123c31a8faaab2864cd3f693283a764955f0bd018976ca7f6a4a527c2b23e091133cc5338ccc729996f964bdc9e3620f0aad8e6817058b123a405a26ca1369c98a323e56b214636d4d879f9d4916c9d9870980c34f0471c98cc3029885455612aa4445db9b17e3a122c77d00ff0085461765ed1188853eb10ca81242a09c84c56646df9482777320eb7a025d18ff0095e0bfcd89ff00e4145a3a13d18ff95e0bfcd89ffe4145a3a09e3ab2955a3ab2941612a65a852a65a189d2a75a812a75a0996a75a816a75a0956a55a896a55a0956a45a8d6a45a224a54a9515f222b8e63d6bb9fd0de3235c03869114f5efa1651fb11f3355e18956ca117c728a2787814fda8d2c377605fe22aa5418ed893413cb3eccc7c11899b3c904a5590b9dec845ca93e1e76b011fd6b6effeab65fbcdf968ca61a2dfd5a7b8b53fd523e0883fd0bf2a8ace33edb7ecb63f67c60ef646bb0f00cb6a8f15d0f8d765cf848b1513e2277479269240a1dc48ac6f62c40b036df7249e35a55c2c7ec2fb8a3f0a72e1633ff969eeafca88c7ec7c06d3c361d30cafb25e38ef97ac7763da62493b85f53c296d6c16d59e07c3f5db2a247d1ba97642c388b907435b24c0c405bab4dfec8f5dd4f4c247bfab4f717e542b23864daab1a46f26c894228556959d9ac0585c8005f4e543fa49b1b69e3215824c46cc4895b3658a464048bdaf753bae7415d146163bff00869ee0f953bea91708d3dc5f950737da9b0f6a4f834c13e2b67f548105c4cf99820b28662b62371dc350296d6d87b4f11834c1c98ad9dd5c793512be7608b65ccc5483e8370ae969848cef8d3dc5f953ce0e3b691a7b8bf2aa3926d7e88ed0c4c58689f13b3c2e193246526706d64176254dcf606a2dc68bed2c16d6c4615b092e2f66b232aab3f58f9c8520825ad6cd702e6d5d1c6063fdda7b8bf2a953071feed3dc5f950732c36cff00aa6130b8792585dd0ce498dc30b3bab0df63c7954a92afb4bea2ba3c9838ff00769ee2fcaa26c2c771fdda7b8bf2a8ac2c72afb4bea2aca4abed2fa8ad7fd523fdda7b8bf2a5f538ff00769ee28fc28330b32fb4bea2a64993da5f515a41858b4feed2ff00e45f9578f858ff00769ee2fca80124cbed2fbc2a74997da5f515666c2c637c69e3957e555db0f1dffc34f1c8bf2aa274957da5f5152a4c9ed2fbc2a9b6063f6107fa14fe14dfa927eed3dc1f2a809accbed2fbc2a55993da5f78504930718d7ab4f241f1d2aabe1a3d4f569ee8f9551a959d3db5f7854ab3a7b6bef0ac43e152d6089e6abf2aa4f020d3225c7355f9511d1feb51fb69ef0a55cd5b0887ff002d3d169542a782d71f1a2b00d683e1cea3c3e545b0b7b0f955175534efa7136a722e94cc9afe17a0781c0fad4a883971f8d251a54d907ebf5e140c22a482336d483e5f8d3b27af854c1b4a08fc7d3cff00ad79637d34a7bebad317f4682746a916a251b87ebc2aca2d07aa29ea29ab4f15036d43f15b4f0f1b6579a3561fb2ceb71e57bd66ba4bb5a69a57c2e189558c7f7ae0d89622e114f01cf99ee06fcf713839d1b23c6f6e60122c3c3cfc683b7a3ab00ca4329dcca41047711a578c6dad738e87b4d0b09002227b1743a0f103838b8d78815d2afa5e81a57ba9ac9fabd2763dfe74989aa2bba73aae70fc87ebf5cea72e6f6b6efd5c5444d034adbfa54449a9cb5c542aa45e821726fbea1994db4ab0ec2ab4a0eb63e46828ca6c779fd6b4327906600ee3cb9d1398f75bfa50d9e10dbf78dd6a0775c3830f8579434c4c380f534a80be1e31d91dc28b436160282c12066503969e9fd28c40341f0a0bcc7414a3437d6f7eff009553c5ed0ead45959dcfd845de7bf5e1de682374b9a1942e2607442402f6bd89dc6f7b11aebaf0e341b223954d11a8639010194dd48b8235d0eed7954ab6a095cd4729b2934eb5ff0042bc7040d05f9d03847a6bf87f4a454d480e95e73a0f613cfd4d4ac951061c29e87ccd04bde2f531616bf0e75595f9d478d8b3c4e9ed23afaa914185c0bac6259646b7592c8c49b9d33b0be9c3beaec38f8dc6649011cc1b83e06a86d0d9eb2a64d7ecf0246fd49d2daeb5e6cde8d2754f1ab15620b2906d637d6dddf2a8ad62ca3eaeec0861958936e40d11c1dfab4befc8b7f1ca37d633a37b09f0e92de4660e1af19d778b6877ff005adb203975df6d6dcedc2a847d69854f13521a6d11094e5bf8d31905ad5301ad7a137febce82ab47c38578eba55871ad42fa8a0a6e9a7eb7d567535725eeaad28d282948b4365886a081a6ea272d09c6100eede37f771d68284a56e6cff114aa1284697ddfae55e5011c025df7f0b9efbdad5a04d050ac0c6013ebeb45a3b682dff71414131662eb310d1bb8242aac6a59846aa3f646ba9be944f0bb670d324624011a656c91cca159829ed765aa92e33ab042296b120dadbb5d7536f2a58211cf1ffe2024a54de3253215ddb9d4919afc548b6ea808ece411ab46082aaec13b977e5f2b91e0055fcd5570e8156d6b1b96207366277f3d6a506a89730a78616dfa7ad4571e7fae7590c4fd22e1bae30431cf882a4e6685030d2f98a8bddadcc69c89a0dd39b6bbaa0cfad55d99b562c546b242d992e46a0860cba15653a861caaf05eea0744ba6ef4a9427769e36a8f11898e246791d51545d99982a81bb527bfefac6ed3fa54d9f15c46cf330d2d1a903df7ca2de17a8372175df42fa4bd228303099a7636b80aa2c5998deca0791d770ae3dd24fa58c54a146197eac01376055d985ac012cb65b6fd2fe3a573ec6e3a499b3caed237b4ec58dae4d813b85c9d3be83bd0da6255eb82142e03e462091985c02469c6aaecb954e23318d4b6fb2bfda2376f5517e576e3417018f12448f1b6e502e3b85ac47e1463a39889649197b016d724a93e9df546d366a07b3598002f63befc9a88126b2dd05e99418dcf120c8f1b37649ff00123cc42baf336cb9870247022b54e283c0d4b30b5cfafeb85308f4a52add1977dd48b73b822d419a97a4124ee63c1a6645395a56055411ec5fed1e744d311344ca258c32369d62b0363fc60db4b711c8d643646d69638a241877662c55f5002598862e49be6bdf402f5a665c4c892c7208d5458c6c8cc4b016605811604fc34a80db8aab236b560b7645f7db5f1a80ff004f0aa21912e35b1f9f0d3d2a17035ab4c38504e926da8b07119653a6e551bddb5eca83f7f0a052aeb7a17b43856770df48b9cab3e1592267cbd666240e46f96c7bc5eb4b8f50c0106e2da7107758d040c073f852aaf7b71a541049d35c14448329723708d4bdcf73689feea098ce9ecb3ba45046d12bb80ef9833e5cdae4d2ca6dc75235e55cc95c8b1abfb2b6998a5490fec9e0386e208e208a83b0ed1562734523239dd636a526d99308b1c98d7ce1e408bd5aea3427ac7f680b6e1af8dac63c26de8032068dd8b02d194ca43a1d46f23295dd73bc73359bfa40dafd6048bb2321323a83f64b0b2a6bbdb29b9dc753a0141d6a1915d43a30656170c0dc10788237d48a7beb847473a5d2e15bfbb7cc84f6e27be53de38ab7f10eeb836b5762d81b6a3c645d6c40ad8e5656b5d4800db4de351af1e55413c4e184b1bc6c480ea5091c032917f1ac7ec7c37d5e571060e3491102077758d24b65cca8543377dc8d6b688a45623a5fb52349ef16591e30ace8af62a49216e471b0375de2e39d06c765e13aa6918daf2b2c8c1770932856ca481a1b03bb9d1344e358c3d318608a39710d97ac20055058a28524b15176ca0d94f7b0a39b33a4b84c410b0e2227622e1438cdee9b1bf76fa830ff004e1b632c50e114f69dbac7d7f652eaa08ef624ff00a2b8da1d7c6b51f497b60627684acbf663fee97bc2120b79b16f8564ef412b8d7c2bc11defcc6b6eee3faf1a4edad7aaf660dcbfa1a28c6c6da4f863997b484f691ae2f6e2adbb36ef856e701d2f884331843995972c6850df3b8b02c7ecd949e06e6dbab3b84c58010cb860f1940b9c2937b0ecb5ed6048b8de3872a9ba8c10ca23964889704837d00d4dcd89d3c688cd6065970d890119a3911ec194ea34237eedd5d77a1bf496b2ff00778e511bae9d70d118836ed01f60f7fd9f0ae49246bf5bb090c809d1efa936e27e15e191a39196fd9b336e1a8b69f1a0fa8ae39d2bd0ad80ad1e0b0eaf72e90479b5d4958c6973c786b5c976afd2ee29ec208e38c7365ceddc2e4dbe1af7551b5e92ed6c34789681645594a86756042e66dc6e6c0922c48bf115245d22870986eb24911c8d024794313736551c4ebc79efae1fb4f6acd3cdf5999c3bb6f3d91a28032e55fb22da5ad518901ed654ed1d35375b15b580d06e3af22ddd507d42260c81c5ec4023c18022f5131d2b81e1ba6d8e89046988211328405236b000f66eca4e5eebf2ade741fa6f2e2e4ea6654be4660eb75cc415ec85d45ed7275e1546f735721fa4899b19b463c246da22804f00ce33bb1f04cbf756f7a41d2ac2617b32ca33fb0a33379aafd9f3b57168f6bbbe3db10872b3c8c45f5ecb5eca7cac2a0e858ed9f27d49e0eb20708000863640a994ea8c09ed8600dfc7c6aeec004e0b0e493fe1a7ddc6b19d20dbec917561555def9b216fb36b0241d0127977d6cb6163564c1445001963552a0ee2a2d6eeaa3d91cdcebf7d2a9feaa38d2a0e269876285ec72a90a5b802d7207a034cc97dd4c41ad59c05c1b8b5c6ba80df03a1a836dd1dda291e1067d591642b62a0950338049048173a5bd93e07193e795d9dc96663763c8b7dc3e55a29dcc78745085ae64de095015adaebb9801c05fefceca39697b7c0d048c9dc75eeadd7d136d42989780ee912ea3f8e3f9a93e9586494e5b1b1dc6e46a37e9a69637d7c057bb371cf14ab246d675272b7226ebf71a0d0f4f7a5934f8a9238e671021c8aa8c54315166636fb576bea785aa8f441f2999b2a12899f339b5b2b2d803707b576e77b0d2b3418816eff008eea35d18959a658ad984a421040e2c2dda3aaf88b50376be39e7935c86c2e022d80245ec09ed30f1343ad94e606d6d41e208dc41e756f6cc1d5e2248c9be536bf3b5b53e3bea91b697b5b9514c7249b9b9bdf5fbea3a95f4e07ce9d2e11d5124652164cd918ee6c86cd6f03a5111937f4a9148e26a0069e84506dfa38714d0658c23a2964cad6be9c3783b8f3ab2713283966c2758514806d7b827427b26e401977f0278d0ee8e61e4605a39ca5ddbb173cf79b1fc28b6261c72b9b481bb03b56ecd8122c7b3bf5e5546331f2a89b3ac663b58e5208e235dc2a7da4bfb6bc8836efd47df516de694c9fdee526c6d96df1af707890a62948cc11d0b29dcd9082411c8800541f45ed390478191f765c3b1ef1688fc6be5c15f4b74e27becbc4baee68491e0d6fc0d7ce3046199549cb7600b7204d893411d97bfcabc46b1aeb5b0fe8f700e199e69640a3501d1413a9b8b0b8dc78f1ae6bb721893112a457ead5d821cd9ae077ee3e341518820007c74abdb2da58b2ca9993367092588bb652182b6e2403f1aa50640c09b95b8baeebf35b8dc0eebd6cc74de331b27d4e30f94a23764855dc05b28361c811dd418a8e367d46a6fc4eb73e35e488cbbf437d35d6e388b53b106cd75245f5d34d78fc6a204b30b92493e3c68267470cb72189dc49beee049abb86c4e22291648f32116b5ae16c2da1be8473bd54c7c6410781be51ae801b71f5f3a6362dc8b173badbf872befa0ee3b3a733c51cc0db3aab5b4d0902e3d6f4a827427680181841e0187a48c07c29551c9b102cec00b598e9cac4e9e557f61a5e41bb465bdc81a16034077f80aa18a60ceec3716623c09245498298ab5c6fb35bc729b7c6a0d46d085ce1d08701517330e26e2fe16d6d6fe2340b1987746caeacac06aac083a804687b8835aedaac446c82d97295f2394fff00c8ac5492e879fcb4a0f49d2abc24ef03e344b61f54d3c4b88b98d9c07034363a731617235d34aa5244bd6305b840cc066fb416e40cd6d2f410623ed120581d6de357fa3af971509b03675b026da9200d7c4d53c42f688a5857caeadec9047791a81e66c2fc280df4ce1098d902f1b3580d01617200b0d077d03eacefb1f4ad074b6659316ccb9b503465b116be96e16aa6987b8a28761203248b18362eeaa0f005982dede75d13e96b011c106cf8a31a46b220ef03abb93de5ae4f79359ce83ec932e3e35b76633d637826a07896ca2b4df4d6c33e15788490f916403ee34472fa720d477d369f08ed0f1a02fb370d0339eb2428d73c40e3de2b4c9b3a12bd8c691dd9d7e62b25879e25639e32d63a9f3f1147d31b8129ac6e0ffabf35066f6ac59242bd667fe2bdfcb79a8b0ac6c4017d6e3eea7ed468da4262042f7df7f9d4108e7bbf56d3c683e969a15c5ecf31a9d26c380a777db8fb26dc35b57ccf2215255810412083bc11a107bebe8ae81ed169f010bb5890a5090b947618a0d0683403777d730fa60c587c72a000648d731000259aed7278f6728a0c461b192466f148e84efcaccbeb635052a540a9f948e04697d4703c7c29469722afed38c811b70640be697523d2deb414256cc6fdc29442ec0778fbe9a74af6372a430362350680ae3a0b4697bdc9906e36d0f0f4fbe86ce805b9f1f9d3a69d98a9637d3f127f1af7abcd6371c74e3d9b6f1df7f81a0d9746f6cac7868d09b119be2ec7f1a556760ec4ff00c3c65945c8277f02c48e1c88a55473ca9f0d1def6b96b10140249ecb5f77eb5a62c2c54b0562a342c01b03de6adecd98a3660b7b82a2dbee45858ef1506b3683f62fcd411e958f922ec820dc9bdc6ba58f1f1dfa568da52d0a11bd54023c0502c395666cd22a28d7556627fca07e2450411c96dfbbbb7d7b873606fe3e3cc51fc4f476f1acb0bb35c5cab80a6dc0adb4d791a6745f6599f16919072a9cf20fe14dea7c4d97ce806748b67361e731b6fca8d7ff0032293e86e3ca87a0ed0d09bf01beff00d6ba7f4b3a3cb89c646e588521564b0ef6ca6fc3781bb75135c1c4902a4291a28ed1193316041d58921b38ca6c6fbd1c106ac1cb311034654bb5f37137e16be9e75730c41d0383fa1eb4fdab2a4c0b21ff000f31d4100a937f5bfddc289747fa298bc5287862544b7f88e4aa9b6fc82c59bc4023bea0d27d192012ce7f6f247af0cb99c9b79dab39f4af8e1263ca037114689dd73790fc5ede55bce8b744b11859164ebe17570559143f6ada800903290dc4fe35c936e6cec5248f2626191199d8b3323052c589395ad622fc41a0134e8f78f114d23854d021be6b1b2d892385ce97f3a02581598376029bf06a3cf2631575863239dc7e6acc442206fd6329e62ff80a311b4653ff00ac71e24fe3400768b31725d429e42a189ac6a6c7019b47cffc5fa26a041ad0774fa2896f8122e6cb2b817d77ac6df7935cc3e91dafb4f13adfb4a37df74682d5d0fe88e6be1254b5ad2f70d1913777764d72ae94396c6e259ae099a4d08b1033b585bc2d402a952a5413426dc2fe76347a3c334d8475504b46eaca2e35cc2cc3f1f2a090be95afe869ccb301c90ffd54192c1617ac7ca4e5e66db80de4dedfd6a2c4a2a9b2b861cec4713c0d135c22f59229172ae7d2fa6955b69c7b8f750568a2cd7d09b01bb99d17e352e0309249204894b390741c39937dd6e66adec70b7b488083a5ca93f1e15d1fa298258e37651ab11724dc9b2e8331d6ddd54366c72a1c96032803d00af680ed52e667f1efe429500b8f6da2c62344ca385829f1b83bc5518a58c48b25800a6e5150004dad7fb47c68a633a310aa665690dad7bb2ee3c7773fbc5451f47636360ce376f60780b8e1c6e289710c98a8d95946650d7dd63a1f3a1c9848c1b92c7bac07c6f46b68745d5232f133332ea54b6f037dac06b55705b1a3900399f5e4c2df7514e4c6b680c8f905bb365ddcaf7bd6870bd2b8a37675c380ce888c54817c998e6b7339be0286ff00c291581eb24d7f897f2d14ff008130dfbd9fde5fc95078dd3042cc4c64e6e1997772af57a57182c444c09cdae71605ad736f117b73bf33418f47f0e1d91a4941048dea3ced96a78fa248e3fbb67b5fedbb0b788016e7e1403702f1c4ca757b3ab90eab66cac1acc2fb8dade75d6f666dc13a45266d09dd71d9363997c8861e95c9e5d808933c64b90a400d7b5f41f3adb6ccd842140b048fa481acec38817ca40e5ce835d87da0aa216375019d493a0b904936dfa18f43fc46b15d2ae9962a3c54d1473054572a06507b3bc71efa5b5b16d8558da76ecb3b11639b5cac7701dfdfbc5736daf8febe69252a01762dbcf1dc37f2a0d46d7e90b626178e6ea199f29eb3200ea5581b86bdf5008f0359d8f0b1a9bf5cbde2da11bec45f750a26ff00af9d4b878d4b59db28e76bd01d8b131afed42de287f03527d7a2ff00f1ff00957fbdaa90c0e17ff51aff00969f1ecfc21363893e497a064d1e1dcdcbaaff0091428f424d3530f8607fc47ff6d7b8fc04518bc72a38ef5b1fbe86b49636cabe6bff007a0db6c2e95a60d1d212b67219b32e6d40234ed0e741b1d89c2cb23c8e18bbb33310d60598dcd85fe147fa09b170b888a479a25721c28d585bb209dc471359ce97e0061f14f1a205436641607b247026f7b1baf95511a9c17b2fef1f9d3bacc0fee9fde6f9d07129e017dc5f956aba5fb1c61a2c31455072e495801ac9f6ae7fdc07728a828ae2f043742defb559c2f48218893144549163db3a8d0db5159a594df7fc056efa19868df3b3c68c0a8cb9954f1d6d714019b6fe1f316fab82c77b126e7c74a8e4dbb037ff006a87c6e6b45d2fc122c6ae8a132b00d9540ecb69adbbedf1ac7e34916b9237ee3be82f2748a35fb3868c5b95c7e34e3d2d9372a01dc19ff06ab1d1a7ed807556e3de39f23c2dc6f5b95b28d377e154730936e4849ec0f46f9d7b5d067980634a82846f99729dc47cbfad0ec1ce46fd2fadbc75af619f41e550e3db730f036eedd558c1d831008a04a3aa95907d9273278370f2371e429d86c5d371e03657e286fe2a778fb8f9546c65e6fb2396bf0345c623eeac80c4ddb7ff00522c28bfd66808ca91b1ccc8ac46e240352acf6a1471155b68e28f56d63a916f5d283c697ac94bf337f2d2df0b569b0b8aec8ac361717dab1e237d1d871360376ee7416ba51b2d71718008574d509dda8d54db81b0d7858572dc4c0d1bb23a95653620f035d34e2f9d07dbfb34620065203ae9723ed0e44fdc7c6830b45b630504b3328bfb4a48b72240d2fcefe5543138678dca38b11bedaefdda8ab9b3cd8e8c57cafe8729fbaa02d2411d8b2e426db832b7ddafc284e271641d32daff00b3dddf44679582eb2311a9cb64fc505bd2b3f2484b13bae775011701bb445dada28bfab5b86ef8d79b23663626465ce14aadc922fb885b55482e741adf9d13c3318a362a08762101037adeef7ffa7f57a0d7f457633e11a42eeac1c285cb7b1de731078ee1eb59fe9dce5f1363b96350be65893ea6de55a3c2e29b22e6df6ac5f49b145e67d45972a0ff004ea7fdc4d50ba25850f8b4bee5bb9ff4eeff0075ab6dd2d83aec33aaeaca43a8e7977f9d89acbf43401d63f1eca8f8935a6facf7d073343a8adcf4373287b9d146503bcb66bfa5ab178d87248e9ecb103c2fa7c2b57d1fc5697bd895171cc8e36f0a8345b64f590c8bbc9536f11a8f88ae6d88c4e62a4f2ae80d3f79f8573dda30e491d38026de0751f0aa9839b2a1651d621cd6d6d978f31a8b78d6cfae3941ee1e5a560b6462cf6535d080479efad4c9377ebe34c34d95c927e75e5519315a9bfdf5e5540b8b68ad87680d29f26d14652330bf0acf52a8d41c871363ff007357c626e3c6b36b355a4c5586ea82fc5880ae2e6c177dfefbd5d1b4a3f6d7de159fc54d707bedf81aa541aefed24fde2fbc2a2c4e3d18001d753cc565a9f135b5a03216cc18b0034ddca8a0da49edafbc2b2cd26846626fc2d50506cc6d28ff0078bef0af46d48fdb5f5158ba540476a4a1e77607436d41e4a29f866a1b1b58d5a89c505ac638086dc7f5ad09ab58b7bdaaad011c09145d71d08fda5f5acfc0f604f2aaf41ac1b6e3dd9ab338c70ceec37162479926a1a540636263d630e18dae411bfbf95116db71fb5fed6f9565af4a82ce3e50f233aee26ff0ab7b3f1a54826da5f9836b7c685d3e37b1a0d1ff006dc7ccfa1f9506da73abbe75bea35d2da8d2fe954a9504b8794a30607506f469b6da726f41f3a04ad4da028fb51493d93e83e74a8552a0f6952a540abdcd5e52a07335e9b4a9502a54a9502a54a9502a54a9502af54dabca540e67bd36952a0f435794a9502a54a9502a54a9502a54a9502a54a9502a54a950794abda5457fffd9, NULL, NULL, '$2y$12$RzZgeqtpViE.TFU5lLtLbeo74rwkGzf9wnBYD/tq45DYa8xocK6W6', NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `albuns`
--
ALTER TABLE `albuns`
  ADD PRIMARY KEY (`id`),
  ADD KEY `albuns_banda_id_foreign` (`banda_id`);

--
-- Indexes for table `bandas`
--
ALTER TABLE `bandas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `failed_jobs`
--
ALTER TABLE `failed_jobs`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `failed_jobs_uuid_unique` (`uuid`);

--
-- Indexes for table `migrations`
--
ALTER TABLE `migrations`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `password_reset_tokens`
--
ALTER TABLE `password_reset_tokens`
  ADD PRIMARY KEY (`email`);

--
-- Indexes for table `personal_access_tokens`
--
ALTER TABLE `personal_access_tokens`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `personal_access_tokens_token_unique` (`token`),
  ADD KEY `personal_access_tokens_tokenable_type_tokenable_id_index` (`tokenable_type`,`tokenable_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `users_email_unique` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `albuns`
--
ALTER TABLE `albuns`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `bandas`
--
ALTER TABLE `bandas`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `failed_jobs`
--
ALTER TABLE `failed_jobs`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `migrations`
--
ALTER TABLE `migrations`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `personal_access_tokens`
--
ALTER TABLE `personal_access_tokens`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `albuns`
--
ALTER TABLE `albuns`
  ADD CONSTRAINT `albuns_banda_id_foreign` FOREIGN KEY (`banda_id`) REFERENCES `bandas` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
