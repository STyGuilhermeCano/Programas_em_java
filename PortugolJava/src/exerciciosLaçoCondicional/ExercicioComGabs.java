package exerciciosLa�oCondicional;

import java.util.Scanner;

public class ExercicioComGabs
{

	public static void main(String[] args)
	{
		/* 4   - Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este 
		 * n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar
		 * exiba o n�mero elevado ao quadrado.
		 */
		
		double numero;
		
		Scanner kb =new Scanner(System.in);
		
		System.out.println(" Digite um numero");
		numero=kb.nextDouble();
				
			if (numero % 2 == 0) // se o mudulo da divisao de um numero der resto 0, ele � par.
			{
				numero = Math.sqrt(numero);  /* se o numero for par numero recebe raiz quadrada Math.sqrt(numero)*/
				System.out.printf("este numero � par e sua raiz quadrada � igual a %.2f",numero);
			}
			else  // se ele for impar vai receber a potencia��o == numero = Math.pow(numero, 2);
				{
					numero = Math.pow(numero, 2);
					System.out.printf("este numero � impar e sua exponencia��o � igual a %.2f",numero);
				}
				
	kb.close();
	}

}
