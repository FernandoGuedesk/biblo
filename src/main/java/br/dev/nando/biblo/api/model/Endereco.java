package br.dev.nando.biblo.api.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable @Access(AccessType.FIELD)
public class Endereco {
	
	@NotNull
	@Size(min=8, max=8)
	@Column(name = "cep")
	private String cep;
	
	@Size(min=0, max=80)
	@Column(name = "logradouro")
	private String logradouro;
	
	@NotNull
	@Size(min=3, max=60)
	@Column(name = "bairro")
	private String bairro;
	
	@NotNull
	@Size(min=3, max=60)
	@Column(name = "cidade")
	private String cidade;
	
	@NotNull
	@Size(min=2, max=2)
	@Column(name = "uf")
	private String uf;
	
	@Size(min=0, max=45)
	@Column(name = "complemento")
	private String complemento;
		
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
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
