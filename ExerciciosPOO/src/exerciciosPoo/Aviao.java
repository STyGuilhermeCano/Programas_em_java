package exerciciosPoo;

public class Aviao 
{

	 public String modelo;
	 public int capacidadePassageiros;
	 public String ciaAerea;
	 public int liga;
	
	
	public void mostraliga() 
	{
		if ( liga == 1)
		{
			System.out.println("o avião esta ligado");
		}
		else if(liga == 2)
		{
			System.out.println("o avião esta desligado");
		}
	}
	 
	public void mostraModelo() {
		System.out.printf("você irá voar num aviao: %s ",modelo);
	}
	 
	 
	 
	 
	 
	 
}
