package br.dev.nando.biblo.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.nando.biblo.api.model.Historico;
import br.dev.nando.biblo.api.repository.HistoricoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/historicos")
@Api(value = "Historicos")
public class HistoricoController {
	
	@Autowired
	HistoricoRepository repositorio;
	
	@ApiOperation(value = "Lista todos os Historicos")
	@GetMapping
	public List<Historico> listar() {
		return repositorio.findAll();
	}
	
	@ApiOperation(value = "Recupera um Historico específico")
	@GetMapping("/{idHistorico}")
	public Optional<Historico> listarUmHistorico(@PathVariable Long idHistorico) {
		Optional<Historico> historicoEncontrado = repositorio.findById(idHistorico);
			return historicoEncontrado;
	}

}
