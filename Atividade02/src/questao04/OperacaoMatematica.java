package questao04;

public class OperacaoMatematica {
	private int numeroA;
	private int numeroB;
	
	public OperacaoMatematica(int numeroA, int numeroB) {
		this.numeroA = numeroA;
		this.numeroB = numeroB;
	}
	
	public void adicao() {
		int total = numeroA + numeroB;
		System.out.println("Adição: " + total);
		System.out.println();
	}

	public void subtracao() {
		int total = numeroA - numeroB;
		System.out.println("Subtração: " + total);
		System.out.println();
	}
	
	public void exibirNumeros() {
		System.out.println(numeroA);
		System.out.println(numeroB);
		System.out.println();
	}
}