package ec3.agenda;

import java.io.Serializable;

public class Contato implements Serializable
{
    private static final long serialVersionUID = 1L;

    public String nome;
    public int numero;

    public Contato(String nome, int numero)
    {
        this.nome   = nome;
        this.numero = numero;
    }

    public void print_dados()
    {
        System.out.println();
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.numero);
    }
}
