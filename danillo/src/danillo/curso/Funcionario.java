package danillo.curso;

public class Funcionario {

	private String nome;
	private String cpf;
	protected double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return this.cpf;

	}



	public double getBonificacao() {
		return this.salario*0.10;
		
	}
	
}
