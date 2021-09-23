-- -----------------------------------------------------
-- Table `biblo_bd`.`emprestimo`
-- -----------------------------------------------------
CREATE TABLE `emprestimo` (
  `id_emprestimo` INT NOT NULL AUTO_INCREMENT,
  `situacao` VARCHAR(45) NOT NULL,
  `dt_emprestimo` DATE NULL,
  `dt_devolucao` DATE NOT NULL,
  `bibliotecario_id_bibliotecario` INT NOT NULL,
  `leitor_id_leitor` INT NOT NULL,
  `livro_id_livro` INT NOT NULL,
  PRIMARY KEY (`id_emprestimo`, `bibliotecario_id_bibliotecario`, `leitor_id_leitor`, `livro_id_livro`),
  INDEX `fk_emprestimo_bibliotecario1_idx` (`bibliotecario_id_bibliotecario` ASC) ,
  INDEX `fk_emprestimo_leitor1_idx` (`leitor_id_leitor` ASC) ,
  INDEX `fk_emprestimo_livro1_idx` (`livro_id_livro` ASC) ,
  CONSTRAINT `fk_emprestimo_bibliotecario1`
    FOREIGN KEY (`bibliotecario_id_bibliotecario`)
    REFERENCES `bibliotecario` (`id_bibliotecario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_emprestimo_leitor1`
    FOREIGN KEY (`leitor_id_leitor`)
    REFERENCES `leitor` (`id_leitor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_emprestimo_livro1`
    FOREIGN KEY (`livro_id_livro`)
    REFERENCES `livro` (`id_livro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO emprestimo (`situacao`, `dt_emprestimo`, `dt_devolucao`, `bibliotecario_id_bibliotecario`, `leitor_id_leitor`, `livro_id_livro`) VALUES ('ativo', '2021-08-30', '2021-09-30', 1, 1, 1);
INSERT INTO emprestimo (`situacao`, `dt_emprestimo`, `dt_devolucao`, `bibliotecario_id_bibliotecario`, `leitor_id_leitor`, `livro_id_livro`) VALUES ('devolvido', '2021-06-05', '2021-07-30', 1, 2, 1);