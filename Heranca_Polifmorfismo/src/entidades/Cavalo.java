package entidades;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);		
	}
		//metodos
		public void  mostraSom() {
		System.out.println("o cavalo esta relinxando");
		}
	
		public void mostraacao() {
			System.out.println("o cavalo esta correndo");
		}
	
}
