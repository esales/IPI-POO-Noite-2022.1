package exemplo02;

public class CalculadoraSalario {
	
	public void calcular(Funcionario funcionario) {
		
		if (funcionario instanceof Programador) {
			System.out.println("Programador");
		} else if (funcionario instanceof AnalistaSistemas) {
			System.out.println("Analista de Sistemas.");
		} else {
			System.out.println("Engenheiro Civil.");
		}
	}
	
	public void calcular2(ProfissionalTI p) {
		
	}
}