CREATE TABLE `usuario` (
  `id_usuario` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  `tipo` VARCHAR(20) NOT NULL,
  `telefone` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB;

INSERT INTO `usuario` (`nome`, `tipo`, `telefone`, `email`) VALUES ('Fernando', 'adm', '999878987', 'fernando@id.com');
INSERT INTO `usuario` (`nome`, `tipo`, `telefone`, `email`) VALUES ('Jonathan', 'adm', '998787878', 'jonathan@id.com');
INSERT INTO `usuario` (`nome`, `tipo`, `telefone`, `email`) VALUES ('Livia', 'usu', '981219978', 'lili@id.com');
INSERT INTO `usuario` (`nome`, `tipo`, `telefone`, `email`) VALUES ('Biatriz', 'usu', '998787889', 'bia@id.com');
INSERT INTO `usuario` (`nome`, `tipo`, `telefone`, `email`) VALUES ('Lucas', 'usu', '978987229', 'luka@id.com'); 