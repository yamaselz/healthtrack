package com.fiap.healthtrack;

public abstract class Funcionalidade {
// Atributos
	private int id;
	private String tipo;
	private String descricao;
	private String dataCriacao;	
	
// GET SET
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getId() {
		return id;
	}
	public String getDataCriacao() {
		return dataCriacao;
	}
		
}
