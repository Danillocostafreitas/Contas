package danillo.aula04;

public class MeuPrograma {

	public static void main(String[] args) {
		
		
		Conta conta = new Conta("danillo");
		System.out.println(conta.nome);
		conta.numero = 123;
		conta.saldo = 200;
		conta.dataDeAberturaConta = new Data();
		conta.dadosTelefone = new Telefone();
		conta.dadosTelefone.numero ="982674902";
		conta.dadosTelefone.dd = "061";
		conta.dadosTelefone.tipo = "Celular";
		
		
		conta.dataDeAberturaConta.dia =17;
		conta.dataDeAberturaConta.mes = 12;
		conta.dataDeAberturaConta.ano = 2017;
		System.out.println(conta.nome);
		System.out.println(conta.numero);
		System.out.println(conta.saldo);
		
		conta.dataDeAberturaConta.ImpressaoData();
		conta.dadosTelefone.ImpressaoDadosTelefone();
		
		
		
		Conta conta1 = new Conta("Cecilia");
		conta1.dataDeAberturaConta = new Data();
		conta1.numero = 457;
		conta1.saldo = 157;
		conta.dataDeAberturaConta.dia = 15;
		conta.dataDeAberturaConta.mes = 12;
		conta.dataDeAberturaConta.ano = 2017;
		conta.dataDeAberturaConta.ImpressaoData();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		

	}

}
