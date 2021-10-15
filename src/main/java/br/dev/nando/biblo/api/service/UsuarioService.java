package br.dev.nando.biblo.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.nando.biblo.api.model.Usuario;
import br.dev.nando.biblo.api.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository repositorio;
	
	public Usuario editarUsuario(Long idUsuario, Usuario usuarioModificado) {
		//recuperar o id do objeto que queremos atualizar.
	    Optional<Usuario> usuarioOriginal = repositorio.findById(idUsuario);
	    //comparar e atualizar.
	   usuarioOriginal.get().setNome(usuarioModificado.getNome());
	   usuarioOriginal.get().setTelefone(usuarioModificado.getTelefone());
	   usuarioOriginal.get().setEmail(usuarioModificado.getEmail());
	   usuarioOriginal.get().setTipo(usuarioModificado.getTipo());
	   usuarioOriginal.get().setEndereco(usuarioModificado.getEndereco());
	   
	   Usuario novoUsuario = new Usuario();
	   
	   novoUsuario.setIdUsuario(usuarioOriginal.get().getIdUsuario());
	   novoUsuario.setNome(usuarioOriginal.get().getNome());
	   novoUsuario.setTipo(usuarioOriginal.get().getTipo());
	   novoUsuario.setTelefone(usuarioOriginal.get().getTelefone());
	   novoUsuario.setEmail(usuarioOriginal.get().getEmail());
	   novoUsuario.setEndereco(usuarioOriginal.get().getEndereco());
	   
	   return repositorio.save(novoUsuario);
		
	}

}
