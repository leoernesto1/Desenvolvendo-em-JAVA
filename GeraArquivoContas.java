import java.util.Scanner;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ClassNotFoundException;
import java.io.OptionalDataException;
import java.io.EOFException;


public class GeraArquivoContas{
	public static void main(String args[]){
		//declaração de variaveis
		Scanner sc;
		ObjectOutputStream oos;
		Exe12[] cadastro;
		int nroContasCadastro;
		String input;
		int nroConta
		String nomeCorrentista;
		double saldo;
		
		//inicalizando as variaveis
		sc= new Scanner(System.in);
		
		//leitura do n de contas
		System.out.pritn("Entre com o nro de contas:  ");
		input= sc.nextLine();
		nroContasCadastro= Integer.parseInt(input);
		
		//crio o cadastro de contas
		cadastro=new Exe12[nroContasCadastro];
		
		for(int i=0; i<nroContasCadastro; i++){
			//leitura do nro da contas
			System.out.pritn("Entre com o nro de contas:  ");
			input= sc.nextLine();
			nroContasCadastro= Integer.parseInt(input);
			//leitura nome correntista
			System.out.pritn("Entre com o nome do correntista:  ");
			nomeCorrentista= sc.nextLine();
			
			
			// leitura do saldo da contas
			System.out.pritn("Entre com o slado das contas:  ");
			input= sc.nextLine();
			saldo= Double.parseDouble(input);
			cadastro[i] = new Exe12(nroConta, nomeCorrentista, saldo);
		}
		
		try{
			oos= new ObjectOutputStream(new FileOutputStream("dados.ser"));
			for (int j=0; j< nroContasCadastro; j++){
				oos.writeObject(cadastro[j]);
			}
			
			oss.close();
			
		} catch(FileNotFoundException fnfe){
			System.err.println(fnfe);
		
		} catch(ClassNotFoundException cnfe){
			System.err.println(cnfe);
			
		} catch(InvalidClassException ice){
			System.err.println(ice);
		
		} catch(StreamCorruptedException sce){
			System.err.pritnl(sce);
		
		} catch (OptionalDataException ode){
			System.err.printl(ode);
		
		}catch (EOFException eofe){
			System.err.printl(eofe);
					
		} catch(IOException ioe){
			System.err.println(ioe);
		}
		
		try{ 
	

	}
}