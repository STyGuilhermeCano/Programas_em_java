import java.util.Scanner;

public class ImparParMelhorado {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int numero, par=0,impar=0;
		int contador = 0; 
		final int LIMITE = 5;
		
		for (contador = 0; contador < LIMITE; contador++) {
			System.out.printf("Digite o %d numero inteiro: ", contador+1);
			numero = ler.nextInt();
			if( (numero % 2)==0 ) {
				par = par + 1;
			} 
			else {
				impar++;
			}
		}
		
		//	System.out.println( (n == 1) ? "masculino":(n == 2)?"feminino":(n == 3)?"outro":"nao se aplica");
		//System.out.printf((par == 1 ) ? "existem %d numero par neste programa e":"existem %d numeros pares neste programa e",(impar==1)?"existem %d numero ímpar neste programa":"existem %d numeros ímpares neste programa",par,impar);               
		// System.out.println(( par ==0 )?"voce  nao digitou nenhum numero par":(par ==1)?"voce digitou um numero par":"voce digitou "+par+" numeros pares ");//voce digitou um numero par ":"voce digitou "+par+" numeros pares ");
		//System.out.println(( impar==0 )?"voce  nao digitou nenhum numero impar":(impar ==1)?"voce digitou um numero impar":"voce digitou "+impar+" numeros impares ");
		 String tpar=(( par ==0 )?"voce  nao digitou nenhum numero par":(par ==1)?"voce digitou um numero par":"voce digitou "+par+" numeros pares "); 
		 String timpar=(( impar==0 )?"voce  nao digitou nenhum numero impar":(impar ==1)?"voce digitou um numero impar":"voce digitou "+impar+" numeros impares ");
		 System.out.println(tpar+" e "+timpar);
		 
		 
		ler.close();
	}
}
