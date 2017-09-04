package ec3.agenda;

import java.io.*;
import java.util.*;

public class Desserializa
{
    public static void main(String[] args) throws Exception, ClassNotFoundException
    {
        LinkedList<Object> lista;

        File file = new File("..\\files\\contatos.dat");

        file.createNewFile();

        FileInputStream local  = new FileInputStream(file);
        ObjectInputStream ler  = new ObjectInputStream(local);

        lista = (LinkedList<Object>) ler.readObject();

        for (Iterator iterator = lista.iterator(); iterator.hasNext(); ) {
            Contato pessoa = (Contato) iterator.next();
            pessoa.print_dados();
        }

        ler.close();
    }
}
