package aplicacao;

import entidades.Funcionario;
import entidades.Terceiros;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario funcionarioCLT = new Funcionario("João");
		Terceiros funcionarioTerceiro = new Terceiros("paulo",30);
		//atribuindo valores ao funcionarioCLT usando o set
		funcionarioCLT.setHorasTrabalhadas(22);
		funcionarioCLT.setValorPorHora(10);
		// imprimindo os valores alterados
		System.out.println("horas trabalhadas = "+funcionarioCLT.getHorasTrabalhadas()+" horas");
		System.out.println("valor pro hora = R$ "+funcionarioCLT.getValorPorHora());
		// usando o metodo pagamento
		System.out.println("Pagamento igual a R$ "+funcionarioCLT.pagamento());
					
							// Terceiro
		
		System.out.print("\n");
		funcionarioTerceiro.setHorasTrabalhadas(20);
		funcionarioTerceiro.setHoraAdicional(15);
		funcionarioTerceiro.setValorPorHora(10);
		//set pagamento - fazer o ajuste nescessário no metodo para este caso
		funcionarioTerceiro.setPagamento(funcionarioTerceiro.getHoraAdicional()*funcionarioTerceiro.getValorPorHora());
		//imprimindo os valores de funciionarioTerceiro
		System.out.println("horas trabalhadas = "+funcionarioTerceiro.getHorasTrabalhadas()+" horas");
		System.out.println("horas adicionais = "+funcionarioTerceiro.getHoraAdicional()+" horas");
		System.out.println("valor por hora R$ = "+funcionarioTerceiro.getValorPorHora());
		System.out.println("Pagamento igual a R$ "+funcionarioTerceiro.pagamento()); // aqui aparece a opção pagamento-terceiro(Override de Funcionario)
		
		// funcionário com metodo pagamento direto
		
				System.out.print("\n");
		
				Funcionario funcionarioCLT02 = new Funcionario("Naruto");
				funcionarioCLT02.pagamento(90,10);
				System.out.println("horas trabalhadas = "+funcionarioCLT02.getHorasTrabalhadas()+" horas");
				System.out.println("valor por hora R$ = "+funcionarioCLT02.getValorPorHora());
				System.out.println("Pagamento igual a R$ "+funcionarioCLT02.pagamento(90,10));
	}

}
