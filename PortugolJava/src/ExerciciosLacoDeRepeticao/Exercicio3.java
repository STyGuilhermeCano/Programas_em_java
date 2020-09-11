package ExerciciosLacoDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) 
	{
	//(WHILE) Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com   				    	  mais de 50 anos. O programa termina quando idade for =-99.
		Locale.setDefault(Locale.US);
        Scanner kb = new Scanner(System.in);

        int idade=0, contMenor=0, contMaior=0;

       
        while(idade!=-99)
        {
            if(idade<21)
            {
                contMenor++;
            }
            else if(idade>50)
            {
                contMaior++;
            }
            
            System.out.println("Por favor, digite a sua idade: ");
            idade=kb.nextInt();
            
        }

        System.out.printf("\nA quantidade de pessoas com menos de 21 anos é de: %d",contMenor-1);
        System.out.printf("\n\nA quantidade de pessoas com mais de 50 anos é de: %d",contMaior);

        kb.close();

	}

}
