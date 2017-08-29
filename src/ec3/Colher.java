package ec3;

public class Colher extends Produtos {
	
	private String cor, metal;
	private double valor;
	private int peso;
	private boolean de_sopa;

	public Colher(String nome, String metal, String cor, String serial, double ID, double valor, int peso, boolean de_sopa) 
	{
		super(nome, serial, ID);

		this.valor = valor;
		this.cor = cor;
		this.peso = peso;
		this.de_sopa = de_sopa;
		this.metal = metal;
	}

	public String getMetal()
	{
		return this.metal;
	}
	
	public void setValor(double valor) 
	{
		 this.valor = valor;
	}
	
	public void getDados()
	{
		System.out.println("Nome: " + this.nome + " Metal: " + this.metal + " Cor: " + this.cor + " Serial: " + this.ID + " Valor: " + this.valor + " Peso: " + this.peso + " É de Sopa: " + this.de_sopa);
	}
}
