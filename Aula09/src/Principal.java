

public class Principal {

	public static void main(String[] args) {
		VeiculoTerrestre veiculo = new VeiculoTerrestre();
		
		veiculo.setMarca("Honda");
		System.out.println(veiculo.getMarca());
		
		VeiculoAereo va = new VeiculoAereo();
		va.setMarca("Teste");
		va.setNumeroTurbinas(4);
		
		System.out.println(va.getMarca());
		System.out.println(va.getNumeroTurbinas());
	}
}