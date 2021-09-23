package br.dev.nando.biblo.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.dev.nando.biblo.api.model.Usuario;
import br.dev.nando.biblo.api.repository.UsuarioRepository;
import br.dev.nando.biblo.api.service.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/usuarios")
@Api(value = "Usuários")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository repositorio;
	
	@Autowired
	UsuarioService service;
	
	@ApiOperation(value = "Lista todos os Usuários")
	@GetMapping
	public List<Usuario> listar() {
		
		return repositorio.findAll();
		
	}
	
	@ApiOperation(value = "Recupera um Usuário específico")
	@GetMapping("/{idUsuario}")
	public Optional<Usuario> listarUmUsuario(@PathVariable Long idUsuario) {
		
		Optional<Usuario> usuarioEncontrado = repositorio.findById(idUsuario);
				return usuarioEncontrado;
		
	}
	
	@ApiOperation(value = "Insere um usuário")
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Usuario adicionar(@RequestBody Usuario usuario) throws Exception {
		
		return repositorio.save(usuario);
		
	}
	
	@ApiOperation(value = "Edita um usuário especificado pelo seu id")
	@PutMapping("/{idUsuario}")
	public Usuario editar(@PathVariable Long idUsuario, @RequestBody Usuario usuarioModificado) throws Exception {
		
		return service.editarUsuario(idUsuario, usuarioModificado);
			
	}
	
	@ApiOperation(value = "Deleta um usuário especificado pelo seu id")
	@DeleteMapping("/{idUsuario}")
	  void deletarUsuario(@PathVariable Long idUsuario) {
	     repositorio.deleteById(idUsuario);
	  }
	
	
	
}
