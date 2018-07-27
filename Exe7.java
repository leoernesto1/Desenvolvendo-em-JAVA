 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exe7;
import java.util.Scanner;
/**
 *
 * @author Pedro
 */
public class Exe7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, div=0;
        System.out.println("Insira o numero: ");
        Scanner num= new Scanner(System.in);
        n=num.nextInt();
        for (int i=1; i<=n; i++){
            if (n%i==0)
                div++;
        }
        if (div==2)
            System.out.println("O numero é primo");
        else
            System.out.println("O numero nao é primo");
        }
    }
