package entidades;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade, String som, String ação) {
		super(nome, idade, som, ação);	
	}

	public void  mostraSom() {
		System.out.println("o cachorro esta latindo");
	}
	
	
	
	
}
