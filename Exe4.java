/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exe4;
import java.util.Scanner;
/**
 *
 * @author Pedro
 */
public class Exe4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float peso, alt, imc;
        System.out.println("Insira o peso em kg: ");
        Scanner p= new Scanner(System.in);
        peso = p.nextFloat();
        System.out.println("Insira a altura em centimetros: ");
        Scanner a= new Scanner(System.in);
        alt = a.nextFloat();
        imc= peso/(alt*alt);
        if (imc<17)
            System.out.println("Muito abaixo do peso");
        if (imc>=17 && imc<18.5)
            System.out.println("Abaixo do peso");
        if (imc>=18.5 && imc<25)
            System.out.println("Peso normal");
        if (imc>=25 && imc<30)
            System.out.println("Acima do peso");
        if (imc>=30 && imc<35)
            System.out.println("Obesidade I");
        if (imc>=35 && imc<40)
            System.out.println("Obesidade II (severa)");
        if (imc>=40)
            System.out.println("Obesidade III (mórbida)");
            
    }
    
}
