package exemplo01;

public class Principal {

	public static void main(String[] args) {

		Moto moto = new Moto();
		
		moto.frear();
		
		moto.acelerar();
		
		Automovel automovel = new Automovel();
		automovel.frear();
		automovel.acelerar();
		
		Barco barco = new Barco();
		
		//VeiculoAquatico v1 = new VeiculoAquatico();
		
	}
}