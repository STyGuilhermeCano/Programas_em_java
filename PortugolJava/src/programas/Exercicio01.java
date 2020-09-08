package programas;

import java.util.Scanner;

public class Exercicio01 
{

	public static void main(String[] args)
	{
		Scanner kb =new Scanner(System.in);
		int anos, meses, dias;
		int idadeEmDias;
		
		System.out.println("sua idade em Anos: ");
		anos=kb.nextInt();
		System.out.println("digite sua idade em Meses: ");
		meses=kb.nextInt();
		System.out.println("digite sua idade em Dias");
		
			dias=kb.nextInt();
			meses=(meses*30);
			idadeEmDias=(anos*365)+(meses+dias);

		System.out.printf( "O valor de sua idade em dias é igual a: %d dias ",idadeEmDias);
		
	  kb.close();	
	}

}
