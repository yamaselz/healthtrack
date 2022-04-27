package com.fiap.healthtrack;

public class Usuario implements ICRUD {
// Atributos
	private String nome;	
	private String sobrenome;	
	private String cpf;	
	private String endereco;
	private String email;	
	private String genero;
	private String dataNascimento;	
	
// GET SET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEmail() {
		return email;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	
// INTERFACE
	@Override
	public void consultar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void adicionar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void atualizar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deletar() {
		// TODO Auto-generated method stub
		
	}
	
 	
}
