-- -----------------------------------------------------
-- Table `biblo_bd`.`Endereco_Usuario`
-- -----------------------------------------------------

ALTER TABLE `usuario` ADD COLUMN `cep` VARCHAR(8);

ALTER TABLE `usuario` ADD COLUMN `logradouro` VARCHAR(80);

ALTER TABLE `usuario` ADD COLUMN `bairro` VARCHAR(60);

ALTER TABLE `usuario` ADD COLUMN `cidade` VARCHAR(60);

ALTER TABLE `usuario` ADD COLUMN `uf` VARCHAR(2);

ALTER TABLE `usuario` ADD COLUMN `complemento` VARCHAR(45);

