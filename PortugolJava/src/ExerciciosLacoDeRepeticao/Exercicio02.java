package ExerciciosLacoDeRepeticao;

public class Exercicio02
{

	public static void main(String[] args) 
	{
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		int numero, contpar=0,contImpar=0;
		
		for (numero=1;numero<=10;numero++)
		{
			System.out.printf("%d ",numero);
			
			if(numero % 2 == 0)
			{
				
				contpar=contpar+1;		
			}
			else
			{
				contImpar=contImpar+1;
			}
		}
		
		System.out.println("\n\na quantidade de numeros pares é igual a "+contpar);
		System.out.println("a quantidade de numeros ímpares é igual a "+contImpar);
	}

}
