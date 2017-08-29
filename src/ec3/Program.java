package ec3;

import javax.swing.JOptionPane;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Program 
{		 
	public static void main(String args[]) throws IOException
	{
		String entrada, marca, cor, serial;
		int escolha, quantidade, comfirm;
		double id, preco;
		boolean bool;
		
		FileOutputStream local = new FileOutputStream("..\\files\\produtos.dat");
		ObjectOutputStream escrever = new ObjectOutputStream(local);
		
		do {
			entrada = JOptionPane.showInputDialog(""
				+ "Olá insira os atributos dos Produtos:\n"
				+ "\t1) Almofada \n"
				+ "\t2) Caixa de som \n"
				+ "\t3) Cerveja \n"
				+ "\t4) Colher \n"
				+ "\t5) Produtos \n"
				+ "\t6) Teclado \n"
				+ "\t0) Sair"
			);

			escolha = Integer.parseInt(entrada);
			
			switch (escolha)
			{
				case 1:
					marca = JOptionPane.showInputDialog("Digite a marca");
					cor = JOptionPane.showInputDialog("Digite qual a cor da almofada");
					serial = JOptionPane.showInputDialog("Digite qual o serial");
					id = Double.parseDouble(JOptionPane.showInputDialog("Digite qual o ID"));
					preco = Double.parseDouble(JOptionPane.showInputDialog("Digite qual o Preço"));
					quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pensa dentro dessa almogada"));
										  
					bool = JOptionPane.showConfirmDialog(null,"Mas tem penas?") == JOptionPane.YES_OPTION;
					
					Almofada almofada = new Almofada("Almofada", marca, cor, serial, id, 0, quantidade, bool);
					almofada.setpreco(preco);
					
					escrever.writeObject(almofada);
				break;

				case 2:
					marca = JOptionPane.showInputDialog("Digite a marca");
				 	cor = JOptionPane.showInputDialog("Digite qual a cor da caixa");
				 	serial = JOptionPane.showInputDialog("Digite qual o serial");
				 	id = Double.parseDouble(JOptionPane.showInputDialog("Digite qual o ID"));
				 	preco = Double.parseDouble(JOptionPane.showInputDialog("Digite qual o preco"));
					quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de caixas"));
				
					bool = JOptionPane.showConfirmDialog(null,"Usa pilhas?") == JOptionPane.YES_OPTION;
					
					Caixa_de_som caixa = new Caixa_de_som("Caixa de Som", marca, cor, serial, id, 0, quantidade, bool);
					
					caixa.setpreco(preco);
					
					escrever.writeObject(caixa);
				break;

				case 3:
					marca = JOptionPane.showInputDialog("Digite a marca");
					cor = JOptionPane.showInputDialog("Digite qual o tipo da cerveja");
					serial = JOptionPane.showInputDialog("Digite qual o serial");
					id = Double.parseDouble(JOptionPane.showInputDialog("Digite qual o ID"));
					preco = Double.parseDouble(JOptionPane.showInputDialog("Digite qual o preco"));
				 	quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite quatas cervejas vem em um fardo"));					 
					bool = JOptionPane.showConfirmDialog(null, "É de trigo?") == JOptionPane.YES_OPTION;
					 
					Cerveja cerveja = new Cerveja("Caixa de Som", marca, cor, serial, id, 0, quantidade, bool);
					cerveja.setpreco(preco);
					
					escrever.writeObject(cerveja);
				break;

				case 4:
					marca = JOptionPane.showInputDialog("Digite a tipo de metal");
				 	ecorntrada = JOptionPane.showInputDialog("Digite qual a cor do cabo");
					serial = JOptionPane.showInputDialog("Digite qual o serial");
				 	id = Double.parseDouble( JOptionPane.showInputDialog("Digite qual o ID"));
				 	preco = Double.parseDouble(JOptionPane.showInputDialog("Digite qual o preco"));
				 	quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite qual o peso da colher?"));
					 
				 	bool = JOptionPane.showConfirmDialog(null, "É de sopa?") == JOptionPane.YES_OPTION;
				 						 
					Colher culhe = new Colher("Culher", marca, cor, serial, id, 0, quantidade, bool);
					culhe.setpreco(preco);
					
					escrever.writeObject(culhe);
				break;

				case 5:
					marca = JOptionPane.showInputDialog("Digite a tipo de metal");
					cor = JOptionPane.showInputDialog("Digite qual a cor do teclado");
					serial = JOptionPane.showInputDialog("Digite qual o serial");
					id = Double.parseDouble(JOptionPane.showInputDialog("Digite qual o ID"));
				 	preco = Double.parseDouble(JOptionPane.showInputDialog("Digite qual o preco"));
					quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de teclas"));
					bool = JOptionPane.showConfirmDialog(null, "É Razer?") == JOptionPane.YES_OPTION;

					Teclado tecla = new Teclado("Teclado", marca, cor, serial, id, 0, quantidade, bool);
					
					tecla.setpreco(preco);
					
					escrever.writeObject(tecla);
				break;
			}
			
		
		} while(escolha != 0);

		escrever.close();
	}

}
