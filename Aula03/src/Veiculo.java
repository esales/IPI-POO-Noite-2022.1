
public class Veiculo {

	String cor;
	int velocidade;
	int numeroRodas;
	
	void acelerar(int incremento) {
		if(velocidade + incremento <= 220) {
			velocidade += incremento;
		}
	}
}