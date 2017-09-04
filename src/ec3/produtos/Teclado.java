package ec3.produtos;

public class Teclado extends ec3.Produto
{	
	private String cor, marca;
	private double preco;
	private int qtd_teclas;
	private boolean razer;

	public Teclado(String nome, String marca, String cor, String serial, double id, double preco, int qtd_teclas, boolean razer) {
		super(nome, serial, id);
		
		this.cor = cor;
		this.marca = marca;
		this.preco = preco;
		this.qtd_teclas = qtd_teclas;
		this.razer = razer;
	}

	
	public void set_preco(double preco)
{
		 this.preco = preco;
	}
	
	public void print_dados()
{
		System.out.println("Nome: "+this.nome+" Marca:"+this.marca+" Cor:"+this.cor+" Serial: "+this.id+" preco: "+this.preco+" Qtd de teclas: "+this.qtd_teclas+" � da Razer: "+this.razer);
	}
	

}
