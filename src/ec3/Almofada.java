package ec3;

public class Almofada extends Produtos
{	
	private String cor, marca;
	private double valor;
	private int qtd_de_penas;
	private boolean penas;

	public Almofada(String nome, String marca, String cor, String serial, double ID, double valor, int qtd_de_penas, boolean penas) 
	{
		super(nome, serial, ID);
		// @TODO: Auto-generated constructor stub
		
		this.valor = valor;
		this.cor = cor;
		this.qtd_de_penas = qtd_de_penas;
		this.penas = penas;
		this.marca = marca;
	}
	
	public Double getValor()
	{
		return this.valor;
	}
	
	public void setValor(double valor)
	{
		 this.valor = valor;
	}
	
	public void getDados()
	{
		System.out.println("Nome: "+this.nome+" Marca:"+this.marca+" Serial: "+this.ID+" Valor: "+this.valor+" Quantidade de penas: "+this.qtd_de_penas+" Tem penas: "+this.penas);
	}

}
