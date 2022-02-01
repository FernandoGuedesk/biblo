package br.dev.nando.biblo.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.nando.biblo.api.model.Emprestimo;
import br.dev.nando.biblo.api.repository.EmprestimoRepository;

@Service
public class EmprestimoService {
	
	@Autowired
	EmprestimoRepository repositorio;
	
	public Emprestimo editarEmprestimo(Long idEmprestimo, Emprestimo emprestimoModificado) {
		
	    Optional<Emprestimo> emprestimoOriginal = repositorio.findById(idEmprestimo);
	    
	   emprestimoOriginal.get().setSituacao(emprestimoModificado.getSituacao());
	   emprestimoOriginal.get().setDataEmprestimo(emprestimoModificado.getDataEmprestimo());
	   emprestimoOriginal.get().setDataDevolucao(emprestimoModificado.getDataDevolucao());
	   emprestimoOriginal.get().setBibliotecario(emprestimoModificado.getBibliotecario());
	   emprestimoOriginal.get().setLeitor(emprestimoModificado.getLeitor());
	   emprestimoOriginal.get().setLivro(emprestimoModificado.getLivro());
	   
	   Emprestimo novoEmprestimo = new Emprestimo();
	   
	   novoEmprestimo.setIdEmprestimo(emprestimoOriginal.get().getIdEmprestimo());
	   novoEmprestimo.setSituacao(emprestimoOriginal.get().getSituacao());
	   novoEmprestimo.setDataEmprestimo(emprestimoOriginal.get().getDataEmprestimo());
	   novoEmprestimo.setDataDevolucao(emprestimoOriginal.get().getDataDevolucao());
	   novoEmprestimo.setBibliotecario(emprestimoOriginal.get().getBibliotecario());
	   novoEmprestimo.setLeitor(emprestimoOriginal.get().getLeitor());
	   novoEmprestimo.setLivro(emprestimoOriginal.get().getLivro());
	   
	   return repositorio.save(novoEmprestimo);
	}
}
