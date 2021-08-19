package br.dev.nando.biblo.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.nando.biblo.api.model.Livros;
import br.dev.nando.biblo.api.repository.LivrosRepository;

@RestController
@RequestMapping("/livros")
public class LivrosController {
	
	@Autowired
	LivrosRepository repositorio;
	
	@GetMapping
	public List<Livros> listar() {
		return repositorio.findAll();
	}

	@GetMapping("/{idLivros}")
	public Optional<Livros> listarUmLivro(@PathVariable Long idLivros) {
		Optional<Livros> livrosEncontrado = repositorio.findById(idLivros);
		return livrosEncontrado;
	}
}
