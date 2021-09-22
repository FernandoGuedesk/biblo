-- -----------------------------------------------------
-- Table `biblo_bd`.`leitor`
-- -----------------------------------------------------
CREATE TABLE `leitor` (
  `id_leitor` INT NOT NULL AUTO_INCREMENT,
  `status` VARCHAR(45) NOT NULL,
  `usuario_id_usuario` INT NOT NULL,
  PRIMARY KEY (`id_leitor`, `usuario_id_usuario`),
  INDEX `fk_leitor_usuario1_idx` (`usuario_id_usuario` ASC) VISIBLE,
  CONSTRAINT `fk_leitor_usuario1`
    FOREIGN KEY (`usuario_id_usuario`)
    REFERENCES `usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
INSERT INTO `leitor` (`status`, `usuario_id_usuario`) VALUES ('ativo', 4);
INSERT INTO `leitor` (`status`, `usuario_id_usuario`) VALUES ('ativo', 5);
