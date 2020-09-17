package entidades;

public class Empregado extends Pessoa {
/*3. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe
 *Empregado tem, para além dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor
 *(inteiro), salarioBase (vencimento base) e imposto (porcentagem retida dos impostos). Implemente a 
 *classe Empregado com métodos seletores e modificadores e um método calcularSalario. Escreva um programa
 *de teste adequado para a classe Empregado.*/
 

	
	
	
		// importado Pessoa
		public Empregado(String nome, String endereço, String telefone) {
		super(nome, endereço, telefone);	
		
	}	// atributos da classe
		private int codigoSetor;
		private double salarioBase;
		private double imposto;
		private double calcularSalario;
		
		
		public void calcularSalario () {
			calcularSalario= (salarioBase-(salarioBase*imposto));
			 System.out.println("valor do salário é igual a = R$ "+calcularSalario);
		}
		
		
		public int getCodigoSetor() {
			return codigoSetor;
		}

		public void setCodigoSetor(int codigoSetor) {
			this.codigoSetor = codigoSetor;
		}

		public double getSalarioBase() {
			return salarioBase;
		}

		public void setSalarioBase(double salarioBase) {
			this.salarioBase = salarioBase;
		}

		public double getImposto() {
			return imposto;
		}

		public void setImposto(double imposto) {
			this.imposto = imposto;
		}

		public double getCalcularSalario() {
			return calcularSalario;
		}

		public void setCalcularSalario(double calcularSalario) {
			this.calcularSalario = calcularSalario;
		}

		public Empregado(String nome, int codigoSetor) {
			super(nome);
			this.codigoSetor = codigoSetor;
		}
		
	
		
}
