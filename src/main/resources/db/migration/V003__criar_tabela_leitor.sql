-- -----------------------------------------------------
-- Table `biblo_bd`.`leitor`
-- -----------------------------------------------------
CREATE TABLE `leitor` (
  `idleitor` INT NOT NULL AUTO_INCREMENT,
  `status` VARCHAR(45) NOT NULL,
  `usuario_idusuario` INT NOT NULL,
  PRIMARY KEY (`idleitor`, `usuario_idusuario`),
  INDEX `fk_leitor_usuario1_idx` (`usuario_idusuario` ASC) VISIBLE,
  CONSTRAINT `fk_leitor_usuario1`
    FOREIGN KEY (`usuario_idusuario`)
    REFERENCES `usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
INSERT INTO `leitor` (`status`, `usuario_idusuario`) VALUES ('ativo', 4);
INSERT INTO `leitor` (`status`, `usuario_idusuario`) VALUES ('ativo', 5);
