package exercicioPooClasse;

import java.util.Locale;
import java.util.Scanner;

import exerciciosPoo.ProdutoEletronico;

public class Exercicio03 {

	public static void main(String[] args) {
		/*3) Crie uma classe produto eletrônico e apresente os atributos e
         * métodos referentes esta classe, em seguida crie um objeto produto eletrônico,
         * defina as instancias deste objeto e apresente as informações deste objeto no
         * console.
         */

        Locale.setDefault(Locale.US);
        Scanner kb = new Scanner(System.in);
        ProdutoEletronico produto1 = new ProdutoEletronico();

        System.out.println("Digite o tipo de aparelho eletrônico: ");
        produto1.tipo= kb.next();
        System.out.println("Digite a marca do aparelho eletrônico: ");
        produto1.marca= kb.next();
        System.out.println("Digite o modelo do aparelho eletrônico: ");
        produto1.modelo= kb.next();

        //método
        
        produto1.mostraTipo();
        produto1.mostraMarca();
        produto1.mostraModelo();


        kb.close();

	}

}
