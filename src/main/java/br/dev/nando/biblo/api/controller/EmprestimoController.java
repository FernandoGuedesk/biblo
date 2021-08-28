package br.dev.nando.biblo.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.nando.biblo.api.model.Emprestimo;
import br.dev.nando.biblo.api.repository.EmprestimoRepository;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {

	@Autowired
	EmprestimoRepository repositorio;
	
	@GetMapping
	public List<Emprestimo> listar() {
		return repositorio.findAll();
	}
	@GetMapping("/{idEmprestimo}")
	public Optional<Emprestimo> listarUmEmprestimo(@PathVariable Long idEmprestimo) {
		Optional<Emprestimo> emprestimoEncontrado = repositorio.findById(idEmprestimo);
			return emprestimoEncontrado;
	}
}
