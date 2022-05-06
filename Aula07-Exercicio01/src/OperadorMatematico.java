public class OperadorMatematico {
	private int numeroA;
	private int numeroB;
	
	public OperadorMatematico(int numeroA, int numeroB) {
		this.numeroA = numeroA;
		this.numeroB = numeroB;
	}
	
	public void adicionar() {
		System.out.print("Adição: ");
		System.out.println(numeroA + numeroB);
	}
	
	public void subtrair() {
		System.out.print("Subtração: ");
		System.out.println(numeroA - numeroB);
	}
	
	public void exibirNumeros() {
		System.out.println("NumeroA: " + numeroA);
		System.out.println("NumeroB: " + numeroB);
	}
	

}
