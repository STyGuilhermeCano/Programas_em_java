package programas;

import java.util.Scanner;

public class Exercicio08
{

	public static void main(String[] args)
	{
	

		 /*	8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
	     	percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
	     	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	     	escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
	     	consumidor.*/
	     
   //  cf - custo fabrica  id imposto distribuidor  igov imposto governo  cv valor de venda p o consumidor 
   
        double cf, pd, igov, cv;
        Scanner kb = new Scanner(System.in);
        
        
       System.out.println("Qual o custo de fabrica��o ? :");
        cf=kb.nextDouble();
        
        pd=(cf/100)*28;
        igov=(cf/100)*45;
        
        System.out.printf("percentagem do dis.R$: %.2f \n",pd);
        System.out.printf("imposto do governo.RS: %.2f \n",igov);
      
        cv=(cf+pd+igov);
        
       
        System.out.printf("Custo ao consumidor R$: %.2f \n",cv);
       
       
kb.close();
	}

}
