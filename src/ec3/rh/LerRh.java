package ec3.rh;

import java.io.*;
import java.util.*;

public class LerRh
{
    public static void main(String[] args) throws Exception, ClassNotFoundException
    {
        File file = new File("..\\files\\rh.dat");

        file.createNewFile();

        FileInputStream fileInput = new FileInputStream(file);
        ObjectInputStream fileObj = new ObjectInputStream(fileInput);

        LinkedList<Object> list = (LinkedList<Object> )fileObj.readObject();

        Funcionario funcionario;

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            funcionario = (Funcionario) iterator.next();
            funcionario.print_dados();
        }

        fileObj.close();
    }
}
