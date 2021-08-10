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


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository repositorio;
	
	@GetMapping
	public List<Usuario> listar() {
		
		return repositorio.findAll();
		
	}
	@GetMapping("/{idUsuario}")
	public Optional<Usuario> listarUmUsuario(@PathVariable Long idUsuario) {
		
		Optional<Usuario> usuarioEncontrado = repositorio.findById(idUsuario);
				return usuarioEncontrado;
		
	}
	
}
