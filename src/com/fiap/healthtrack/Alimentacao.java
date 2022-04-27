package com.fiap.healthtrack;


public class Alimentacao extends Funcionalidade implements ICRUD{
// Atributos
	private float caloriasAlimento;
	private int quantidadeAlimento;
	
// GET SET
	public float getCaloriasAlimento() {
		return caloriasAlimento;
	}
	public void setCaloriasAlimento(float caloriasAlimento) {
		this.caloriasAlimento = caloriasAlimento;
	}
	public int getQuantidadeAlimento() {
		return quantidadeAlimento;
	}
	public void setQuantidadeAlimento(int quantidadeAlimento) {
		this.quantidadeAlimento = quantidadeAlimento;	}
	
	
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
