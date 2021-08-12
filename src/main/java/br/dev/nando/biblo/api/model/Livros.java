package br.dev.nando.biblo.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="livros")
public class Livros {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idlivros")
	private Long idLivros;
	@Column
	private String titulo;
	@Column
	private String autor;
	@Column
	private String editora;
	@Column
	private String cidade;
	@Column
	private String ano;
	@Column
	private String edicao;
	@Column
	private String isbn;
	@Column
	private String estatusEmprestimo;
	
	
	public long getIdLivros() {
		return idLivros;
	}
	public void setIdLivros(long idLivros) {
		this.idLivros = idLivros;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAltor() {
		return autor;
	}
	public void setAltor(String altor) {
		this.autor = altor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getEstatusEmprestimo() {
		return estatusEmprestimo;
	}
	public void setEstatusEmprestimo(String estatusEmprestimo) {
		this.estatusEmprestimo = estatusEmprestimo;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idLivros ^ (idLivros >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livros other = (Livros) obj;
		if (idLivros != other.idLivros)
			return false;
		return true;
	}
		

}
