package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.Animal;
import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Preguiça;

public class ProgramaTeste {

	public static void main(String[] args) {
	
		Cachorro cachorro = new Cachorro("O cachorrooo",7);
		Cavalo cavalo = new Cavalo("O cavalooo",10);
		Preguiça preguiça = new Preguiça("A preguiçaaa",5);
		
		System.out.println("AÇÂO DOS BICHOS\n");
	
		
				cachorro.mostraSom();
				cachorro.mostraacao();
				
				System.out.println();
				
				cavalo.mostraSom();
				cavalo.mostraacao();
				
				System.out.println();
				
				preguiça.mostraSom();
				preguiça.mostraacao();
				
			
				
				
	}
}