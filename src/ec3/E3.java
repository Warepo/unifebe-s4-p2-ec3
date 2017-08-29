package ec2;

import java.io.*;

public class E3
{
    public static void main(String[] args) throws IOException
    {
        File customFile = new File("..\\files\\games.txt");

        FileReader openedFile = new FileReader(customFile);
        BufferedReader fileReader = new BufferedReader(openedFile);

        String line = fileReader.readLine();

        while (line != null)
        {
            System.out.println(line.replace("#", " "));

            line = fileReader.readLine();
        }

        openedFile.close();
    }
}
