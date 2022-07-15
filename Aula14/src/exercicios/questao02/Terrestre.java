package exercicios.questao02;

public class Terrestre extends Animal {
	private boolean consegueNadar;
	
	public Terrestre(String nome, int numeroPatas, boolean consegueNadar) {
		super(nome, numeroPatas);
		this.consegueNadar = consegueNadar;
	}

	public boolean isConsegueNadar() {
		return consegueNadar;
	}

	public void setConsegueNadar(boolean consegueNadar) {
		this.consegueNadar = consegueNadar;
	}
}