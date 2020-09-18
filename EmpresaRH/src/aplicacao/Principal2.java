package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.Terceiros;

public class Principal2 {

public static void main(String[] args) {
	
	int n;
	char ch;
	String nome;
	int hora;
	double valor;
	double valorextra=0;
	
		Scanner kb = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("digite o numero de funcinarios ");
		n = kb.nextInt();
		
		for (int i = 1; i<=n; i++) {
					
					System.out.println("CADASTRO FUNCIONARIO"+i+":");
					System.out.println("terceiro [S/N] :");
					ch = kb.next().toUpperCase().charAt(0);
					System.out.println("nome: ");
					nome = kb.next().toUpperCase();
					System.out.println("Horas trabalhadas: ");
					hora = kb.nextInt();
					System.out.println("valor da hora trabalhada: ");
					valor = kb.nextDouble();
					if( ch == 'S') {
				
				System.out.println("digite o valor extra adicional: ");
				valorextra = kb.nextDouble();
				list.add(new Terceiros(nome, hora, valor, valorextra));
			}		
			else {
				list.add(new Funcionario(nome, hora,valor));
			}
		
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS");
			
		for (Funcionario func: list) {
				System.out.println(func.getNome()+" "+func.pagamento());
			}
			
	}
		
}

