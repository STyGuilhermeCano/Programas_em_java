package programas;

import java.util.Scanner;

public class exercicio04 
{
	/* 4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a
	 * seguinte express�o: D=(R+S)/2  onde, R=(A+B)� onde, S=(B+C)�
     */

	public static void main(String[] args)
	{
		double a, b, c, d, r, s;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		a=kb.nextInt();
		System.out.println("Digite o valor de b: ");
		b=kb.nextInt();
		System.out.println("Digite o valor de c: ");
		c=kb.nextInt();
		
			
		r=Math.pow(a,2)+ Math.pow(b, 2);
		s=Math.pow(b,2)+ Math.pow(c, 2);
		
		d=(r+s)/2;
			
		System.out.println(d);
	
	kb.close();	
	}

}
