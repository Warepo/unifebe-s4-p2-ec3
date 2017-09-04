package ec3;

import ec3.produtos.*;
import javax.swing.*;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Program_output
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        int entrada;

        FileInputStream local = new FileInputStream(".\\files\\produtos.dat");
        ObjectInputStream ler = new ObjectInputStream(local);

        do {
            entrada = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Abra os produtos que você quer:\n"
                + "\t1) Almofada \n"
                + "\t2) Caixa de som \n"
                + "\t3) Cerveja \n"
                + "\t4) Colher \n"
                + "\t5) Produto \n"
                + "\t6) Teclado \n"
                + "\t0) Sair"
              ));

            switch (entrada) {
                case 1:

                    Almofada al = (Almofada) ler.readObject();
                    al.print_dados();

                    break;

                case 2:

                    Caixa_de_som cs = (Caixa_de_som) ler.readObject();
                    cs.print_dados();

                    break;

                case 3:

                    Cerveja cv = (Cerveja) ler.readObject();
                    cv.print_dados();

                    break;

                case 4:

                    Colher cl = (Colher) ler.readObject();
                    cl.print_dados();

                    break;

                case 5:

                    Teclado tc = (Teclado) ler.readObject();
                    tc.print_dados();

                    break;
            }
        } while (entrada != 0);

        ler.close();
    } /* main */
}
