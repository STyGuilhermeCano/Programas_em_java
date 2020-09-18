package entidades;

public class Animal {

	private String nome;
	private int idade;
	private String som;
	private String ação;
	// constructor
	public Animal(String nome,int idade,String som,String ação) {
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.ação = ação;
	}
	// gets and sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getAção() {
		return ação;
	}

	public void setAção(String ação) {
		this.ação = ação;
	}
	
	
	
}
