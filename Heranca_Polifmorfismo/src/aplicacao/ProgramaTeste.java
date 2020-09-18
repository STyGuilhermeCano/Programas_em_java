package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.Animal;
import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Preguiça;

public class ProgramaTeste {

	public static void main(String[] args) {
	
		Cachorro cachorro = new Cachorro("O cachorrooo",7," esta latindoooooo","corre");
		Cavalo cavalo = new Cavalo("O cavalooo",10,"está relinxandooooo","corre");
		Preguiça preguiça = new Preguiça("A preguiçaaa",5,"está bocejaandoooooo","sobe em arvores");
		
		System.out.println("         AÇÂO DOS BICHOS");
	
		List<Animal> list = new ArrayList<>();
		
				list.add(new Cachorro("O cachorroo",7,"esta latindoooooo","corre"));
				list.add(new Cavalo("O cavaloooo",10,"está relinxandooooo","corre"));
				list.add(new Preguiça("A preguiçaaa",5,"está bocejaandoooooo","sobe em arvores"));

				for(Animal animal : list) {
					System.out.println("\n"+animal.getNome()+" "+animal.getSom());
				}

	}
}