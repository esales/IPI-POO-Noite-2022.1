
public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private double salario;
	private int idade;
	
	public Pessoa(String nome, String sobrenome, double salario, int idade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
		this.idade = idade;
	}
	
	public void imprimirNomeCompleto() {
		String nomeCompleto = nome + " " + sobrenome;
		System.out.println(nomeCompleto);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
