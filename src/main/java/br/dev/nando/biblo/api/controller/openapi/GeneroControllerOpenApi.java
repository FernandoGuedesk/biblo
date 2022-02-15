package br.dev.nando.biblo.api.controller.openapi;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.dev.nando.biblo.api.model.Genero;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Generos", description = "Cadastro e controle de generos")
public interface GeneroControllerOpenApi {

	@ApiOperation(value = "Lista todos os generos", notes = "Realiza recuperção de todos os generos cadastrados dentro do sistema" )
	public List<Genero> listar();
	
	@ApiOperation(value = "Listar um genero específico", notes = "Recupera um único genero a partir de seu id")
	public Optional<Genero> listarUmGenero(@PathVariable Long idGenero);
	
	@ApiOperation(value = "Inserir um genero", notes = "Cadastrar um novo genero")
	public Genero adicionar(@RequestBody Genero genero);
	
	@ApiOperation(value = "Edita um genero especificado pelo seu id",  notes = "Edita um genero especificado pelo seu id")
	public Genero editar(@PathVariable Long idGenero, @RequestBody Genero generoModificado);
	
	@ApiOperation(value = "Deleta um genero especificado pelo seu id", notes = "Deleta um genero especificado pelo seu id")
	public void deletarGenero(@PathVariable Long idGenero);
}
