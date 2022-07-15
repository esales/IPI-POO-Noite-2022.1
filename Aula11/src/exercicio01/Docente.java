package exercicio01;

public class Docente extends Pessoa {
	private String siape;
	
	public Docente(String nome, String siape) {
		super(nome);
		this.siape = siape;
	}

	public String getSIAPE() {
		return siape;
	}

	public void setSIAPE(String sIAPE) {
		siape = sIAPE;
	}
}