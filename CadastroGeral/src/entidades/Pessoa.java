package entidades;

public class Pessoa {

	// atributos
	private String nome; 
	private char sexo; 
	private int anoNasc;
	private String etnia;
	
	
	
	
	public Pessoa () {
		
	}
	
	// construtor
	public Pessoa(String nome) {
		this.nome= nome;
	}
	
	// sobrecarga
	public Pessoa(String nome, int anoNasc) {
		this.nome = nome;
		this.anoNasc = anoNasc;
	}
	
	public Pessoa(String nome, char sexo, int anoNasc) {
		
		this.nome = nome; this.sexo = sexo;	this.anoNasc = anoNasc;
	}

	public Pessoa (String nome, char sexo, int anoNasc, String etnia) {
		this.nome = nome; this.sexo = sexo; 
		this.anoNasc = anoNasc; this.etnia = etnia;
	}

			//seguranças
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public char getsexo() {
		return sexo;
	}

	public void setsexo(char sexo) {
		this.sexo = sexo;
	}
	
	

	
	
	
	
}
