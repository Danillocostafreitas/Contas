package danillo.curso;

public class Gerente extends Funcionario {

	private double senha;
	private int numeroDeFuncionariosGerenciados;

	public double getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido");
			return true;
		} else {
			System.out.println("Senha Incorreta, digite novamente");
			return false;
		}
	}

	public double getBonificacao() {
		return this.salario* 0.15;

	}

}
