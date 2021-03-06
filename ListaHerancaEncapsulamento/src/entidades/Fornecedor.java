package entidades;

public class Fornecedor extends Pessoa {


/*2 Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior)
	 a classe Fornecedor. Considere que cada inst�ncia da classe Fornecedor tem, para al�m dos atributos que 
	caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao cr�dito m�ximo atribu�do ao
	 fornecedor) e valorDivida (montante da d�vida para com o fornecedor). Implemente na classe Fornecedor,
	 para al�m dos usuais m�todos seletores e modificadores, um m�todo obterSaldo() que devolve a diferen�a
	 entre os valores dos atributos valorCredito e valorDivida. Depois de implementada a classe Fornecedor,
	 crie um programa de teste adequado que lhe permita verificar o funcionamento dos m�todos implementados 
	 na classe Fornecedor e os herdados da classe Pessoa. */

	
		// importado de pessoa
		 public Fornecedor(String nome, String endere�o) {
			 super(nome, endere�o);
		 }
		 
		 double valorCredito;  
		 double valorDivida ; 
		 double obterSaldo; //devolve a diferen�a entre os valores dos atributos valorCredito e valorDivida.
		
		 
		
		public void obterSaldo() {
			 obterSaldo = (valorCredito-valorDivida);
			 System.out.println("valor do saldo � igual a = R$ "+obterSaldo);
		}


		public double getObterSaldo() {
			return obterSaldo;
		}


		public void setObterSaldo(double obterSaldo) {
			this.obterSaldo = obterSaldo;
		}


		public double getValorCredito() {
			return valorCredito;
		}


		public void setValorCredito(double valorCredito) {
			this.valorCredito = valorCredito;
		}


		public double getValorDivida() {
			return valorDivida;
		}


		public void setValorDivida(double valorDivida) {
			this.valorDivida = valorDivida;
		}
				
	}
