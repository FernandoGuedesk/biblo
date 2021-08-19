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

@RestController
@RequestMapping("/historico")
public class HistoricoController {
	
	@Autowired
	HistoricoRepository repositorio;
	
	@GetMapping
	public List<Historico> listar() {
		return repositorio.findAll();
	}
	
	@GetMapping("/{idHistorico}")
	public Optional<Historico> listarUmHistorico(@PathVariable Long idHistorico) {
		Optional<Historico> historicoEncontrado = repositorio.findById(idHistorico);
			return historicoEncontrado;
	}

}
