import java.util.Scanner;

public class Exe2{

	public static void main(String args[]){
		//Declaração das variaveis
		Scanner sc;
		int nTermos;
		double pi, termo;
		int den;
		//Inicialização variaveis
		sc=new Scanner(System.in);
		pi=0;
		den=1;
		//Leitura dos termos
		do{
			System.out.print("entre com o numero");
			nTermos = sc.nextInt();
		} while(nTermos<2);
		//calculo do pi
		for(int i=0; i<nTermos; i++){
			termo=(double)4/den;//Calcula o proximo termo
			//Verifica o sinal
			if (i%2 ==0)
				pi=pi+termo;//soma
			else//impar subtrai
				pi=pi-termo;
			
			den=den+2;
		}//for
		System.out.println("o Valor de PI e'  "+pi);//Escreve o resultado
	}//Class
}//Exe2

		
		