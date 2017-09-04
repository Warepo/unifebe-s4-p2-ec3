package ec3.agenda;

import ec3.agenda.Contato.*;

import javax.swing.JOptionPane;
import java.util.LinkedList;

import java.io.*;

public class Program
{
    public static void main(String args[]) throws IOException
    {
        String nome;
        int telefone;
        Contato contato;

        LinkedList<Object> lista = new LinkedList<Object>();

        File file = new File("..\\files\\contatos.dat");

        file.createNewFile();

        FileOutputStream local      = new FileOutputStream(file);
        ObjectOutputStream escrever = new ObjectOutputStream(local);

        for (int i = 0; i <= 5; i++) {
            nome   = JOptionPane.showInputDialog("Digite o nome: ");
            telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de telefone: "));

            contato = new Contato(nome, telefone);

            lista.add(contato);
        }

        escrever.writeObject(lista);
        escrever.close();
    }
}
