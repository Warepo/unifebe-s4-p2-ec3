package ec3.agenda;

import javax.swing.JOptionPane;
import java.util.LinkedList;

import java.io.*;

public class Program
{
    public static void main(String args[]) throws IOException
    {
        File file = new File("..\\files\\contatos.dat");

        file.createNewFile();

        FileOutputStream local      = new FileOutputStream(file);
        ObjectOutputStream escrever = new ObjectOutputStream(local);

        String nome;
        int telefone;
        Contato contato;
        LinkedList<Object> lista = new LinkedList<Object>();

        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos contatos você deseja inserir?"));

        for (int i = 0; i <= qtd; i++) {
            nome     = JOptionPane.showInputDialog("Qual o nome do contato " + (i + 1) + "?");
            telefone = Integer.parseInt(JOptionPane.showInputDialog("Qual o telefone do contato " + (i + 1) + "?"));

            contato = new Contato(nome, telefone);

            lista.add(contato);
        }

        escrever.writeObject(lista);

        escrever.close();
    }
}
