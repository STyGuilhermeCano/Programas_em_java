package aplicacao;

import entidades.Empregado;
import entidades.Fornecedor;

	public class ProgramaTeste {

		public static void main(String[] args) {
		
		Fornecedor cimento = new Fornecedor("cauê","Cotia");
			
		  cimento.setNome("----------Cimento Cauê---------");
		  cimento.setValorDivida(1000);
		  cimento.setValorCredito(1500);
		  cimento.getObterSaldo();
		
		System.out.println(cimento.getNome());  
		System.out.println("valor da dívida = R$ "+cimento.getValorDivida());
		System.out.println("valor em credito = R$ "+cimento.getValorCredito());	
			
		cimento.obterSaldo();
				
		// teste do Empregado
		
		System.out.println("\n");
		
		Empregado Juarez = new Empregado("Juarez","Rua liberdade N-518","7070-7070");
		Juarez.getSalarioBase();
		Juarez.getImposto();
		Juarez.setSalarioBase(2500);
		Juarez.setImposto(0.30);
		
		System.out.println("--------------"+Juarez.getNome()+"--------------");
		System.out.println("Salário Base: "+Juarez.getSalarioBase());
		System.out.println("Imposto: "+Juarez.getImposto()+" %");
		Juarez.calcularSalario();
			
	}

}
