import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		
		System.out.println(veiculo.velocidade);
		
		veiculo.acelerar(50);
		
		System.out.println(veiculo.velocidade);
		
		veiculo.acelerar(100);
		
		System.out.println(veiculo.velocidade);
		
		veiculo.acelerar(70);
		
		System.out.println(veiculo.velocidade);
		
		veiculo.acelerar(10);
		
		System.out.println(veiculo.velocidade);
		
		
		
	}
}