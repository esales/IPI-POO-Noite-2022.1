package exercicio01;

public class Estudante extends Pessoa {
	private String matricula;
	
	public Estudante(String nome, String matricula) {
		super(nome);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}