package exerciciosLaçoCondicional;

import java.util.Scanner;

public class CategoriaIdade 
{

	public static void main(String[] args) 
	{
		/*    3-Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria 
		 *    ela se encontra:
		 * 
         *    10-14 infantil                     15-17 juvenil                           18-25 adulto
		 */

		int idade;
		Scanner kb = new Scanner(System.in);
		
		System.out.println(" Qual a sua Idade ? ");
		idade = kb.nextInt();
		
		
		if (idade>=10 && idade<=14)
		{
			System.out.println("Categoria Infantil ");
		}	
			else 
				if(idade>=15 && idade<=17)
				{
					System.out.println("Categoria Juvenil");
				}
				else
					if(idade>=18 && idade<=25)
					{
						System.out.println("Categoria Adulto(a)");
					}
					else System.out.println(" Não se enquadra em nenhuma categoria ");
		kb.close();
	}

}
