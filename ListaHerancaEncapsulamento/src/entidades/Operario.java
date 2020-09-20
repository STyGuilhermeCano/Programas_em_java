package entidades;

public class Operario extends Pessoa {

	private double valorProducao;
	private double comissao;
	

	public Operario(String nome, String endereço, double valorProducao, double comissao) {
		super(nome, endereço);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public double getValorProducao() {
		return valorProducao;
	}


	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}


	public double getComissao() {
		return comissao;
	}


	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	
}

