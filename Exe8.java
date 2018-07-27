/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacci;
import java.util.Scanner;
/**
 *
 * @author Pedro
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //declaraçao de variaveis 
       int seq,aux1,aux2,sizeseq;
       float num1,num2,auxnum;
       
       //iniciaçao das variaves
       aux1=1;
       aux2=1;
       
       //leitura do numero de termos da sequencia e os numeros limitantes
       System.out.println("Digite o numero de termos da sequencia");
       Scanner ss= new Scanner(System.in);
       sizeseq= ss.nextInt();
       System.out.println("Insira o primeiro numero: ");
       Scanner sc= new Scanner(System.in);
       num1 = sc.nextFloat();
       System.out.println("Insira o segundo numero: ");
       Scanner in= new Scanner(System.in);
       num2 = in.nextFloat();
       
       //ordenaçao dos numeros limitantes
       if (num2<num1){
           auxnum=num1;
           num1=num2;
           num2=auxnum;
       }
       
       //iniciaçao da sequencia (considerando os 2 primeiros termos ja dados)
       for(int i=2; i<sizeseq; i++){
            seq=aux1+aux2;
            if (seq>=num1 && seq<=num2)  //checagem e impressao dos numeros da sequencia entre os numeros limitantes
                System.out.print(seq+ " ");
            aux1=aux2;
            aux2=seq;
		}
        
    }
    
}