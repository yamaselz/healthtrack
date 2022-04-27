package com.fiap.healthtrack;

public class PressaoArterial extends Funcionalidade implements ICRUD{
// Atributos
	private int sistolica;
	private int diastolica;
	private float bpm;
	
// GET SET
	public int getSistolica() {
		return sistolica;
	}

	public void setSistolica(int sistolica) {
		this.sistolica = sistolica;
	}

	public int getDiastolica() {
		return diastolica;
	}

	public void setDiastolica(int diastolica) {
		this.diastolica = diastolica;
	}

	public float getBpm() {
		return bpm;
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
