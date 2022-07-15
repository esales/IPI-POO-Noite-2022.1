package exercicios.questao02;

public class Animal {
	private String nome;
	private int numeroPatas;
	
	public Animal(String nome, int numeroPatas) {
		super();
		this.nome = nome;
		this.numeroPatas = numeroPatas;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroPatas() {
		return numeroPatas;
	}
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	
	
}
