package exerciciosLaçoCondicional;

import java.util.Scanner;

public class OrdemCrescente 
{

	public static void main(String[] args) 
	{
		// 2-	Faça um programa que entre com três números e coloque em ordem crescente.

		int n1, n2, n3;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Digite N1: ");
		n1=kb.nextInt();
		System.out.println("Digite N2: ");
		n2=kb.nextInt();
		System.out.println("Digite N3: ");
		n3=kb.nextInt();

		if (n1>n2 && n1>n3)
		{
			System.out.printf("%d..%d..%d ",n3,n2,n1);
		}
		else if (n3>n2 && n3>n1)
		{
			System.out.printf("%d..%d..%d ",n1,n2,n3);
		}
		else if (n2>n1 && n2>n3)
		{
			System.out.printf("%d..%d..%d ",n3,n1,n2);
		}
	
		kb.close();
	}

}
