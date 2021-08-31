-- -----------------------------------------------------
-- Table `biblo_bd`.`Emprestimo`
-- -----------------------------------------------------
CREATE TABLE `Emprestimo` (
  `idEmprestimo` INT NOT NULL AUTO_INCREMENT,
  `situacao` VARCHAR(45) NOT NULL,
  `dt_emprestimo` DATE NULL,
  `dt_devolucao` DATE NOT NULL,
  `bibliotecario_idbibliotecario` INT NOT NULL,
  `leitor_idleitor` INT NOT NULL,
  `livros_idlivros` INT NOT NULL,
  PRIMARY KEY (`idEmprestimo`, `bibliotecario_idbibliotecario`, `leitor_idleitor`, `livros_idlivros`),
  INDEX `fk_Emprestimo_bibliotecario1_idx` (`bibliotecario_idbibliotecario` ASC) ,
  INDEX `fk_Emprestimo_leitor1_idx` (`leitor_idleitor` ASC) ,
  INDEX `fk_Emprestimo_livros1_idx` (`livros_idlivros` ASC) ,
  CONSTRAINT `fk_Emprestimo_bibliotecario1`
    FOREIGN KEY (`bibliotecario_idbibliotecario`)
    REFERENCES `bibliotecario` (`idbibliotecario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Emprestimo_leitor1`
    FOREIGN KEY (`leitor_idleitor`)
    REFERENCES `leitor` (`idleitor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Emprestimo_livros1`
    FOREIGN KEY (`livros_idlivros`)
    REFERENCES `livros` (`idlivros`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO emprestimo (`situacao`, `dt_emprestimo`, `dt_devolucao`, `bibliotecario_idbibliotecario`, `leitor_idleitor`, `livros_idlivros`) VALUES ('ativo', '2021-08-30', '2021-09-30', 1, 1, 1);
INSERT INTO emprestimo (`situacao`, `dt_emprestimo`, `dt_devolucao`, `bibliotecario_idbibliotecario`, `leitor_idleitor`, `livros_idlivros`) VALUES ('devolvido', '2021-06-05', '2021-07-30', 1, 2, 1);