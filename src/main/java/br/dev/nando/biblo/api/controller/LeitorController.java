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
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/leitores")
@Api(value = "Leitores")
public class LeitorController {
	
	@Autowired
	LeitorRepository repositorio;
	
	@ApiOperation(value = "Lista todos os Leitores")
	@GetMapping
	public List<Leitor> listar() {
		return repositorio.findAll();
	}
	
	@ApiOperation(value = "Recupera um Leitor Específico")
	@GetMapping("/{idLeitor}")
	public Optional<Leitor> listarUmLeitor(@PathVariable Long idLeitor) {
		Optional<Leitor> leitorEncontrado = repositorio.findById(idLeitor);
		return leitorEncontrado;
	}

}
