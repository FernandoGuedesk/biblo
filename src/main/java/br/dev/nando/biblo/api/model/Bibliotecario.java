package br.dev.nando.biblo.api.model;

public class Bibliotecario {
	
	private long idBibliotecario;
	private String status;
	private Usuario usuario;
	public long getIdBibliotecario() {
		return idBibliotecario;
	}
	public void setIdBibliotecario(long idBibliotecario) {
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
