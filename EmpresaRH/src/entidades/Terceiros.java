package entidades;

public class Terceiros extends Funcionario{

	// construtores importados de Funcionarios
	
	public Terceiros(String nome) {
		super(nome);	
	}
	
	public Terceiros(String nome, int horasTrabalhadas) {
		super(nome, horasTrabalhadas);
	}
	
	
	
	

	public Terceiros(String nome, int horasTrabalhadas, double valorPorHora, double horaAdicional) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.horaAdicional = horaAdicional;
	}



	// Atributo  da classe 
	private double horaAdicional;

	// metodos
	
	@Override // mudança apenas para esta situação na classe Terceiros
	public double pagamento() {
		return super.pagamento() + (this.horaAdicional * this.getValorPorHora());	
	}
	
	
	
	// seguranças
	
	public double getHoraAdicional() {
		return horaAdicional;
	}

	public void setHoraAdicional(double horaAdicional) {
		this.horaAdicional = horaAdicional;
	}
	
	
	
}
