package exerciciosLa�oCondicional;

import java.util.Scanner;

public class QualNumeroMaior
{

	public static void main(String[] args)
	{
		// 1 Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

		int a, b, c;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println(" Digite o valor de A");
		a = kb.nextInt();
		System.out.println(" Digite o valor de B");
		b = kb.nextInt();
		System.out.println(" Digite o valor de C");
		c = kb.nextInt();
		
		
		if(a > b && a > c)
		{
			System.out.printf("o maior valor �: A  %d",a);
		}
			else if (b > a &&  b > c)
			{
				System.out.printf("o maior valor �: B %d",b);
			}
			else 
			{
				System.out.printf("o maior valor �: %d",c);
			}
		
		
		kb.close();
	}

}
