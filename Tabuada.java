
    import java.util.Scanner;
/**
 *
 * @author Pedro
 */
public class Tabuada {
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
