package com.fiap.healthtrack;

public abstract class Conta {
// Atributos
	private int numeroConta;
	private String username;
	private String senha;
	private String dataCriacao;	
	private String dataAlteracao;
	private Usuario user = new Usuario();
	
// GET SET
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public String getUsername() {
		return username;
	}
	public String getDataCriacao() {
		return dataCriacao;
	}
	public String getDataAlteracao() {
		return dataAlteracao;
	}
	public Usuario getUser() {
		return user;
	}

	public void alterarSenha() {

	}	

}
