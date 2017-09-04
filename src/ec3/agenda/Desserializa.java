package ec3.agenda;

import java.io.*;

public class Desserializa
{
    public static void main(String[] args) throws Exception, ClassNotFoundException
    {
        Contato carlos;

        File file = new File("..\\files\\contatos.dat");

        file.createNewFile();

        FileInputStream local  = new FileInputStream(file);
        ObjectInputStream ler  = new ObjectInputStream(local);

        carlos = (Contato) ler.readObject();

        ler.close();
    }
}
