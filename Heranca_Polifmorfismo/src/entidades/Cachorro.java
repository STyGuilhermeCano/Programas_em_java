package entidades;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) {
		super(nome, idade);	
	}

	public void  mostraSom() {
		System.out.println("o cachorro esta latindo");
	}
	
	public void mostraacao() {
		System.out.println("o cachorro esta correndo");
	}
	
	
	
}
