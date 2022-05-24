create database AdminEmple;

use AdminEmple;

create table Departamentos(
idDepartamento int not null primary key, /*(autoincremental , deshabilitado en el formulario)*/
departamento_codigo int not null,
departamento_nombre varchar (50) not null,
fecha_hora_crea time not null, /*(Solo visual)*/
fecha_hora_modifica time not null/*(Solo visual)*/
);


create table Empleados(
idEmpleado int not null primary key, /*(autoincremental , deshabilitado en el formulario)*/
documento_tipo varchar (20) not null, /*(RC, TI, CC, CE)*/
documento_numero  char (10)
);

CREATE TABLE departamentos  (
  id bigint NOT NULL AUTO_INCREMENT,
  departamento_codigo varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  departamento_nombre varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  fecha_hora_crea datetime NOT NULL,
  fecha_hora_modifica datetime NOT NULL,
  PRIMARY KEY (id) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 35 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for empleados
-- ----------------------------
DROP TABLE IF EXISTS empleados;
CREATE TABLE empleados  (
  id bigint NOT NULL AUTO_INCREMENT,
  documento_tipo varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  documento_numero varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  nombres varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  apellidos varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  departamentos_id bigint NOT NULL,
  ciudad varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  direccion varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  correo_electronico varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  telefono varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  fecha_hora_crea datetime NOT NULL,
  fecha_hora_modifica datetime NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX departamentos_id(departamentos_id) USING BTREE,
  CONSTRAINT empleados_ibfk_1 FOREIGN KEY (departamentos_id) REFERENCES departamentos (id) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;