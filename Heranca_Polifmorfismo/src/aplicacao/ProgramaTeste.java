package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.Animal;
import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Pregui�a;

public class ProgramaTeste {

	public static void main(String[] args) {
	
		Cachorro cachorro = new Cachorro("O cachorrooo",7);
		Cavalo cavalo = new Cavalo("O cavalooo",10);
		Pregui�a pregui�a = new Pregui�a("A pregui�aaa",5);
		
		System.out.println("A��O DOS BICHOS\n");
	
		
				cachorro.mostraSom();
				cachorro.mostraacao();
				
				System.out.println();
				
				cavalo.mostraSom();
				cavalo.mostraacao();
				
				System.out.println();
				
				pregui�a.mostraSom();
				pregui�a.mostraacao();
				
			
				
				
	}
}