package br.dev.nando.biblo.api.model;

public class Endereco {
	
	private String cep;
	private String lograduro;
	private String bairro;
	private String cidade;
	private String uf;
	private String complemento;
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLograduro() {
		return lograduro;
	}
	public void setLograduro(String lograduro) {
		this.lograduro = lograduro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	
	

}
