package questao05;

public class Imovel {
	private String endereco;
	private double valor;
	private boolean financiavel;
	
	public Imovel(String endereco, double valor, boolean financiavel) {
		this.endereco = endereco;
		this.valor = valor;
		this.financiavel = financiavel;
	}
	
	public void calcularValorParcela(int meses) {
		if (this.financiavel) {
			double valorParcela = this.valor/meses;
			System.out.println(meses + " parcelas de R$ " + valorParcela);
		} else {
			System.out.println("O imóvel não é financiável.");
		}
	}
	
	
}
