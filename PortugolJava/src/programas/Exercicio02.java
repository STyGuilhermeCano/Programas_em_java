package programas;

import java.util.Scanner;

public class Exercicio02
{

	public static void main(String[] args)
	{
		int idadeEmDias, idadeEmMeses, idadeEmAnos;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println(" Informe sua idade em dias: ");
		idadeEmDias=kb.nextInt();
		
		idadeEmAnos=(idadeEmDias/365);
		idadeEmMeses=(idadeEmDias%365)/30;
		idadeEmDias=(idadeEmDias%365)%30;
		
		System.out.printf(" Sua idade é de %d Anos, %d Meses e %d Dias ",idadeEmAnos,idadeEmMeses,idadeEmDias);
	
		kb.close();
	}

}
