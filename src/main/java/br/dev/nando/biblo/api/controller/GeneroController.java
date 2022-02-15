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

import br.dev.nando.biblo.api.controller.openapi.GeneroControllerOpenApi;
import br.dev.nando.biblo.api.model.Genero;
import br.dev.nando.biblo.api.repository.GeneroRepository;
import br.dev.nando.biblo.api.service.GeneroService;

@RestController
@RequestMapping("/generos")
public class GeneroController implements GeneroControllerOpenApi{
	
	@Autowired
	GeneroRepository repositorio;
	
	@Autowired
	GeneroService service;
	
	@GetMapping
	public List<Genero> listar() {
		return repositorio.findAll();
	}
	
	@GetMapping("/{idGenero}")
	public Optional<Genero> listarUmGenero(@PathVariable Long idGenero) {
		 return repositorio.findById(idGenero);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public Genero adicionar(@RequestBody Genero genero) {
		return repositorio.save(genero);
	}
	
	@PutMapping("/{idGenero}")
	public Genero editar(@PathVariable Long idGenero, @RequestBody Genero generoModificado) {
		
		return service.editarGenero(idGenero, generoModificado);
	}
	
	@DeleteMapping("/{idGenero}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deletarGenero(@PathVariable Long idGenero) {
	     repositorio.deleteById(idGenero);
	  }
}
