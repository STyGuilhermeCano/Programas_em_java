package entidades;

	public class Aluno {
		// atributos da classe
		public String nomeAluno;
		public int anoNascimentoAluno;
		public char sexoAluno;
		public char turmaAluno;	
		public double notas[] = new double[4];
		public double media;
		public double mediaEscola;
		
		
		
		
		//metodos
		
		public void mostraSexo() {
			if(sexoAluno == 'M') {
				System.out.printf("O SEXO DE %s � MASCULINO  ", nomeAluno);
			}
			else if(sexoAluno == 'F') {
				System.out.printf("O SEXO DE %s � FEMININO ", nomeAluno);
			}
		}
		
		public void mostraIdade() {
			System.out.printf("VOC� TEM: %d ANOS DE IDADE",(2020-anoNascimentoAluno));
		}
		
		
		public void mostraMedia() {
			media = ((notas[0]+notas[1]+notas[2]+notas[3])/4);
		
			
			if(media >= mediaEscola) {
				System.out.printf("APROVADO COM MEDIA %.2f ", media);
			}
			else {
				System.out.printf("REPROVADO COM M�DIA %.2f ",media);
				this.mediaEscola = media;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

	
	
	
	
