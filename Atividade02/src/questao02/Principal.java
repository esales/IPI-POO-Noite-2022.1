package questao02;

public class Principal {

	public static void main(String[] args) {
		char[] gabarito = new char[5];
		gabarito[0] = 'a';
		gabarito[1] = 'b';
		gabarito[2] = 'a';
		gabarito[3] = 'c';
		gabarito[4] = 'e';
		
		CorrecaoAvaliacao gabaritoOficial = new CorrecaoAvaliacao(gabarito);
		
		char[] resposta1 = new char[5];
		resposta1[0] = 'a';
		resposta1[1] = 'b';
		resposta1[2] = 'a';
		resposta1[3] = 'c';
		resposta1[4] = 'e';
		
		
		char[] resposta2 = new char[5];
		resposta2[0] = 'a';
		resposta2[1] = 'a';
		resposta2[2] = 'a';
		resposta2[3] = 'a';
		resposta2[4] = 'a';
		
		gabaritoOficial.verificarAcertos(resposta1);
		gabaritoOficial.verificarAcertos(resposta2);
	}
}