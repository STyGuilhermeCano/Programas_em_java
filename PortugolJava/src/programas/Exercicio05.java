package programas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 
{
	/* 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.
	    * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
		*/
	
	public static void main(String[] args)
	{
	   double nota1, nota2, nota3, media;
	   String nome;
	   
	   Locale.setDefault(Locale.US); // para usar ponto e seguir o padrao americano na hora de digitar as medias case seja um valor real ex. 7.5
	  Scanner kb = new Scanner(System.in);
	   
	   
	   System.out.println(" Informe nome do aluno: ");
	   nome=kb.next();
	   
	   System.out.println(" informe nota 1: ");
	   nota1=kb.nextDouble();
	   System.out.println(" informe nota 2: ");
	   nota2=kb.nextDouble();
	   System.out.println(" informe nota 3: ");
	   nota3=kb.nextDouble();
	   
	   nota1=(nota1*2);
	   nota2=(nota2*3);
	   nota3=(nota3*5);
	   
	   media=(nota1+nota2+nota3)/(2+3+5);
	   
	   System.out.printf(" A media de %s é igual a: %.2f ",nome,media);
	   
	 kb.close();  
	}

}
