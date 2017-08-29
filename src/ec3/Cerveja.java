
public class Cerveja extends Produtos{
	
	private String tipo,marca;
	private double valor;
	private int qtd_fardo;
	private boolean trigo;

	public Cerveja(String nome,String marca, String tipo, String serial, double ID, double valor, int qtd_fardo, boolean trigo) {
		super(nome, serial, ID);
		// TODO Auto-generated constructor stub
		this.valor = valor;
		this.tipo = tipo;
		this.qtd_fardo = qtd_fardo;
		this.trigo = trigo;
		this.marca = marca;
	}
	
	public Double getValor(){
		return this.valor;
	}
	
	public void setValor(double valor){
		 this.valor = valor;
	}

	public void getDados(){
		System.out.println("Nome: "+this.nome+" Marca:"+this.marca+" Tipo:"+this.tipo+" Serial: "+this.ID+" Valor: "+this.valor+" Quantidade em fardo: "+this.qtd_fardo+" Tem trigo: "+this.trigo);
	}
	

}
