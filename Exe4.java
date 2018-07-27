import java.util.Scanner;
public class Exe4{
	public static void main(String args[]){
		//declaração variaveis
		Scanner sc;
		int nTermos;//N
		int[]seq; //seuqencia numeros
		int[][] resultados;//matriz de resultados
		int i, j, k;//indices array e matriz;
		
		//inicialização
		sc=new Scanner(System.in);
		
		//leitura do nro de termos da sequencia
		nTermos=sc.nextInt();
		
		//inicalizar a sequencia
		seq= new int[nTermos];
		
		//leitura da sequencia
		for(i=0;i<nTermos; i++)
			seq[i]=sc.nextInt();
		
		//inicialização matriz de resultados
		resultados=new int[getNumElementosUnicos(seq)][2];
		
		//Calcula matriz
		k=0;
		for(i=0; i<seq.length; i++){
			for (j=0; j<k; j++){
				if(seq[i] == resultados[j][0])//elemento encontrado na matriz de resultado
					break;	
					
			if(j==k)//nao encontrou
				//adiciono elemento a matriz de resultado
				resultados[k][0]=seq[i];
				resultados[k][1]=getNumElementosSeq(seq, seq[i]);
				k++;
			}
		}
		//calcula resultados
		for(i=0;i<resultados.length;i++)
			System.out.println(resultados[i][0] + " = "+ resultados[i][1] + "vez(es)");
			
			
	}
	
	public static int getNumElementosSeq(int[] seq, int nro){
		int cont;
		
		cont=0;
		for(int i=0; i<seq.length; i++)
			if(seq[i]==nro)
				cont ++;
		return cont;
	}
	
	public static int getNumElementosUnicos(int[] seq){
		int i, j; //indices
		int cont;
		
		cont=0;
		for(i=0; i<seq.length; i++){
			for (j=0; j<i; j++){
				if(seq[i] == seq[j]) //Elemento ja foi visto
					break;
			}
			//ver se encontrou o elemento
			if(i==j)//nao encontrou, entao incrementa
				cont++;
		}
		return cont; // retorna resultado
	}
}