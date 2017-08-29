
public class Teclado extends Produtos{
	
	private String cor,marca;
	private double valor;
	private int qtd_teclas;
	private boolean razer;

	public Teclado(String nome,String marca, String cor, String serial, double ID, double valor, int qtd_teclas, boolean razer) {
		super(nome, serial, ID);
		this.cor = cor;
		this.marca = marca;
		this.valor = valor;
		this.qtd_teclas = qtd_teclas;
		this.razer = razer;
	}

	
	public void setValor(double valor){
		 this.valor = valor;
	}
	
	public void getDados(){
		System.out.println("Nome: "+this.nome+" Marca:"+this.marca+" Cor:"+this.cor+" Serial: "+this.ID+" Valor: "+this.valor+" Qtd de teclas: "+this.qtd_teclas+" É da Razer: "+this.razer);
	}
	

}
