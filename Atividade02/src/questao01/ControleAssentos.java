package questao01;

public class ControleAssentos {
	private boolean[] assentos;
	
	public ControleAssentos(int qtdAssentos){
		assentos = new boolean[qtdAssentos];
	}
	
	public void ocuparAssento(int numeroAssento) {
		
		if (assentos[numeroAssento])
			System.out.println("*** Assento já ocupado. ***");
		else
			assentos[numeroAssento] = true;
	}
	
	public void desocuparAssento(int numeroAssento) {
		if(assentos[numeroAssento])
			assentos[numeroAssento] = false;
		else
			System.out.println("*** Assento já está desocupado. ***");
		
	}
	
	public void exibirListaAssentos() {
		String situacao;
		
		for(int i=0; i<=assentos.length-1; i++) {
			situacao = "desocupado";
			
			if (assentos[i])
				situacao = "ocupado";
			
			System.out.println("Assento " + i + ": " + situacao);
		}
		
		System.out.println();
	}
}