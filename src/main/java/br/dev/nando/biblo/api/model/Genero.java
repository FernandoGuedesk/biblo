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

@Entity
@Table(name="genero")
public class Genero {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_genero")
	private Long idGenero;
	@Column(name = "nome_genero")
	private String nomeGenero;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="livros_generos",
	             joinColumns={@JoinColumn(name="livros_idlivros")},
	             inverseJoinColumns={@JoinColumn(name="genero_id_genero")})
	private List<Livros> livros;
	
	
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
	public List<Livros> getLivros() {
		return livros;
	}
	public void setLivros(List<Livros> livros) {
		this.livros = livros;
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
