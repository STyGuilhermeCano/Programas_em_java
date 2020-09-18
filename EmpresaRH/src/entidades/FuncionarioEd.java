package entidades;
public class FuncionarioEd
{
	//ATRIBUTOS
	private String nome;
	private int horasTrabalhadas;
	private double valorPorHora;
	//CONSTRUTORES
	public FuncionarioEd()  //CONSTRUTOR TEM O MESMO NOME DA CLASSE
	{
		
	}
	//SOBRECARGA
	public FuncionarioEd(String nome)
	{
		this.nome = nome;
	}
	public FuncionarioEd(String nome, int horasTrabalhadas, double valorPorHora)
	{
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}
	// SEGURAÇÃO - ENCAPSULAMENTO
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
	
	// MEUS METODOS
	
	public double pagamento()
	{
		return this.horasTrabalhadas*this.valorPorHora;
	}
	
	
	//SOBRECARGA
	public double pagamento(int horasTrabalhadas, double valorPorHora)
	{
		double recebimento;
		recebimento = horasTrabalhadas * valorPorHora;
		
		setValorPorHora(valorPorHora);
		setHorasTrabalhadas(horasTrabalhadas);
		
		return recebimento;
	}
	
}