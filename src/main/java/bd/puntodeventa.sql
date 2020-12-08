-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 08, 2020 at 03:56 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.1.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `puntodeventa`
--

-- --------------------------------------------------------

--
-- Table structure for table `bitacora`
--

CREATE TABLE `bitacora` (
  `idBitacora` int(10) NOT NULL,
  `descripcion` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `idUsuario` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Dumping data for table `bitacora`
--

INSERT INTO `bitacora` (`idBitacora`, `descripcion`, `fecha`, `hora`, `idUsuario`) VALUES
(1081, 'Se regitro la operación de efectivo_inicial', '2020-09-05', '01:43:20', 10),
(1082, 'Se regitro la operación de efectivo_inicial', '2020-09-05', '01:44:56', 10),
(1083, 'Se regitro la operación de efectivo_inicial', '2020-09-06', '00:16:34', 10),
(1084, 'Registró el producto Producto 1', '2020-09-06', '00:53:06', 10),
(1085, 'Se regitro la operación de registro_producto', '2020-09-06', '00:53:06', 10),
(1086, 'Registró el producto Producto 2', '2020-09-06', '01:00:10', 10),
(1087, 'Se regitro la operación de registro_producto', '2020-09-06', '01:00:10', 10),
(1088, 'Modificó los datos del producto Croquetas', '2020-09-06', '01:25:26', 10),
(1089, 'Modificó los datos del producto Croquetas2', '2020-09-06', '01:29:32', 10),
(1090, 'Modificó los datos del producto Croquetas buenas', '2020-09-06', '01:31:49', 10),
(1091, 'Modificó los datos del producto Producto 2', '2020-09-06', '01:35:53', 10),
(1092, 'Modificó los datos del producto Croquetas buenas', '2020-09-06', '01:38:15', 10),
(1093, 'Registró el producto Producto para eliminar', '2020-09-06', '01:48:14', 10),
(1094, 'Se regitro la operación de registro_producto', '2020-09-06', '01:48:14', 10),
(1095, 'Eliminó los datos del producto Producto para eliminar', '2020-09-06', '01:49:30', 10),
(1096, 'Registró el producto Producto Eliminar 2', '2020-09-06', '02:00:06', 10),
(1097, 'Se regitro la operación de registro_producto', '2020-09-06', '02:00:06', 10),
(1098, 'Modificó los datos del producto Producto Eliminar 3', '2020-09-06', '02:00:06', 10),
(1099, 'Modificó los datos del producto Producto Eliminar 4', '2020-09-06', '02:00:06', 10),
(1100, 'Modificó los datos del producto Producto Eliminar 5', '2020-09-06', '02:00:06', 10),
(1101, 'Modificó los datos del producto Producto Eliminar 6', '2020-09-06', '02:04:00', 10),
(1102, 'Eliminó los datos del producto Producto Eliminar 6', '2020-09-06', '02:07:39', 10),
(1103, 'Registró el producto Producto eliminar nuevo', '2020-09-06', '02:09:25', 10),
(1104, 'Se regitro la operación de registro_producto', '2020-09-06', '02:09:25', 10),
(1105, 'Modificó los datos del producto Producto eliminar nuevo 2', '2020-09-06', '02:09:25', 10),
(1106, 'Eliminó los datos del producto Producto eliminar nuevo 2', '2020-09-06', '02:09:25', 10),
(1107, 'Registro al cliente Agustín Job Hernández Montes', '2020-09-06', '19:48:39', 10),
(1108, 'Modificó los datos del cliente Agustín Job Hernández Montes', '2020-09-06', '20:10:29', 10),
(1109, 'Modificó los datos del cliente Beatriz Andrade Galvan', '2020-09-06', '20:10:29', 10),
(1110, 'Modificó los datos del cliente Beatriz Andrade Galvan', '2020-09-06', '20:13:41', 10),
(1111, 'Registro al cliente Agustín Job Hernández Montes', '2020-09-06', '20:23:36', 10),
(1112, 'Modificó los datos del cliente Agustín Job Hernández Montes', '2020-09-06', '20:23:09', 10),
(1113, 'Registro al cliente Cliente de prueba', '2020-09-06', '20:25:38', 10),
(1114, 'Elimino los datos del cliente Cliente de prueba', '2020-09-06', '20:25:05', 10),
(1115, 'Registro al usuario job', '2020-09-06', '22:21:02', 10),
(1116, 'Modifico los datos del usuario Agustín Job', '2020-09-06', '23:01:45', 10),
(1117, 'Modifico los datos del usuario Admin', '2020-09-06', '23:12:26', 10),
(1118, 'Registro al usuario Prueba', '2020-09-06', '23:13:24', 10),
(1119, 'Modifico los datos del usuario Prueba1', '2020-09-06', '23:15:25', 10),
(1120, 'Elimino los datos del usuario Prueba1', '2020-09-06', '23:26:11', 10),
(1121, 'Se regitro la operación de efectivo_inicial', '2020-09-07', '01:01:45', 10),
(1122, 'Se realizó una transferencia del producto Croquetas buenasen varios del producto Producto 2', '2020-09-07', '01:19:00', 10),
(1123, 'Se realizó una transferencia del producto Croquetas buenasen varios del producto Producto 2', '2020-09-07', '01:21:55', 10),
(1124, 'Se regitro la operación de efectivo_inicial', '2020-09-08', '11:27:57', 10),
(1125, 'Se regitro la operación de registro_producto', '2020-09-08', '11:28:03', 10),
(1126, 'Agregó inventario al producto con código 123456', '2020-09-08', '11:28:03', 10),
(1127, 'Se regitro la operación de registro_producto', '2020-09-08', '11:33:49', 10),
(1128, 'Agregó inventario al producto con código 12345', '2020-09-08', '11:33:49', 10),
(1129, 'Se regitro la operación de efectivo_inicial', '2020-09-09', '00:04:26', 10),
(1130, 'Se regitro la operación de efectivo_inicial', '2020-09-09', '00:13:19', 10),
(1131, 'Se regitro la operación de salida_efectivo', '2020-09-09', '12:54:20', 10),
(1132, 'Se regitro la operación de entrada_efectivo', '2020-09-09', '14:06:47', 10),
(1133, 'Venta registrada', '2020-09-09', '22:58:02', 10),
(1134, 'Se registró la devolución de 1 articulo(s) con el código 123456', '2020-09-09', '23:05:00', 10),
(1135, 'Venta registrada', '2020-09-09', '23:11:42', 10),
(1136, 'Venta registrada', '2020-09-09', '23:12:36', 10),
(1137, 'Se regitro la operación de efectivo_inicial', '2020-09-10', '00:12:01', 10),
(1138, 'Venta registrada', '2020-09-10', '00:12:17', 10),
(1139, 'Venta registrada', '2020-09-10', '23:15:35', 10),
(1140, 'Venta registrada', '2020-09-10', '23:17:12', 10),
(1141, 'Venta registrada', '2020-09-10', '23:18:17', 10),
(1142, 'Se regitro la operación de efectivo_inicial', '2020-09-11', '10:53:30', 10),
(1143, 'Venta registrada', '2020-09-11', '10:54:03', 10),
(1144, 'Venta registrada', '2020-09-11', '11:10:50', 10),
(1145, 'Venta registrada', '2020-09-11', '11:28:05', 10),
(1146, 'Se regitro la operación de efectivo_inicial', '2020-09-12', '00:28:14', 10),
(1147, 'Se regitro la operación de efectivo_inicial', '2020-09-13', '20:39:34', 10),
(1148, 'Venta registrada', '2020-09-14', '00:13:06', 10),
(1149, 'Se regitro la operación de efectivo_inicial', '2020-09-14', '00:17:06', 10),
(1150, 'Se registró un abono de 50.0 en el ticket 6', '2020-09-14', '23:11:02', 10),
(1151, 'Se registró un abono de 50.0 en el ticket 6', '2020-09-14', '23:11:02', 10),
(1152, 'Se registró un abono de 50.0 en el ticket 6', '2020-09-14', '23:11:38', 10),
(1153, 'Se registró un abono de 50.0 en el ticket 6', '2020-09-14', '23:12:33', 10),
(1154, 'Se registró un abono de 70.0 en el ticket 6', '2020-09-14', '23:15:38', 10),
(1155, 'Se regitro la operación de efectivo_inicial', '2020-09-15', '00:25:48', 10),
(1156, 'Se registró un abono de 31.0 en el ticket 6', '2020-09-15', '00:26:11', 10),
(1157, 'Se registró un abono de 653.0 en el ticket 6', '2020-09-15', '00:27:43', 10),
(1158, 'Venta registrada', '2020-09-15', '00:40:36', 10),
(1159, 'Se registró un abono de 50.0 en el ticket 6', '2020-09-15', '00:40:54', 10),
(1160, 'Venta registrada', '2020-09-15', '00:42:51', 10),
(1161, 'Se registró un abono de 251.0 en el ticket 6', '2020-09-15', '01:11:11', 10),
(1162, 'Venta registrada', '2020-09-15', '01:14:15', 10),
(1163, 'Se registró un abono de 151.0 en el ticket 6', '2020-09-15', '01:14:50', 10),
(1164, 'Se registró un abono de 50.0 en el ticket 6', '2020-09-15', '01:14:56', 10),
(1165, 'Se registró un abono de 50.0 en el ticket 6', '2020-09-15', '01:15:12', 10),
(1166, 'Venta registrada', '2020-09-15', '02:16:44', 10),
(1167, 'Se liquidaron todos los adeudos del cliente Agustín Job Hernández Montes', '2020-09-15', '03:09:28', 10),
(1168, 'Se registró un abono de 752.0 en el ticket 5', '2020-09-15', '03:25:18', 10),
(1169, 'Se registró un abono de 51.0 en el ticket 5', '2020-09-15', '03:27:27', 10),
(1170, 'Venta registrada', '2020-09-15', '04:10:55', 10),
(1171, 'Se liquidaron todos los adeudos del cliente Beatriz Andrade Galvan', '2020-09-15', '04:17:48', 10),
(1172, 'Venta registrada', '2020-09-15', '04:18:54', 10),
(1173, 'Se registró un abono de 50.0 en el ticket 6', '2020-09-15', '04:19:11', 10),
(1174, 'Venta registrada', '2020-09-15', '19:36:34', 10),
(1175, 'Venta registrada', '2020-09-15', '20:42:12', 10),
(1176, 'Se regitro la operación de efectivo_inicial', '2020-09-16', '12:55:13', 10),
(1177, 'Venta registrada', '2020-09-16', '12:59:25', 10),
(1178, 'Se registró un abono de 50.0 en el ticket 5', '2020-09-16', '12:59:43', 10),
(1179, 'Se regitro la operación de entrada_efectivo', '2020-09-16', '13:12:10', 10),
(1180, 'Se regitro la operación de salida_efectivo', '2020-09-16', '13:13:17', 10),
(1181, 'Se regitro la operación de salida_efectivo', '2020-09-16', '13:13:45', 10),
(1182, 'Registro al usuario Empleado', '2020-09-16', '13:14:56', 10),
(1183, 'Modifico los datos del usuario Agustín Job', '2020-09-16', '13:48:56', 10),
(1184, 'Modifico los datos del usuario Admin', '2020-09-16', '13:58:48', 10),
(1185, 'Modifico los datos del usuario Empleado', '2020-09-16', '14:03:32', 10),
(1186, 'Modifico los datos del usuario Empleado', '2020-09-16', '14:04:08', 13),
(1187, 'Se regitro la operación de efectivo_inicial', '2020-09-16', '14:11:23', 13),
(1188, 'Se regitro la operación de entrada_efectivo', '2020-09-16', '14:11:45', 13),
(1189, 'Se regitro la operación de salida_efectivo', '2020-09-16', '14:11:56', 13),
(1190, 'Venta registrada', '2020-09-16', '14:13:59', 13),
(1191, 'Venta registrada', '2020-09-16', '15:57:42', 13),
(1192, 'Venta registrada', '2020-09-16', '21:39:57', 10),
(1193, 'Se regitro la operación de efectivo_inicial', '2020-09-17', '00:01:28', 10),
(1194, 'Venta registrada', '2020-09-17', '00:04:27', 10),
(1195, 'Se regitro la operación de efectivo_inicial', '2020-09-21', '12:46:59', 10),
(1196, 'Venta registrada', '2020-09-21', '12:52:34', 10),
(1197, 'Venta registrada', '2020-09-21', '13:10:06', 10),
(1198, 'Elimino los datos del cliente Beatriz Andrade Galvan', '2020-09-21', '13:08:21', 10),
(1199, 'Elimino los datos del cliente Agustín Job Hernández Montes', '2020-09-21', '13:08:21', 10),
(1200, 'Registro al cliente sandra andrade', '2020-09-21', '13:14:40', 10),
(1201, 'Registro al cliente valeria lopez', '2020-09-21', '13:15:11', 10),
(1202, 'Registro al cliente beatriz galvan', '2020-09-21', '13:15:46', 10),
(1203, 'Registro al cliente agustin hernadez ', '2020-09-21', '13:16:27', 10),
(1204, 'Venta registrada', '2020-09-21', '13:18:27', 10),
(1205, 'Venta registrada', '2020-09-21', '13:19:01', 10),
(1206, 'Venta registrada', '2020-09-21', '13:19:46', 10),
(1207, 'Se regitro la operación de entrada_efectivo', '2020-09-21', '13:19:57', 10),
(1208, 'Se regitro la operación de entrada_efectivo', '2020-09-21', '13:20:26', 10),
(1209, 'Se regitro la operación de entrada_efectivo', '2020-09-21', '13:20:39', 10),
(1210, 'Se regitro la operación de salida_efectivo', '2020-09-21', '13:21:07', 10),
(1211, 'Se regitro la operación de salida_efectivo', '2020-09-21', '13:21:23', 10),
(1212, 'Se registró la devolución de 2 articulo(s) con el código 123456', '2020-09-21', '13:22:23', 10),
(1213, 'Se registró la devolución de 3 articulo(s) con el código 12345', '2020-09-21', '13:23:45', 10),
(1214, 'Se registró la devolución de 1 articulo(s) con el código 12345', '2020-09-21', '13:24:27', 10),
(1215, 'Se registró la devolución de 1 articulo(s) con el código 12345', '2020-09-21', '13:24:54', 10),
(1216, 'Se registró la devolución de 1 articulo(s) con el código 123456', '2020-09-21', '13:25:34', 10),
(1217, 'Venta registrada', '2020-09-21', '13:26:27', 10),
(1218, 'Se registró la devolución de 1 articulo(s) con el código 123456', '2020-09-21', '13:26:42', 10),
(1219, 'Modificó los datos del cliente sandra andrade', '2020-09-21', '13:08:21', 10),
(1220, 'Modificó los datos del cliente agustin hernadez ', '2020-09-21', '13:08:21', 10),
(1221, 'Elimino los datos del cliente beatriz galvan', '2020-09-21', '13:08:21', 10),
(1222, 'Se registró un abono de 50.0 en el ticket 8', '2020-09-21', '13:29:48', 10),
(1223, 'Se registró un abono de 100.0 en el ticket 8', '2020-09-21', '13:30:07', 10),
(1224, 'Se registró un abono de 30.0 en el ticket 8', '2020-09-21', '13:30:29', 10),
(1225, 'Se liquidaron todos los adeudos del cliente agustin hernadez ', '2020-09-21', '13:31:05', 10),
(1226, 'Registró el producto boletos', '2020-09-21', '13:08:21', 10),
(1227, 'Se regitro la operación de registro_producto', '2020-09-21', '13:08:21', 10),
(1228, 'Registró el producto cajas', '2020-09-21', '13:08:21', 10),
(1229, 'Se regitro la operación de registro_producto', '2020-09-21', '13:08:21', 10),
(1230, 'Registró el producto mesas', '2020-09-21', '13:08:21', 10),
(1231, 'Se regitro la operación de registro_producto', '2020-09-21', '13:08:21', 10),
(1232, 'Registró el producto vasos', '2020-09-21', '13:08:21', 10),
(1233, 'Se regitro la operación de registro_producto', '2020-09-21', '13:08:21', 10),
(1234, 'Modificó los datos del producto boletos', '2020-09-21', '13:08:21', 10),
(1235, 'Modificó los datos del producto vasos', '2020-09-21', '13:08:21', 10),
(1236, 'Eliminó los datos del producto vasos', '2020-09-21', '13:08:21', 10),
(1237, 'Se regitro la operación de registro_producto', '2020-09-21', '13:08:21', 10),
(1238, 'Agregó inventario al producto con código 12345', '2020-09-21', '13:08:21', 10),
(1239, 'Se regitro la operación de registro_producto', '2020-09-21', '13:08:21', 10),
(1240, 'Agregó inventario al producto con código 1234567', '2020-09-21', '13:08:21', 10),
(1241, 'Se realizó una transferencia del producto boletosen varios del producto cajas', '2020-09-21', '13:08:21', 10),
(1242, 'Registro al usuario sandra', '2020-09-21', '13:43:49', 10),
(1243, 'Registro al usuario valeria', '2020-09-21', '13:44:12', 10),
(1244, 'Modifico los datos del usuario sandra andrade', '2020-09-21', '13:44:26', 10),
(1245, 'Modifico los datos del usuario Agustín Job', '2020-09-21', '13:51:23', 10),
(1246, 'Modifico los datos del usuario sandra andrade', '2020-09-21', '13:51:37', 10),
(1247, 'Modifico los datos del usuario valeria', '2020-09-21', '13:51:46', 10),
(1248, 'Elimino los datos del usuario valeria', '2020-09-21', '13:49:04', 10),
(1249, 'Venta registrada', '2020-09-21', '13:53:01', 10),
(1250, 'Venta registrada', '2020-09-21', '13:53:20', 10),
(1251, 'Se registró la devolución de 1 articulo(s) con el código 12345', '2020-09-21', '14:00:37', 10),
(1252, 'Se registró la devolución de 1 articulo(s) con el código 123456', '2020-09-21', '14:00:37', 10),
(1253, 'Se registró la devolución de 5 articulo(s) con el código 1234567', '2020-09-21', '14:00:37', 10),
(1254, 'Se registró la devolución de 5 articulo(s) con el código 321', '2020-09-21', '14:00:37', 10),
(1255, 'Se registró la devolución de 1 articulo(s) con el código 12345', '2020-09-21', '14:00:47', 10),
(1256, 'Se registró la devolución de 1 articulo(s) con el código 123456', '2020-09-21', '14:00:47', 10),
(1257, 'Se registró la devolución de 1 articulo(s) con el código 12345', '2020-09-21', '14:00:47', 10),
(1258, 'Se registró la devolución de 1 articulo(s) con el código 123', '2020-09-21', '14:00:47', 10),
(1259, 'Se registró la devolución de 1 articulo(s) con el código 12345', '2020-09-21', '14:00:51', 10),
(1260, 'Se registró la devolución de 1 articulo(s) con el código 12345', '2020-09-21', '14:00:55', 10),
(1261, 'Se registró la devolución de 4 articulo(s) con el código 123456', '2020-09-21', '14:00:59', 10),
(1262, 'Se registró la devolución de 1 articulo(s) con el código 12345', '2020-09-21', '14:00:59', 10),
(1263, 'Se registró la devolución de 2 articulo(s) con el código 12345', '2020-09-21', '14:01:03', 10),
(1264, 'Se registró la devolución de 1 articulo(s) con el código 123456', '2020-09-21', '14:01:03', 10),
(1265, 'Venta registrada', '2020-09-21', '14:19:35', 10),
(1266, 'Venta registrada', '2020-09-21', '14:20:52', 10),
(1267, 'Se regitro la operación de registro_producto', '2020-09-21', '13:49:04', 10),
(1268, 'Agregó inventario al producto con código 1234567', '2020-09-21', '13:49:04', 10),
(1269, 'Se regitro la operación de registro_producto', '2020-09-21', '13:49:04', 10),
(1270, 'Agregó inventario al producto con código 123', '2020-09-21', '13:49:04', 10),
(1271, 'Se regitro la operación de registro_producto', '2020-09-21', '13:49:04', 10),
(1272, 'Agregó inventario al producto con código 1234567', '2020-09-21', '13:49:04', 10),
(1273, 'Modifico los datos del usuario sandra andrade', '2020-09-21', '14:27:17', 10),
(1274, 'Se registró la devolución de 2 articulo(s) con el código 321', '2020-09-21', '14:28:36', 10),
(1275, 'Se registró la devolución de 10 articulo(s) con el código 123', '2020-09-21', '14:28:59', 10),
(1276, 'Modificó los datos del cliente valeria lopez', '2020-09-21', '14:28:07', 10),
(1277, 'Venta registrada', '2020-09-21', '14:32:13', 10),
(1278, 'Se registró un abono de 320.0 en el ticket 9', '2020-09-21', '14:32:38', 10),
(1279, 'Se regitro la operación de registro_producto', '2020-09-21', '14:28:07', 10),
(1280, 'Agregó inventario al producto con código 321', '2020-09-21', '14:28:07', 10),
(1281, 'Modificó los datos del cliente valeria lopez', '2020-09-21', '14:33:56', 10),
(1282, 'Elimino los datos del usuario sandra andrade', '2020-09-21', '14:33:56', 10),
(1283, 'Elimino los datos del usuario Empleado', '2020-09-21', '14:33:56', 10),
(1284, 'Registro al usuario sandra', '2020-09-21', '14:40:03', 10),
(1285, 'Modifico los datos del usuario sandra', '2020-09-21', '14:40:10', 10),
(1286, 'Modifico los datos del usuario sandra', '2020-09-21', '14:41:29', 10),
(1287, 'Modifico los datos del usuario sandra', '2020-09-21', '14:42:32', 10),
(1288, 'Se regitro la operación de efectivo_inicial', '2020-09-21', '14:42:52', 16),
(1289, 'Venta registrada', '2020-09-21', '14:43:34', 16),
(1290, 'Venta registrada', '2020-09-21', '14:44:21', 16),
(1291, 'Se registró la devolución de 1 articulo(s) con el código 12345', '2020-09-21', '14:47:15', 16),
(1292, 'Se registró la devolución de 1 articulo(s) con el código 123456', '2020-09-21', '14:47:15', 16),
(1293, 'Se registró la devolución de 5 articulo(s) con el código 1234567', '2020-09-21', '14:47:15', 16),
(1294, 'Se registró la devolución de 1 articulo(s) con el código 321', '2020-09-21', '14:47:15', 16),
(1295, 'Se registró la devolución de 2 articulo(s) con el código 123', '2020-09-21', '14:47:15', 16),
(1296, 'Se registró la devolución de 1 articulo(s) con el código 321', '2020-09-21', '14:47:15', 16),
(1297, 'Se registró la devolución de 1 articulo(s) con el código 12345', '2020-09-21', '14:47:20', 16),
(1298, 'Se registró la devolución de 1 articulo(s) con el código 123456', '2020-09-21', '14:47:20', 16),
(1299, 'Se registró la devolución de 1 articulo(s) con el código 12345', '2020-09-21', '14:47:20', 16),
(1300, 'Se registró la devolución de 2 articulo(s) con el código 123', '2020-09-21', '14:47:20', 16),
(1301, 'Se registró la devolución de 12 articulo(s) con el código 1234567', '2020-09-21', '14:47:20', 16),
(1302, 'Se registró la devolución de 2 articulo(s) con el código 123', '2020-09-21', '14:47:20', 16),
(1303, 'Se registró la devolución de 1 articulo(s) con el código 12345', '2020-09-21', '14:47:24', 16),
(1304, 'Se registró la devolución de 12 articulo(s) con el código 321', '2020-09-21', '14:47:24', 16),
(1305, 'Se registró la devolución de 1 articulo(s) con el código 123', '2020-09-21', '14:47:24', 16),
(1306, 'Se registró la devolución de 1 articulo(s) con el código 12345', '2020-09-21', '14:47:28', 16),
(1307, 'Se registró la devolución de 1 articulo(s) con el código 123', '2020-09-21', '14:47:28', 16),
(1308, 'Se registró la devolución de 1 articulo(s) con el código 321', '2020-09-21', '14:47:28', 16),
(1309, 'Se registró la devolución de 1 articulo(s) con el código 12345', '2020-09-21', '14:47:28', 16),
(1310, 'Se registró la devolución de 1 articulo(s) con el código 12345', '2020-09-21', '14:47:31', 16),
(1311, 'Se registró la devolución de 6 articulo(s) con el código 123', '2020-09-21', '14:47:31', 16),
(1312, 'Se registró la devolución de 2 articulo(s) con el código 321', '2020-09-21', '14:47:31', 16),
(1313, 'Elimino los datos del usuario sandra', '2020-09-21', '14:42:59', 16),
(1314, 'Registro al usuario Valeria', '2020-09-21', '14:48:48', 16),
(1315, 'Se regitro la operación de efectivo_inicial', '2020-09-21', '14:49:09', 17),
(1316, 'Venta registrada', '2020-09-21', '14:50:27', 17),
(1317, 'Venta registrada', '2020-09-21', '14:50:39', 17),
(1318, 'Se regitro la operación de entrada_efectivo', '2020-09-21', '14:50:47', 17),
(1319, 'Se regitro la operación de entrada_efectivo', '2020-09-21', '14:51:06', 17),
(1320, 'Se regitro la operación de entrada_efectivo', '2020-09-21', '14:51:18', 17),
(1321, 'Se regitro la operación de salida_efectivo', '2020-09-21', '14:52:04', 17),
(1322, 'Se regitro la operación de salida_efectivo', '2020-09-21', '14:52:26', 17),
(1323, 'Registro al cliente carlos', '2020-09-21', '14:53:12', 17),
(1324, 'Modificó los datos del cliente carlos', '2020-09-21', '14:49:13', 17),
(1325, 'Registró el producto bocinas', '2020-09-21', '14:49:13', 17),
(1326, 'Se regitro la operación de registro_producto', '2020-09-21', '14:49:13', 17),
(1327, 'Eliminó los datos del producto boletos', '2020-09-21', '14:49:14', 17),
(1328, 'Registró el producto velas', '2020-09-21', '14:49:13', 17),
(1329, 'Se regitro la operación de registro_producto', '2020-09-21', '14:49:13', 17),
(1330, 'Modifico los datos del usuario Valeria', '2020-09-21', '14:56:44', 10),
(1331, 'Modifico los datos del usuario Valeria', '2020-09-21', '14:56:51', 10),
(1332, 'Venta registrada', '2020-09-21', '14:57:38', 17),
(1333, 'Se registró un abono de 200.0 en el ticket 12', '2020-09-21', '14:58:00', 17),
(1334, 'Se registró un abono de 700.0 en el ticket 12', '2020-09-21', '14:59:16', 17),
(1335, 'Se regitro la operación de registro_producto', '2020-09-21', '14:57:05', 17),
(1336, 'Agregó inventario al producto con código 5678', '2020-09-21', '14:57:05', 17),
(1337, 'Se realizó una transferencia del producto bocinasen varios del producto cajas', '2020-09-21', '14:57:05', 17),
(1338, 'Registro al usuario aylin', '2020-09-21', '15:05:46', 10),
(1339, 'Se regitro la operación de efectivo_inicial', '2020-09-21', '15:06:05', 18),
(1340, 'Venta registrada', '2020-09-21', '15:07:05', 18),
(1341, 'Se registró un abono de 100.0 en el ticket 12', '2020-09-21', '16:05:47', 10),
(1342, 'Se registró un abono de 200.0 en el ticket 12', '2020-09-21', '16:06:52', 10),
(1343, 'Se registró la devolución de 4 articulo(s) con el código 5678', '2020-09-21', '17:46:39', 17),
(1344, 'Modificó los datos del cliente sandra andrade', '2020-09-21', '17:45:55', 17),
(1345, 'Eliminó los datos del producto Croquetas buenas', '2020-09-21', '17:45:55', 17),
(1346, 'Modifico los datos del usuario Valeria', '2020-09-21', '19:13:39', 10),
(1347, 'Modifico los datos del usuario aylin', '2020-09-21', '19:13:47', 10),
(1348, 'Elimino los datos del usuario aylin', '2020-09-21', '19:13:28', 10),
(1349, 'Modifico los datos del usuario Valeria', '2020-09-21', '19:14:09', 10),
(1350, 'Registro al usuario bety', '2020-09-21', '19:14:30', 10),
(1351, 'Se regitro la operación de efectivo_inicial', '2020-09-21', '19:16:17', 19),
(1352, 'Venta registrada', '2020-09-21', '19:20:25', 19),
(1353, 'Venta registrada', '2020-09-21', '19:20:47', 19),
(1354, 'Venta registrada', '2020-09-21', '19:21:11', 19),
(1355, 'Venta registrada', '2020-09-21', '19:21:28', 19),
(1356, 'Venta registrada', '2020-09-21', '19:26:32', 19),
(1357, 'Se registró la devolución de 1 articulo(s) con el código 321', '2020-09-21', '19:27:10', 19),
(1358, 'Se regitro la operación de entrada_efectivo', '2020-09-21', '19:33:53', 19),
(1359, 'Se regitro la operación de entrada_efectivo', '2020-09-21', '19:34:05', 19),
(1360, 'Se regitro la operación de entrada_efectivo', '2020-09-21', '19:34:18', 19),
(1361, 'Se regitro la operación de salida_efectivo', '2020-09-21', '19:34:42', 19),
(1362, 'Se regitro la operación de salida_efectivo', '2020-09-21', '19:35:21', 19),
(1363, 'Modifico los datos del usuario Valeria', '2020-09-21', '19:41:56', 10),
(1364, 'Elimino los datos del usuario Valeria', '2020-09-21', '19:41:45', 10),
(1365, 'Registro al usuario usuario', '2020-09-21', '19:42:30', 10),
(1366, 'Se regitro la operación de efectivo_inicial', '2020-09-21', '19:42:46', 20),
(1367, 'Venta registrada', '2020-09-21', '19:44:00', 20),
(1368, 'Venta registrada', '2020-09-21', '19:44:48', 20),
(1369, 'Se regitro la operación de entrada_efectivo', '2020-09-21', '19:45:27', 20),
(1370, 'Se regitro la operación de salida_efectivo', '2020-09-21', '19:45:41', 20),
(1371, 'Venta registrada', '2020-09-21', '19:47:21', 20),
(1372, 'Se registró un abono de -5500.0 en el ticket 12', '2020-09-21', '19:52:42', 10),
(1373, 'Se registró un abono de 20.0 en el ticket 12', '2020-09-21', '19:52:48', 10),
(1374, 'Venta registrada', '2020-09-21', '19:54:25', 20),
(1375, 'Venta registrada', '2020-09-21', '19:54:36', 20),
(1376, 'Se registró un abono de 50.0 en el ticket 8', '2020-09-21', '19:55:20', 10),
(1377, 'Se registró un abono de 100.0 en el ticket 11', '2020-09-21', '19:55:34', 10),
(1378, 'Venta registrada', '2020-09-21', '19:57:53', 20),
(1379, 'Venta registrada', '2020-09-21', '19:58:23', 20),
(1380, 'Venta registrada', '2020-09-21', '19:58:34', 20),
(1381, 'Venta registrada', '2020-09-21', '19:59:09', 20),
(1382, 'Modifico los datos del usuario bety', '2020-09-21', '20:00:46', 10),
(1383, 'Venta registrada', '2020-09-21', '20:01:27', 19),
(1384, 'Venta registrada', '2020-09-21', '20:03:05', 19),
(1385, 'Venta registrada', '2020-09-21', '20:03:10', 19),
(1386, 'Venta registrada', '2020-09-21', '20:03:20', 19),
(1387, 'Venta registrada', '2020-09-21', '20:03:26', 19),
(1388, 'Venta registrada', '2020-09-21', '20:03:31', 19),
(1389, 'Venta registrada', '2020-09-21', '20:03:37', 19),
(1390, 'Venta registrada', '2020-09-21', '20:03:43', 19),
(1391, 'Venta registrada', '2020-09-21', '20:04:01', 19),
(1392, 'Venta registrada', '2020-09-21', '20:04:09', 19),
(1393, 'Elimino los datos del cliente sandra andrade', '2020-09-21', '20:13:59', 10),
(1394, 'Modificó los datos del cliente valeria lopez', '2020-09-21', '20:13:59', 10),
(1395, 'Se registró un abono de 200.0 en el ticket 9', '2020-09-21', '20:14:41', 10),
(1396, 'Registro al usuario 125132', '2020-09-21', '20:28:18', 10),
(1397, 'Modifico los datos del usuario 125132', '2020-09-21', '20:29:13', 10),
(1398, 'Elimino los datos del usuario 125132', '2020-09-21', '20:32:39', 10),
(1399, 'Se regitro la operación de registro_producto', '2020-09-21', '20:32:39', 10),
(1400, 'Agregó inventario al producto con código 5678', '2020-09-21', '20:32:39', 10),
(1401, 'Registró el producto latas', '2020-09-21', '20:32:40', 10),
(1402, 'Se regitro la operación de registro_producto', '2020-09-21', '20:32:40', 10),
(1403, 'Modifico los datos del usuario Agustín Job', '2020-09-21', '20:37:12', 10),
(1404, 'Se regitro la operación de efectivo_inicial', '2020-09-21', '20:37:35', 11),
(1405, 'Se realizó una transferencia del producto bocinasen varios del producto bocinas', '2020-09-21', '20:37:39', 11),
(1406, 'Se realizó una transferencia del producto latasen varios del producto latas', '2020-09-21', '20:50:02', 11),
(1407, 'Modificó los datos del producto latas', '2020-09-21', '20:50:58', 11),
(1408, 'Se regitro la operación de efectivo_inicial', '2020-09-21', '21:36:29', 13),
(1409, 'Se realizó una transferencia del producto bocinasen varios del producto bocinas', '2020-09-21', '21:38:50', 10),
(1410, 'Se regitro la operación de efectivo_inicial', '2020-09-22', '16:13:23', 10),
(1411, 'Eliminó los datos del producto bocinas', '2020-09-22', '16:13:42', 10),
(1412, 'Eliminó los datos del producto cajas', '2020-09-22', '16:13:42', 10),
(1413, 'Eliminó los datos del producto latas', '2020-09-22', '16:13:42', 10),
(1414, 'Eliminó los datos del producto mesas', '2020-09-22', '16:13:42', 10),
(1415, 'Eliminó los datos del producto velas', '2020-09-22', '16:13:42', 10),
(1416, 'Registró el producto lamparas', '2020-09-22', '16:13:42', 10),
(1417, 'Se regitro la operación de registro_producto', '2020-09-22', '16:13:42', 10),
(1418, 'Registró el producto sillas', '2020-09-22', '16:13:42', 10),
(1419, 'Se regitro la operación de registro_producto', '2020-09-22', '16:13:42', 10),
(1420, 'Registró el producto libros', '2020-09-22', '16:13:42', 10),
(1421, 'Se regitro la operación de registro_producto', '2020-09-22', '16:13:42', 10),
(1422, 'Registró el producto flores', '2020-09-22', '16:13:42', 10),
(1423, 'Se regitro la operación de registro_producto', '2020-09-22', '16:13:42', 10),
(1424, 'Registró el producto libretas', '2020-09-22', '16:13:42', 10),
(1425, 'Se regitro la operación de registro_producto', '2020-09-22', '16:13:42', 10),
(1426, 'Registró el producto juguetes', '2020-09-22', '16:13:42', 10),
(1427, 'Se regitro la operación de registro_producto', '2020-09-22', '16:13:42', 10),
(1428, 'Registró el producto almohadas', '2020-09-22', '16:13:42', 10),
(1429, 'Se regitro la operación de registro_producto', '2020-09-22', '16:13:42', 10),
(1430, 'Registró el producto aretes', '2020-09-22', '16:13:42', 10),
(1431, 'Se regitro la operación de registro_producto', '2020-09-22', '16:13:42', 10),
(1432, 'Elimino los datos del cliente carlos', '2020-09-22', '16:13:41', 10),
(1433, 'Elimino los datos del cliente valeria lopez', '2020-09-22', '16:13:41', 10),
(1434, 'Registro al cliente aylin', '2020-09-22', '16:23:45', 10),
(1435, 'Registro al cliente beatriz', '2020-09-22', '16:24:08', 10),
(1436, 'Registro al cliente valeria andrade', '2020-09-22', '16:24:34', 10),
(1437, 'Registro al cliente felipe andrade', '2020-09-22', '16:24:58', 10),
(1438, 'Registro al cliente florinda galvan', '2020-09-22', '16:26:06', 10),
(1439, 'Registro al cliente julio lara', '2020-09-22', '16:26:47', 10),
(1440, 'Se realizó una transferencia del producto almohadasen varios del producto almohadas', '2020-09-22', '16:13:42', 10),
(1441, 'Se realizó una transferencia del producto aretesen varios del producto juguetes', '2020-09-22', '16:13:42', 10),
(1442, 'Elimino los datos del usuario bety', '2020-09-22', '16:13:41', 10),
(1443, 'Elimino los datos del usuario usuario', '2020-09-22', '16:13:41', 10),
(1444, 'Registro al usuario sandra ', '2020-09-22', '16:31:00', 10),
(1445, 'Registro al usuario valeria', '2020-09-22', '16:31:24', 10),
(1446, 'Venta registrada', '2020-09-22', '16:43:46', 10),
(1447, 'Venta registrada', '2020-09-22', '16:44:32', 10),
(1448, 'Venta registrada', '2020-09-22', '16:45:16', 10),
(1449, 'Venta registrada', '2020-09-22', '16:47:50', 10),
(1450, 'Venta registrada', '2020-09-22', '16:48:04', 10),
(1451, 'Venta registrada', '2020-09-22', '16:48:59', 10),
(1452, 'Se registró la devolución de 2 articulo(s) con el código 2233', '2020-09-22', '16:55:17', 10),
(1453, 'Se regitro la operación de entrada_efectivo', '2020-09-22', '16:55:35', 10),
(1454, 'Se regitro la operación de entrada_efectivo', '2020-09-22', '16:55:50', 10),
(1455, 'Se regitro la operación de entrada_efectivo', '2020-09-22', '16:56:00', 10),
(1456, 'Se regitro la operación de entrada_efectivo', '2020-09-22', '16:56:12', 10),
(1457, 'Se regitro la operación de salida_efectivo', '2020-09-22', '16:56:25', 10),
(1458, 'Se regitro la operación de salida_efectivo', '2020-09-22', '16:56:38', 10),
(1459, 'Se regitro la operación de salida_efectivo', '2020-09-22', '16:56:47', 10),
(1460, 'Se registró un abono de 50.0 en el ticket 13', '2020-09-22', '17:06:01', 10),
(1461, 'Se registró un abono de 500.0 en el ticket 13', '2020-09-22', '17:06:14', 10),
(1462, 'Se registró un abono de 100.0 en el ticket 14', '2020-09-22', '17:06:43', 10),
(1463, 'Se registró un abono de 150.0 en el ticket 13', '2020-09-22', '17:07:54', 10),
(1464, 'Se regitro la operación de efectivo_inicial', '2020-09-22', '17:10:12', 23),
(1465, 'Venta registrada', '2020-09-22', '17:11:36', 23),
(1466, 'Venta registrada', '2020-09-22', '17:12:33', 23),
(1467, 'Venta registrada', '2020-09-22', '19:14:52', 23),
(1468, 'Venta registrada', '2020-09-22', '19:15:51', 23),
(1469, 'Se regitro la operación de entrada_efectivo', '2020-09-22', '19:16:35', 23),
(1470, 'Se regitro la operación de entrada_efectivo', '2020-09-22', '19:16:53', 23),
(1471, 'Se regitro la operación de salida_efectivo', '2020-09-22', '19:17:07', 23),
(1472, 'Se regitro la operación de salida_efectivo', '2020-09-22', '19:17:21', 23),
(1473, 'Venta registrada', '2020-09-22', '19:28:06', 10),
(1474, 'Venta registrada', '2020-09-22', '19:28:45', 10),
(1475, 'Modifico los datos del usuario valeria', '2020-09-22', '19:37:13', 10),
(1476, 'Modifico los datos del usuario sandra ', '2020-09-22', '19:37:19', 10),
(1477, 'Se regitro la operación de efectivo_inicial', '2020-09-22', '19:37:35', 22),
(1478, 'Venta registrada', '2020-09-22', '19:45:00', 22),
(1479, 'Venta registrada', '2020-09-22', '19:46:03', 22),
(1480, 'Se regitro la operación de efectivo_inicial', '2020-09-24', '15:05:15', 10),
(1481, 'Venta registrada', '2020-09-24', '15:10:21', 10),
(1482, 'Venta registrada', '2020-09-24', '15:11:17', 10),
(1483, 'Venta registrada', '2020-09-24', '15:12:13', 10),
(1484, 'Elimino los datos del cliente julio lara', '2020-09-24', '15:08:31', 10),
(1485, 'Elimino los datos del cliente florinda galvan', '2020-09-24', '15:08:31', 10),
(1486, 'Elimino los datos del cliente felipe andrade', '2020-09-24', '15:08:31', 10),
(1487, 'Elimino los datos del cliente valeria andrade', '2020-09-24', '15:08:31', 10),
(1488, 'Registro al cliente sandra andrade', '2020-09-24', '15:13:21', 10),
(1489, 'Registro al cliente felipe Andrade', '2020-09-24', '15:13:41', 10),
(1490, 'Venta registrada', '2020-09-24', '15:14:07', 10),
(1491, 'Venta registrada', '2020-09-24', '15:14:49', 10),
(1492, 'Se regitro la operación de entrada_efectivo', '2020-09-24', '15:15:27', 10),
(1493, 'Se regitro la operación de entrada_efectivo', '2020-09-24', '15:15:38', 10),
(1494, 'Se regitro la operación de salida_efectivo', '2020-09-24', '15:16:08', 10),
(1495, 'Se regitro la operación de salida_efectivo', '2020-09-24', '15:16:41', 10),
(1496, 'Se registró la devolución de 2 articulo(s) con el código 5566', '2020-09-24', '15:18:35', 10),
(1497, 'Se registró un abono de 100.0 en el ticket 19', '2020-09-24', '15:28:06', 10),
(1498, 'Se registró un abono de 100.0 en el ticket 20', '2020-09-24', '15:28:24', 10),
(1499, 'Se realizó una transferencia del producto lamparasen varios del producto flores', '2020-09-24', '15:08:31', 10),
(1500, 'Se realizó una transferencia del producto almohadasen varios del producto almohadas', '2020-09-24', '15:08:31', 10),
(1501, 'Registró el producto pantalla', '2020-09-24', '15:08:31', 10),
(1502, 'Se regitro la operación de registro_producto', '2020-09-24', '15:08:31', 10),
(1503, 'Modifico los datos del usuario sandra ', '2020-09-24', '15:42:59', 10),
(1504, 'Modifico los datos del usuario valeria', '2020-09-24', '15:43:04', 10),
(1505, 'Registro al usuario beatriz', '2020-09-24', '15:43:28', 10),
(1506, 'Se regitro la operación de efectivo_inicial', '2020-09-24', '15:44:13', 24),
(1507, 'Se registró un abono de 20.0 en el ticket 20', '2020-09-24', '15:49:53', 24),
(1508, 'Modifico los datos del usuario valeria', '2020-09-24', '15:52:41', 24),
(1509, 'Se regitro la operación de efectivo_inicial', '2020-09-24', '15:53:00', 23),
(1510, 'Venta registrada', '2020-09-24', '15:54:09', 23),
(1511, 'Venta registrada', '2020-09-24', '15:55:27', 23),
(1512, 'Se registró la devolución de 1 articulo(s) con el código 3344', '2020-09-24', '16:00:12', 23),
(1513, 'Venta registrada', '2020-09-24', '16:01:25', 10),
(1514, 'Se registró la devolución de 1 articulo(s) con el código 9988', '2020-09-24', '16:03:42', 10),
(1515, 'Eliminó los datos del producto pantalla', '2020-09-24', '16:01:02', 10),
(1516, 'Se regitro la operación de entrada_efectivo', '2020-09-24', '16:11:08', 24),
(1517, 'Se regitro la operación de entrada_efectivo', '2020-09-24', '16:11:47', 24),
(1518, 'Se regitro la operación de salida_efectivo', '2020-09-24', '16:12:14', 24),
(1519, 'Se regitro la operación de entrada_efectivo', '2020-09-24', '16:14:37', 10),
(1520, 'Se regitro la operación de salida_efectivo', '2020-09-24', '16:15:07', 10),
(1521, 'Venta registrada', '2020-09-24', '16:16:40', 24),
(1522, 'Se registró un abono de 150.0 en el ticket 20', '2020-09-24', '16:17:00', 24),
(1523, 'Se regitro la operación de entrada_efectivo', '2020-09-24', '16:17:22', 24),
(1524, 'Se regitro la operación de efectivo_inicial', '2020-09-25', '01:39:51', 10),
(1525, 'Venta registrada', '2020-09-25', '01:41:24', 10),
(1526, 'Elimino los datos del cliente beatriz', '2020-09-25', '01:39:56', 10),
(1527, 'Se regitro la operación de efectivo_inicial', '2020-09-26', '11:00:33', 10),
(1528, 'Registró el producto A ver si sale', '2020-09-26', '12:08:12', 10),
(1529, 'Se regitro la operación de registro_producto', '2020-09-26', '12:08:12', 10),
(1530, 'Se registró la devolución de 1 articulo(s) con el código 12345', '2020-09-26', '12:11:09', 10),
(1531, 'Se registró la devolución de 1 articulo(s) con el código 123', '2020-09-26', '12:11:09', 10),
(1532, 'Se registró la devolución de 1 articulo(s) con el código 321', '2020-09-26', '12:11:09', 10),
(1533, 'Se registró la devolución de 1 articulo(s) con el código 12345', '2020-09-26', '12:11:09', 10),
(1534, 'Se registró la devolución de 1 articulo(s) con el código 123456', '2020-09-26', '12:11:09', 10),
(1535, 'Se registró la devolución de 1 articulo(s) con el código 123', '2020-09-26', '12:11:09', 10),
(1536, 'Se registró la devolución de 1 articulo(s) con el código 5678', '2020-09-26', '12:11:09', 10),
(1537, 'Se registró la devolución de 1 articulo(s) con el código 2345', '2020-09-26', '12:11:09', 10),
(1538, 'Se registró la devolución de 1 articulo(s) con el código 123456', '2020-09-26', '12:11:09', 10),
(1539, 'Se registró la devolución de 2 articulo(s) con el código 2233', '2020-09-26', '12:11:09', 10),
(1540, 'Se registró la devolución de 1 articulo(s) con el código 6677', '2020-09-26', '12:11:09', 10),
(1541, 'Se registró la devolución de 0.05 articulo(s) con el código 123456', '2020-09-26', '12:11:09', 10),
(1542, 'Se registró la devolución de 3 articulo(s) con el código 2345', '2020-09-26', '12:17:07', 10),
(1543, 'Se registró la devolución de 1 articulo(s) con el código 5678', '2020-09-26', '12:21:07', 10),
(1544, 'Venta registrada', '2020-09-26', '13:11:59', 10),
(1545, 'Venta registrada', '2020-09-26', '13:12:17', 10),
(1546, 'Venta registrada', '2020-09-26', '13:12:22', 10),
(1547, 'Venta registrada', '2020-09-26', '13:12:28', 10),
(1548, 'Venta registrada', '2020-09-26', '13:12:35', 10),
(1549, 'Venta registrada', '2020-09-26', '13:12:48', 10),
(1550, 'Venta registrada', '2020-09-26', '23:40:04', 10),
(1551, 'Venta registrada', '2020-09-26', '23:40:45', 10),
(1552, 'Se registró la devolución de 2 articulo(s) con el código 6677', '2020-09-26', '23:41:06', 10),
(1553, 'Se registró la devolución de 1 articulo(s) con el código 5566', '2020-09-26', '23:42:00', 10),
(1554, 'Se registró la devolución de 1 articulo(s) con el código 123456', '2020-09-26', '23:42:33', 10),
(1555, 'Se registró la devolución de 1 articulo(s) con el código 7788', '2020-09-27', '00:03:18', 10),
(1556, 'Se registró la devolución de 1 articulo(s) con el código 123456', '2020-09-27', '00:03:18', 10),
(1557, 'Se registró la devolución de 1 articulo(s) con el código 2233', '2020-09-27', '00:03:18', 10),
(1558, 'Se regitro la operación de efectivo_inicial', '2020-09-27', '00:04:00', 10),
(1559, 'Se registró la devolución de 1 articulo(s) con el código 7788', '2020-09-27', '00:04:16', 10),
(1560, 'Se registró la devolución de 1 articulo(s) con el código 4455', '2020-09-27', '00:04:16', 10),
(1561, 'Se regitro la operación de registro_producto', '2020-09-27', '00:14:31', 10),
(1562, 'Agregó inventario al producto con código 159753', '2020-09-27', '00:14:31', 10),
(1563, 'Se regitro la operación de registro_producto', '2020-09-27', '00:19:54', 10),
(1564, 'Agregó inventario al producto con código 159753', '2020-09-27', '00:19:54', 10),
(1565, 'Se regitro la operación de registro_producto', '2020-09-27', '00:23:25', 10),
(1566, 'Agregó inventario al producto con código 159753', '2020-09-27', '00:23:25', 10),
(1567, 'Venta registrada', '2020-09-27', '00:26:16', 10),
(1568, 'Venta registrada', '2020-09-27', '00:27:50', 10),
(1569, 'Registro al usuario Bernardo', '2020-09-27', '00:38:37', 10),
(1570, 'Modifico los datos del usuario Bernardo1', '2020-09-27', '00:38:52', 10),
(1571, 'Registro al usuario xxx', '2020-09-27', '00:42:55', 10),
(1572, 'Elimino los datos del usuario xxx', '2020-09-27', '00:42:43', 10),
(1573, 'Se regitro la operación de efectivo_inicial', '2020-09-27', '10:49:37', 11),
(1574, 'Se regitro la operación de efectivo_inicial', '2020-10-09', '17:28:59', 10),
(1575, 'Venta registrada', '2020-10-09', '17:29:15', 10),
(1576, 'Venta registrada', '2020-10-09', '17:29:29', 10),
(1577, 'Venta registrada', '2020-10-09', '17:29:51', 10),
(1578, 'Venta registrada', '2020-10-09', '17:30:13', 10),
(1579, 'Se regitro la operación de efectivo_inicial', '2020-10-14', '20:07:29', 10),
(1580, 'Se regitro la operación de efectivo_inicial', '2020-10-16', '12:08:31', 10),
(1581, 'Se regitro la operación de efectivo_inicial', '2020-10-17', '00:27:33', 10),
(1582, 'Se regitro la operación de efectivo_inicial', '2020-10-18', '00:04:01', 10),
(1583, 'Venta registrada', '2020-10-18', '00:25:34', 10),
(1584, 'Venta registrada', '2020-10-18', '00:25:47', 10),
(1585, 'Venta registrada', '2020-10-18', '00:25:51', 10),
(1586, 'Venta registrada', '2020-10-18', '00:26:05', 10),
(1587, 'Venta registrada', '2020-10-18', '00:26:15', 10),
(1588, 'Venta registrada', '2020-10-18', '00:26:23', 10),
(1589, 'Venta registrada', '2020-10-18', '00:26:34', 10),
(1590, 'Se regitro la operación de efectivo_inicial', '2020-11-26', '09:18:30', 10),
(1591, 'Se regitro la operación de efectivo_inicial', '2020-12-03', '20:04:27', 10),
(1592, 'Se regitro la operación de efectivo_inicial', '2020-12-06', '18:45:48', 10),
(1593, 'Registro al usuario job', '2020-12-06', '18:48:29', 10),
(1594, 'Venta registrada', '2020-12-06', '22:49:18', 10),
(1595, 'Venta registrada', '2020-12-06', '22:54:49', 10),
(1596, 'Venta registrada', '2020-12-06', '22:54:59', 10),
(1597, 'Venta registrada', '2020-12-06', '23:18:49', 10),
(1598, 'Venta registrada', '2020-12-06', '23:24:30', 10),
(1599, 'Venta registrada', '2020-12-06', '23:25:00', 10),
(1600, 'Venta registrada', '2020-12-06', '23:25:30', 10),
(1601, 'Venta registrada', '2020-12-06', '23:30:21', 10);

-- --------------------------------------------------------

--
-- Table structure for table `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(10) NOT NULL,
  `nombre` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `direccion` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `telefono` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `limiteCredito` int(10) NOT NULL,
  `eliminado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Dumping data for table `cliente`
--

INSERT INTO `cliente` (`idCliente`, `nombre`, `direccion`, `telefono`, `limiteCredito`, `eliminado`) VALUES
(5, 'Beatriz Andrade Galvan', 'Oriente 4 No. 37', '27212909', 1000, 1),
(6, 'Agustín Job Hernández Montes', 'Oriente 2 No. 38 Colonia Centro', '2721397909', 2000, 1),
(7, 'Cliente de prueba', 'Oriente 4 No. 38 colonia centro', '27272727', 100, 1),
(8, 'sandra andrade', 'calle 10 avenidas 23 ', '271458795', 200, 1),
(9, 'valeria lopez', 'calle 8 avenidas 34', '12004522653', 60000, 1),
(10, 'beatriz galvan', 'calle 23 avenidas', '78965245632', 4000, 1),
(11, 'agustin hernadez ', 'calle 5, avenidas 34', 'ssdfdfffr', 300, 0),
(12, 'carlos', 'call 4 ', '12154564', 2500, 1),
(13, 'aylin', 'calee 10', '123344', 2000, 0),
(14, 'beatriz', 'calle 8', '123456445', 500, 1),
(15, 'valeria andrade', 'calle 6', '2165776253', 4000, 1),
(16, 'felipe andrade', 'calle 9', '55124674', 4000, 1),
(17, 'florinda galvan', 'calle 23', '56677886434', 6000, 1),
(18, 'julio lara', 'calle 45', '56175326', 3000, 1),
(19, 'sandra andrade', 'sghdjvgdsj', '2234556', 3000, 0),
(20, 'felipe Andrade', 'dasjbjhsdvg', '23456', 4000, 0);

-- --------------------------------------------------------

--
-- Table structure for table `configuracion`
--

CREATE TABLE `configuracion` (
  `idConfiguracion` int(11) NOT NULL,
  `impresora` varchar(200) COLLATE utf8_spanish2_ci NOT NULL,
  `nombreLocal` varchar(200) COLLATE utf8_spanish2_ci NOT NULL,
  `rfc` varchar(50) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Table structure for table `credito`
--

CREATE TABLE `credito` (
  `idCredito` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `idTicket` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `monto` double NOT NULL,
  `abonado` double NOT NULL,
  `fechaAbono` date NOT NULL,
  `finalizado` tinyint(1) NOT NULL DEFAULT 0,
  `idUsuario` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Dumping data for table `credito`
--

INSERT INTO `credito` (`idCredito`, `idCliente`, `idTicket`, `fecha`, `monto`, `abonado`, `fechaAbono`, `finalizado`, `idUsuario`) VALUES
(1, 6, 7, '2020-09-11', 151, 50, '2020-09-14', 1, 1),
(6, 6, 7, '2020-09-11', 151, 70, '2020-09-14', 1, 1),
(7, 6, 7, '2020-09-11', 151, 31, '2020-09-15', 1, 1),
(8, 6, 9, '2020-09-14', 653, 653, '2020-09-15', 1, 1),
(9, 6, 10, '2020-09-15', 351, 50, '2020-09-15', 1, 1),
(10, 6, 10, '2020-09-15', 351, 251, '2020-09-15', 1, 1),
(11, 6, 12, '2020-09-15', 151, 151, '2020-09-15', 1, 1),
(12, 6, 11, '2020-09-15', 453, 50, '2020-09-15', 1, 1),
(13, 6, 11, '2020-09-15', 453, 50, '2020-09-15', 1, 1),
(15, 5, 6, '2020-09-11', 751, 51, '2020-09-15', 1, 1),
(16, 5, 0, '2020-09-15', 0, 851, '2020-09-15', 1, 10),
(17, 6, 15, '2020-09-15', 151, 50, '2020-09-15', 0, 10),
(18, 5, 16, '2020-09-15', 351, 50, '2020-09-16', 0, 10),
(19, 8, 25, '2020-09-21', 180, 50, '2020-09-21', 1, 10),
(20, 8, 25, '2020-09-21', 180, 100, '2020-09-21', 1, 10),
(21, 8, 25, '2020-09-21', 180, 30, '2020-09-21', 1, 10),
(22, 11, 0, '2020-09-21', 0, 1300, '2020-09-21', 1, 10),
(23, 9, 3, '2020-09-21', 7320, 320, '2020-09-21', 0, 10),
(24, 12, 3, '2020-09-21', 1700, 200, '2020-09-21', 1, 17),
(25, 12, 3, '2020-09-21', 1700, 700, '2020-09-21', 1, 17),
(26, 12, 3, '2020-09-21', 1700, 100, '2020-09-21', 1, 10),
(27, 12, 3, '2020-09-21', 1700, 200, '2020-09-21', 1, 10),
(28, 12, 3, '2020-09-21', 1700, -5500, '2020-09-21', 1, 10),
(29, 12, 4, '2020-09-21', 520, 20, '2020-09-21', 0, 10),
(30, 8, 4, '2020-09-21', 100, 50, '2020-09-21', 0, 10),
(31, 11, 5, '2020-09-21', 200, 100, '2020-09-21', 0, 10),
(32, 9, 2, '2020-09-21', 1100, 200, '2020-09-21', 0, 10),
(33, 13, 4, '2020-09-22', 1050, 50, '2020-09-22', 0, 10),
(34, 13, 4, '2020-09-22', 1050, 500, '2020-09-22', 0, 10),
(35, 14, 5, '2020-09-22', 200, 100, '2020-09-22', 0, 10),
(36, 13, 4, '2020-09-22', 1050, 150, '2020-09-22', 0, 10),
(37, 19, 18, '2020-09-24', 200, 100, '2020-09-24', 0, 10),
(38, 20, 19, '2020-09-24', 320, 100, '2020-09-24', 0, 10),
(39, 20, 19, '2020-09-24', 320, 20, '2020-09-24', 0, 24),
(40, 20, 19, '2020-09-24', 320, 150, '2020-09-24', 0, 24);

-- --------------------------------------------------------

--
-- Table structure for table `movimientos_extras`
--

CREATE TABLE `movimientos_extras` (
  `idMovimiento` int(10) NOT NULL,
  `tipo` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `descripcion` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `monto` double NOT NULL,
  `fecha` date NOT NULL,
  `revisado` tinyint(1) NOT NULL DEFAULT 0,
  `idUsuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Dumping data for table `movimientos_extras`
--

INSERT INTO `movimientos_extras` (`idMovimiento`, `tipo`, `descripcion`, `monto`, `fecha`, `revisado`, `idUsuario`) VALUES
(80, 'efectivo_inicial', 'Registro de efectivo inicial', 200, '2020-09-05', 0, 10),
(81, 'efectivo_inicial', 'Registro de efectivo inicial', 0, '2020-09-06', 0, 10),
(82, 'registro_producto', '12345', 100, '2020-09-06', 0, 10),
(83, 'registro_producto', '123456', 100, '2020-09-06', 0, 10),
(84, 'registro_producto', '1', 100, '2020-09-06', 0, 10),
(85, 'registro_producto', '1', 100, '2020-09-06', 0, 10),
(86, 'registro_producto', '1', 10, '2020-09-06', 0, 10),
(87, 'efectivo_inicial', 'Registro de efectivo inicial', 100, '2020-09-07', 0, 10),
(88, 'efectivo_inicial', 'Registro de efectivo inicial', 200, '2020-09-08', 0, 10),
(89, 'registro_producto', '123456', 10, '2020-09-08', 0, 10),
(90, 'registro_producto', '12345', 10, '2020-09-08', 0, 10),
(92, 'efectivo_inicial', 'Registro de efectivo inicial', 205, '2020-09-09', 0, 10),
(93, 'salida_efectivo', 'Compra de algo', 200, '2020-09-09', 0, 10),
(94, 'entrada_efectivo', 'Me dio mi papá', 100, '2020-09-09', 0, 10),
(95, 'efectivo_inicial', 'Registro de efectivo inicial', 150, '2020-09-10', 0, 10),
(96, 'efectivo_inicial', 'Registro de efectivo inicial', 150, '2020-09-11', 0, 10),
(97, 'efectivo_inicial', 'Registro de efectivo inicial', 200, '2020-09-12', 0, 10),
(98, 'efectivo_inicial', 'Registro de efectivo inicial', 250, '2020-09-13', 0, 10),
(99, 'efectivo_inicial', 'Registro de efectivo inicial', 250, '2020-09-14', 0, 10),
(100, 'efectivo_inicial', 'Registro de efectivo inicial', 220, '2020-09-15', 0, 10),
(101, 'efectivo_inicial', 'Registro de efectivo inicial', 250, '2020-09-16', 0, 10),
(102, 'entrada_efectivo', 'Prueba entrada', 150, '2020-09-16', 0, 10),
(103, 'salida_efectivo', 'Prueba salida', 150, '2020-09-16', 0, 10),
(104, 'salida_efectivo', 'Segunda prueba ', 50, '2020-09-16', 0, 10),
(105, 'efectivo_inicial', 'Registro de efectivo inicial', 120, '2020-09-16', 0, 13),
(106, 'entrada_efectivo', 'Prueba empleado 1', 120, '2020-09-16', 0, 13),
(107, 'salida_efectivo', 'Prueba empleado 1', 80, '2020-09-16', 0, 13),
(108, 'efectivo_inicial', 'Registro de efectivo inicial', 350, '2020-09-17', 0, 10),
(109, 'efectivo_inicial', 'Registro de efectivo inicial', 250, '2020-09-21', 0, 10),
(110, 'entrada_efectivo', 'pago de producto', 200, '2020-09-21', 0, 10),
(111, 'entrada_efectivo', 'pago de producto 2', 100, '2020-09-21', 0, 10),
(112, 'entrada_efectivo', 'pago de prodcuto 3', 200, '2020-09-21', 0, 10),
(113, 'salida_efectivo', 'pago 1', 50, '2020-09-21', 0, 10),
(114, 'salida_efectivo', 'pago de producto 2', 200, '2020-09-21', 0, 10),
(115, 'devolución', 'Se registro la devolución del producto con cœdigo 123456', 400, '2020-09-21', 0, 10),
(116, 'devolución', 'Se registro la devolución del producto con cœdigo 12345', 540, '2020-09-21', 0, 10),
(117, 'devolución', 'Se registro la devolución del producto con cœdigo 12345', 180, '2020-09-21', 0, 10),
(118, 'devolución', 'Se registro la devolución del producto con cœdigo 123456', 200, '2020-09-21', 0, 10),
(119, 'devolución', 'Se registro la devolución del producto con cœdigo 123456', 200, '2020-09-21', 0, 10),
(120, 'registro_producto', '1234567', 15, '2020-09-21', 0, 10),
(121, 'registro_producto', '123', 50, '2020-09-21', 0, 10),
(122, 'registro_producto', '321', 30, '2020-09-21', 0, 10),
(123, 'registro_producto', '4321', 80, '2020-09-21', 0, 10),
(124, 'registro_producto', '12345', 1, '2020-09-21', 0, 10),
(125, 'registro_producto', '1234567', 1, '2020-09-21', 0, 10),
(126, 'registro_producto', '1234567', 20, '2020-09-21', 0, 10),
(127, 'registro_producto', '123', 3, '2020-09-21', 0, 10),
(128, 'registro_producto', '1234567', 6, '2020-09-21', 0, 10),
(129, 'devolución', 'Se registro la devolución del producto con cœdigo 321', 1100, '2020-09-21', 0, 10),
(130, 'devolución', 'Se registro la devolución del producto con cœdigo 123', 1180, '2020-09-21', 0, 10),
(131, 'registro_producto', '321', 10, '2020-09-21', 0, 10),
(132, 'efectivo_inicial', 'Registro de efectivo inicial', 200, '2020-09-21', 0, 16),
(133, 'efectivo_inicial', 'Registro de efectivo inicial', 500, '2020-09-21', 0, 17),
(134, 'entrada_efectivo', 'pago11', 500, '2020-09-21', 0, 17),
(135, 'entrada_efectivo', 'pago 22', 150, '2020-09-21', 0, 17),
(136, 'entrada_efectivo', 'pago 33', 300, '2020-09-21', 0, 17),
(137, 'salida_efectivo', 'salida33', 30, '2020-09-21', 0, 17),
(138, 'salida_efectivo', 'salida 11', 80, '2020-09-21', 0, 17),
(139, 'registro_producto', '5678', 10, '2020-09-21', 0, 17),
(140, 'registro_producto', '2345', 50, '2020-09-21', 0, 17),
(141, 'registro_producto', '5678', 2, '2020-09-21', 0, 17),
(142, 'efectivo_inicial', 'Registro de efectivo inicial', 100, '2020-09-21', 0, 18),
(143, 'devolución', 'Se registro la devolución del producto con cœdigo 5678', 800, '2020-09-21', 0, 17),
(144, 'efectivo_inicial', 'Registro de efectivo inicial', 100, '2020-09-21', 0, 19),
(145, 'entrada_efectivo', 'pago betty', 200, '2020-09-21', 0, 19),
(146, 'entrada_efectivo', 'pago betty2', 12, '2020-09-21', 0, 19),
(147, 'entrada_efectivo', 'pago betty 3', 50, '2020-09-21', 0, 19),
(148, 'salida_efectivo', 'pago cajas ', 250, '2020-09-21', 0, 19),
(149, 'salida_efectivo', 'pago sandra1', 10, '2020-09-21', 0, 19),
(150, 'efectivo_inicial', 'Registro de efectivo inicial', 100, '2020-09-21', 0, 20),
(151, 'entrada_efectivo', 'pago', 20, '2020-09-21', 0, 20),
(152, 'salida_efectivo', 'pago1', 20, '2020-09-21', 0, 20),
(153, 'registro_producto', '5678', 10, '2020-09-21', 0, 10),
(154, 'registro_producto', '246', 15, '2020-09-21', 0, 10),
(155, 'efectivo_inicial', 'Registro de efectivo inicial', 10, '2020-09-21', 0, 11),
(156, 'efectivo_inicial', 'Registro de efectivo inicial', 250, '2020-09-21', 0, 13),
(157, 'efectivo_inicial', 'Registro de efectivo inicial', 100, '2020-09-22', 0, 10),
(158, 'registro_producto', '1122', 30, '2020-09-22', 0, 10),
(159, 'registro_producto', '2233', 20, '2020-09-22', 0, 10),
(160, 'registro_producto', '3344', 25, '2020-09-22', 0, 10),
(161, 'registro_producto', '4455', 100, '2020-09-22', 0, 10),
(162, 'registro_producto', '5566', 50, '2020-09-22', 0, 10),
(163, 'registro_producto', '6677', 40, '2020-09-22', 0, 10),
(164, 'registro_producto', '7788', 20, '2020-09-22', 0, 10),
(165, 'registro_producto', '8899', 10, '2020-09-22', 0, 10),
(166, 'devolución', 'Se registro la devolución del producto con cœdigo 2233', 400, '2020-09-22', 0, 10),
(167, 'entrada_efectivo', 'pago 1', 200, '2020-09-22', 0, 10),
(168, 'entrada_efectivo', 'pago 2', 100, '2020-09-22', 0, 10),
(169, 'entrada_efectivo', 'pago 3', 50, '2020-09-22', 0, 10),
(170, 'entrada_efectivo', 'pago 4', 100, '2020-09-22', 0, 10),
(171, 'salida_efectivo', 'pago 1', 100, '2020-09-22', 0, 10),
(172, 'salida_efectivo', 'pago 2', 50, '2020-09-22', 0, 10),
(173, 'salida_efectivo', 'pago 3', 20, '2020-09-22', 0, 10),
(174, 'efectivo_inicial', 'Registro de efectivo inicial', 200, '2020-09-22', 0, 23),
(175, 'entrada_efectivo', 'pago valeria 1', 50, '2020-09-22', 0, 23),
(176, 'entrada_efectivo', 'pago valeria 2', 20, '2020-09-22', 0, 23),
(177, 'salida_efectivo', 'pago 1', 100, '2020-09-22', 0, 23),
(178, 'salida_efectivo', 'pago 2', 50, '2020-09-22', 0, 23),
(179, 'efectivo_inicial', 'Registro de efectivo inicial', 100, '2020-09-22', 0, 22),
(180, 'efectivo_inicial', 'Registro de efectivo inicial', 100, '2020-09-24', 0, 10),
(181, 'entrada_efectivo', 'pago 1', 100, '2020-09-24', 0, 10),
(182, 'entrada_efectivo', 'pago 2', 50, '2020-09-24', 0, 10),
(183, 'salida_efectivo', 'pago 1', 200, '2020-09-24', 0, 10),
(184, 'salida_efectivo', 'pago 2', 50, '2020-09-24', 0, 10),
(185, 'devolución', 'Se registro la devolución del producto con cœdigo 5566', 80, '2020-09-24', 0, 10),
(186, 'registro_producto', '9988', 10, '2020-09-24', 0, 10),
(187, 'efectivo_inicial', 'Registro de efectivo inicial', 200, '2020-09-24', 0, 24),
(188, 'efectivo_inicial', 'Registro de efectivo inicial', 100, '2020-09-24', 0, 23),
(189, 'entrada_efectivo', 'abono 1', 100, '2020-09-24', 0, 24),
(190, 'entrada_efectivo', 'pago 2', 100, '2020-09-24', 0, 24),
(191, 'salida_efectivo', 'pago 1', 100, '2020-09-24', 0, 24),
(192, 'entrada_efectivo', 'pago 1', 100, '2020-09-24', 0, 10),
(193, 'salida_efectivo', 'pago 2', 100, '2020-09-24', 0, 10),
(194, 'entrada_efectivo', 'pago 1', 100, '2020-09-24', 0, 24),
(195, 'efectivo_inicial', 'Registro de efectivo inicial', 150, '2020-09-25', 0, 10),
(196, 'efectivo_inicial', 'Registro de efectivo inicial', 250, '2020-09-26', 0, 10),
(197, 'registro_producto', '159753', 100, '2020-09-26', 0, 10),
(198, 'devolución', 'Se registro la devolución del producto con cœdigo 2345', 300, '2020-09-26', 0, 10),
(199, 'devolución', 'Se registro la devolución del producto con cœdigo 5678', 600, '2020-09-26', 0, 10),
(200, 'devolución', 'Se registro la devolución del producto con cœdigo 6677', 500, '2020-09-26', 0, 10),
(201, 'efectivo_inicial', 'Registro de efectivo inicial', 250, '2020-09-27', 0, 10),
(202, 'registro_producto', '159753', 5, '2020-09-27', 0, 10),
(203, 'registro_producto', '159753', 10, '2020-09-27', 0, 10),
(204, 'registro_producto', '159753', 15, '2020-09-27', 0, 10),
(205, 'efectivo_inicial', 'Registro de efectivo inicial', 250, '2020-09-27', 0, 11),
(206, 'efectivo_inicial', 'Registro de efectivo inicial', 120, '2020-10-09', 0, 10),
(207, 'efectivo_inicial', 'Registro de efectivo inicial', 150, '2020-10-14', 0, 10),
(208, 'efectivo_inicial', 'Registro de efectivo inicial', 125, '2020-10-16', 0, 10),
(209, 'efectivo_inicial', 'Registro de efectivo inicial', 100, '2020-10-17', 0, 10),
(210, 'efectivo_inicial', 'Registro de efectivo inicial', 150, '2020-10-18', 0, 10),
(211, 'efectivo_inicial', 'Registro de efectivo inicial', 100, '2020-11-26', 0, 10),
(212, 'efectivo_inicial', 'Registro de efectivo inicial', 200, '2020-12-03', 0, 10),
(213, 'efectivo_inicial', 'Registro de efectivo inicial', 250, '2020-12-06', 0, 10);

-- --------------------------------------------------------

--
-- Table structure for table `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(10) NOT NULL,
  `codigo` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `descripcion` varchar(150) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `precioCosto` double NOT NULL,
  `precioVenta` double NOT NULL,
  `precioMayoreo` double NOT NULL,
  `cantidad` double NOT NULL,
  `inventarioMinimo` int(10) NOT NULL,
  `eliminado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Dumping data for table `producto`
--

INSERT INTO `producto` (`idProducto`, `codigo`, `descripcion`, `precioCosto`, `precioVenta`, `precioMayoreo`, `cantidad`, `inventarioMinimo`, `eliminado`) VALUES
(483, '12345', 'Croquetas buenas', 151, 180, 121, 94.94444444444444, 51, 1),
(484, '123456', 'Producto 2', 150, 200, 175, 110, 5, 0),
(485, '1', 'Producto Eliminar eliminado', 100, 150, 125, 100, 1, 1),
(486, '1', 'Producto Eliminar 6', 100, 150, 125, 100, 1, 1),
(487, '1', 'Producto eliminar nuevo 2', 100, 150, 120, 10, 1, 1),
(488, '1234567', 'boletos', 60, 80, 70, 56, 5, 1),
(489, '123', 'cajas', 100, 120, 118, 39, 20, 1),
(490, '321', 'mesas', 500, 600, 550, 39, 10, 1),
(491, '4321', 'vasos', 250, 400, 350, 80, 2, 1),
(492, '5678', 'bocinas', 100, 200, 150, 10, 5, 1),
(493, '2345', 'velas', 50, 100, 80, 12, 20, 1),
(494, '246', 'latas', 10, 20, 12, 10, 5, 1),
(495, '1122', 'lamparas', 15, 30, 25, 20, 10, 0),
(496, '2233', 'sillas', 100, 200, 180, 9, 5, 0),
(497, '3344', 'libros', 30, 60, 55, 5, 5, 0),
(498, '4455', 'flores', 45, 70, 65, 14, 20, 0),
(499, '5566', 'libretas', 20, 40, 38, 27, 10, 0),
(500, '6677', 'juguetes', 150, 250, 220, 41, 5, 0),
(501, '7788', 'almohadas', 90, 150, 140, 2, 10, 0),
(502, '8899', 'aretes', 200, 450, 420, 2, 3, 0),
(503, '9988', 'pantalla', 100, 300, 350, 10, 2, 1),
(504, '159753', 'A ver si sale', 100, 150, 145, 126, 10, 0);

-- --------------------------------------------------------

--
-- Table structure for table `ticket`
--

CREATE TABLE `ticket` (
  `idTicket` int(11) NOT NULL,
  `numero` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Dumping data for table `ticket`
--

INSERT INTO `ticket` (`idTicket`, `numero`, `fecha`, `activo`) VALUES
(474, 1, '2020-09-09', 0),
(475, 1, '2020-09-09', 0),
(476, 1, '2020-09-09', 0),
(477, 1, '2020-09-09', 0),
(478, 1, '2020-09-09', 0),
(479, 2, '2020-09-09', 0),
(480, 3, '2020-09-10', 0),
(481, 4, '2020-09-10', 0),
(482, 5, '2020-09-10', 0),
(483, 6, '2020-09-10', 0),
(484, 7, '2020-09-11', 0),
(485, 8, '2020-09-11', 0),
(486, 9, '2020-09-11', 0),
(487, 10, '2020-09-14', 0),
(488, 11, '2020-09-15', 0),
(489, 12, '2020-09-15', 0),
(490, 13, '2020-09-15', 0),
(491, 14, '2020-09-15', 0),
(492, 15, '2020-09-15', 0),
(493, 16, '2020-09-15', 0),
(494, 17, '2020-09-15', 0),
(495, 18, '2020-09-15', 0),
(496, 19, '2020-09-16', 0),
(497, 20, '2020-09-16', 0),
(498, 21, '2020-09-16', 0),
(499, 22, '2020-09-16', 0),
(500, 23, '2020-09-17', 0),
(501, 24, '2020-09-21', 0),
(502, 25, '2020-09-21', 0),
(503, 26, '2020-09-21', 0),
(504, 27, '2020-09-21', 0),
(505, 28, '2020-09-21', 0),
(506, 29, '2020-09-21', 0),
(507, 1, '2020-09-21', 0),
(508, 2, '2020-09-21', 0),
(509, 3, '2020-09-21', 0),
(510, 1, '2020-09-21', 0),
(511, 2, '2020-09-21', 0),
(512, 3, '2020-09-21', 0),
(513, 4, '2020-09-21', 0),
(514, 5, '2020-09-21', 0),
(515, 6, '2020-09-21', 0),
(516, 1, '2020-09-21', 0),
(517, 2, '2020-09-21', 0),
(518, 3, '2020-09-21', 0),
(519, 4, '2020-09-21', 0),
(520, 1, '2020-09-21', 0),
(521, 2, '2020-09-21', 0),
(522, 1, '2020-09-21', 0),
(523, 2, '2020-09-21', 0),
(524, 3, '2020-09-21', 0),
(525, 4, '2020-09-21', 0),
(526, 5, '2020-09-21', 0),
(527, 6, '2020-09-21', 0),
(528, 1, '2020-09-21', 0),
(529, 2, '2020-09-21', 0),
(530, 3, '2020-09-21', 0),
(531, 4, '2020-09-21', 0),
(532, 5, '2020-09-21', 0),
(533, 6, '2020-09-21', 0),
(534, 7, '2020-09-21', 0),
(535, 8, '2020-09-21', 0),
(536, 9, '2020-09-21', 0),
(537, 10, '2020-09-21', 0),
(538, 1, '2020-09-21', 0),
(539, 2, '2020-09-21', 0),
(540, 3, '2020-09-21', 0),
(541, 4, '2020-09-21', 0),
(542, 5, '2020-09-21', 0),
(543, 6, '2020-09-21', 0),
(544, 7, '2020-09-21', 0),
(545, 8, '2020-09-21', 0),
(546, 9, '2020-09-21', 0),
(547, 10, '2020-09-21', 0),
(548, 11, '2020-09-21', 0),
(549, 1, '2020-09-21', 0),
(550, 2, '2020-09-22', 0),
(551, 3, '2020-09-22', 0),
(552, 4, '2020-09-22', 0),
(553, 5, '2020-09-22', 0),
(554, 6, '2020-09-22', 0),
(555, 7, '2020-09-22', 0),
(556, 8, '2020-09-22', 0),
(557, 9, '2020-09-22', 0),
(558, 10, '2020-09-22', 0),
(559, 11, '2020-09-22', 0),
(560, 12, '2020-09-22', 0),
(561, 13, '2020-09-22', 0),
(562, 14, '2020-09-22', 0),
(563, 15, '2020-09-22', 0),
(564, 16, '2020-09-24', 0),
(565, 17, '2020-09-24', 0),
(566, 18, '2020-09-24', 0),
(567, 19, '2020-09-24', 0),
(568, 20, '2020-09-24', 0),
(569, 21, '2020-09-24', 0),
(570, 1, '2020-09-24', 0),
(571, 2, '2020-09-24', 0),
(572, 3, '2020-09-24', 0),
(573, 4, '2020-09-24', 0),
(574, 5, '2020-09-25', 0),
(575, 6, '2020-09-26', 0),
(576, 1, '2020-09-26', 0),
(577, 2, '2020-09-26', 0),
(578, 3, '2020-09-26', 0),
(579, 4, '2020-09-26', 0),
(580, 5, '2020-09-26', 0),
(581, 6, '2020-09-26', 0),
(582, 7, '2020-09-26', 0),
(583, 8, '2020-09-26', 0),
(584, 9, '2020-09-27', 0),
(585, 10, '2020-09-27', 0),
(586, 1, '2020-10-09', 0),
(587, 2, '2020-10-09', 0),
(588, 1, '2020-10-09', 0),
(589, 2, '2020-10-09', 0),
(590, 3, '2020-10-09', 0),
(591, 1, '2020-10-09', 0),
(592, 2, '2020-10-09', 0),
(593, 3, '2020-10-18', 0),
(594, 1, '2020-10-18', 0),
(595, 2, '2020-10-18', 0),
(596, 3, '2020-10-18', 0),
(597, 4, '2020-10-18', 0),
(598, 1, '2020-10-18', 1),
(599, 2, '2020-10-18', 1),
(600, 3, '2020-10-18', 1),
(601, 4, '2020-10-18', 1),
(602, 5, '2020-12-06', 1),
(603, 6, '2020-12-06', 1),
(604, 7, '2020-12-06', 1),
(605, 8, '2020-12-06', 1),
(606, 9, '2020-12-06', 1),
(607, 10, '2020-12-06', 1),
(608, 11, '2020-12-06', 1),
(609, 12, '2020-12-06', 1);

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `idUsuario` int(10) NOT NULL,
  `nombre` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `direccion` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `tipoUsuario` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `telefono` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `eliminado` tinyint(1) NOT NULL DEFAULT 0,
  `fecha` date NOT NULL,
  `enSesion` tinyint(1) NOT NULL DEFAULT 0,
  `hora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`idUsuario`, `nombre`, `direccion`, `username`, `password`, `tipoUsuario`, `telefono`, `eliminado`, `fecha`, `enSesion`, `hora`) VALUES
(10, 'Admin', 'Admin', 'admin', '@12345', 'Administrador', '2721234', 0, '2020-12-06', 1, '23:30:14'),
(11, 'Agustín Job', 'Oriente 2', 'job@hotmail.com', '12345', 'Administrador', '2721397909', 0, '2020-09-27', 0, '11:06:53'),
(12, 'Prueba1', 'pru1', 'pru1', '123441', 'Empleado', 'pre1', 1, '2020-09-06', 0, '23:13:24'),
(13, 'Empleado', 'oriente 4 no 37. colonia centrro', 'empleado', '@12345', 'Empleado', '2721397909', 1, '2020-09-21', 0, '21:36:29'),
(14, 'sandra andrade', 'cale 12', 'sanjksdgdjk@hjhlkshdcl', '123456789', 'Administrador', '21465687', 1, '2020-09-21', 0, '13:43:49'),
(15, 'valeria', 'asdeawdaw', 'swqwdqw@jkdhnjs', '13579', 'Empleado', '12544558585', 1, '2020-09-21', 0, '13:44:12'),
(16, 'sandra', 'calle 10', 'sgandrade@hotmail.com', '4321', 'Administrador', '2711937497', 1, '2020-09-21', 0, '14:42:52'),
(17, 'Valeria', 'sasdds', 'val', '1234567', 'Administrador', '2515465546', 1, '2020-09-21', 0, '19:14:50'),
(18, 'aylin', 'zbdfnmbmdfv', 'aylin', '56789', 'Administrador', '53468465413', 1, '2020-09-21', 0, '15:06:05'),
(19, 'bety', 'asdcas', 'betty', '123456789', 'Empleado', '545456', 1, '2020-09-21', 0, '20:01:03'),
(20, 'usuario', 'dgfajsdgvf', 'usu', '123', 'Empleado', '54534', 1, '2020-09-21', 0, '19:56:12'),
(21, '125132', 'njkjknkl', '45646', 'hgvghvl', 'Administrador', 'hvbhjvljk', 1, '2020-09-21', 0, '20:28:18'),
(22, 'sandra ', 'calle 10', 'sandra', '123456789', 'Empleado', '21627327882', 0, '2020-09-22', 0, '19:37:35'),
(23, 'valeria', 'calle 3', 'valeria', '23456789', 'Empleado', '1546347612', 0, '2020-09-24', 0, '15:53:00'),
(24, 'beatriz', 'adswed', 'betty', '789', 'Administrador', '25363772', 0, '2020-09-24', 0, '16:16:20'),
(25, 'Bernardo1', '1', 'berny1', '123451', 'Administrador', '27213979091', 0, '2020-09-27', 0, '00:38:37'),
(26, 'xxx', 'xxx', 'xxx', 'xxx', 'Administrador', 'xx', 1, '2020-09-27', 0, '00:42:55'),
(27, 'job', 'oriente job', 'job1234', 'job', 'Administrador', 'job', 0, '2020-12-06', 0, '18:48:29');

-- --------------------------------------------------------

--
-- Table structure for table `ventas`
--

CREATE TABLE `ventas` (
  `idVenta` int(10) NOT NULL,
  `idTicket` int(10) NOT NULL,
  `codigo` varchar(500) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `nombre` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `precioCosto` double NOT NULL,
  `precioVenta` double NOT NULL,
  `cantidad` double NOT NULL,
  `importe` double NOT NULL,
  `idCliente` int(11) NOT NULL DEFAULT 0,
  `idUsuario` int(10) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `mayoreo` varchar(10) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `devolucion` tinyint(1) NOT NULL DEFAULT 0,
  `devocompleta` tinyint(1) NOT NULL DEFAULT 0,
  `tipoCompra` varchar(20) COLLATE utf16_spanish2_ci NOT NULL DEFAULT 'efectivo',
  `finalizada` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish2_ci;

--
-- Dumping data for table `ventas`
--

INSERT INTO `ventas` (`idVenta`, `idTicket`, `codigo`, `nombre`, `precioCosto`, `precioVenta`, `cantidad`, `importe`, `idCliente`, `idUsuario`, `fecha`, `hora`, `mayoreo`, `devolucion`, `devocompleta`, `tipoCompra`, `finalizada`) VALUES
(33543, 0, '123456', 'Producto 2', 150, 200, 1, 200, 0, 10, '2020-09-09', '22:58:02', 'NO', 1, 1, 'efectivo', 1),
(33544, 0, '12345', 'Croquetas buenas', 151, 151, 2, 302, 0, 10, '2020-09-09', '23:11:42', 'NO', 0, 0, 'efectivo', 1),
(33545, 1, '12345', 'Croquetas buenas', 151, 151, 1, 151, 0, 10, '2020-09-21', '23:12:36', 'NO', 1, 1, 'efectivo', 1),
(33546, 1, '123456', 'Producto 2', 150, 200, 1, 200, 0, 10, '2020-09-21', '23:12:36', 'NO', 1, 1, 'efectivo', 1),
(33547, 2, '12345', 'Croquetas buenas', 151, 151, 1, 151, 0, 10, '2020-09-21', '00:12:17', 'NO', 1, 1, 'efectivo', 1),
(33548, 2, '123456', 'Producto 2', 150, 200, 1, 200, 0, 10, '2020-09-21', '00:12:17', 'NO', 1, 1, 'efectivo', 1),
(33549, 3, '12345', 'Croquetas buenas', 151, 151, 1, 151, 0, 10, '2020-09-21', '23:15:35', 'NO', 1, 1, 'efectivo', 1),
(33550, 4, '12345', 'Croquetas buenas', 151, 151, 1, 151, 0, 10, '2020-09-26', '23:17:12', 'NO', 1, 1, 'efectivo', 1),
(33551, 5, '12345', 'Croquetas buenas', 151, 151, 1, 151, 0, 10, '2020-09-27', '23:18:17', 'NO', 1, 1, 'efectivo', 1),
(33552, 6, '123456', 'Producto 2', 150, 200, 3, 600, 5, 10, '2020-09-27', '10:54:03', 'NO', 1, 1, 'credito', 1),
(33553, 6, '12345', 'Croquetas buenas', 151, 151, 1, 151, 5, 10, '2020-09-27', '10:54:03', 'NO', 1, 1, 'credito', 1),
(33554, 7, '12345', 'Croquetas buenas', 151, 151, 1, 151, 6, 10, '2020-09-11', '11:10:50', 'NO', 0, 0, 'credito', 1),
(33555, 8, '12345', 'Croquetas buenas', 151, 151, 1, 151, 0, 10, '2020-09-11', '11:28:05', 'NO', 0, 0, 'efectivo', 1),
(33556, 8, '123456', 'Producto 2', 150, 200, 1, 200, 0, 10, '2020-09-11', '11:28:05', 'NO', 0, 0, 'efectivo', 1),
(33557, 9, '12345', 'Croquetas buenas', 151, 151, 3, 453, 6, 10, '2020-09-14', '00:13:06', 'NO', 0, 0, 'credito', 1),
(33558, 9, '123456', 'Producto 2', 150, 200, 1, 200, 6, 10, '2020-09-14', '00:13:06', 'NO', 0, 0, 'credito', 1),
(33559, 10, '12345', 'Croquetas buenas', 151, 151, 1, 151, 6, 10, '2020-09-15', '00:40:36', 'NO', 0, 0, 'credito', 1),
(33560, 10, '123456', 'Producto 2', 150, 200, 1, 200, 6, 10, '2020-09-15', '00:40:36', 'NO', 0, 0, 'credito', 1),
(33561, 11, '12345', 'Croquetas buenas', 151, 151, 3, 453, 6, 10, '2020-09-15', '00:42:51', 'NO', 0, 0, 'credito', 1),
(33562, 12, '12345', 'Croquetas buenas', 151, 151, 1, 151, 6, 10, '2020-09-15', '01:14:15', 'NO', 0, 0, 'credito', 1),
(33563, 13, '12345', 'Croquetas buenas', 151, 151, 4, 604, 6, 10, '2020-09-15', '02:16:44', 'NO', 0, 0, 'credito', 1),
(33564, 14, '12345', 'Croquetas buenas', 151, 151, 1, 151, 5, 10, '2020-09-15', '04:10:55', 'NO', 0, 0, 'credito', 1),
(33565, 15, '12345', 'Croquetas buenas', 151, 151, 1, 151, 6, 10, '2020-09-15', '04:18:54', 'NO', 0, 0, 'credito', 0),
(33566, 16, '123456', 'Producto 2', 150, 200, 1, 200, 5, 10, '2020-09-15', '19:36:34', 'NO', 0, 0, 'credito', 0),
(33567, 16, '12345', 'Croquetas buenas', 151, 151, 1, 151, 5, 10, '2020-09-15', '19:36:34', 'NO', 0, 0, 'credito', 0),
(33568, 17, '12345', 'Croquetas buenas', 151, 151, 1, 151, 0, 10, '2020-09-15', '20:42:12', 'NO', 0, 0, 'efectivo', 1),
(33569, 18, '123456', 'Producto 2', 150, 200, 1, 200, 0, 10, '2020-09-16', '12:59:25', 'NO', 0, 0, 'efectivo', 1),
(33570, 19, '12345', 'Croquetas buenas', 151, 151, 1, 151, 0, 13, '2020-09-16', '14:13:59', 'NO', 0, 0, 'efectivo', 1),
(33571, 20, '12345', 'Croquetas buenas', 151, 180, 1, 180, 5, 13, '2020-09-16', '15:57:42', 'NO', 0, 0, 'credito', 0),
(33572, 21, '12345', 'Croquetas buenas', 151, 180, 0.05555555555555555, 10, 5, 10, '2020-09-16', '21:39:57', 'NO', 0, 0, 'credito', 0),
(33573, 22, '12345', 'Croquetas buenas', 151, 180, 1, 180, 0, 10, '2020-09-17', '00:04:27', 'NO', 0, 0, 'efectivo', 1),
(33574, 22, '123456', 'Producto 2', 150, 200, 1, 200, 0, 10, '2020-09-17', '00:04:27', 'NO', 0, 0, 'efectivo', 1),
(33575, 23, '12345', 'Croquetas buenas', 151, 121, 1, 121, 6, 10, '2020-09-21', '12:52:34', 'NO', 1, 1, 'credito', 0),
(33576, 24, '12345', 'Croquetas buenas', 151, 180, 1, 360, 0, 10, '2020-09-21', '13:10:06', 'NO', 1, 0, 'efectivo', 1),
(33577, 24, '123456', 'Producto 2', 150, 200, 1, 600, 0, 10, '2020-09-21', '13:10:06', 'NO', 1, 0, 'efectivo', 1),
(33578, 25, '12345', 'Croquetas buenas', 151, 180, 1, 180, 8, 10, '2020-09-21', '13:18:27', 'NO', 1, 1, 'credito', 1),
(33579, 26, '123456', 'Producto 2', 150, 200, 1, 400, 11, 10, '2020-09-21', '13:19:01', 'NO', 1, 0, 'credito', 1),
(33580, 26, '12345', 'Croquetas buenas', 151, 180, 2, 900, 11, 10, '2020-09-21', '13:19:01', 'NO', 1, 0, 'credito', 1),
(33581, 27, '123456', 'Producto 2', 150, 200, 4, 800, 10, 10, '2020-09-21', '13:19:46', 'NO', 1, 1, 'credito', 0),
(33582, 27, '12345', 'Croquetas buenas', 151, 180, 1, 180, 10, 10, '2020-09-21', '13:19:46', 'NO', 1, 1, 'credito', 0),
(33583, 28, '12345', 'Croquetas buenas', 151, 180, 2, 360, 0, 10, '2020-09-21', '13:26:27', 'NO', 1, 1, 'efectivo', 1),
(33584, 28, '123456', 'Producto 2', 150, 200, 1, 400, 0, 10, '2020-09-21', '13:26:27', 'NO', 1, 1, 'efectivo', 1),
(33585, 1, '1234567', 'boletos', 60, 80, 5, 400, 0, 10, '2020-09-21', '13:53:01', 'NO', 1, 1, 'efectivo', 1),
(33586, 1, '321', 'mesas', 500, 600, 1, 3000, 0, 10, '2020-09-21', '13:53:01', 'NO', 1, 1, 'efectivo', 1),
(33587, 2, '12345', 'Croquetas buenas', 151, 180, 1, 180, 9, 10, '2020-09-21', '13:53:20', 'NO', 1, 1, 'credito', 0),
(33588, 2, '123', 'cajas', 100, 120, 2, 120, 9, 10, '2020-09-21', '13:53:20', 'NO', 1, 1, 'credito', 0),
(33589, 1, '123', 'cajas', 100, 118, 2, 236, 0, 10, '2020-09-21', '14:19:35', 'NO', 1, 1, 'efectivo', 1),
(33590, 1, '321', 'mesas', 500, 550, 1, 1650, 0, 10, '2020-09-21', '14:19:35', 'NO', 1, 1, 'efectivo', 1),
(33591, 2, '1234567', 'boletos', 60, 70, 12, 840, 0, 10, '2020-09-21', '14:20:52', 'NO', 1, 1, 'efectivo', 1),
(33592, 2, '123', 'cajas', 100, 118, 2, 1416, 0, 10, '2020-09-21', '14:20:52', 'NO', 1, 1, 'efectivo', 1),
(33593, 3, '321', 'mesas', 500, 600, 12, 7200, 9, 10, '2020-09-21', '14:32:13', 'NO', 1, 1, 'credito', 0),
(33594, 3, '123', 'cajas', 100, 120, 1, 120, 9, 10, '2020-09-21', '14:32:13', 'NO', 1, 1, 'credito', 0),
(33595, 4, '123', 'cajas', 100, 120, 1, 120, 0, 16, '2020-09-26', '14:43:34', 'NO', 1, 1, 'efectivo', 1),
(33596, 4, '321', 'mesas', 500, 600, 1, 600, 0, 16, '2020-09-26', '14:43:34', 'NO', 1, 1, 'efectivo', 1),
(33597, 4, '12345', 'Croquetas buenas', 151, 180, 1, 180, 0, 16, '2020-09-26', '14:43:34', 'NO', 1, 1, 'efectivo', 1),
(33598, 5, '123', 'cajas', 100, 120, 6, 720, 9, 16, '2020-09-27', '14:44:21', 'NO', 1, 1, 'credito', 0),
(33599, 5, '321', 'mesas', 500, 600, 2, 1200, 9, 16, '2020-09-27', '14:44:21', 'NO', 1, 1, 'credito', 0),
(33600, 1, '123', 'cajas', 100, 120, 5, 600, 0, 17, '2020-09-21', '14:50:27', 'NO', 0, 0, 'efectivo', 1),
(33601, 1, '321', 'mesas', 500, 600, 2, 1200, 0, 17, '2020-09-21', '14:50:27', 'NO', 0, 0, 'efectivo', 1),
(33602, 1, '123456', 'Producto 2', 150, 175, 1, 175, 0, 17, '2020-09-21', '14:50:27', 'NO', 0, 0, 'efectivo', 1),
(33603, 2, '1234567', 'boletos', 60, 80, 1, 80, 0, 17, '2020-09-21', '14:50:39', 'NO', 0, 0, 'efectivo', 1),
(33604, 3, '2345', 'velas', 50, 100, 2, 500, 12, 17, '2020-09-21', '14:57:38', 'NO', 1, 0, 'credito', 1),
(33605, 3, '5678', 'bocinas', 100, 200, 1, 1200, 12, 17, '2020-09-21', '14:57:38', 'NO', 1, 0, 'credito', 1),
(33606, 1, '5678', 'bocinas', 100, 200, 1, 200, 0, 18, '2020-09-21', '15:07:05', 'NO', 0, 0, 'efectivo', 1),
(33607, 1, '2345', 'velas', 50, 100, 20, 2000, 0, 18, '2020-09-21', '15:07:05', 'NO', 0, 0, 'efectivo', 1),
(33608, 1, '321', 'mesas', 500, 600, 1, 600, 0, 18, '2020-09-21', '15:07:05', 'NO', 0, 0, 'efectivo', 1),
(33609, 1, '5678', 'bocinas', 100, 200, 3, 600, 0, 19, '2020-09-21', '19:20:25', 'NO', 0, 0, 'efectivo', 1),
(33610, 1, '123', 'cajas', 100, 120, 2, 240, 0, 19, '2020-09-21', '19:20:25', 'NO', 0, 0, 'efectivo', 1),
(33611, 1, '2345', 'velas', 50, 100, 10, 1000, 0, 19, '2020-09-21', '19:20:25', 'NO', 0, 0, 'efectivo', 1),
(33612, 2, '5678', 'bocinas', 100, 200, 1, 200, 9, 19, '2020-09-21', '19:20:47', 'NO', 0, 0, 'credito', 0),
(33613, 2, '321', 'mesas', 500, 600, 1, 600, 9, 19, '2020-09-21', '19:20:47', 'NO', 0, 0, 'credito', 0),
(33614, 3, '2345', 'velas', 50, 100, 2, 100, 0, 19, '2020-09-21', '19:21:11', 'NO', 1, 0, 'efectivo', 1),
(33615, 3, '321', 'mesas', 500, 600, 1, 600, 0, 19, '2020-09-21', '19:21:11', 'NO', 0, 0, 'efectivo', 1),
(33616, 3, '123', 'cajas', 100, 120, 1, 120, 0, 19, '2020-09-21', '19:21:11', 'NO', 0, 0, 'efectivo', 1),
(33617, 4, '123456', 'Producto 2', 150, 200, 1, 200, 12, 19, '2020-09-26', '19:21:28', 'NO', 1, 1, 'credito', 0),
(33618, 4, '123', 'cajas', 100, 120, 1, 120, 12, 19, '2020-09-26', '19:21:28', 'NO', 1, 1, 'credito', 0),
(33619, 4, '5678', 'bocinas', 100, 200, 1, 200, 12, 19, '2020-09-26', '19:21:28', 'NO', 1, 1, 'credito', 0),
(33620, 5, '123', 'cajas', 100, 120, 2, 240, 0, 19, '2020-09-27', '19:26:32', 'NO', 1, 1, 'efectivo', 1),
(33621, 5, '321', 'mesas', 500, 600, 1, 600, 0, 19, '2020-09-27', '19:26:32', 'NO', 1, 1, 'efectivo', 1),
(33622, 1, '5678', 'bocinas', 100, 200, 1, 200, 0, 20, '2020-09-21', '19:44:00', 'NO', 0, 0, 'efectivo', 1),
(33623, 1, '123', 'cajas', 100, 120, 1, 120, 0, 20, '2020-09-21', '19:44:00', 'NO', 0, 0, 'efectivo', 1),
(33624, 2, '2345', 'velas', 50, 100, 1, 100, 0, 20, '2020-09-21', '19:44:48', 'NO', 0, 0, 'efectivo', 1),
(33625, 3, '123', 'cajas', 100, 120, 1, 120, 0, 20, '2020-09-21', '19:47:21', 'NO', 0, 0, 'efectivo', 1),
(33626, 3, '5678', 'bocinas', 100, 200, 1, 200, 0, 20, '2020-09-21', '19:47:21', 'NO', 1, 0, 'efectivo', 1),
(33627, 4, '2345', 'velas', 50, 100, 1, 100, 8, 20, '2020-09-26', '19:54:25', 'NO', 1, 1, 'credito', 0),
(33628, 5, '123456', 'Producto 2', 150, 200, 1, 200, 11, 20, '2020-09-27', '19:54:36', 'NO', 1, 1, 'credito', 0),
(33629, 6, '123', 'cajas', 100, 120, 2, 240, 0, 20, '2020-09-27', '19:57:53', 'NO', 1, 1, 'efectivo', 1),
(33630, 7, '2345', 'velas', 50, 100, 1, 100, 0, 20, '2020-09-21', '19:58:23', 'NO', 0, 0, 'efectivo', 1),
(33631, 8, '2345', 'velas', 50, 100, 1, 100, 0, 20, '2020-09-21', '19:58:34', 'NO', 0, 0, 'efectivo', 1),
(33632, 9, '123', 'cajas', 100, 120, 1, 120, 8, 20, '2020-09-21', '19:59:09', 'NO', 0, 0, 'credito', 0),
(33633, 1, '321', 'mesas', 500, 600, 1, 600, 0, 19, '2020-09-21', '20:01:27', 'NO', 0, 0, 'efectivo', 1),
(33634, 1, '123456', 'Producto 2', 150, 200, 2, 400, 0, 19, '2020-09-21', '20:01:27', 'NO', 0, 0, 'efectivo', 1),
(33635, 2, '123', 'cajas', 100, 120, 1, 120, 0, 19, '2020-09-21', '20:03:05', 'NO', 0, 0, 'efectivo', 1),
(33636, 3, '321', 'mesas', 500, 600, 1, 600, 0, 19, '2020-09-21', '20:03:10', 'NO', 0, 0, 'efectivo', 1),
(33637, 4, '123456', 'Producto 2', 150, 200, 1, 200, 0, 19, '2020-09-26', '20:03:20', 'NO', 1, 1, 'efectivo', 1),
(33638, 5, '123456', 'Producto 2', 150, 200, 1, 200, 0, 19, '2020-09-27', '20:03:26', 'NO', 1, 1, 'efectivo', 1),
(33639, 6, '2345', 'velas', 50, 100, 1, 100, 0, 19, '2020-09-27', '20:03:31', 'NO', 1, 1, 'efectivo', 1),
(33640, 7, '2345', 'velas', 50, 100, 1, 100, 0, 19, '2020-09-21', '20:03:37', 'NO', 0, 0, 'efectivo', 1),
(33641, 8, '321', 'mesas', 500, 600, 1, 600, 12, 19, '2020-09-21', '20:03:43', 'NO', 0, 0, 'credito', 0),
(33642, 9, '123', 'cajas', 100, 120, 1, 120, 0, 19, '2020-09-21', '20:04:01', 'NO', 0, 0, 'efectivo', 1),
(33643, 10, '123456', 'Producto 2', 150, 200, 1, 200, 0, 19, '2020-09-21', '20:04:09', 'NO', 0, 0, 'efectivo', 1),
(33644, 1, '7788', 'almohadas', 90, 150, 2, 300, 0, 10, '2020-09-22', '16:43:46', 'NO', 0, 0, 'efectivo', 1),
(33645, 1, '4455', 'flores', 45, 70, 1, 70, 0, 10, '2020-09-22', '16:43:46', 'NO', 0, 0, 'efectivo', 1),
(33646, 1, '5566', 'libretas', 20, 40, 4, 160, 0, 10, '2020-09-22', '16:43:46', 'NO', 0, 0, 'efectivo', 1),
(33647, 1, '3344', 'libros', 30, 60, 1, 60, 0, 10, '2020-09-22', '16:43:46', 'NO', 1, 1, 'efectivo', 1),
(33648, 2, '7788', 'almohadas', 90, 150, 1, 150, 0, 10, '2020-09-22', '16:44:32', 'NO', 0, 0, 'efectivo', 1),
(33649, 2, '8899', 'aretes', 200, 450, 1, 450, 0, 10, '2020-09-22', '16:44:32', 'NO', 0, 0, 'efectivo', 1),
(33650, 2, '4455', 'flores', 45, 70, 1, 70, 0, 10, '2020-09-22', '16:44:32', 'NO', 0, 0, 'efectivo', 1),
(33651, 2, '6677', 'juguetes', 150, 250, 1, 250, 0, 10, '2020-09-22', '16:44:32', 'NO', 0, 0, 'efectivo', 1),
(33652, 2, '5566', 'libretas', 20, 40, 1, 40, 0, 10, '2020-09-22', '16:44:32', 'NO', 0, 0, 'efectivo', 1),
(33653, 3, '7788', 'almohadas', 90, 150, 4, 600, 0, 10, '2020-09-22', '16:45:16', 'NO', 0, 0, 'efectivo', 1),
(33654, 3, '4455', 'flores', 45, 70, 1, 70, 0, 10, '2020-09-22', '16:45:16', 'NO', 0, 0, 'efectivo', 1),
(33655, 4, '2233', 'sillas', 100, 200, 2, 800, 13, 10, '2020-09-26', '16:47:50', 'NO', 1, 1, 'credito', 0),
(33656, 4, '6677', 'juguetes', 150, 250, 1, 250, 13, 10, '2020-09-26', '16:47:50', 'NO', 1, 1, 'credito', 0),
(33657, 5, '2233', 'sillas', 100, 200, 1, 200, 14, 10, '2020-09-27', '16:48:04', 'NO', 1, 1, 'credito', 0),
(33658, 6, '3344', 'libros', 30, 60, 1, 60, 15, 10, '2020-09-27', '16:48:59', 'NO', 1, 1, 'credito', 0),
(33659, 6, '7788', 'almohadas', 90, 150, 1, 150, 15, 10, '2020-09-27', '16:48:59', 'NO', 1, 1, 'credito', 0),
(33660, 6, '4455', 'flores', 45, 70, 1, 70, 15, 10, '2020-09-27', '16:48:59', 'NO', 1, 1, 'credito', 0),
(33661, 7, '5566', 'libretas', 20, 40, 2, 80, 0, 23, '2020-09-22', '17:11:36', 'NO', 0, 0, 'efectivo', 1),
(33662, 7, '7788', 'almohadas', 90, 150, 1, 150, 0, 23, '2020-09-22', '17:11:36', 'NO', 0, 0, 'efectivo', 1),
(33663, 8, '2233', 'sillas', 100, 200, 1, 200, 0, 23, '2020-09-22', '17:12:33', 'NO', 0, 0, 'efectivo', 1),
(33664, 8, '3344', 'libros', 30, 60, 10, 600, 0, 23, '2020-09-22', '17:12:33', 'NO', 0, 0, 'efectivo', 1),
(33665, 9, '1122', 'lamparas', 15, 25, 1, 25, 16, 23, '2020-09-22', '19:14:52', 'NO', 0, 0, 'credito', 0),
(33666, 9, '2233', 'sillas', 100, 180, 1, 180, 16, 23, '2020-09-22', '19:14:52', 'NO', 0, 0, 'credito', 0),
(33667, 9, '3344', 'libros', 30, 60, 1, 60, 16, 23, '2020-09-22', '19:14:52', 'NO', 0, 0, 'credito', 0),
(33668, 10, '2233', 'sillas', 100, 200, 1, 200, 17, 23, '2020-09-22', '19:15:51', 'NO', 0, 0, 'credito', 0),
(33669, 10, '8899', 'aretes', 200, 450, 1, 450, 17, 23, '2020-09-22', '19:15:51', 'NO', 0, 0, 'credito', 0),
(33670, 10, '4455', 'flores', 45, 70, 2, 140, 17, 23, '2020-09-22', '19:15:51', 'NO', 0, 0, 'credito', 0),
(33671, 11, '2233', 'sillas', 100, 200, 1, 200, 0, 10, '2020-09-22', '19:28:06', 'NO', 0, 0, 'efectivo', 1),
(33672, 12, '2233', 'sillas', 100, 200, 1, 200, 0, 10, '2020-09-22', '19:28:45', 'NO', 0, 0, 'efectivo', 1),
(33673, 12, '3344', 'libros', 30, 60, 1, 60, 0, 10, '2020-09-22', '19:28:45', 'NO', 0, 0, 'efectivo', 1),
(33674, 13, '3344', 'libros', 30, 60, 1, 60, 18, 22, '2020-09-22', '19:45:00', 'NO', 0, 0, 'credito', 0),
(33675, 14, '3344', 'libros', 30, 60, 2, 120, 0, 22, '2020-09-22', '19:46:03', 'NO', 0, 0, 'efectivo', 1),
(33676, 14, '2233', 'sillas', 100, 200, 1, 200, 0, 22, '2020-09-22', '19:46:03', 'NO', 0, 0, 'efectivo', 1),
(33677, 15, '7788', 'almohadas', 90, 150, 1, 150, 0, 10, '2020-09-24', '15:10:21', 'NO', 0, 0, 'efectivo', 1),
(33678, 15, '8899', 'aretes', 200, 450, 1, 450, 0, 10, '2020-09-24', '15:10:21', 'NO', 0, 0, 'efectivo', 1),
(33679, 16, '5566', 'libretas', 20, 40, 8, 400, 0, 10, '2020-09-24', '15:11:17', 'NO', 1, 0, 'efectivo', 1),
(33680, 16, '3344', 'libros', 30, 60, 1, 60, 0, 10, '2020-09-24', '15:11:17', 'NO', 0, 0, 'efectivo', 1),
(33681, 17, '2233', 'sillas', 100, 180, 1, 180, 0, 10, '2020-09-24', '15:12:13', 'NO', 0, 0, 'efectivo', 1),
(33682, 18, '123456', 'Producto 2', 150, 200, 1, 200, 19, 10, '2020-09-24', '15:14:07', 'NO', 0, 0, 'credito', 0),
(33683, 19, '6677', 'juguetes', 150, 250, 1, 250, 20, 10, '2020-09-24', '15:14:49', 'NO', 0, 0, 'credito', 0),
(33684, 19, '4455', 'flores', 45, 70, 1, 70, 20, 10, '2020-09-24', '15:14:49', 'NO', 0, 0, 'credito', 0),
(33685, 20, '2233', 'sillas', 100, 200, 1, 200, 0, 23, '2020-09-24', '15:54:09', 'NO', 0, 0, 'efectivo', 1),
(33686, 20, '3344', 'libros', 30, 60, 1, 60, 0, 23, '2020-09-24', '15:54:09', 'NO', 0, 0, 'efectivo', 1),
(33687, 20, '5566', 'libretas', 20, 40, 2, 80, 0, 23, '2020-09-24', '15:54:09', 'NO', 0, 0, 'efectivo', 1),
(33688, 1, '3344', 'libros', 30, 60, 1, 60, 0, 23, '2020-09-24', '15:55:27', 'NO', 1, 1, 'efectivo', 1),
(33689, 2, '9988', 'pantalla', 100, 300, 1, 300, 20, 10, '2020-09-24', '16:01:25', 'NO', 1, 1, 'credito', 0),
(33690, 3, '3344', 'libros', 30, 60, 1, 60, 0, 24, '2020-09-24', '16:16:40', 'NO', 0, 0, 'efectivo', 1),
(33691, 4, '123456', 'Producto 2', 150, 200, 0.05, 10, 0, 10, '2020-09-26', '01:41:24', 'NO', 1, 1, 'efectivo', 1),
(33692, 5, '5566', 'libretas', 20, 40, 1, 40, 0, 10, '2020-09-27', '13:11:59', 'NO', 1, 1, 'efectivo', 1),
(33693, 1, '4455', 'flores', 45, 70, 1, 70, 0, 10, '2020-09-26', '13:12:17', 'NO', 0, 0, 'efectivo', 1),
(33694, 2, '1122', 'lamparas', 15, 30, 1, 30, 0, 10, '2020-09-26', '13:12:22', 'NO', 0, 0, 'efectivo', 1),
(33695, 3, '1122', 'lamparas', 15, 30, 1, 30, 0, 10, '2020-09-26', '13:12:28', 'NO', 0, 0, 'efectivo', 1),
(33696, 4, '123456', 'Producto 2', 150, 200, 1, 200, 0, 10, '2020-09-26', '13:12:35', 'NO', 1, 1, 'efectivo', 1),
(33697, 5, '7788', 'almohadas', 90, 150, 1, 150, 0, 10, '2020-09-27', '13:12:48', 'NO', 1, 1, 'efectivo', 1),
(33698, 5, '123456', 'Producto 2', 150, 200, 1, 200, 0, 10, '2020-09-27', '13:12:48', 'NO', 1, 1, 'efectivo', 1),
(33699, 5, '2233', 'sillas', 100, 200, 1, 200, 0, 10, '2020-09-27', '13:12:48', 'NO', 1, 1, 'efectivo', 1),
(33700, 6, '7788', 'almohadas', 90, 150, 1, 150, 0, 10, '2020-09-27', '23:40:04', 'NO', 1, 1, 'efectivo', 1),
(33701, 6, '4455', 'flores', 45, 70, 1, 70, 0, 10, '2020-09-27', '23:40:04', 'NO', 1, 1, 'efectivo', 1),
(33702, 7, '4455', 'flores', 45, 70, 2, 140, 0, 10, '2020-09-26', '23:40:45', 'NO', 0, 0, 'efectivo', 1),
(33703, 7, '6677', 'juguetes', 150, 250, 2, 1000, 0, 10, '2020-09-26', '23:40:45', 'NO', 1, 0, 'efectivo', 1),
(33704, 7, '5566', 'libretas', 20, 40, 1, 40, 0, 10, '2020-09-26', '23:40:45', 'NO', 0, 0, 'efectivo', 1),
(33705, 8, '159753', 'A ver si sale', 100, 150, 1, 150, 0, 10, '2020-09-27', '00:26:16', 'NO', 0, 0, 'efectivo', 1),
(33706, 8, '4455', 'flores', 45, 70, 74, 5180, 0, 10, '2020-09-27', '00:26:16', 'NO', 0, 0, 'efectivo', 1),
(33707, 9, '4455', 'flores', 45, 70, 4, 280, 0, 10, '2020-09-27', '00:27:50', 'NO', 0, 0, 'efectivo', 1),
(33708, 1, '8899', 'aretes', 200, 450, 1, 450, 0, 10, '2020-10-09', '17:29:15', 'NO', 0, 0, 'efectivo', 1),
(33709, 1, '1122', 'lamparas', 15, 30, 1, 30, 0, 10, '2020-10-09', '17:29:29', 'NO', 0, 0, 'efectivo', 1),
(33710, 2, '6677', 'juguetes', 150, 250, 1, 250, 0, 10, '2020-10-09', '17:29:51', 'NO', 0, 0, 'efectivo', 1),
(33711, 2, '1122', 'lamparas', 15, 30, 1, 30, 0, 10, '2020-10-09', '17:29:51', 'NO', 0, 0, 'efectivo', 1),
(33712, 2, '5566', 'libretas', 20, 40, 1, 40, 0, 10, '2020-10-09', '17:29:51', 'NO', 0, 0, 'efectivo', 1),
(33713, 1, '5566', 'libretas', 20, 40, 1, 40, 0, 10, '2020-10-09', '17:30:13', 'NO', 0, 0, 'efectivo', 1),
(33714, 1, '2233', 'sillas', 100, 200, 1, 200, 0, 10, '2020-10-09', '17:30:13', 'NO', 0, 0, 'efectivo', 1),
(33715, 2, '7788', 'almohadas', 90, 150, 1, 150, 0, 10, '2020-10-18', '00:25:34', 'NO', 0, 0, 'efectivo', 1),
(33716, 1, '6677', 'juguetes', 150, 250, 1, 250, 0, 10, '2020-10-18', '00:25:47', 'NO', 0, 0, 'efectivo', 1),
(33717, 2, '5566', 'libretas', 20, 40, 1, 40, 0, 10, '2020-10-18', '00:25:51', 'NO', 0, 0, 'efectivo', 1),
(33718, 3, '8899', 'aretes', 200, 450, 1, 450, 0, 10, '2020-10-18', '00:26:05', 'NO', 0, 0, 'efectivo', 1),
(33719, 1, '6677', 'juguetes', 150, 250, 1, 250, 0, 10, '2020-10-18', '00:26:15', 'NO', 0, 0, 'efectivo', 1),
(33720, 1, '1122', 'lamparas', 15, 30, 1, 30, 0, 10, '2020-10-18', '00:26:15', 'NO', 0, 0, 'efectivo', 1),
(33721, 2, '159753', 'A ver si sale', 100, 150, 1, 150, 0, 10, '2020-10-18', '00:26:23', 'NO', 0, 0, 'efectivo', 1),
(33722, 2, '1122', 'lamparas', 15, 30, 1, 30, 0, 10, '2020-10-18', '00:26:23', 'NO', 0, 0, 'efectivo', 1),
(33723, 2, '5566', 'libretas', 20, 40, 1, 40, 0, 10, '2020-10-18', '00:26:23', 'NO', 0, 0, 'efectivo', 1),
(33724, 3, '159753', 'A ver si sale', 100, 150, 1, 150, 0, 10, '2020-10-18', '00:26:34', 'NO', 0, 0, 'efectivo', 1),
(33725, 3, '123456', 'Producto 2', 150, 200, 1, 200, 0, 10, '2020-10-18', '00:26:34', 'NO', 0, 0, 'efectivo', 1),
(33726, 3, '2233', 'sillas', 100, 200, 1, 200, 0, 10, '2020-10-18', '00:26:34', 'NO', 0, 0, 'efectivo', 1),
(33727, 4, '159753', 'A ver si sale', 100, 150, 1, 150, 0, 10, '2020-12-06', '22:49:18', 'NO', 0, 0, 'efectivo', 1),
(33728, 5, '6677', 'juguetes', 150, 250, 1, 250, 0, 10, '2020-12-06', '22:54:49', 'NO', 0, 0, 'efectivo', 1),
(33729, 6, '1122', 'lamparas', 15, 30, 1, 30, 0, 10, '2020-12-06', '22:54:59', 'NO', 0, 0, 'efectivo', 1),
(33730, 7, '7788', 'almohadas', 90, 150, 1, 150, 13, 10, '2020-12-06', '23:18:49', 'NO', 0, 0, 'credito', 0),
(33731, 8, '6677', 'juguetes', 150, 250, 1, 250, 0, 10, '2020-12-06', '23:24:30', 'NO', 0, 0, 'efectivo', 1),
(33732, 9, '5566', 'libretas', 20, 40, 1, 40, 0, 10, '2020-12-06', '23:25:00', 'NO', 0, 0, 'efectivo', 1),
(33733, 10, '4455', 'flores', 45, 70, 1, 70, 11, 10, '2020-12-06', '23:25:30', 'NO', 0, 0, 'credito', 0),
(33734, 11, '8899', 'aretes', 200, 450, 1, 450, 0, 10, '2020-12-06', '23:30:21', 'NO', 0, 0, 'efectivo', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bitacora`
--
ALTER TABLE `bitacora`
  ADD PRIMARY KEY (`idBitacora`),
  ADD KEY `FKBitacora453434` (`idUsuario`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indexes for table `configuracion`
--
ALTER TABLE `configuracion`
  ADD PRIMARY KEY (`idConfiguracion`);

--
-- Indexes for table `credito`
--
ALTER TABLE `credito`
  ADD PRIMARY KEY (`idCredito`);

--
-- Indexes for table `movimientos_extras`
--
ALTER TABLE `movimientos_extras`
  ADD PRIMARY KEY (`idMovimiento`);

--
-- Indexes for table `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`);

--
-- Indexes for table `ticket`
--
ALTER TABLE `ticket`
  ADD PRIMARY KEY (`idTicket`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idUsuario`);

--
-- Indexes for table `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`idVenta`),
  ADD KEY `FKVentas635259` (`idUsuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bitacora`
--
ALTER TABLE `bitacora`
  MODIFY `idBitacora` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1602;

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `configuracion`
--
ALTER TABLE `configuracion`
  MODIFY `idConfiguracion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `credito`
--
ALTER TABLE `credito`
  MODIFY `idCredito` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT for table `movimientos_extras`
--
ALTER TABLE `movimientos_extras`
  MODIFY `idMovimiento` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=214;

--
-- AUTO_INCREMENT for table `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=505;

--
-- AUTO_INCREMENT for table `ticket`
--
ALTER TABLE `ticket`
  MODIFY `idTicket` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=610;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idUsuario` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `ventas`
--
ALTER TABLE `ventas`
  MODIFY `idVenta` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33735;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bitacora`
--
ALTER TABLE `bitacora`
  ADD CONSTRAINT `FKBitacora453434` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`);

--
-- Constraints for table `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `FKVentas635259` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
