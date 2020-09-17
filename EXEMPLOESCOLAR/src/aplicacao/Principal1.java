package aplicacao;

import java.util.Scanner;

import entidades.Aluno;

public class Principal1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		double mediaEscola;
		
		System.out.println("SISTEMA DE CONTROLE ESCOLA EM JAVA - POO ");
		
		System.out.print("\nDIGITE O NOME DO ALUNO: ");
		aluno1.nomeAluno = kb.next().toUpperCase();
		System.out.println("BEM VINDO: "+aluno1.nomeAluno);
		
		System.out.print("\nQUAL É O SEU SEXO ? [M/F] ");
		aluno1.sexoAluno = kb.next().toUpperCase().charAt(0);
		aluno1.mostraSexo();
		
		System.out.print("\n\nEM QUAL ANO VOCÊ NASCEU ? ");
		aluno1.anoNascimentoAluno = kb.nextInt();
		aluno1.mostraIdade();
		
		System.out.print("\n\nQUAL É A MÉDIA DA ESCOLA ? ");
		aluno1.mediaEscola = kb.nextDouble();
		
		
		System.out.println("\nDIGITE SUAS NOTAS");
		for (int i=0;i<4;i++) {
			System.out.printf("digite  %d° nota: ",i+1);
			aluno1.notas[i] = kb.nextDouble();
		}
		
		aluno1.mostraMedia();
		

	}

}
