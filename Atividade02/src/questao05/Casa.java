package questao05;

public class Casa extends Imovel {
	private int areaExterna;

	public Casa(String endereco, 
				double valor, 
				boolean financiavel,
				int areaExterna) {
		super(endereco, valor, financiavel);
		this.areaExterna = areaExterna;
	}
	
	
}
