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

import br.dev.nando.biblo.api.model.Genero;
import br.dev.nando.biblo.api.repository.GeneroRepository;
import br.dev.nando.biblo.api.service.GeneroService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/generos")
@Api(value = "Generos")
public class GeneroController {
	
	@Autowired
	GeneroRepository repositorio;
	
	@Autowired
	GeneroService service;
	
	@ApiOperation(value = "Lista todos os Generos")
	@GetMapping
	public List<Genero> listar() {
		return repositorio.findAll();
	}
	
	@ApiOperation(value = "Recupera um Genero específico")
	@GetMapping("/{idGenero}")
	public Optional<Genero> listarUmGenero(@PathVariable Long idGenero) {
		 return repositorio.findById(idGenero);
	}
	@ApiOperation(value = "Inserir um genero")
	@PostMapping
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public Genero adicionar(@RequestBody Genero genero) throws Exception {
		return repositorio.save(genero);
	}
	@ApiOperation(value = "Edita um genero especificado pelo seu id")
	@PutMapping("/{idGenero}")
	public Genero editar(@PathVariable Long idGenero, @RequestBody Genero generoModificado) throws Exception {
		
		return service.editarGenero(idGenero, generoModificado);
	}
	@ApiOperation(value = "Deleta um genero especificado pelo seu id")
	@DeleteMapping("/{idGenero}")
	@ResponseStatus(code = HttpStatus.OK)
	  void deletarGenero(@PathVariable Long idGenero) {
	     repositorio.deleteById(idGenero);
	  }
}
