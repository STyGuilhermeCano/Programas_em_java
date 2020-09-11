package ExerciciosLacoDeRepeticao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
	
	    /*Escrever um programa que receba vários números inteiros no teclado.
	     * E no final imprimir a média dos números múltiplos de 3.
	     * Para sair digitar 0(zero).(DO...WHILE)
	     */

	        Scanner kb = new Scanner(System.in);

	            int numero=0, multiplo=0;
	            double soma=0, cont=0; 
	            double media=0;

	        do{
	            System.out.println("Digite um numero inteiro: ");
	            numero=kb.nextInt();

	        if (numero%3==0)
	        { 
	            soma=soma+numero;
	                cont=cont+1;
	        }

	        }while (numero!=0);

	            media=soma/(cont-1);
	            System.out.printf("A media dos numeros multiplos de 3 é: %.2f ", media);

	        kb.close();
	   
	}

}
