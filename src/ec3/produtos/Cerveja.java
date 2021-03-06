package ec3.produtos;

public class Cerveja extends ec3.Produto
{
    private String tipo, marca;
    private double preco;
    private int qtd_fardo;
    private boolean trigo;

    public Cerveja(String nome, String marca, String tipo, String serial, double id, double preco, int qtd_fardo, boolean trigo)
    {
        super(nome, serial, id);
        // TODO Auto-generated constructor stub
        this.preco     = preco;
        this.tipo      = tipo;
        this.qtd_fardo = qtd_fardo;
        this.trigo     = trigo;
        this.marca     = marca;
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
        System.out.println(
            "Nome: " + this.nome + " Marca:" + this.marca + " Tipo:" + this.tipo + " Serial: " + this.id + " preco: " + this.preco + " Quantidade em fardo: " + this.qtd_fardo + " Tem trigo: "
            + this.trigo);
    }
}
