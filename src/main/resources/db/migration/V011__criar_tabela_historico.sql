-- -----------------------------------------------------
-- Table `biblo_bd`.`Historico`
-- -----------------------------------------------------
CREATE TABLE `Historico` (
  `id_historico` INT NOT NULL AUTO_INCREMENT,
  `dt_emprestimo` DATE NULL,
  `dt_devolucao` DATE NULL,
  `idleitor` INT NULL,
  `idbibliotecario` INT NULL,
  `idlivro` INT NULL,
  PRIMARY KEY (`id_historico`))
ENGINE = InnoDB;

INSERT INTO historico (`dt_emprestimo`, `dt_devolucao`, `idLeitor`, `idbibliotecario`, `idlivro`) VALUES ( '2021-08-30', '2021-09-30', 1, 1, 1);
INSERT INTO historico (`dt_emprestimo`, `dt_devolucao`, `idLeitor`, `idbibliotecario`, `idlivro`) VALUES ( '2021-06-05', '2021-07-30', 1, 1, 1);