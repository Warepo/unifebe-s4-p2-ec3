package ec3.agenda;

import java.io.Serializable;

public class Contato implements Serializable
{
    private static final long serialVersionUID = 1L;

    private String nome;
    private int numero;

    public Contato(String nome, int numero)
    {
        this.nome   = nome;
        this.numero = numero;
    }

    public void print_dados()
    {
        System.out.print("Nome: " + this.nome + " Telefone: " + this.numero);
    }
}
