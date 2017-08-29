package ec2;

import java.io.*;

public class E2
{
    public static void main(String[] args) throws IOException
    {
        File customFile = new File("..\\files\\games.txt");

        FileReader openedFile = new FileReader(customFile);

        BufferedReader readFile = new BufferedReader(openedFile);

        String readLine = readFile.readLine();

        while (readLine != null)
        {
            System.out.printf(readLine + "\n");
            readLine = readFile.readLine();
        }

        openedFile.close();
    }
}
