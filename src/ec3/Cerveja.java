public class Cerveja extends ec3.Produtos{
	
	private String tipo,marca;
	private double preco;
	private int qtd_fardo;
	private boolean trigo;

	public Cerveja(String nome,String marca, String tipo, String serial, double ID, double preco, int qtd_fardo, boolean trigo) {
		super(nome, serial, ID);
		// TODO Auto-generated constructor stub
		this.preco = preco;
		this.tipo = tipo;
		this.qtd_fardo = qtd_fardo;
		this.trigo = trigo;
		this.marca = marca;
	}
	
	public Double getpreco(){
		return this.preco;
	}
	
	public void setpreco(double preco){
		 this.preco = preco;
	}

	public void getDados(){
		System.out.println("Nome: "+this.nome+" Marca:"+this.marca+" Tipo:"+this.tipo+" Serial: "+this.ID+" preco: "+this.preco+" Quantidade em fardo: "+this.qtd_fardo+" Tem trigo: "+this.trigo);
	}
	

}
