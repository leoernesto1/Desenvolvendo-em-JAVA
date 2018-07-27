/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exe5;
import java.util.Scanner;
/**
 *
 * @author Pedro
 */
public class Exe5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String num;
        System.out.println("Insira o numero: ");
        Scanner n= new Scanner(System.in);
        num = n.nextLine();
        char[] letras = num.toCharArray();
        for(int i=0; i<num.length();i++){
            System.out.println(letras [i]);
        }
    }
    
}
