public class TesteExe3{

	public static void main(String args[]){
		Retangulo obj;
		double perimetro, area;
		obj= new Retangulo(5,10);
		
		// Calculo perimetro e area
		perimetro=2*obj.getComprimento()+2* obj.getLargura();
		area= obj.getComprimento()*obj.getLargura();
		
		System.out.println("Perimetro:  " + perimetro);
		System.out.println("Area:  " + area);
		
		//dobrar valor comprimento
		obj.setComprimento(2*obj.getComprimento());
		//novo calculo
		perimetro=2*obj.getComprimento()+2* obj.getLargura();
		area= obj.getComprimento()*obj.getLargura();
		System.out.println("Perimetro:  " + perimetro);
		System.out.println("Area:  " + area);
	
	}//public
}//class