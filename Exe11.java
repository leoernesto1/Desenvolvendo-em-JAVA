// Exercicio 1 aula 08 JAVA


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Exe11{
	public static void main(String args[]){
		// Declaração de variaveis
		BufferedReader br;
		PrintWriter pw;
		String line;
		
		//Abrir arquivos de entrada e saída
		try{
			br= new BufferedReader(new FileReader(args[0]));
			pw= new PrintWriter(new FileWriter(args[1]));
			
			//ler linhas do arquivo de entrada e escrever para aruqivo de saída
			
			line= br.readLine();
				
			while (line!= null){
				pw.println(line);
				line=br.readLine();
			
			}
			
			//fecha os arquvos de entrada e saída
			
			br.close();
			pw.close();
			
			
			
			
		
		} catch(FileNotFoundException fnfe){
			System.err.println(fnfe);
		} catch(IOException ioe){
			System.err.println(ioe);
		}
	}
}













