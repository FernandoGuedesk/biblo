package br.dev.nando.biblo.api.controller.openapi;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.dev.nando.biblo.api.model.Emprestimo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Empréstimos", description = "Cadastro e controle de empréstimos" )
public interface EmprestimoControllerOpenApi {
	
	@ApiOperation(value = "Lista todos os empréstimos", notes = "Realiza recuperção de todos os empréstimos cadastrados dentro do sistema"  )
	public List<Emprestimo> listar();
	
	@ApiOperation(value = "Listar um empréstimo específico", notes = "Recupera um único empréstimo a partir de seu id")
	public Optional<Emprestimo> listarUmEmprestimo(@PathVariable Long idEmprestimo);
	
	@ApiOperation(value = "Insere um empréstimo", notes = "Cadastrar um novo empréstimo")
	public Emprestimo adicionar(@RequestBody Emprestimo emprestimo);
		
		
	@ApiOperation(value = "Edita um empréstimo especificado pelo seu id", notes = "Edita um empréstimo especificado pelo seu id")
	public Emprestimo editar(@PathVariable Long idEmprestimo, @RequestBody Emprestimo emprestimoModificado);
		
	@ApiOperation(value = "Deleta um empréstimo especificado pelo seu id", notes = "Deleta um empréstimo especificado pelo seu id")
	public void deletarEmprestimo(@PathVariable Long idEmprestimo);
	
}
