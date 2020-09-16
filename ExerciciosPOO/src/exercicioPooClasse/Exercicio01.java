package exercicioPooClasse;

import java.util.Locale;
import java.util.Scanner;

import exerciciosPoo.Cliente;

public class Exercicio01 {

	public static void main(String[] args) {
		/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
		 * esta classe, em seguida crie um objeto cliente, defina as instancias deste
		 * objeto e apresente as informações deste objeto no console.
		 */
   Locale.setDefault(Locale.US); 
   Scanner kb = new Scanner(System.in);

   Cliente cliente1 = new Cliente();

   System.out.println("Digite o seu nome: ");
   cliente1.nomeCliente=kb.next().toUpperCase();
   kb.nextLine();
   System.out.println("Digite a sua idade: ");
   cliente1.idadeCliente=kb.nextInt();
   kb.nextLine();
   System.out.println("Digite o seu sexo [F/M]: ");
   cliente1.sexoCliente=kb.next().toUpperCase().charAt(0);
   kb.nextLine();

   //métodos

   cliente1.mostraidadeCliente();
   cliente1.mostraSexo();


   kb.close();
		
		
		
		
	}

}
