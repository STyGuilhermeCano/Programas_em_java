package aplicacao;



import entidades.Aluno;
import entidades.Disciplina;
import entidades.Pessoa;
import entidades.Professor;

public class Cadastro {
	
	public static void main(String[] args)
	{
		
		Pessoa fulano = new Pessoa("joão");
		Pessoa sicrano = new Pessoa("Xururu",'F');
		Aluno novoAluno = new Aluno("Paulo",'m',2000,"branco","turma 8");
		Professor novoProfessor = new Professor("Luiza","moduo2");
		Disciplina disciplinaTeste = new Disciplina("Portugues", 1);
		Disciplina disciplinaTeste1 = new Disciplina("ingles", 5);
		
		
	
		
		
		System.out.println(novoProfessor.getNome() +" "+novoProfessor.getMateriaLecioada());
	
	}
}