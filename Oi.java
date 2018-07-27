import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Oi{
	public static void main(String args[]){
		BufferedReader dado= new BufferedReader(new InputStreamReader(System.in));
		String nome="";
		System.out.print("Digite seu nome:");
		try{
			nome=dado.readLine();
		} catch(IOException ex){
			System.err.println("ERRO");
		}
		
		System.err.println("Ola " +nome);
	}
}

		
		