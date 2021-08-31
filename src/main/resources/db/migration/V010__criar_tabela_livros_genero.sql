-- -----------------------------------------------------
-- Table `livros_generos`
-- -----------------------------------------------------
CREATE TABLE `livros_generos` (
  `livros_idlivros` INT NOT NULL,
  `genero_id_genero` INT NOT NULL,
  PRIMARY KEY (`livros_idlivros`, `genero_id_genero`),
  INDEX `fk_livros_generos_genero1_idx` (`genero_id_genero` ASC) VISIBLE,
  INDEX `fk_livros_generos_livros1_idx` (`livros_idlivros` ASC) VISIBLE,
  CONSTRAINT `fk_livros_generos_livros1`
    FOREIGN KEY (`livros_idlivros`)
    REFERENCES `livros` (`idlivros`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_livros_generos_genero1`
    FOREIGN KEY (`genero_id_genero`)
    REFERENCES `genero` (`id_genero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;