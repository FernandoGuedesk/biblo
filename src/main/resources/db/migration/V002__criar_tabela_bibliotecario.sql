-- -----------------------------------------------------
-- Table `biblo_bd`.`bibliotecario`
-- -----------------------------------------------------
CREATE TABLE `bibliotecario` (
  `idbibliotecario` INT NOT NULL AUTO_INCREMENT,
  `status` VARCHAR(45) NOT NULL,
  `usuario_idusuario` INT NOT NULL,
  PRIMARY KEY (`idbibliotecario`, `usuario_idusuario`),
  INDEX `fk_bibliotecario_usuario1_idx` (`usuario_idusuario` ASC) VISIBLE,
  CONSTRAINT `fk_bibliotecario_usuario1`
    FOREIGN KEY (`usuario_idusuario`)
    REFERENCES `usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO `bibliotecario` (`status`, `usuario_idusuario`) VALUES ('ATIVO', 3);