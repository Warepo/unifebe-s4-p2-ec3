import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Program_output 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream local = new FileInputStream("..\\files\\produtos.dat");
		ObjectInputStream ler = new ObjectInputStream(local);
		
		ler.close();
	}
}
