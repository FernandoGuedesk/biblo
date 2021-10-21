package br.dev.nando.biblo.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.nando.biblo.api.model.Livro;
import br.dev.nando.biblo.api.repository.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	LivroRepository repositorio;
	
	public Livro editarLivro(Long idLivro, Livro livroModificado) {
		Optional<Livro> livroOriginal = repositorio.findById(idLivro);
		
		livroOriginal.get().setTitulo(livroModificado.getTitulo());
		livroOriginal.get().setAutor(livroModificado.getAutor());
		livroOriginal.get().setEditora(livroModificado.getEditora());
		livroOriginal.get().setCidade(livroModificado.getCidade());
		livroOriginal.get().setAno(livroModificado.getAno());
		livroOriginal.get().setEdicao(livroModificado.getEdicao());
		livroOriginal.get().setIsbn(livroModificado.getIsbn());
		livroOriginal.get().setStatusEmprestimo(livroModificado.getStatusEmprestimo());
		livroOriginal.get().setGenero(livroModificado.getGenero());
		
		
		Livro novoLivro = new Livro();
		
		novoLivro.setIdLivros(livroOriginal.get().getIdLivros());
		novoLivro.setTitulo(livroOriginal.get().getTitulo());
		novoLivro.setAutor(livroOriginal.get().getAutor());
		novoLivro.setEditora(livroOriginal.get().getEditora());
		novoLivro.setCidade(livroOriginal.get().getCidade());
		novoLivro.setAno(livroOriginal.get().getAno());
		novoLivro.setEdicao(livroOriginal.get().getEdicao());
		novoLivro.setIsbn(livroOriginal.get().getIsbn());
		novoLivro.setStatusEmprestimo(livroOriginal.get().getStatusEmprestimo());
		novoLivro.setGenero(livroOriginal.get().getGenero());
		
		return repositorio.save(novoLivro);
	}

}
