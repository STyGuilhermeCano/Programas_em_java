package exercicioPooClasse;

import java.util.Scanner;

import exerciciosPoo.Aviao;

public class Exercicio02
{

	public static void main(String[] args)
	{
		/* 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, 
		 * em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as 
		 * informa��es deste objeto no console.*/

		Scanner kb = new Scanner(System.in);
		Aviao aviao1 = new Aviao();
		
		System.out.println("PARAMETROS DO AVI�O");
		
		System.out.println("Qual o modelo do aviao ?");
		aviao1.modelo = kb.nextLine();
		System.out.println("O AVIAO ESTA LIGADO ?  1- sim  / 2- n�o ");
		aviao1.liga = kb.nextInt();
		
		aviao1.mostraliga();
		aviao1.mostraModelo();
		
	}
	
}
