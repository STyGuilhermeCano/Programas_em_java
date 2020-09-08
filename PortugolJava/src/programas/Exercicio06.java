package programas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args)
	{
	
				/*6. Construa um programa em c que, tendo como dados de entrada dois pontos
				quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula 
				que efetua tal cálculo é: d=raiz de (x2-x1)² + (y2-y1)² */
				
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		double x1, y1, x2, y2, d;

           System.out.println(" Digite os valores dos pontos x1 , y1 , x2 , y2 \n");
           
           x1=kb.nextDouble();
           y1=kb.nextDouble();
           x2=kb.nextDouble();
           y2=kb.nextDouble();
           
           d=Math.sqrt((Math.pow(x2+x1,2)+Math.pow(y2-y1, 2)));
           // Math.sqrt(2)= raiz quadrada;
           // Math.pow(numero+numero,potenciação) exponenciação;		   
        		   
           System.out.printf(" A distância entre os pontos é %.1f ", d);
           
      kb.close();
	}

}
