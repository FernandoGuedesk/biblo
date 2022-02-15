package br.dev.nando.biblo.api.controller.openapi;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.dev.nando.biblo.api.model.Bibliotecario;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Bibliotecários", description = "Cadastro e controle de bibliotecário" )
public interface BibliotecarioControllerOpenApi {

	@ApiOperation(value = "Listar todos os bibliotecários ", notes = "Realiza recuperção de todos os bibliotecário cadastrados dentro do sistema" )
	public List<Bibliotecario> listar();
	
	@ApiOperation(value = "Lista um único bibliotecário", notes = "Recupera um único bibliotecário a partir de seu id")
	public Optional<Bibliotecario> listarUmBibliotecario(@PathVariable Long idBibliotecario);
	
	@ApiOperation(value = "Inserir um bibliotecário", notes = "Cadastrar um novo bibliotecário")
	public Bibliotecario adicionar(@RequestBody Bibliotecario bibliotecario); 
			
	@ApiOperation(value = "Editar um bibliotecário", notes = "Edita um bibliotecário especificado pelo seu id")
	public Bibliotecario editar(@PathVariable Long idBibliotecario, @RequestBody Bibliotecario bibliotecarioModificado);		
		
	@ApiOperation(value = "Deleta um bibliotecário", notes = "Deleta um bibliotecário especificado pelo seu id")
	public void deletarBibliotecario(@PathVariable Long idBibliotecario);
}
