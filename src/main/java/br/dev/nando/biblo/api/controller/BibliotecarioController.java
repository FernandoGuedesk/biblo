package br.dev.nando.biblo.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.nando.biblo.api.model.Bibliotecario;
import br.dev.nando.biblo.api.repository.BibliotecarioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Bibliotecarios")
@RequestMapping("/bibliotecarios")
public class BibliotecarioController {
	
	@Autowired
	BibliotecarioRepository repositorio;
	
	@ApiOperation(value = "Lista todos os Bibliotecarios ")
	@GetMapping
	public List<Bibliotecario> listar() {
		return repositorio.findAll();
		
	}
	
	@ApiOperation(value = "Recupera um Bibliotecario específico")
	@GetMapping("/{idBibliotecario}")
	public Optional<Bibliotecario> listarUmBibliotecario(@PathVariable Long idBibliotecario) {
		Optional<Bibliotecario> bibliotecarioEncontrado = repositorio.findById(idBibliotecario);
			return bibliotecarioEncontrado;
	}

}
