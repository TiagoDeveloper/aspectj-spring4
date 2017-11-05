package br.com.tiagodeveloper.models;

import org.springframework.hateoas.ResourceSupport;

public class Contato extends ResourceSupport{
	
	private Long idContato;
	private String nomeContato;
	private Integer telefoneContato;

	public Contato() {
	}

	public Contato(Long idContato, String nomeContato, Integer telefoneContato) {
		this.idContato = idContato;
		this.nomeContato = nomeContato;
		this.telefoneContato = telefoneContato;
	}

	public Long getIdContato() {
		return idContato;
	}

	public void setIdContato(Long idContato) {
		this.idContato = idContato;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public Integer getTelefoneContato() {
		return telefoneContato;
	}
	public void setTelefoneContato(Integer telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	@Override
	public String toString() {
		return "Contato [idContato=" + idContato + ", nomeContato=" + nomeContato + ", telefoneContato=" + telefoneContato + "]";
	}
}
