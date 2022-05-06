
public class Pessoa {
	String nome;
	int idade;
	double salario;
	boolean temCasaPropria;
	
	public Pessoa() {
		this.nome = "";
		this.idade = 0;
		this.salario = 0;
		this.temCasaPropria = false;
	}
	
	public void imprimir() {
		System.out.println("---------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Salário: " + this.salario);
		System.out.println("Casa própria: " + this.temCasaPropria);
		System.out.println("---------------");
	}

}