package br.dev.nando.biblo.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bibliotecario")
public class Bibliotecario {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_bibliotecario")
	private Long idBibliotecario;
	@Column
	private String status;
	@ManyToOne
	private Usuario usuario;
	
	
	
	public Long getIdBibliotecario() {
		return idBibliotecario;
	}
	public void setIdBibliotecario(Long idBibliotecario) {
		this.idBibliotecario = idBibliotecario;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idBibliotecario ^ (idBibliotecario >>> 32));
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
		Bibliotecario other = (Bibliotecario) obj;
		if (idBibliotecario != other.idBibliotecario)
			return false;
		return true;
	}
	
	

}
