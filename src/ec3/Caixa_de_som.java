package ec3;

public class Caixa_de_som extends Produtos 
{
	private String cor,marca;
	private double valor;
	private int qtd_de_caixas;
	private boolean pilha;
	
	public Caixa_de_som(String nome,String marca, String cor, String serial, double ID, double valor, int qtd_de_caixas, boolean pilha) {
		super(nome, serial, ID);

		this.valor = valor;
		this.cor = cor;
		this.qtd_de_caixas = qtd_de_caixas;
		this.pilha = pilha;
		this.marca = marca;
	}
	
	public Double getValor(){
		return this.valor;
	}
	
	public void setValor(double valor){
		 this.valor = valor;
	}
	
	public void getDados(){
		System.out.println("Nome: "+this.nome+" Marca:"+this.marca+" Serial: "+this.ID+" Valor: "+this.valor+" Quantidade de caixas: "+this.qtd_de_caixas+" Usa pilha: "+this.pilha);
	}

}
