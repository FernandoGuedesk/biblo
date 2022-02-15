package br.dev.nando.biblo.api.controller.openapi;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.dev.nando.biblo.api.model.Historico;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Históricos", description = "Cadastro e controle de históricos")
public interface HistoricoControllerOpenApi {

	@ApiOperation(value = "Lista todos os históricos", notes = "Realiza recuperção de todos os históricos cadastrados dentro do sistema" )
	public List<Historico> listar();
	
	@ApiOperation(value = "Buscar um histórico específico", notes = "Buscar um único histórico a partir de seu id")
	public Optional<Historico> listarUmHistorico(@PathVariable Long idHistorico);
	
	@ApiOperation(value = "insere um histórico",  notes = "Cadastrar um novo histórico")
	public Historico adicionar(@RequestBody Historico historico);
}
