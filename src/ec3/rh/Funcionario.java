package ec3.rh;

import java.io.Serializable;

public class Funcionario extends ec3.agenda.Contato
{
    public String nivelEscolaridade, cargo;
    public double salario;

    public Funcionario(ec3.agenda.Contato contato)
    {
        super(contato.nome, contato.numero);

        this.nivelEscolaridade = nivelEscolaridade;
        this.cargo   = cargo;
        this.salario = salario;
    }

    public void print_dados()
    {
        System.out.println();
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.numero);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salário: " + this.salario);
        System.out.println("Nível de escolaridade: " + this.nivelEscolaridade);
    }
}
