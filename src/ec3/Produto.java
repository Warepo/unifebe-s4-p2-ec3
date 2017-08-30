package ec3;

import java.io.Serializable;

public class Produto implements Serializable
{
	private static final long serialVersionUID = 1L;

	public String nome, serial;
	public double ID;

	public Produto(String nome, String serial, double ID) 
	{
		this.nome = nome;
		this.serial = serial;
		this.ID = ID;
	}
}