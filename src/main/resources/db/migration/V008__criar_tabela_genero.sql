CREATE TABLE `genero` (
  `id_genero` INT NOT NULL AUTO_INCREMENT,
  `nome_genero` VARCHAR(45) NOT NULL,
   PRIMARY KEY (`id_genero`))
  ENGINE = InnoDB;

INSERT INTO `genero` (`nome_genero`) VALUES ('Auto-ajuda');
INSERT INTO `genero` (`nome_genero`) VALUES ('Fantasia');
INSERT INTO `genero` (`nome_genero`) VALUES ('Negócio');
INSERT INTO `genero` (`nome_genero`) VALUES ('Ficção cientifica');
INSERT INTO `genero` (`nome_genero`) VALUES ('Ação');
INSERT INTO `genero` (`nome_genero`) VALUES ('Humor');
INSERT INTO `genero` (`nome_genero`) VALUES ('Infanto-juvenil');
