package entidades;

public class ContaCorrente extends ContaBancaria{
 

	private int talionario;
	
	public ContaCorrente(int numero, double saldo, int talionario) {
		super(numero, saldo);
		this.talionario = talionario;
	}

	public int getTalionario() {
		return talionario;
	}

	public void setTalionario(int talionario) {
		
	}
}