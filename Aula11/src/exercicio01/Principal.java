package exercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Estudante[] estudantes = new Estudante[10];
		Docente[] docentes = new Docente[10];
		int opcao = 0;
		String nome = "";
		String matricula = "";
		String siape = "";
		Estudante estudante = null;
		Docente docente = null;
		int iEstudante = 0;
		int iDocente = 0;
		
		System.out.println("1-Cadastrar estudante");
		System.out.println("2-Cadastrar docente");
		System.out.println("3-Listar estudantes");
		System.out.println("4-Listar docentes");
		System.out.println("5-Listar todos");
		System.out.println("9-Finalizar");
		System.out.print("Opção: ");
		opcao = scanner.nextInt();
		
		while(opcao!=9) {
			switch(opcao) {
				case 1: System.out.println();
						System.out.println("Cadastro de estudante");
						System.out.println("Digite o nome: ");
						nome = scanner.next();
						System.out.println("Digite a matrícula:");
						matricula = scanner.next();
						System.out.println();
						estudante = new Estudante(nome, matricula);
						estudantes[iEstudante] = estudante;
						iEstudante++;
						break;
				
				case 2: System.out.println();
						System.out.println("Cadastro de docente");
						System.out.println("Digite o nome: ");
						nome = scanner.next();
						System.out.println("Digite o siape:");
						siape = scanner.next();
						System.out.println();
						docente = new Docente(nome, siape);
						docentes[iDocente] = docente;
						iDocente++;
						break;
				
				case 3: System.out.println();
						System.out.println("Lista de estudantes");
						for(Estudante est:estudantes) {
							if (est != null)
								System.out.println(est.getMatricula() + " - " + est.getNome());
						}
						System.out.println();
						break;
						
				case 4: System.out.println();
						System.out.println("Lista de docentes");
						for(Docente doc:docentes) {
							if (doc != null)
								System.out.println(doc.getSIAPE() + " - " + doc.getNome());
						}
						System.out.println();
						break;
						
				case 5: System.out.println();
						System.out.println("Listar todos");
						for(Estudante est:estudantes) {
							if (est != null)
								System.out.println(est.getMatricula() + " - " + est.getNome());
						}
						for(Docente doc:docentes) {
							if (doc != null)
								System.out.println(doc.getSIAPE() + " - " + doc.getNome());
						}
						System.out.println();
			}
			System.out.println();
			System.out.println("1-Cadastrar estudante");
			System.out.println("2-Cadastrar docente");
			System.out.println("3-Listar estudantes");
			System.out.println("4-Listar docentes");
			System.out.println("5-Listar todos");
			System.out.println("9-Finalizar");
			System.out.print("Opção: ");
			opcao = scanner.nextInt();
			System.out.println();
		}
	}
}