CREATE TABLE `livro_has_genero` (
  `livro_id_livro` INT NOT NULL,
  `genero_id_genero` INT NOT NULL,
  INDEX `fk_livro_has_genero_genero1_idx` (`genero_id_genero` ASC) VISIBLE,
  INDEX `fk_livro_has_genero_livro1_idx` (`livro_id_livro` ASC) VISIBLE,
  CONSTRAINT `fk_livro_has_genero_livro1`
    FOREIGN KEY (`livro_id_livro`)
    REFERENCES `livro` (`id_livro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_livro_has_genero_genero1`
    FOREIGN KEY (`genero_id_genero`)
    REFERENCES `genero` (`id_genero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO `livro_has_genero` (`livro_id_livro`, `genero_id_genero`) VALUES (1,2);
INSERT INTO `livro_has_genero` (`livro_id_livro`, `genero_id_genero`) VALUES (1,7);
INSERT INTO `livro_has_genero` (`livro_id_livro`, `genero_id_genero`) VALUES (2,2);
INSERT INTO `livro_has_genero` (`livro_id_livro`, `genero_id_genero`) VALUES (3,3);
INSERT INTO `livro_has_genero` (`livro_id_livro`, `genero_id_genero`) VALUES (4,1);
INSERT INTO `livro_has_genero` (`livro_id_livro`, `genero_id_genero`) VALUES (5,1);
INSERT INTO `livro_has_genero` (`livro_id_livro`, `genero_id_genero`) VALUES (6,2);