-- -----------------------------------------------------
-- Table `biblo_bd`.`Historico`
-- -----------------------------------------------------
CREATE TABLE `historico` (
  `id_historico` INT NOT NULL AUTO_INCREMENT,
  `dt_emprestimo` DATE NULL,
  `dt_devolucao` DATE NULL,
  `id_leitor` INT NULL,
  `id_bibliotecario` INT NULL,
  `id_livro` INT NULL,
  PRIMARY KEY (`id_historico`))
ENGINE = InnoDB;

INSERT INTO historico (`dt_emprestimo`, `dt_devolucao`, `id_leitor`, `id_bibliotecario`, `id_livro`) VALUES ( '2021-08-30', '2021-09-30', 1, 1, 1);
INSERT INTO historico (`dt_emprestimo`, `dt_devolucao`, `id_leitor`, `id_bibliotecario`, `id_livro`) VALUES ( '2021-06-05', '2021-07-30', 1, 1, 1);