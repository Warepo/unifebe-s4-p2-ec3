package ec3;

public class Teclado extends Produtos{
	
	private String cor, marca;
	private double preco;
	private int qtd_teclas;
	private boolean razer;

	public Teclado(String nome,String marca, String cor, String serial, double ID, double preco, int qtd_teclas, boolean razer) {
		super(nome, serial, ID);
		this.cor = cor;
		this.marca = marca;
		this.preco = preco;
		this.qtd_teclas = qtd_teclas;
		this.razer = razer;
	}

	
	public void setpreco(double preco){
		 this.preco = preco;
	}
	
	public void getDados(){
		System.out.println("Nome: "+this.nome+" Marca:"+this.marca+" Cor:"+this.cor+" Serial: "+this.ID+" preco: "+this.preco+" Qtd de teclas: "+this.qtd_teclas+" � da Razer: "+this.razer);
	}
	

}
