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

import br.dev.nando.biblo.api.model.Bibliotecario;
import br.dev.nando.biblo.api.repository.BibliotecarioRepository;
import br.dev.nando.biblo.api.service.BibliotecarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Bibliotecarios")
@RequestMapping("/bibliotecarios")
public class BibliotecarioController {
	
	
	@Autowired
	BibliotecarioRepository repositorio;
	
	@Autowired
	BibliotecarioService service;
	
	@ApiOperation(value = "Recuperar todos os Bibliotecarios ")
	@GetMapping
	public List<Bibliotecario> listar() {
		return repositorio.findAll();
		
	}
	
	@ApiOperation(value = "Recupera um Bibliotecario específico")
	@GetMapping("/{idBibliotecario}")
	
	public Optional<Bibliotecario> listarUmBibliotecario(@PathVariable Long idBibliotecario) { 
			
		return repositorio.findById(idBibliotecario);
	}
	
	@ApiOperation(value = "Insere um novo bibliotecario")
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Bibliotecario adicionar(@RequestBody Bibliotecario bibliotecario) throws Exception {
		
		return repositorio.save(bibliotecario);
	}
	
	@ApiOperation(value = "Edita um bibliotecario especificado pelo seu id")
	@PutMapping("/{idBibliotecario}")
	public Bibliotecario editar(@PathVariable Long idBibliotecario, @RequestBody Bibliotecario bibliotecarioModificado) throws Exception {
		
		return service.editarBibliotecario(idBibliotecario, bibliotecarioModificado);
		
	}
	
	@ApiOperation(value = "Deleta um bibliotecario especificado pelo seu id")
	@DeleteMapping("/{idBibliotecario}")
	@ResponseStatus(code = HttpStatus.OK)
	  void deletarBibliotecario(@PathVariable Long idBibliotecario) {
	     repositorio.deleteById(idBibliotecario);
	  }

}
