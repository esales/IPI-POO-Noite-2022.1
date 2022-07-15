package exercicios.questao02;

public class Aquatico extends Animal {
	private String tipoRespiracao;
	
	public Aquatico(String nome, int numeroPatas, String tipoRespiracao) {
		super(nome, numeroPatas);
		this.tipoRespiracao = tipoRespiracao;
	}

	public String getTipoRespiracao() {
		return tipoRespiracao;
	}

	public void setTipoRespiracao(String tipoRespiracao) {
		this.tipoRespiracao = tipoRespiracao;
	}
}