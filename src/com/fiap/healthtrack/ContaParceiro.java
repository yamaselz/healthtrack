package com.fiap.healthtrack;

public class ContaParceiro extends Conta implements ICRUD{
// Atributos
	private String tipoParceiro;
	private String descricaoParceiro;	
	
// GET SET
	public String getDescricaoParceiro() {
		return descricaoParceiro;
	}
	public void setDescricaoParceiro(String descricaoParceiro) {
		this.descricaoParceiro = descricaoParceiro;
	}
	public String getTipoParceiro() {
		return tipoParceiro;
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
