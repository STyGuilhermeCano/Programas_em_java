package exerciciosLaçoCondicional;

import java.util.Scanner;

public class ParOuImpar
{

	public static void main(String[] args)
	{
		/* 4   - Faça um programa em que permita a entrada de um número qualquer e exiba se este 
		 * número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar
		 * exiba o número elevado ao quadrado.
		 */
		
	int numero;
		
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println(" Digite um numero");
		numero=kb.nextInt();
		
			if (numero % 2==0) // se o modulo de um numero dividido por 2 for = a 0 ele é par. 
			{
				System.out.printf(" Número par e sua raiz quadrada é igual a:  "+Math.sqrt(numero));
			}
			else  
			{
				System.out.printf("numero impar e seu exponencial ao quadrado é igual a :"+numero*numero++);
			}

		kb.close();	
	}

}
