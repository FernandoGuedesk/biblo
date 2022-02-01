package br.dev.nando.biblo.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.dev.nando.biblo.api.model.Genero;
import br.dev.nando.biblo.api.repository.GeneroRepository;

@Service
public class GeneroService {

	@Autowired
	GeneroRepository repositorio;
	
	//Editar genero
	public Genero editarGenero(Long idGenero, Genero generoModificado) {
		//recuperar o id do objeto que queremos atualizar.
	    Optional<Genero> generoOriginal = repositorio.findById(idGenero);
	   generoOriginal.get().setNomeGenero(generoModificado.getNomeGenero());
	   generoOriginal.get().setLivro(generoModificado.getLivro());
	   
	   Genero novoGenero = new Genero();
	   
	   novoGenero.setIdGenero(generoOriginal.get().getIdGenero());
	   novoGenero.setNomeGenero(generoOriginal.get().getNomeGenero());
	   novoGenero.setLivro(generoOriginal.get().getLivro());
	   
	   return repositorio.save(novoGenero);
		
	}
}
