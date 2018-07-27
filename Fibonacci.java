public class Fibonacci{
	public static void main(String args[]){
		
	int p=0, s=1, t=0;
	System.out.print("Digite o priemrio numero");
	
	System.out.print(p+", " +s);
	for(int i=1; i<=8; i++){
		p=p+s;
		System.out.print(", "+p);
		
		p=s;
		s=p;
		p=0;
		}
	}
}
	