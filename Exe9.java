/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exe9;
import java.util.Scanner;
/**
 *
 * @author Pedro
 */
public class Exe9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        System.out.println("Digite uma frase");
        Scanner n= new Scanner(System.in);
        frase = n.nextLine();
        char[] letras = frase.toCharArray();
        for(int i=0; i<frase.length();i++){
            int ascii_of_char = (int)letras[i]; 
            System.out.println(letras [i]+"="+ascii_of_char);
        }
        }
    
}
