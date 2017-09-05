package ec3.rh;

import java.io.*;
import java.util.*;

public class Program
{
    public static void main(String[] args) throws Exception, ClassNotFoundException
    {
        File fileAgenda = new File("..\\files\\contatos.dat");

        fileAgenda.createNewFile();

        ObjectInputStream fileObjContatos = new ObjectInputStream(new FileInputStream(fileAgenda));

        File file = new File("..\\files\\rh.dat");
        file.createNewFile();

        ObjectInputStream fileObj = new ObjectInputStream(new FileInputStream(file));

        LinkedList<Object> listContatos = (LinkedList<Object> )fileObjContatos.readObject();
        Iterator iterator = listContatos.iterator();

        Contato contato;
        LinkedList<Object> list = new LinkedList<Object>();

        Scanner reader = new Scanner(System.in);

        while (iterator.hasNext()) {
            contato = (Contato) iterator.next();
            contato.print_dados();

            System.out.print("Qual o nível de escolaridade do contato '" + contato.nome + "'?: ");
            contato.nivelEscolaridade = reader.next();
            System.out.println();

            System.out.print("Qual o cargo do contato '" + contato.nome + "'?: ");
            contato.cargo = reader.next();
            System.out.println();

            System.out.print("Qual o salário pretendido do contato '" + contato.nome + "'?: ");
            contato.salario = reader.nextFloat();
            System.out.println();

            list.add(contato);
        }
        
        fileObjContatos.close();

        fileObj.writeObject(list);
        fileObj.close();
    } /* main */
}
