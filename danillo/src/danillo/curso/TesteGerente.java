package danillo.curso;

public class TesteGerente {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		Funcionario funcionario = gerente;
		gerente.setNome("Danillo");
		gerente.setCpf("700.626.291-74");
		gerente.setSalario(5000);
		gerente.setSenha(19662233);
		gerente.autentica(19662233);
		gerente.getBonificacao();
		System.out.println(funcionario.getBonificacao());
		
		
		
		
		
		
	
	
		
	

	}

}
