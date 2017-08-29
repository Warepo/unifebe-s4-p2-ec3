/**
 * @description O programa varre os itens do diretório C:\ e exibe o nome e data de modificação dos itens lá presentes.
 */

package ec2;

import java.io.*;
import java.util.Date;

public class E4
{
    public static void main(String[] args) throws IOException
    {
        File arquivo = new File("c:\\");
        File fList[] = arquivo.listFiles();

        System.out.println("Encontrados : " + fList.length);

        for (int i = 0; i < fList.length; i++)
        {
            System.out.println(fList[i].getName() + " " + new Date(fList[i].lastModified()));
        } // for
    } // main
} // class
