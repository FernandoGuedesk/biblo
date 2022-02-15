package br.dev.nando.biblo.api.controller.openapi;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.dev.nando.biblo.api.model.Usuario;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Usuários", description = "Cadastro e controle de usuários")
public interface UsuarioControllerOpenApi {

	@ApiOperation(value = "Listar todos os usuários", notes = "Realiza recuperção de todos os usuários cadastrados dentro do sistema")
	public List<Usuario> listar();
	
	@ApiOperation(value = "Buscar um usuário específico", notes = "Buscar um único usuário a partir de seu id")
	public Optional<Usuario> listarUmUsuario(@PathVariable Long idUsuario);
	
	@ApiOperation(value = "Insere um usuário", notes = "Cadastrar um novo usuário")
	public Usuario adicionar(@RequestBody Usuario usuario);
	
	@ApiOperation(value = "Edita um usuário especificado pelo seu id", notes = "Edita um usuário especificado pelo seu id")
	public Usuario editar(@PathVariable Long idUsuario, @RequestBody Usuario usuarioModificado);
	
	@ApiOperation(value = "Deleta um usuário especificado pelo seu id", notes = "Deleta um usuário especificado pelo seu id")
	public void deletarUsuario(@PathVariable Long idUsuario);
}
