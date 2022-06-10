package questao03;

public class ControleTexto {
	private String texto;
	
	public ControleTexto(String texto) {
		this.texto = texto;
	}
	
	public void atualizar(String texto) {
		this.texto = texto;
	}
	
	public void concatenar(String texto) {
		this.texto = this.texto + texto;
		
	}
	
	public void exibir() {
		System.out.println("Texto: " + texto);
	}
}