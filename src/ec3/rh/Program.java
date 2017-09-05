package ec3.rh;

import java.io.*;
import java.util.*;

public class Program
{
    public static void main(String[] args) throws Exception, ClassNotFoundException
    {
        File fileContatos = new File("..\\files\\contatos.dat");

        fileContatos.createNewFile();
        ObjectInputStream fileObjContatos = new ObjectInputStream(new FileInputStream(fileContatos));

        File fileRh = new File("..\\files\\rh.dat");
        fileRh.createNewFile();
        ObjectOutputStream fileObj = new ObjectOutputStream(new FileOutputStream(fileRh));

        LinkedList<Object> listContatos = (LinkedList<Object> )fileObjContatos.readObject();
        Iterator iterator = listContatos.iterator();

        ec3.agenda.Contato contato;
        Funcionario funcionario;
        LinkedList<Object> list = new LinkedList<Object>();

        Scanner reader = new Scanner(System.in);

        while (iterator.hasNext()) {
            contato = (ec3.agenda.Contato)iterator.next();
            contato.print_dados();

            System.out.println();

            funcionario = new Funcionario(contato);

            System.out.print("Qual o nível de escolaridade do contato '" + funcionario.nome + "'?: ");
            funcionario.nivelEscolaridade = reader.next();

            System.out.print("Qual o cargo do contato '" + funcionario.nome + "'?: ");
            funcionario.cargo = reader.next();

            System.out.print("Qual o salário pretendido do contato '" + funcionario.nome + "'?: ");
            funcionario.salario = reader.nextFloat();

            System.out.println();

            list.add(funcionario);
        }

        fileObjContatos.close();

        fileObj.writeObject(list);
        fileObj.close();
    } /* main */
}
