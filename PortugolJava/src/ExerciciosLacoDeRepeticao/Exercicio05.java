package ExerciciosLacoDeRepeticao;

import java.util.Scanner;

public class Exercicio05
{

	public static void main(String[] args) 
	{
		// Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, 
	    // mostre a soma dos n�meros digitados.(DO...WHILE)
		
		int numero=0, somaNumeros=0;
		
		Scanner kb = new Scanner(System.in);
		
		do {
				System.out.println("digite um numero");
				numero=kb.nextInt();
				somaNumeros=somaNumeros+numero;
			
		   }
		while(numero!=0);
			   
		System.out.printf("\na soma de todos os numeros � igual a: %d ",somaNumeros);
		
		kb.close();
	}

}
