package br.dev.nando.biblo.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.nando.biblo.api.model.Bibliotecario;
import br.dev.nando.biblo.api.repository.BibliotecarioRepository;

@Service
public class BibliotecarioService {

	@Autowired
	BibliotecarioRepository repositorio;
	
	public Bibliotecario editarBibliotecario(Long idBibliotecario, Bibliotecario bibliotecarioModificado) {
	
		Optional<Bibliotecario> bibliotecarioOriginal = repositorio.findById(idBibliotecario);
		
		bibliotecarioOriginal.get().setStatus(bibliotecarioModificado.getStatus());
		bibliotecarioOriginal.get().setUsuario(bibliotecarioModificado.getUsuario());
		
		Bibliotecario novoBibliotecario = new Bibliotecario();
		
		novoBibliotecario.setIdBibliotecario(bibliotecarioOriginal.get().getIdBibliotecario());
		novoBibliotecario.setStatus(bibliotecarioOriginal.get().getStatus());
		novoBibliotecario.setUsuario(bibliotecarioOriginal.get().getUsuario());
		
		return repositorio.save(novoBibliotecario);
	}
	
}
