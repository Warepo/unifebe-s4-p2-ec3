package ec2;

import java.io.*;

public class E1
{
    public static void main(String[] args) throws IOException
    {
        File customFile = new File("..\\files\\games.txt");

        if (customFile.exists())
        {
            System.out.println("Arquivo já existe, será sobreescrito.");
        }
        else
        {
            System.out.println("Escrevendo novo arquivo.");
        }

        FileWriter writer = new FileWriter(customFile);
        PrintWriter printer = new PrintWriter(writer);

        printer.printf(
            "Brasil#x#Argentina#:#3#x#0\n" +
            "Coreia#x#Japao#:#1#x#2\n" +
            "Alemanha#x#Peru#:#1#x#0\n" +
            "EUA#x#Espanha#:#2#x#2\n" +
            "Africa#x#Mexico#:#1#x#2"
        );

        writer.close();
    }
}
