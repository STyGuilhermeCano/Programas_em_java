package entidades;

public class PessoaEd {
		
		private String nome;
		private char   sexo;
		private int    anoNasc;
		private String etnia;
		
		// contrutores 
		
		public PessoaEd(String nome) {
			this.nome = nome;
		}

		public PessoaEd(String nome, char sexo) {
			
			this.nome = nome;
			this.sexo = sexo;
		}

		public PessoaEd(String nome, char sexo, int anoNasc) {
			
			this.nome = nome;
			this.sexo = sexo;
			this.anoNasc = anoNasc;
		}

		public PessoaEd(String nome, char sexo, int anoNasc, String etnia) {
			
			this.nome = nome;
			this.sexo = sexo;
			this.anoNasc = anoNasc;
			this.etnia = etnia;
		}

		
		//seguranças
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			this.sexo = sexo;
		}

		public int getAnoNasc() {
			return anoNasc;
		}

		public void setAnoNasc(int anoNasc) {
			this.anoNasc = anoNasc;
		}

		public String getEtnia() {
			return etnia;
		}

		public void setEtnia(String etnia) {
			this.etnia = etnia;
		}
		
		
		
		
}