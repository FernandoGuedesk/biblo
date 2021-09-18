package br.dev.nando.biblo.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.nando.biblo.api.model.Usuario;
import br.dev.nando.biblo.api.repository.UsuarioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/usuarios")
@Api(value = "Usuários")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository repositorio;
	
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
	
}
