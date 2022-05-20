package exercicioHeranca;

public class Principal {

	public static void main(String[] args) {
		Docente docente = new Docente();
		Discente discente = new Discente();
		
		docente.setNome("Teste");
		docente.setIdade(30);
		docente.setAreaAtuacao("Informática");
		
		System.out.println(docente.getNome());
		
		
		
	}
}