package com.fiap.healthtrack;

public class ContaCliente extends Conta implements ICRUD{
// Atributos
	private String plano;
	private float peso;
	private float altura;
	private Peso p = new Peso();
	private PressaoArterial pr = new PressaoArterial();
	private AtividadeFisica e = new AtividadeFisica();
	
// GET SET
	public String getPlano() {
		return plano;
	}
	public void setPlano(String plano) {
		this.plano = plano;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public Peso getP() {
		return p;
	}
	public void setP(Peso p) {
		this.p = p;
	}
	public PressaoArterial getPr() {
		return pr;
	}
	public void setPr(PressaoArterial pr) {
		this.pr = pr;
	}
	public AtividadeFisica getE() {
		return e;
	}
	public void setE(AtividadeFisica e) {
		this.e = e;
	}
	
	public void alterarPlano() {
		
	}
	
	public void alterarPeso() {
		
	}
	
	public void alterarAltura() {
		
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
