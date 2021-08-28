package br.dev.nando.biblo.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="genero")
public class Genero {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_genero")
	private long idGenero;
	@Column(name = "nome_genero")
	private String nomeGenero;
	@Column
	public long getIdGenero() {
		return idGenero;
	}
	public void setIdGenero(long idGenero) {
		this.idGenero = idGenero;
	}
	public String getNomeGenero() {
		return nomeGenero;
	}
	public void setNomeGenero(String nomeGenero) {
		this.nomeGenero = nomeGenero;
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
