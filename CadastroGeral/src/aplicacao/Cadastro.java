package aplicacao;

import entidades.Diciplina;
import entidades.Pessoa;

public class Cadastro {

	public static void main(String[] args) {
		
		
		
		
		Pessoa teste = new Pessoa();
		Pessoa teste1 = new Pessoa("José");
		Pessoa teste2 = new Pessoa("pedro",1980);
		Pessoa teste3 = new Pessoa("João", 'm', 1991);
		Pessoa teste4 = new Pessoa("Julio", 'm', 1991, "negro");
				
		
		Diciplina disciplinaTeste = new Diciplina("ingles",4);
		
	
		System.out.println(teste3.getNome()+" "+teste3.getsexo());
		teste3.setsexo('f'); 
		System.out.println(teste3.getNome()+" "+teste3.getsexo());
	}

}
