package exerciciosLa�oCondicional;

import java.util.Scanner;

public class ParOuImpar
{

	public static void main(String[] args)
	{
		/* 4   - Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este 
		 * n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar
		 * exiba o n�mero elevado ao quadrado.
		 */
		
	int numero;
		
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println(" Digite um numero");
		numero=kb.nextInt();
		
			if (numero % 2==0) // se o modulo de um numero dividido por 2 for = a 0 ele � par. 
			{
				System.out.printf(" N�mero par e sua raiz quadrada � igual a:  "+Math.sqrt(numero));
			}
			else  
			{
				System.out.printf("numero impar e seu exponencial ao quadrado � igual a :"+numero*numero++);
			}

		kb.close();	
	}

}
