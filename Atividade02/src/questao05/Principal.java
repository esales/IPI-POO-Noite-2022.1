package questao05;

public class Principal {

	public static void main(String[] args) {
		Apartamento apto = new Apartamento("Rua 1", 100000, false, 4);
		
		apto.calcularValorParcela(100);
	}

}
