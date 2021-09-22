package br.dev.nando.biblo.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.nando.biblo.api.model.Usuario;
import br.dev.nando.biblo.api.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository repositorio;
	
	public Usuario editarUsuario(Long idUsuario, Usuario novoUsuario) {
		
		return repositorio.findById(idUsuario)
				.map(usuario -> {
					usuario.setNome(novoUsuario.getNome());
					usuario.setTipo(novoUsuario.getTelefone());
					usuario.setTipo(novoUsuario.getTipo());
					usuario.setEmail(novoUsuario.getEmail());
					usuario.setEndereco(novoUsuario.getEndereco());
					return repositorio.save(usuario);
				})
				.orElseGet(() -> {
					novoUsuario.setIdUsuario(idUsuario);
			        return repositorio.save(novoUsuario);
			      });
	}

}
