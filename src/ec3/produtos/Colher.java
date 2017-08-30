package ec3.produtos;

public class Colher extends ec3.Produto {
	
	private String cor, metal;
	private double preco;
	private int peso;
	private boolean de_sopa;

	public Colher(String nome, String metal, String cor, String serial, double ID, double preco, int peso, boolean de_sopa) 
	{
		super(nome, serial, ID);

		this.preco = preco;
		this.cor = cor;
		this.peso = peso;
		this.de_sopa = de_sopa;
		this.metal = metal;
	}

	public String getMetal()
	{
		return this.metal;
	}
	
	public void set_preco(double preco) 
	{
		 this.preco = preco;
	}
	
	public void print_dados()
	{
		System.out.println("Nome: " + this.nome + " Metal: " + this.metal + " Cor: " + this.cor + " Serial: " + this.ID + " preco: " + this.preco + " Peso: " + this.peso + " É de Sopa: " + this.de_sopa);
	}
}
