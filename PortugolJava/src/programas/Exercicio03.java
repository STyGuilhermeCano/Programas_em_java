package programas;

import java.util.Scanner;

public class Exercicio03 
{

	public static void main(String[] args)
	{
		int segundos, minutos, horas;
		Scanner kb = new Scanner(System.in);
		
		System.out.println(" Digite o tempo de duração do evento em segundos: ");
		segundos=kb.nextInt();
		
			horas=(segundos/3600);
			minutos=(segundos%3600)/60;
			segundos=(segundos%3600)%60;
		
		System.out.printf(" O tempo de duração do evento foi de: %d horas, %d minutos e %d segundos.",horas,minutos,segundos);		
		
		kb.close();
	}
	
}
