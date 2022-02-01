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

import br.dev.nando.biblo.api.model.Emprestimo;
import br.dev.nando.biblo.api.repository.EmprestimoRepository;
import br.dev.nando.biblo.api.service.EmprestimoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/emprestimos")
@Api(value = "Emprestimos")
public class EmprestimoController {

	@Autowired
	EmprestimoRepository repositorio;
	
	@Autowired
	EmprestimoService service;
	
	@ApiOperation(value = "Lista todos os Emprestimos")
	@GetMapping
	public List<Emprestimo> listar() {
		return repositorio.findAll();
	}
	
	@ApiOperation(value = "Recupera um Emprestimo específico")
	@GetMapping("/{idEmprestimo}")
	public Optional<Emprestimo> listarUmEmprestimo(@PathVariable Long idEmprestimo) {
		
			return repositorio.findById(idEmprestimo);
	}
	
	@ApiOperation(value = "Insere um emprestimo")
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Emprestimo adicionar(@RequestBody Emprestimo emprestimo) throws Exception {
		
		return repositorio.save(emprestimo);	
	}
	
	@ApiOperation(value = "Edita um emprestimo especificado pelo seu id")
	@PutMapping("/{idEmprestimo}")
	public Emprestimo editar(@PathVariable Long idEmprestimo, @RequestBody Emprestimo emprestimoModificado) throws Exception {
		
		return service.editarEmprestimo(idEmprestimo, emprestimoModificado);		
	}
	
	@ApiOperation(value = "Deleta um emprestimo especificado pelo seu id")
	@DeleteMapping("/{idEmprestimo}")
	@ResponseStatus(code = HttpStatus.OK)
	  void deletarEmprestimo(@PathVariable Long idEmprestimo) {
	     repositorio.deleteById(idEmprestimo);
	  }
}
