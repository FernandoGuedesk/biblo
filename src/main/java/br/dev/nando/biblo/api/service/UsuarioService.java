package br.dev.nando.biblo.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.nando.biblo.api.model.Usuario;
import br.dev.nando.biblo.api.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository repositorio;
	
	public Usuario editarUsuario(Long idUsuario, Usuario usuarioModificado) {
		//recupera um id existen
		return repositorio.findById(idUsuario)
				//atribui o valor modificado no usuario antigo.
				.map(usuario -> {
					usuario.setNome(usuarioModificado.getNome());
					usuario.setTipo(usuarioModificado.getTelefone());
					usuario.setTipo(usuarioModificado.getTipo());
					usuario.setEmail(usuarioModificado.getEmail());
					usuario.setEndereco(usuarioModificado.getEndereco());
					//salva o usuario que recebeu a modificação.
					return repositorio.save(usuario);
				})
				.orElseGet(() -> {
					usuarioModificado.setIdUsuario(idUsuario);
			        return repositorio.save(usuarioModificado);
			      });
	}

}
