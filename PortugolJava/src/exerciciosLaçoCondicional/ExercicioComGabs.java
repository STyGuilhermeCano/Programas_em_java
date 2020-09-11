package exerciciosLaçoCondicional;

import java.util.Scanner;

public class ExercicioComGabs
{

	public static void main(String[] args)
	{
		/* 4   - Faça um programa em que permita a entrada de um número qualquer e exiba se este 
		 * número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar
		 * exiba o número elevado ao quadrado.
		 */
		
		double numero;
		
		Scanner kb =new Scanner(System.in);
		
		System.out.println(" Digite um numero");
		numero=kb.nextDouble();
				
			if (numero % 2 == 0) // se o mudulo da divisao de um numero der resto 0, ele é par.
			{
				numero = Math.sqrt(numero);  /* se o numero for par numero recebe raiz quadrada Math.sqrt(numero)*/
				System.out.printf("este numero é par e sua raiz quadrada é igual a %.2f",numero);
			}
			else  // se ele for impar vai receber a potenciação == numero = Math.pow(numero, 2);
				{
					numero = Math.pow(numero, 2);
					System.out.printf("este numero é impar e sua exponenciação é igual a %.2f",numero);
				}
				
	kb.close();
	}

}
