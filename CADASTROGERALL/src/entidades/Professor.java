package entidades;

public class Professor extends Pessoa {

	
	private String materiaLecioada;

	public Professor(String nome, String materiaLecioada) {
		super(nome);
		this.materiaLecioada = materiaLecioada;
	}

	public String getMateriaLecioada() {
		return materiaLecioada;
	}

	public void setMateriaLecioada(String materiaLecioada) {
		this.materiaLecioada = materiaLecioada;
	}
	
	
	
	
	
	
	
	
	
}
