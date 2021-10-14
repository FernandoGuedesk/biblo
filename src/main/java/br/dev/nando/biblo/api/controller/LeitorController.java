package br.dev.nando.biblo.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.dev.nando.biblo.api.model.Leitor;
import br.dev.nando.biblo.api.repository.LeitorRepository;
import br.dev.nando.biblo.api.service.LeitorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/leitores")
@Api(value = "Leitores")
public class LeitorController {
	
	@Autowired
	LeitorRepository repositorio;
	
	@Autowired
	LeitorService service;
	
	@ApiOperation(value = "Recupera todos os Leitores")
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
	
	@ApiOperation(value = "Inserir um leitor")
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Leitor adicionar(@RequestBody Leitor leitor) {
		return repositorio.save(leitor);
	}
	
	@ApiOperation(value = "Edita um leitor especificado pelo seu id")
	@PutMapping("/{idLeitor}")
	public Leitor editar(@PathVariable Long idLeitor, @RequestBody Leitor leitorModificado) throws Exception {
		return service.editarLeitor(idLeitor, leitorModificado);
	}

}
