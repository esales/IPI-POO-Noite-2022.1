
public class Principal {

	public static void main(String[] args) {
		Veiculo veiculo1 = new Veiculo();
		
		VeiculoTerrestre veiculo2 = new VeiculoTerrestre();
		
		Veiculo veiculo3 = new VeiculoTerrestre();
		
		veiculo3 = new VeiculoAereo();
		
		OutraClasse outraclasse = new OutraClasse();
//		outraclasse.testar(veiculo2);
//		outraclasse.testar2(veiculo1);
		
		
		System.out.println(veiculo3 instanceof VeiculoTerrestre);
	}

}
