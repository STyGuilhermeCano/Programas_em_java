package LacoDeRepeticao;

import java.util.Scanner;

public class While
{

	public static void main(String[] args) 
	{
		
		//Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. 
		
		Scanner kb = new Scanner(System.in);
		int numero;
			
		for(numero=1000;numero<1999;numero++)
		{
			if (numero % 11 == 5)
			{
				System.out.println(numero++);
				
			}
		
		}
			
		kb.close();
	}

}
