import java.io.Serializable
public class Exe12 implements Serializable{
	
	private int nroConta;
	private String nomeCorrentista;
	private double saldoConta;
	
	//construtor
	
	public Exe12(int nroConta, String nomeCorrentista, double saldoConta){
		this.nroConta= nroConta;
		this.nomeCorrentista= nomeCorrentista;
		this.saldoConta= saldoConta;
	}
	
	public int getNroConta(){
		return nroConta;
	}
	
	public String getNomeCorrentista(){
		return nomeCorrentista;
	}
	
	public double getSaldoConta(){
		return saldoConta;
	}
	public 
	

}