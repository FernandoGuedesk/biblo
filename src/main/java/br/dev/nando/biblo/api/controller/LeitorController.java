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

import br.dev.nando.biblo.api.controller.openapi.LeitorControllerOpenApi;
import br.dev.nando.biblo.api.model.Leitor;
import br.dev.nando.biblo.api.repository.LeitorRepository;
import br.dev.nando.biblo.api.service.LeitorService;


@RestController
@RequestMapping("/leitores")
public class LeitorController implements LeitorControllerOpenApi {
	
	@Autowired
	LeitorRepository repositorio;
	
	@Autowired
	LeitorService service;
	
	@GetMapping
	public List<Leitor> listar() {
		return repositorio.findAll();
	}
	
	@GetMapping("/{idLeitor}")
	public Optional<Leitor> listarUmLeitor(@PathVariable Long idLeitor) {
		Optional<Leitor> leitorEncontrado = repositorio.findById(idLeitor);
		return leitorEncontrado;
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Leitor adicionar(@RequestBody Leitor leitor) {
		return repositorio.save(leitor);
	}
	
	@PutMapping("/{idLeitor}")
	public Leitor editar(@PathVariable Long idLeitor, @RequestBody Leitor leitorModificado) {
		return service.editarLeitor(idLeitor, leitorModificado);
	}
	
	@DeleteMapping("/{idLeitor}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deletarLeitor(@PathVariable Long idLeitor) {
	     repositorio.deleteById(idLeitor);
	  }

}
