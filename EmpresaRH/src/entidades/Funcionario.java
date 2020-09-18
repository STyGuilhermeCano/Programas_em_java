package entidades;

public class Funcionario {

	private String nome;
	private int horasTrabalhadas;
	private double valorPorHora;
	public double pagamento;
	
	//construtores
	
	public Funcionario(String nome) {
		super();
		this.nome = nome;
	}
	public Funcionario(String nome, int horasTrabalhadas) {
		super();
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public Funcionario(String nome, int horasTrabalhadas, double valorPorHora) {
		super();
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
		this.pagamento = pagamento;
	}
	
	// método
	
	public double pagamento() {
		return  (this.horasTrabalhadas*this.valorPorHora);	
	}
	// sobrecarga de metodo - aqui terei a opção de alterar os valores do funcionario
	// sem prescisar pedir gets and seters antes no nome dele.
	public double pagamento(int horasTrabalhadas, double valorPorHora) {
		double pagamento;
		pagamento = horasTrabalhadas * valorPorHora;
		setValorPorHora(valorPorHora);
		setHorasTrabalhadas(horasTrabalhadas);
		return pagamento;
		
	}
	// seguranças
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getValorPorHora() {
		return valorPorHora;
	}
	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	public double getPagamento() {
		return pagamento;
	}
	public void setPagamento(double pagamento) {
		this.pagamento = pagamento;
	}
	

}
