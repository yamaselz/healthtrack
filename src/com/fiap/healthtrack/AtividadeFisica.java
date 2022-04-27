package com.fiap.healthtrack;

public class AtividadeFisica extends Funcionalidade implements ICRUD{

// Atributos
	private String tempo;
	private float caloriasGastas;
	
// GET SET
	public String getTempo() {
		return tempo;
	}
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	public float getCaloriasGastas() {
		return caloriasGastas;
	}
	public void setCaloriasGastas(float caloriasGastas) {
		this.caloriasGastas = caloriasGastas;
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
