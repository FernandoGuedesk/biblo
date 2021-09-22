-- -----------------------------------------------------
-- Table `biblo_bd`.`bibliotecario`
-- -----------------------------------------------------
CREATE TABLE `bibliotecario` (
  `id_bibliotecario` INT NOT NULL AUTO_INCREMENT,
  `status` VARCHAR(45) NOT NULL,
  `usuario_id_usuario` INT NOT NULL,
  PRIMARY KEY (`id_bibliotecario`, `usuario_id_usuario`),
  INDEX `fk_bibliotecario_usuario1_idx` (`usuario_id_usuario` ASC) VISIBLE,
  CONSTRAINT `fk_bibliotecario_usuario1`
    FOREIGN KEY (`usuario_id_usuario`)
    REFERENCES `usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO `bibliotecario` (`status`, `usuario_id_usuario`) VALUES ('ATIVO', 3);