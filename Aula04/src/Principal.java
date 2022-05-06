
public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.imprimir();
		
		pessoa.nome = "Teste";
		pessoa.idade = 25;
		pessoa.salario = 1000;
		pessoa.temCasaPropria = true;
		
		pessoa.imprimir();
		
		pessoa.idade = 40;
		pessoa.imprimir();
	}

}
