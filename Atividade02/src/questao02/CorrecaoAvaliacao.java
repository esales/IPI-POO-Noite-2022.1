package questao02;

public class CorrecaoAvaliacao {
	private char[] gabaritoOficial;
	
	public CorrecaoAvaliacao(char[] gabarito) {
		this.gabaritoOficial = gabarito;
	}
	
	public void verificarAcertos(char[] folhaResposta) {
		int qtdAcertos = 0;
		
		for(int i=0; i<=gabaritoOficial.length-1; i++) {
			if(gabaritoOficial[i] == folhaResposta[i])
				qtdAcertos++;
		}
		
		System.out.println("Número de acertos: " + qtdAcertos);
	}
}