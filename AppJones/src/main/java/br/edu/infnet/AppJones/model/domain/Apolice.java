package br.edu.infnet.AppJones.model.domain;

import java.time.LocalDate;

public class Apolice {
	
	private Long apoliceContratante;
	private String SeguradoraContratada;
	private LocalDate vigenciaInicial;
	private LocalDate vigenciaFinal;
	private float valor;
	
	
	public Long getApoliceContratante() {
		return apoliceContratante;
	}
	public void setApoliceContratante(Long apoliceContratante) {
		this.apoliceContratante = apoliceContratante;
	}
	public String getSeguradoraContratada() {
		return SeguradoraContratada;
	}
	public void setSeguradoraContratada(String seguradoraContratada) {
		SeguradoraContratada = seguradoraContratada;
	}
	public LocalDate getVigenciaInicial() {
		return vigenciaInicial;
	}
	public void setVigenciaInicial(LocalDate vigenciaInicial) {
		this.vigenciaInicial = vigenciaInicial;
	}
	public LocalDate getVigenciaFinal() {
		return vigenciaFinal;
	}
	public void setVigenciaFinal(LocalDate vigenciaFinal) {
		this.vigenciaFinal = vigenciaFinal;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	

}
