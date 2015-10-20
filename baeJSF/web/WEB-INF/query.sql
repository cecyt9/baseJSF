CREATE TABLE `cecyt9`.`persona` (
  `idpersona` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `nombre` VARCHAR(45) NOT NULL COMMENT '',
  `apellido_paterno` VARCHAR(45) NOT NULL COMMENT '',
  `apellido_materno` VARCHAR(45) NOT NULL COMMENT '',
  `email` VARCHAR(45) NOT NULL COMMENT '',
  `usuario` VARCHAR(45) NOT NULL COMMENT '',
  `contrasena` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`idpersona`)  COMMENT '');
