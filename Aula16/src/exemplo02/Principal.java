package exemplo02;

public class Principal {

	public static void main(String[] args) {
		CalculadoraSalario c = new CalculadoraSalario();
		
		Programador p = new Programador();
		EngenheiroCivil e = new EngenheiroCivil();
		
		c.calcular(e);
		
		c.calcular2(p);
		
	}

}
