package br.dev.nando.biblo.api.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.nando.biblo.api.model.Livro;
import br.dev.nando.biblo.api.repository.LivroRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/livros")
@Api(value = "Livros")
public class LivroController {
	
	@Autowired
	LivroRepository repositorio;
	
	@ApiOperation(value = "Lista todos os livros")
	@GetMapping
	public List<Livro> listar() {
		return repositorio.findAll();
	}
	
	@ApiOperation(value = "Recupera um livro específico")
	@GetMapping("/{idLivros}")
	public Optional<Livro> listarUmLivro(@PathVariable Long idLivros) {
		Optional<Livro> livrosEncontrado = repositorio.findById(idLivros);
		return livrosEncontrado;
	}
}
