package ec2;

import java.io.*;
import java.util.Scanner;

public class E6
{
    public static void main(String[] args) throws IOException
    {
        Scanner reader = new Scanner(System.in);

        File customFile = new File("..\\files\\contacts.txt");

        FileWriter customFileWriter = new FileWriter(customFile, true);

        System.out.print(
            "Escolha uma das opções a seguir:\n" +
            "\t1. Visualizar contatos.\n" +
            "\t2. Inserir novo contato.\n" +
            "\nDigite o número da opção desejada: "
        );
        String i = reader.next();
        System.out.println();

        switch (i) {
            case "1":
                E5_1.main(null); // reads the contact list
                break;
            case "2":
                E5.main(null); // e5 handles contact insertions
                break;
            default:
                System.out.println("Opção desconhecida!");
                break;
        }
    }
}
