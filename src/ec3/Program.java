package ec3;

import javax.swing.JOptionPane;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Program {
		 
	public static void main(String args[]) throws IOException
	{
		String entra, marca, cor, serial;
		int escolha, quantidade, comfirm;
		double id, valor;
		boolean bool;
		
		FileOutputStream local = new FileOutputStream("c:\\Users\\Usuario\\Desktop\\PO2\\trabalho3\\produtos.dat");
		ObjectOutputStream escrever = new ObjectOutputStream(local);
		
		do {
			entra = JOptionPane.showInputDialog(""
				+ "Olá insira os atributos dos Produtos:\n"
				+ "\t1) Almofada \n"
				+ "\t2) Caixa de som \n"
				+ "\t3) Cerveja \n"
				+ "\t4) Colher \n"
				+ "\t5) Produtos \n"
				+ "\t6) Teclado \n"
				+ "\t0) Sair"
			);

			escolha = Integer.parseInt(entra);
			
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
					almofada.setValor(preco);
					
					escrever.writeObject(almofada);
				break;

				case 2:
				 	entra = JOptionPane.showInputDialog("Digite a marca");
				 	marca = entra;
				 	entra = JOptionPane.showInputDialog("Digite qual a cor da caixa");
				 	cor  = entra;
				 	entra = JOptionPane.showInputDialog("Digite qual o serial");
				 	serial = entra;
				 	entra = JOptionPane.showInputDialog("Digite qual o ID");
				 	id = Double.parseDouble(entra);
				 	entra = JOptionPane.showInputDialog("Digite qual o Valor");
				 	valor = Double.parseDouble(entra);
				 	entra = JOptionPane.showInputDialog("Digite a quantidade de caixas");
				 	quantidade = Integer.parseInt(entra);
				 	comfirm = JOptionPane.showConfirmDialog(null,"Usa pilhas?");
				 	if(comfirm == JOptionPane.YES_OPTION){
				 		bool = true;
				 	}else{
				 		bool = false;
				 	}
					Caixa_de_som caixa = new Caixa_de_som("Caixa de Som", marca, cor, serial, id, 0, quantidade, bool);
					caixa.setValor(valor);
					
					escrever.writeObject(caixa);
				break;
				case 3:
				 	entra = JOptionPane.showInputDialog("Digite a marca");
				 	marca = entra;
				 	entra = JOptionPane.showInputDialog("Digite qual o tipo da cerveja");
				 	cor  = entra;
				 	entra = JOptionPane.showInputDialog("Digite qual o serial");
				 	serial = entra;
				 	entra = JOptionPane.showInputDialog("Digite qual o ID");
				 	id = Double.parseDouble(entra);
				 	entra = JOptionPane.showInputDialog("Digite qual o Valor");
				 	valor = Double.parseDouble(entra);
				 	entra = JOptionPane.showInputDialog("Digite quatas cervejas vem em um fardo");
				 	quantidade = Integer.parseInt(entra);
				 	comfirm = JOptionPane.showConfirmDialog(null,"� de trigo??");
				 	if(comfirm == JOptionPane.YES_OPTION){
				 		bool = true;
				 	}else{
				 		bool = false;
				 	}
					Cerveja cevada = new Cerveja("Caixa de Som", marca, cor, serial, id, 0, quantidade, bool);
					cevada.setValor(valor);
					
					escrever.writeObject(cevada);
				break;
				case 4:
				 	entra = JOptionPane.showInputDialog("Digite a tipo de metal");
				 	marca = entra;
				 	entra = JOptionPane.showInputDialog("Digite qual a cor do cabo");
				 	cor  = entra;
				 	entra = JOptionPane.showInputDialog("Digite qual o serial");
				 	serial = entra;
				 	entra = JOptionPane.showInputDialog("Digite qual o ID");
				 	id = Double.parseDouble(entra);
				 	entra = JOptionPane.showInputDialog("Digite qual o Valor");
				 	valor = Double.parseDouble(entra);
				 	entra = JOptionPane.showInputDialog("Digite qual o peso da colher?");
				 	quantidade = Integer.parseInt(entra);
				 	comfirm = JOptionPane.showConfirmDialog(null,"� de sopa??");
				 	if(comfirm == JOptionPane.YES_OPTION){
				 		bool = true;
				 	}else{
				 		bool = false;
				 	}
					Colher culhe = new Colher("Culher", marca, cor, serial, id, 0, quantidade, bool);
					culhe.setValor(valor);
					
					escrever.writeObject(culhe);
				break;
				case 5:
				 	entra = JOptionPane.showInputDialog("Digite a tipo de metal");
				 	marca = entra;
				 	entra = JOptionPane.showInputDialog("Digite qual a cor do teclado");
				 	cor  = entra;
				 	entra = JOptionPane.showInputDialog("Digite qual o serial");
				 	serial = entra;
				 	entra = JOptionPane.showInputDialog("Digite qual o ID");
				 	id = Double.parseDouble(entra);
				 	entra = JOptionPane.showInputDialog("Digite qual o Valor");
				 	valor = Double.parseDouble(entra);
				 	entra = JOptionPane.showInputDialog("Digite a quantidade de teclas");
				 	quantidade = Integer.parseInt(entra);
				 	comfirm = JOptionPane.showConfirmDialog(null,"� RAZER!!!!??");
				 	if(comfirm == JOptionPane.YES_OPTION){
				 		bool = true;
				 	}else{
				 		bool = false;
				 	}
					Teclado tecla = new Teclado("Teclado", marca, cor, serial, id, 0, quantidade, bool);
					tecla.setValor(valor);
					
					escrever.writeObject(tecla);
				break;
			}
			
		
		} while(escolha != 0);

		escrever.close();
	}

}
