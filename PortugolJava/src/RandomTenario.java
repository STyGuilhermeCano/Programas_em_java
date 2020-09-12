import java.util.Random;
import java.util.Scanner;

public class RandomTenario {

	public static void main(String[] args) {
		
		Random gerador = new Random(); // INSTANCIANDO UM OBJETO DE NUMEROS RANDOMICOS
     	
		Scanner ler = new Scanner(System.in);
		int numero, par=0,impar=0;
		int contador = 0;
		final int LIMITE = 10;
		
		for (contador = 0; contador < LIMITE; contador++) {
			numero = gerador.nextInt(100)+1; // COMO COMEÇA EM ZERO, PRA EVITAR ESCOLHE O ZERO BASTAR SOMAR 1, O 100 DENTRO É O LIMITE DE ESCOLHE [1-100]
			System.out.println("Valor "+(contador+1)+" = "+numero); // PARA EXIBI A ESCOLHA ALEATORIA NA TELA
			
			//PROCESSO NORMA DE ANALISE SE O NUMERO ALEATORIO ESCOLHIDO É PAR OU IMPAR
			if( (numero % 2)==0 ) {
				par = par + 1;
			}
			else {
				impar++;
			}
		}
		// CRIANDO VARIAVEIS TEXTO AO MESMO TEMPO USANDO TERNARIO PRA DECIDI O TEXTO
		String tpar=(( par ==0 )?"voce  nao digitou nenhum numero par":(par ==1)?"voce digitou um numero par":"voce digitou "+par+" numeros pares ");
		String timpar=(( impar==0 )?"voce  nao digitou nenhum numero impar":(impar ==1)?"voce digitou um numero impar":"voce digitou "+impar+" numeros impares ");
		
		//IMPRIMINDO AS DUAS VARAVEIS JUNTAS
		System.out.println(tpar+" e "+timpar);
		ler.close();
		
	}
}
	
