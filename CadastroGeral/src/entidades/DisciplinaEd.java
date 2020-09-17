package entidades;

public class DisciplinaEd
{
	public String nomeDisciplina;
	public int nivelDisciplina;
	
	
	//construtores
	
	public DisciplinaEd(String nomeDisciplina, int nivelDisciplina) {
		
		this.nomeDisciplina = nomeDisciplina;
		this.nivelDisciplina = nivelDisciplina;
	}
	
	//seguranças
	
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public int getNivelDisciplina() {
		return nivelDisciplina;
	}

	public void setNivelDisciplina(int nivelDisciplina) {
		this.nivelDisciplina = nivelDisciplina;
	}

	
	
	
	
	
	

}