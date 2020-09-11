package ExerciciosLacoDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04
{

	public static void main(String[] args)
	{
	 /*(WHILE)Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.
	  *  	  Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino), e as opções 
	  *       (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
	  *   	  Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: 
	  *  
			 o número de pessoas calmas; 
			 o número de mulheres nervosas; 
			 o número de homens agressivos; 
			 o número de pessoas nervosas com mais de 40 anos; 
			 o número de pessoas calmas com menos de 18 anos.    */
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		int pessoas=0, idade=0, sexo=0, temperamento=0;
		int pessoasCalmas18=0, pessoasCalmas=0, homensAgressivos=0, mulheresNervosas=0, pessoasNervosas40=0;
		final int LIMITE=4; // final é igual a constante do Portugol = const
		
		System.out.println("-----Pesquisa de comportamento-----");
		
		while(pessoas<LIMITE)
		{
			System.out.println("Escreva a sua idade: ");
			idade=kb.nextInt();
			System.out.println("Digite 1 para Feminino e 2 para Masculino: ");
			sexo=kb.nextInt();
			System.out.println("Digite 1 para Calma, 2 para Nervoso e 3 para Agressivo: ");
			temperamento=kb.nextInt();
			
			
			if (sexo==1 && temperamento==2) //if = se; && = e; 1 mulheres e 2 - nervosas
			{
				mulheresNervosas=mulheresNervosas+1; // isso é igual a mulheresNervosas++
			}
			else if (sexo==2 && temperamento==3) // else if = senao se | 2- homens e 3 - agressivos
			{
				homensAgressivos=homensAgressivos+1;
			}
			else if (idade>40 && temperamento==2)
			{
				pessoasNervosas40=pessoasNervosas40+1;
			}
			else if (idade<18 && temperamento==1)
			{
				pessoasCalmas18=pessoasCalmas18+1;
			}
			else if (temperamento==1)
			{
				pessoasCalmas=pessoasCalmas+1;
			}
					
		
			pessoas++;
			
			
		}
		System.out.printf("O número de pessoas que se declararam calmas é de: %d",pessoasCalmas);
		System.out.printf("O número de mulheres que se declararam calmas é de: %d",mulheresNervosas);
		System.out.printf("O número de homens que se declararam agressivos é de: %d",homensAgressivos);
		System.out.printf("O número de pessoas calmas com mais de 40 nos é de: %d",pessoasNervosas40);
		System.out.printf("O número de pessoas calmas menores de 18 anos é de: %d",pessoasCalmas18);
		
		
		kb.close();
	}

}