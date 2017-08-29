import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class main_output {
	public static void main(String[] args) throws Exception {
		FileInputStream local = new FileInputStream("c:\\Users\\Usuario\\Desktop\\PO2\\trabalho3\\produtos.dat");
		ObjectInputStream ler = new ObjectInputStream(local);
		
		ler.close();
	}
}
