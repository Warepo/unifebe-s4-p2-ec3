package ec3.rh;

import java.io.Serializable;

public class Contato implements Serializable
{
    private static final long serialVersionUID = 1L;

    private String nome, nivelEscolaridade, cargo;
    private int numero;
    private double salario;

    public Contato(String nome, int numero, String nivelEscolaridade, String cargo, double salario)
    {
        this.nome   = nome;
        this.nivelEscolaridade = nivelEscolaridade;
        this.cargo = cargo;
        this.numero = numero;
        this.salario = salario;
    }

    public void print_dados()
    {
        System.out.print("Nome: '" + this.nome + "' | Telefone: " + this.numero);
    }
}
