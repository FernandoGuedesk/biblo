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

import br.dev.nando.biblo.api.controller.openapi.EmprestimoControllerOpenApi;
import br.dev.nando.biblo.api.model.Emprestimo;
import br.dev.nando.biblo.api.repository.EmprestimoRepository;
import br.dev.nando.biblo.api.service.EmprestimoService;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController implements EmprestimoControllerOpenApi{

	@Autowired
	EmprestimoRepository repositorio;
	
	@Autowired
	EmprestimoService service;
	
	@GetMapping
	public List<Emprestimo> listar() {
		return repositorio.findAll();
	}
	
	@GetMapping("/{idEmprestimo}")
	public Optional<Emprestimo> listarUmEmprestimo(@PathVariable Long idEmprestimo) {
		
			return repositorio.findById(idEmprestimo);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Emprestimo adicionar(@RequestBody Emprestimo emprestimo) {
		
		return repositorio.save(emprestimo);	
	}
	
	@PutMapping("/{idEmprestimo}")
	public Emprestimo editar(@PathVariable Long idEmprestimo, @RequestBody Emprestimo emprestimoModificado) {
		return service.editarEmprestimo(idEmprestimo, emprestimoModificado);		
	}
	
	@DeleteMapping("/{idEmprestimo}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deletarEmprestimo(@PathVariable Long idEmprestimo) {
	     repositorio.deleteById(idEmprestimo);
	  }
}
