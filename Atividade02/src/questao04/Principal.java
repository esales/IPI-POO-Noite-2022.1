package questao04;

public class Principal {

	public static void main(String[] args) {
		OperacaoMatematica operacao = new OperacaoMatematica(1, 5);
		
		operacao.adicao();
		
		operacao.subtracao();
		
		operacao.exibirNumeros();
	}

}
