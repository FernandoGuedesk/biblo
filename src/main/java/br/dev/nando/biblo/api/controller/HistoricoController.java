package br.dev.nando.biblo.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.dev.nando.biblo.api.controller.openapi.HistoricoControllerOpenApi;
import br.dev.nando.biblo.api.model.Historico;
import br.dev.nando.biblo.api.repository.HistoricoRepository;

@RestController
@RequestMapping("/historicos")
public class HistoricoController implements HistoricoControllerOpenApi {
	
	@Autowired
	HistoricoRepository repositorio;
	
	@GetMapping
	public List<Historico> listar() {
		return repositorio.findAll();
	}
	
	@GetMapping("/{idHistorico}")
	public Optional<Historico> listarUmHistorico(@PathVariable Long idHistorico) {
		return  repositorio.findById(idHistorico);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Historico adicionar(@RequestBody Historico historico) {
		return repositorio.save(historico);
	}

}
