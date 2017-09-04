package ec3.agenda;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Deslerializa
{
    public static void main(String[] args) throws Exception, ClassNotFoundException
    {
        Contato carlos;

        FileInputStream local = new FileInputStream(".\\files\\Contatos.dat");
        ObjectInputStream ler = new ObjectInputStream(local);

        carlos = (Contato) ler.readObject();

        ler.close();
    }
}
