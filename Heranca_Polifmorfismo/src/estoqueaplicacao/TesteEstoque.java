package estoqueaplicacao;

import java.util.ArrayList;
import java.util.Collection;

public class TesteEstoque {

	public static void main(String[] args) {
	
		
		System.out.println("Brazilian Food List --->\n");
		Collection<String> Estoque = new ArrayList(); // list one 
		// add items at the list
		Estoque.add("Arroz");      		
		Estoque.add("Feijao");    
		Estoque.add("Farofa");    
		Estoque.add("Macarrao");  
		// printing the list
		System.out.println(Estoque); 
		System.out.println();
		// Removing one name
		System.out.println("Removing item -->");
		Estoque.remove("Arroz");  // removing item
		// reprinting the list
		System.out.println(Estoque); 
		
		// updating the list
		// printing a list into an other list
		System.out.println("\nAdding items -->");
		Collection<String> Estoque2 = new ArrayList(); // list two
		// add items at the new list 
		Estoque2.add("Carne");   
		Estoque2.add("Frango");  
		Estoque2.add("Coração"); 
		
		Estoque.addAll(Estoque2);// putting a list into an other list
		
		System.out.println(Estoque); // printing a list into an other list
		
	}

}
