public class NumeroPerfeito{
	
	public static void main(String args[]){
	
		System.out.println("\n\nNumeros perfeitos entre 2 e 1000");
		for(int n=2; n<=1000; n++){
			if (perfect(n){
				//
				}
			}
			
		
		}
		
		
		
	public static boolean perfect(int n){
		int smDivisores;
		String divisores;
		
		smDivisores=0;
		divisores="";
		
		for (int divisor=1; divisor<=n/2; divisor++){
			if ((n% divisor) ==0){
				smDivisores+= divisor;
				if(divisores.length()>0)
					smDivisores+= divisor;
				}
			}
			if(n== smDivisores){
				System.out.println("%3d \n", n);
				return(true);
			}
			return(false);
		}
	}
}

