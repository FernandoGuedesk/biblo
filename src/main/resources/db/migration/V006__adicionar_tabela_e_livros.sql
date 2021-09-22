-- -----------------------------------------------------
-- Table `biblo_bd`.`livro`
-- -----------------------------------------------------
CREATE TABLE `livro` (
  `id_livro` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(120) NOT NULL,
  `autor` VARCHAR(60) NOT NULL,
  `editora` VARCHAR(45) NOT NULL,
  `cidade` VARCHAR(45) NULL,
  `ano` VARCHAR(45) NULL,
  `edicao` VARCHAR(4) NULL,
  `isbn` VARCHAR(45) NULL,
  `statusEmprestimo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_livro`))
ENGINE = InnoDB;

INSERT INTO `livro` (`titulo`, `autor`, `editora`, `cidade`,`ano`, `edicao`, `isbn`, `statusEmprestimo`) VALUES ('Harry Potter', 'J. K. Rowling', 'Rocco', 'São Paulo', '1997', '2','8624365429901','emprestado');
INSERT INTO `livro` (`titulo`, `autor`, `editora`, `cidade`,`ano`, `edicao`, `isbn`, `statusEmprestimo`) VALUES ('Song of Ice and Fire Series', 'George R.R. Martin', 'Leya Brasil', 'São Paulo', '2010', '2','9876554534987','disponível');
INSERT INTO `livro` (`titulo`, `autor`, `editora`, `cidade`,`ano`, `edicao`, `isbn`, `statusEmprestimo`) VALUES ('Do Mil ao Milhão – Sem Cortar o Cafezinho', 'Thiago Nigro', 'HarperCollins', 'São Paulo', '2018', '2','1234365429901','disponível');
INSERT INTO `livro` (`titulo`, `autor`, `editora`, `cidade`,`ano`, `edicao`, `isbn`, `statusEmprestimo`) VALUES ('Mulheres Que Correm Com Os Lobos', 'Clarissa Pinkola Estes', 'Rocco', 'São Paulo', '1992', '2','8624361234901','disponível');
INSERT INTO `livro` (`titulo`, `autor`, `editora`, `cidade`,`ano`, `edicao`, `isbn`, `statusEmprestimo`) VALUES ('A Sutil Arte de Ligar o F*da-se', 'JMark Manson', 'Intrínseca', 'São Paulo', '2021', '2','8624365412345','disponível');
INSERT INTO `livro` (`titulo`, `autor`, `editora`, `cidade`,`ano`, `edicao`, `isbn`, `statusEmprestimo`) VALUES ('The Lord of the Rings Series', 'J. R. R. Tolkien', 'HarperCollins', 'São Paulo', '2019', '2','0024365429901','disponível');