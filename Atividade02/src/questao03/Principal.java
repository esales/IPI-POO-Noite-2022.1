package questao03;

public class Principal {

	public static void main(String[] args) {
		ControleTexto controle = new ControleTexto("IFPE");
		
		controle.exibir();
		
		controle.atualizar("Instituto");
		controle.exibir();
		
		controle.concatenar(" Federal");
		controle.exibir();
	}

}
