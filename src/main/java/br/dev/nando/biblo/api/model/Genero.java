package br.dev.nando.biblo.api.model;


import java.util.List;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="genero")
public class Genero {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_genero")
	private Long idGenero;
	@Column(name = "nome_genero")
	private String nomeGenero;
	@JsonBackReference("genero")
	@ManyToMany(fetch = FetchType.EAGER)
	  @JoinTable(name="livro_has_genero",
	             joinColumns={@JoinColumn(name="livro_id_livro")},
	             inverseJoinColumns={@JoinColumn(name="genero_id_genero")})
	private List<Livro> livro;
	
	
	public Long getIdGenero() {
		return idGenero;
	}
	public void setIdGenero(Long idGenero) {
		this.idGenero = idGenero;
	}
	public String getNomeGenero() {
		return nomeGenero;
	}
	public void setNomeGenero(String nomeGenero) {
		this.nomeGenero = nomeGenero;
	}
	public List<Livro> getLivro() {
		return livro;
	}
	public void setLivro(List<Livro> livro) {
		this.livro = livro;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idGenero ^ (idGenero >>> 32));
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
		Genero other = (Genero) obj;
		if (idGenero != other.idGenero)
			return false;
		return true;
	}
	
	

}
