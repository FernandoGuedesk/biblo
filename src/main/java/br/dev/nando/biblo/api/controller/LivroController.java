package br.dev.nando.biblo.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.dev.nando.biblo.api.controller.openapi.LivroControllerOpenApi;
import br.dev.nando.biblo.api.model.Livro;
import br.dev.nando.biblo.api.repository.LivroRepository;
import br.dev.nando.biblo.api.service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController implements LivroControllerOpenApi {
	
	@Autowired
	LivroRepository repositorio;
	
	@Autowired
	LivroService service;
	
	@GetMapping
	public List<Livro> listar() {
		
		return repositorio.findAll();
	}
	
	@GetMapping("/{idLivros}")
	public Optional<Livro> listarUmLivro(@PathVariable Long idLivros) {
		
		return repositorio.findById(idLivros);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Livro adicionar(@RequestBody Livro livro) {
		 return repositorio.save(livro);
	}
	
	@PutMapping("/{idLivro}")
	public Livro editar(@PathVariable Long idLivro, @RequestBody Livro livroModificado) {
		
		return service.editarLivro(idLivro, livroModificado);
	}
	
	@DeleteMapping("/{idLivro}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deletarLivro(@PathVariable Long idLivro) {
		repositorio.deleteById(idLivro);
	}
	
}
