package br.dev.nando.biblo.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="leitor")
public class Leitor {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idleitor")
	private Long idLeitor;
	@Column
	private String status;
	@ManyToOne
	private Usuario usuario;
	
	
	public Long getIdLeitor() {
		return idLeitor;
	}
	public void setIdLeitor(Long idLeitor) {
		this.idLeitor = idLeitor;
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
		result = prime * result + ((idLeitor == null) ? 0 : idLeitor.hashCode());
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
		Leitor other = (Leitor) obj;
		if (idLeitor == null) {
			if (other.idLeitor != null)
				return false;
		} else if (!idLeitor.equals(other.idLeitor))
			return false;
		return true;
	}

}
