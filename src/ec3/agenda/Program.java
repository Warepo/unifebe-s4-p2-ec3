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

        FileOutputStream fileInput = new FileOutputStream(file);
        ObjectOutputStream fileObj = new ObjectOutputStream(fileInput);

        String nome;
        int telefone;
        LinkedList<Object> list = new LinkedList<Object>();

        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos contatos você deseja inserir?"));

        for (int i = 0; i <= qtd; i++) {
            nome     = JOptionPane.showInputDialog("Qual o nome do contato " + (i + 1) + "?");
            telefone = Integer.parseInt(JOptionPane.showInputDialog("Qual o telefone do contato " + (i + 1) + "?"));

            list.add(new Contato(nome, telefone));
        }

        fileObj.writeObject(list);

        fileObj.close();
    }
}
