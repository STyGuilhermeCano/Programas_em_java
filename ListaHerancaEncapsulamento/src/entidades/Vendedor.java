package entidades;

public class Vendedor extends Pessoa {
	
	private double valorVEndas;
	private double comissao;
	
	// constructor
	
	public Vendedor(String nome, String endere�o, double valorVEndas, double comissao) {
		super(nome, endere�o);
		this.valorVEndas = valorVEndas;
		this.comissao = comissao;		
	}

		//	generating Getters and Setters 
	
		public double getValorVEndas() {
			return valorVEndas;
		}

		public void setValorVEndas(double valorVEndas) {
			this.valorVEndas = valorVEndas;
		}

		public double getComissao() {
			return comissao;
		}

		public void setComissao(double comissao) {
			this.comissao = comissao;
		}

}
