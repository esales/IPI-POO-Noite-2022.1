
public class Veiculo {

	String cor;
	int velocidade;
	int numeroRodas;
	boolean temArCondicionado;
	
	public Veiculo() {
		this.cor = "";
		this.numeroRodas = 4;
		this.velocidade = 0;
		this.temArCondicionado = false;
	}
	
	void acelerar(int incremento) {
		if(velocidade + incremento <= 220) {
			velocidade += incremento;
		} else {
			velocidade = 220;
		}
	}
	
	void frear(int decremento) {
		if (velocidade - decremento >= 0) {
			velocidade -= decremento;
		} else {
			velocidade = 0;
		}
	}
}