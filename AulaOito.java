public class AulaOito{
	public static void main(String args[]){
	
		float media=2;
		
		if(media>=6){
			System.err.println("Aprovado, com a media" +media);
		} else{
		System.err.println("Reprovado, com media "+media+", faltam "+(6-media)+" pontos para sua aprovação.");
		}
	}
}

	