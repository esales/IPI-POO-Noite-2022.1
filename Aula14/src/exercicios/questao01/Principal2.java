package exercicios.questao01;

import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		Funcionario[] lista = new Funcionario[10];
		Scanner scanner = new Scanner(System.in);
		
		String nome = "";
		int idade = 0;
		double salario = 0;
		int indice = 0;
		int qtdFuncionarios = 0;
		double montanteSalario = 0;
		double mediaSalario = 0;
		
		System.out.println("Digite o nome: ");
		nome = scanner.next();
		
		while((!nome.equalsIgnoreCase("fim")) && (indice<10)) {
			System.out.println("Digite a idade: ");
			idade = scanner.nextInt();
			System.out.println("Digite o salario: ");
			salario = scanner.nextDouble();
			
			Funcionario funcionario = new Funcionario(nome, idade, salario);
			
			lista[indice] = funcionario;
			indice++;
			qtdFuncionarios++;
			montanteSalario += salario;
			
			System.out.println("Digite o nome: ");
			nome = scanner.next();
		}
		
		mediaSalario = montanteSalario/qtdFuncionarios;
		
		System.out.println("Quantidade de funcionários: " + qtdFuncionarios);
		System.out.println("Média de salários: " + mediaSalario);
	}
}