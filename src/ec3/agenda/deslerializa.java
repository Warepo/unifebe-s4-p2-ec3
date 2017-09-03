package ec3.agenda;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class deslerializa
{
    public static void main(String[] args) throws Exception,ClassNotFoundException
    {
        FileInputStream local = new FileInputStream(".\\files\\contatos.dat");
        ObjectInputStream ler = new ObjectInputStream(local);

        contato carlos = (contato) ler.readObject();



        ler.close();
    }
}
