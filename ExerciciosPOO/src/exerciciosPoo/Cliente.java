package exerciciosPoo;

public class Cliente {

	public String nomeCliente;
    public int idadeCliente;
    public char sexoCliente;

    public void mostraSexo() 
    {
        if (sexoCliente=='M')
        {
            System.out.printf("Cliente do sexo %c.",sexoCliente);
        }
        else if (sexoCliente == 'F') 
        {
            System.out.printf("Cliente do sexo %c.",sexoCliente);
        }
    }

    public void mostraidadeCliente()
    {
        if(sexoCliente=='M')
        {
            System.out.printf("O cliente tem %d anos.",idadeCliente);
        }
        else if(sexoCliente=='F')
        {
            System.out.printf("A cliente tem %d anos.",idadeCliente);
        }
    }
	
}
