package vetoresMatrizes;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02 
{
	public static void main(String[] args) 
	{
		//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

		 Random gerador = new Random ();		
		 int matriz[][] = new int [3][3];
				
			final int LINHA=3;
			final int COLUNA=3; //linha e colunas constantes
				
			int linha,coluna, valorDigitado = 0; 
			int cont10=0;
				
			for(linha=0; linha<LINHA; linha++)
			{
				System.out.printf(" | ");
					
				for (coluna=0; coluna<COLUNA; coluna++)
				{
						valorDigitado = gerador.nextInt(20)+1;
						matriz[linha][coluna] = valorDigitado;
						
					// escreva("Matriz [",l,"][",c,"] :", matriz[l][c])
					
						System.out.print(matriz[linha][coluna]);
						System.out.print(" | ");
						
							if (valorDigitado > 10)
							{
								cont10=cont10+1; //cont++
							}
						
				}
					System.out.print("\n\n");
			}
			
					System.out.print("quantidade de numeros maiores que 10 na Matriz igual a: "+cont10);
	}	
}
	