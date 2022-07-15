package exercicios.questao01;

public class Principal {

	public static void main(String[] args) {
		Funcionario[] lista = new Funcionario[10];
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		
		f1.setNome("Teste f1");
		f1.setIdade(35);
		f1.setSalario(2500);
		
		f2.setNome("Teste f2");
		f2.setIdade(20);
		f2.setSalario(2000);
		
		f3.setNome("Teste f3");
		f3.setIdade(28);
		f3.setSalario(1800);
		
		lista[0] = f1;
		lista[1] = f2;
		lista[2] = f3;
		
		f1.setNome("123");
		
		System.out.println(lista[0].getNome());
		System.out.println(lista[1].getNome());
		System.out.println(lista[2].getNome());

	}
}