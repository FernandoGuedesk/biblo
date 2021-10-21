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

import br.dev.nando.biblo.api.model.Livro;
import br.dev.nando.biblo.api.repository.LivroRepository;
import br.dev.nando.biblo.api.service.LivroService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/livros")
@Api(value = "Livros")
public class LivroController {
	
	@Autowired
	LivroRepository repositorio;
	
	@Autowired
	LivroService service;
	
	@ApiOperation(value = "Lista todos os livros")
	@GetMapping
	public List<Livro> listar() {
		
		return repositorio.findAll();
	}
	
	@ApiOperation(value = "Buscar um livro específico")
	@GetMapping("/{idLivros}")
	public Optional<Livro> listarUmLivro(@PathVariable Long idLivros) {
		
		return repositorio.findById(idLivros);
	}
	
	@ApiOperation(value = "Insere um livro")
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Livro adicionar(@RequestBody Livro livro) throws Exception {
		 return repositorio.save(livro);
	}
	
	@ApiOperation(value = "Edita um livro especificado pelo seu id")
	@PutMapping("/{idLivro}")
	public Livro editar(@PathVariable Long idLivro, @RequestBody Livro livroModificado) throws Exception {
		
		return service.editarLivro(idLivro, livroModificado);
	}
	
	@ApiOperation(value = "Deleta um livro especificado pelo seu id")
	@DeleteMapping("/{idLivro}")
	@ResponseStatus(code = HttpStatus.OK)
	void deletarLivro(@PathVariable Long idLivro) {
		repositorio.deleteById(idLivro);
	}
	
}
