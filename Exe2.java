/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exe2;
    import java.util.Scanner;
/**
 *
 * 
 */
public class Exe2 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Insira o numero: ");
        int x,i,tabu;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("Tabuada:");
        for(i=0; i<=100; i++){
            tabu=i*x;
            System.out.println(tabu);
        }
    }
    
}
