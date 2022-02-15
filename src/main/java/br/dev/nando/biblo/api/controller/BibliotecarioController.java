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

import br.dev.nando.biblo.api.controller.openapi.BibliotecarioControllerOpenApi;
import br.dev.nando.biblo.api.model.Bibliotecario;
import br.dev.nando.biblo.api.repository.BibliotecarioRepository;
import br.dev.nando.biblo.api.service.BibliotecarioService;

@RestController
@RequestMapping("/bibliotecarios")
public class BibliotecarioController implements BibliotecarioControllerOpenApi{
	
	
	@Autowired
	BibliotecarioRepository repositorio;
	
	@Autowired
	BibliotecarioService service;
	
	@GetMapping
	public List<Bibliotecario> listar() {
		return repositorio.findAll();
		
	}
	
	@GetMapping("/{idBibliotecario}")
	public Optional<Bibliotecario> listarUmBibliotecario(@PathVariable Long idBibliotecario) { 
			
		return repositorio.findById(idBibliotecario);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Bibliotecario adicionar(@RequestBody Bibliotecario bibliotecario) {
		
		return repositorio.save(bibliotecario);
	}
	
	@PutMapping("/{idBibliotecario}")
	@ResponseStatus(code = HttpStatus.OK)
	public Bibliotecario editar(@PathVariable Long idBibliotecario, @RequestBody Bibliotecario bibliotecarioModificado) {
		
		return service.editarBibliotecario(idBibliotecario, bibliotecarioModificado);
		
	}
	
	@DeleteMapping("/{idBibliotecario}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deletarBibliotecario(@PathVariable Long idBibliotecario) {
	     repositorio.deleteById(idBibliotecario);
	  }

}
