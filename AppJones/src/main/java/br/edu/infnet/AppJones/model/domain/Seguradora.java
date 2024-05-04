package br.edu.infnet.AppJones.model.domain;

import java.util.List;

public class Seguradora {

	
	private String cpf_cnpj;
	private List<Apolice> apolices;
	
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	public List<Apolice> getApolices() {
		return apolices;
	}
	public void setApolices(List<Apolice> apolices) {
		this.apolices = apolices;
	}
}
