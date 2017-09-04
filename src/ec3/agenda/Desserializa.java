package ec3.agenda;

import java.io.*;
import java.util.*;

// TODO: mover para fora do .agenda
// TODO: melhorar nomes das variáveis
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

        Contato contato;
        Iterator iterator = lista.iterator();
        
        while (iterator.hasNext()) {
            contato = (Contato) iterator.next();
            contato.print_dados();
        }

        ler.close();
    }
}
