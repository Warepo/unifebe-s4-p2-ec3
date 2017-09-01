package ec3;

import ec3.produtos.*;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Program_output 
{
	public static void main(String[] args) throws Exception 
	{
		String entrada;
		int escolha;

		FileInputStream local = new FileInputStream(".\\files\\produtos.dat");
		ObjectInputStream ler = new ObjectInputStream(local);

		do {
			entrada = JOptionPane.showInputDialog(""
					+ "Abra os produtos que você quer:\n"
					+ "\t1) Almofada \n"
					+ "\t2) Caixa de som \n"
					+ "\t3) Cerveja \n"
					+ "\t4) Colher \n"
					+ "\t5) Produto \n"
					+ "\t6) Teclado \n"
					+ "\t0) Sair"
			);

			escolha = Integer.parseInt(entrada);
			switch (escolha)
			{
				case 1:
							Almofada al = (Almofada) ler.readObject();
							al.print_dados();
					break;

				case 2:

					break;

				case 3:

					break;

				case 4:

					break;

				case 5:

					break;
			}


		} while (escolha != 0);

		ler.close();
	}
}
