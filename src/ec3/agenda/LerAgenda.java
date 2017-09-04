package ec3.agenda;

import java.io.*;
import java.util.*;

public class LerAgenda
{
    public static void main(String[] args) throws Exception, ClassNotFoundException
    {
        File file = new File("..\\files\\contatos.dat");

        file.createNewFile();

        FileInputStream fileInput  = new FileInputStream(file);
        ObjectInputStream fileObj  = new ObjectInputStream(fileInput);

        LinkedList<Object> list = (LinkedList<Object>) fileObj.readObject();

        Contato contato;

        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            contato = (Contato) iterator.next();
            contato.print_dados();
        }

        fileObj.close();
    }
}
