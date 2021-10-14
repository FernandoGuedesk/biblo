package br.dev.nando.biblo.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.nando.biblo.api.model.Leitor;
import br.dev.nando.biblo.api.repository.LeitorRepository;

@Service
public class LeitorService {
	
	@Autowired
	LeitorRepository repositorio;
	public Leitor editarLeitor(Long idLeitor, Leitor leitorModificado) {
		
		var leitorOriginal = repositorio.findById(idLeitor);
		
		leitorOriginal.get().setStatus(leitorModificado.getStatus());
		leitorOriginal.get().setUsuario(leitorModificado.getUsuario());
		
		Leitor leitor = new Leitor();
		
		leitor.setIdLeitor(leitorOriginal.get().getIdLeitor());
		leitor.setStatus(leitorOriginal.get().getStatus());
		leitor.setUsuario(leitorOriginal.get().getUsuario());
		
		return repositorio.saveAndFlush(leitor);
	}

}
