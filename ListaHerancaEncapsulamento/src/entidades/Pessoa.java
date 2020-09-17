package entidades;					/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com
 									seus respectivos seletores (getters) e modificadores (setters), e ainda
 									 o construtor padrão e pelo menos mais duas opções de construtores 
 									 conforme sua percepção. Atributos: String nome;*  String endereço; 
 									 String telefone; */
public class Pessoa {

		private String nome;
		private	String endereço;
		private	String telefone;
		private int    anoNasc;
		private char   sexo;
		
		// construtores
		
		public Pessoa(String nome) {
			super();
			this.nome = nome;
		}		
		
		public Pessoa(String nome,String endereço) {
			super();
			this.nome = nome;
			this.endereço = endereço;
		}

		public Pessoa(String nome, String endereço, String telefone) {
			super();
			this.nome = nome;
			this.endereço = endereço;
			this.telefone = telefone;
		}

		public Pessoa(String nome, String endereço, String telefone, int anoNasc) {
			super();
			this.nome = nome;
			this.endereço = endereço;
			this.telefone = telefone;
			this.anoNasc = anoNasc;
		}

		public Pessoa(String nome, String endereço, String telefone, int anoNasc, char sexo) {
			super();
			this.nome = nome;
			this.endereço = endereço;
			this.telefone = telefone;
			this.anoNasc = anoNasc;
			this.sexo = sexo;
		}

		
		// seguranças
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEndereço() {
			return endereço;
		}

		public void setEndereço(String endereço) {
			this.endereço = endereço;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public int getAnoNasc() {
			return anoNasc;
		}

		public void setAnoNasc(int anoNasc) {
			this.anoNasc = anoNasc;
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			this.sexo = sexo;
		}		
		

		
}
