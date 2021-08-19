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

@RestController
@RequestMapping("/bibliotecario")
public class BibliotecarioController {
	
	@Autowired
	BibliotecarioRepository repositorio;
	private Long idBibliotecario;
	
	@GetMapping
	public List<Bibliotecario> listar() {
		return repositorio.findAll();
		
	}
	@GetMapping("/{idBibliotecario}")
	public Optional<Bibliotecario> listarUmBibliotecario(@PathVariable Long isBibliotecario) {
		Optional<Bibliotecario> bibliotecarioEncontrado = repositorio.findById(idBibliotecario);
			return bibliotecarioEncontrado;
	}

}
