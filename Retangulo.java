public class Retangulo{

	private double comprimento, largura;
	
	public Retangulo(double comprimento, double largura){
		setComprimento(comprimento);
		setLargura(largura);
	}
	
	public double getComprimento(){
		return comprimento;
	}
	
	public void setComprimento(double comprimento){
		if(comprimento>0)
			this.comprimento=comprimento;
		else
			this.comprimento = 1;
	}
	
	public double getLargura(){
		return largura;
	}
	
	public void setLargura(double largura){
		if(largura>0)
			this.largura=largura;
		else
			this.largura = 1;
	}
}