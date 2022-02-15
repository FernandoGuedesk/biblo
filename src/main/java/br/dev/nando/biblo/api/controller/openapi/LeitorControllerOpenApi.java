package br.dev.nando.biblo.api.controller.openapi;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.dev.nando.biblo.api.model.Leitor;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Leitores", description = "Cadastro e controle de leitores")
public interface LeitorControllerOpenApi {

	@ApiOperation(value = "Listar todos os leitores", notes = "Realiza recuperção de todos os leitors cadastrados dentro do sistema" )
	public List<Leitor> listar();
	
	@ApiOperation(value = "Listar um leitor Específico", notes = "Recupera um único leitor a partir de seu id")
	public Optional<Leitor> listarUmLeitor(@PathVariable Long idLeitor);
	
	@ApiOperation(value = "Inserir um leitor", notes = "Cadastrar um novo leitor")
	public Leitor adicionar(@RequestBody Leitor leitor);
	
	@ApiOperation(value = "Edita um leitor especificado pelo seu id", notes = "Edita um leitor especificado pelo seu id")
	public Leitor editar(@PathVariable Long idLeitor, @RequestBody Leitor leitorModificado);
	
	@ApiOperation(value = "Deleta um leitor especificado pelo seu id", notes = "Deleta um leitor especificado pelo seu id")
	public void deletarLeitor(@PathVariable Long idLeitor);
}
