import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int primeiroNumero = 0;
		int segundoNumero = 0;
		int soma = 0;
		
		System.out.println("Digite o primeiro n�mero: ");
		primeiroNumero = scanner.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		segundoNumero = scanner.nextInt();
		
		soma = primeiroNumero + segundoNumero;
		
		System.out.println("A soma foi " + soma + "");
		
		

	}

}
