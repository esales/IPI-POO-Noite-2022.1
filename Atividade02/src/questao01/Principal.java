package questao01;

public class Principal {

	public static void main(String[] args) {
		ControleAssentos controle = new ControleAssentos(10);
		
		controle.ocuparAssento(2);
		controle.ocuparAssento(2);
		controle.exibirListaAssentos();
		controle.desocuparAssento(2);
		controle.desocuparAssento(2);
		controle.exibirListaAssentos();
	}

}
