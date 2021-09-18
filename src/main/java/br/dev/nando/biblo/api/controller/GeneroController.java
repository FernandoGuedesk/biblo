package br.dev.nando.biblo.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.nando.biblo.api.model.Genero;
import br.dev.nando.biblo.api.repository.GeneroRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/generos")
@Api(value = "Generos")
public class GeneroController {
	
	@Autowired
	GeneroRepository repositorio;
	
	@ApiOperation(value = "Lista todos os Generos")
	@GetMapping
	public List<Genero> listar() {
		return repositorio.findAll();
	}
	
	@ApiOperation(value = "Recupera um Genero específico")
	@GetMapping("/{idGenero}")
	public Optional<Genero> listarUmGenero(@PathVariable Long idGenero) {
		Optional<Genero> generoEncontrado = repositorio.findById(idGenero);
			return generoEncontrado;
	}

}
