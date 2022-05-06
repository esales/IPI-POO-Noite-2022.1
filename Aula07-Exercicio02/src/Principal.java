import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pessoa[] pessoas = new Pessoa[3];
		String nome = "";
		String sobrenome = "";
		int idade = 0;
		double salario = 0;
		
		int maiorIdade = -1;
		int menorIdade = 200;
		
		Pessoa pessoaMaiorIdade = null;
		Pessoa pessoaMenorIdade = null;
		
		int qtdSalarioMaior = 0;
		
		
		for(int i=0; i<=pessoas.length-1; i++) {
			System.out.println("Digite o nome: ");
			nome = scanner.next();
			
			System.out.println("Digite o sobrenome: ");
			sobrenome = scanner.next();
			
			System.out.println("Digite a idade: ");
			idade = scanner.nextInt();
			
			System.out.println("Digite o salário: ");
			salario = scanner.nextDouble();
			
			pessoas[i] = new Pessoa(nome, sobrenome, salario, idade);
			
			if (pessoas[i].getIdade() > maiorIdade) {
				maiorIdade = pessoas[i].getIdade();
				
				pessoaMaiorIdade = pessoas[i];
				
			}
			
			if(pessoas[i].getIdade() < menorIdade) {
				menorIdade = pessoas[i].getIdade();
				
				pessoaMenorIdade = pessoas[i];
			}
			
			if(pessoas[i].getSalario() > 2000)
				qtdSalarioMaior++;
		}
		
		System.out.println("Maior idade: " + pessoaMaiorIdade.getNome());
		System.out.println("Menor idade: " + pessoaMenorIdade.getNome());
		System.out.println("Total +2000: " + qtdSalarioMaior);
		
		
		System.out.println("Lista de pessoas cadastradas");
		for(Pessoa pessoa:pessoas) {
			System.out.println(pessoa.getNome());
		}
	}
}
