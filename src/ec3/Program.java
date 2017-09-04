package ec3;

import ec3.produtos.*;

import javax.swing.JOptionPane;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Program
{
	public static void main(String args[]) throws IOException,ClassNotFoundException
	{
		String entrada, marca, cor, serial;
		int escolha, quantidade, comfirm;
		double id, preco;
		boolean bool;

		FileOutputStream local = new FileOutputStream(".\\files\\produtos.dat");
		ObjectOutputStream escrever = new ObjectOutputStream(local);

		do {
			entrada = JOptionPane.showInputDialog(""
			+ "Olá insira os atributos dos Produto:\n"
			+ "\t1) Almofada \n"
			+ "\t2) Caixa de som \n"
			+ "\t3) Cerveja \n"
			+ "\t4) Colher \n"
			+ "\t5) Produto \n"
			+ "\t6) Teclado \n"
			+ "\t0) Sair"
			);

			escolha = Integer.parseInt(entrada);

			if (escolha != 0) 
			{
				marca = JOptionPane.showInputDialog("Digite a marca");
				cor = JOptionPane.showInputDialog("Digite qual a cor da caixa");
				serial = JOptionPane.showInputDialog("Digite qual o serial");
				id = Double.parseDouble(JOptionPane.showInputDialog("Digite qual o id"));
				preco = Double.parseDouble(JOptionPane.showInputDialog("Digite qual o Preço"));

				switch (escolha)
				{
					case 1:

					quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas penas tem?"));
					bool = JOptionPane.showConfirmDialog(null,"Mas tem penas?") == JOptionPane.YES_OPTION;

					Almofada almofada = new Almofada("Almofada", marca, cor, serial, id, 0, quantidade, bool);
					almofada.set_preco(preco);

					escrever.writeObject(almofada);
					break;

					case 2:
					quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas caixas auxiliares"));
					bool = JOptionPane.showConfirmDialog(null,"Usa pilhas?") == JOptionPane.YES_OPTION;
					
					Caixa_de_som caixa = new Caixa_de_som("Caixa de Som", marca, cor, serial, id, 0, quantidade, bool);
					caixa.set_preco(preco);

					escrever.writeObject(caixa);
					break;

					case 3:
					quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas cervejas tem dento das caixas ?"));
					bool = JOptionPane.showConfirmDialog(null, "É de trigo?") == JOptionPane.YES_OPTION;
					
					Cerveja cerveja = new Cerveja("Caixa de Som", marca, cor, serial, id, 0, quantidade, bool);
					cerveja.set_preco(preco);

					escrever.writeObject(cerveja);
					break;

					case 4:
					quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso da colher"));
					bool = JOptionPane.showConfirmDialog(null, "É de sopa?") == JOptionPane.YES_OPTION;

					Colher culhe = new Colher("Culher", marca, cor, serial, id, 0, quantidade, bool);
					culhe.set_preco(preco);

					escrever.writeObject(culhe);
					break;

					case 5:
					quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de teclas"));
					bool = JOptionPane.showConfirmDialog(null, "É Razer?") == JOptionPane.YES_OPTION;

					Teclado tecla = new Teclado("Teclado", marca, cor, serial, id, 0, quantidade, bool);
					tecla.set_preco(preco);

					escrever.writeObject(tecla);
					break;
				}
				
			}


		} while (escolha != 0);

		escrever.close();
	}
}
