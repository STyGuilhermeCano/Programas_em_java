package Tenario;

import java.util.Scanner;

public class Tenario 
{

	public static void main(String[] args) 
	{
		// fazer no tenario a seguinte condição 1 = masculino, 2= feminino, 3= outro
		int n;
		
		Scanner kb =new Scanner(System.in);
		
		System.out.println("digite um numero");
		n=kb.nextInt();
		
		System.out.println( (n == 1) ? "masculino":(n == 2)?"feminino":(n == 3)?"outro":"nao se aplica");
		
			
	kb.close();	
	}

}
