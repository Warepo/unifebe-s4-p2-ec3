package ec3;

import java.io.Serializable;

public class Produto implements Serializable
{
	private static final long serialVersionUID = 1L;

	public String nome, serial;
	public double id;

	public Produto(String nome, String serial, double id) 
	{
		this.nome = nome;
		this.serial = serial;
		this.id = id;
	}
}