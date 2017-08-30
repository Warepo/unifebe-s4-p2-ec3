public class Almofada extends Produto
{	
	private String cor, marca;
	private double preco;
	private int qtd_de_penas;
	private boolean penas;

	public Almofada(String nome, String marca, String cor, String serial, double ID, double preco, int qtd_de_penas, boolean penas) 
	{
		super(nome, serial, ID);
		// @TODO: Auto-generated constructor stub
		
		this.preco = preco;
		this.cor = cor;
		this.qtd_de_penas = qtd_de_penas;
		this.penas = penas;
		this.marca = marca;
	}
	
	public Double get_preco()
	{
		return this.preco;
	}
	
	public void set_preco(double preco)
	{
		 this.preco = preco;
	}
	
	public void print_dados()
	{
		System.out.println("Nome: " + this.nome + " Marca: " + this.marca + " Serial: " + this.ID + " preco: " + this.preco + " Quantidade de penas: " + this.qtd_de_penas + " Tem penas: " + this.penas);
	}

}
