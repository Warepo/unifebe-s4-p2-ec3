import java.io.Serializable;

public class Produtos implements ec3.Serializable
{
	private static final long serialVersionUID = 1L;

	public String nome, serial;
	public double ID;

	public Produtos(String nome, String serial, double ID) 
	{
		this.nome = nome;
		this.serial = serial;
		this.ID = ID;
	}
}