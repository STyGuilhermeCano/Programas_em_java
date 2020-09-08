package programas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 
{

	public static void main(String[] args) 
	{
		/* 7 - Um sistema de equações lineares do tipo: ax+by=c dx+ey=f pode ser resolvido segundo mostrado abaixo :
		 x=ce-bf/ae-bd  y=af-cd/ae-bd .
		Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcule e mostra os valores de x e y.*/
	
		double A, B, C, D, E, F, X, Y;
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);

     System.out.println(" Digite A: ");
     A=kb.nextDouble();
     System.out.println(" Digite B: ");
     B=kb.nextDouble();
     System.out.println(" Digite C: ");
     C=kb.nextDouble();
     System.out.println(" Digite D: ");
     D=kb.nextDouble();
     System.out.println(" Digite E: ");
     E=kb.nextDouble();
     System.out.println(" Digite F: ");
     F=kb.nextDouble();
     
     // PROCESSAMMENTO

     X=((C*E)-(B*F))/((A*E)-(B*D));
     Y=((A*F)-(C*D))/((A*E)-(B*D));

     System.out.printf("o valor de x é: %.2f ", X);
     
     System.out.printf("o valor de y é: %.2f ", Y);
     

     kb.close();
	}

}
