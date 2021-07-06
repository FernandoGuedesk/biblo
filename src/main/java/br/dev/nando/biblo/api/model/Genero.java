package br.dev.nando.biblo.api.model;

public class Genero {
	
	private long idGenero;
	private String nomeGenero;
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
