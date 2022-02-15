package br.dev.nando.biblo.api.controller.openapi;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.dev.nando.biblo.api.model.Livro;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Livros", description = "Cadastro e controle de livros")
public interface LivroControllerOpenApi {

	@ApiOperation(value = "Lista todos os livros", notes = "Realiza recuperção de todos os livros cadastrados dentro do sistema" )
	public List<Livro> listar();
	
	@ApiOperation(value = "Buscar um livro específico" , notes = "Buscar um único livro a partir de seu id")
	public Optional<Livro> listarUmLivro(@PathVariable Long idLivros);
	
	@ApiOperation(value = "Insere um livro", notes = "Cadastrar um novo livro")
	public Livro adicionar(@RequestBody Livro livro);
	
	@ApiOperation(value = "Edita um livro especificado pelo seu id", notes = "Edita um livro especificado pelo seu id")
	public Livro editar(@PathVariable Long idLivro, @RequestBody Livro livroModificado);
	
	@ApiOperation(value = "Deleta um livro especificado pelo seu id", notes = "Deleta um livro especificado pelo seu id")
	public void deletarLivro(@PathVariable Long idLivro);
}
