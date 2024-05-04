package br.edu.infnet.AppJones.model.domain;

public class ApoliceAuto extends Apolice{
	
	private String numero;
	private String beneficiario;
	private int bonusApolice;
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBeneficiario() {
		return beneficiario;
	}
	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}
	public int getBonusApolice() {
		return bonusApolice;
	}
	public void setBonusApolice(int bonusApolice) {
		this.bonusApolice = bonusApolice;
	}

}
