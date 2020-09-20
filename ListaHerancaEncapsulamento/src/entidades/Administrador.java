package entidades;

public class Administrador extends Pessoa {

	private double ajudaDeCusto;

	public Administrador(String nome, String endere�o, double ajudaDeCusto) {
		super(nome, endere�o);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
}
