package entidades;
public class TerceiroEd  extends FuncionarioEd
{
	private double horasAdicionais;

	
	public TerceiroEd(String nome, int horasTrabalhadas, double valorPorHora, double horasAdicionais) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.horasAdicionais = horasAdicionais;
	}
	public double getHorasAdicionais() {
		return horasAdicionais;
	}
	public void setHorasAdicionais(double horasAdicionais) {
		this.horasAdicionais = horasAdicionais;
	}
	
	@Override  // mudança apenas para esta situação - puxadinho do metodo  //forceps
	public double pagamento()
	{
		
		return super.pagamento() + (this.horasAdicionais * super.getValorPorHora());
		
		//return (this.horasTrabalhadas*this.valorPorHora) + (horasAdicionais*valorPorHora)
	}
	//sobrecarga
	public double pagamento(int horasTrabalhadas, double valorPorHora)
	{
		double recebimento;
		recebimento = (horasTrabalhadas * valorPorHora) + (this.getHorasAdicionais()*valorPorHora);
		
		super.setValorPorHora(valorPorHora);
		super.setHorasTrabalhadas(horasTrabalhadas);
		
		return recebimento;
	
	}
}
