package ec2;

import java.io.*;
import java.util.Scanner;

public class E5
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("\nBem vindo(a) ao registrador de contatos!\n");

        Scanner reader = new Scanner(System.in);

        File customFile = new File("..\\files\\contacts.txt");
        FileWriter customFileWriter = new FileWriter(customFile, true);

        System.out.print("Informe o nome do novo contato: ");
        String name = reader.next();
        System.out.println();

        System.out.print("Informe o telefone do novo contato: ");
        String phone = reader.next();
        System.out.println();

        PrintWriter writer = new PrintWriter(customFileWriter);
        writer.printf(name + "#" + phone + "%n");

        customFileWriter.close();
    }
}
