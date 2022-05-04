package br.dev.nando.biblo.api.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.dev.nando.biblo.api.controller.openapi.UsuarioControllerOpenApi;
import br.dev.nando.biblo.api.model.Usuario;
import br.dev.nando.biblo.api.repository.UsuarioRepository;
import br.dev.nando.biblo.api.service.UsuarioService;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController implements UsuarioControllerOpenApi{
	
	@Autowired
	UsuarioRepository repositorio;
	
	@Autowired
	UsuarioService service;
	
	@GetMapping
	public List<Usuario> listar() {
		
		return repositorio.findAll();	
	}
	
	@GetMapping("/{idUsuario}")
	public Optional<Usuario> listarUmUsuario(@PathVariable Long idUsuario) {
		
		return repositorio.findById(idUsuario);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Usuario adicionar(@Valid @RequestBody Usuario usuario) {
		
		return repositorio.save(usuario);	
	}
	
	@PutMapping("/{idUsuario}")
	public Usuario editar(@PathVariable Long idUsuario, @RequestBody Usuario usuarioModificado) {
		
		return service.editarUsuario(idUsuario, usuarioModificado);		
	}
	
	@DeleteMapping("/{idUsuario}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deletarUsuario(@PathVariable Long idUsuario) {
	     repositorio.deleteById(idUsuario);
	  }
	
	
	
}
