package br.dev.nando.biblo.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.nando.biblo.api.model.Leitor;
import br.dev.nando.biblo.api.repository.LeitorRepository;

@RestController
@RequestMapping("/leitor")
public class LeitorController {
	
	@Autowired
	LeitorRepository repositorio;
	
	
	public List<Leitor> listar() {
		return repositorio.findAll();
	}
	@GetMapping("/{idLeitor}")
	public Optional<Leitor> listarUmLeitor(@PathVariable Long idLitor) {
		Optional<Leitor> leitorEncontrado = repositorio.findById(idLitor);
		return leitorEncontrado;
	}

}
