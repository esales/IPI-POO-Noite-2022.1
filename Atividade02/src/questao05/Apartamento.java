package questao05;

public class Apartamento extends Imovel {
	private int andar;
	
	public Apartamento(String endereco, 
					   double valor, 
					   boolean financiavel, 
					   int andar) {
		super(endereco, valor, financiavel);
		this.andar = andar;
	}
	
	

}
