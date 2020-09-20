package entidades;

public class Animal {

	private String nome;
	private int idade;
	
		// constructor
		public Animal(String nome,int idade) {
			this.nome = nome;
			this.idade = idade;	
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

}
