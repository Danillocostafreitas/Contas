package danillo;

import br.com.caelum.contas.modelo.Conta;

public class MeuPrograma {

	
	
	public static void main (String []args) {
		
			//Criando uma conta
		Conta minhaConta = new Conta();
			minhaConta.setTitular("Danillo");
			minhaConta.setNumero(58784);
			minhaConta.setAgencia("48784-2");
			minhaConta.setSaldo(100);
			System.out.println(minhaConta.getTitular());
			System.out.println(minhaConta.getNumero());
			
			System.out.println(minhaConta.getSaldo());
			
			
			minhaConta.dataDeAbertura = new Data();
			minhaConta.dataDeAbertura.dia = 14;
			minhaConta.dataDeAbertura.mes = 12;
			minhaConta.dataDeAbertura.ano = 2017;
			
			
			
			//chamando os métodos
			minhaConta.saca(100);
			minhaConta.deposita(500);
			minhaConta.calcularRendidmento(0.1);
			
			
			//Criando conta
			Conta c1 = new Conta();
			c1.setTitular("Rafael"); 
		
			c1.setNumero(45679);
			c1.setSaldo(200);
			c1.setAgencia("784-2");
			c1.dataDeAbertura	= new Data();
			c1.dataDeAbertura.dia = 15;
			c1.dataDeAbertura.mes = 12;
			c1.dataDeAbertura.ano = 2017;
			
			System.out.println(c1.getSaldo());
			
			
			
			Conta c2 = c1;
			
			if (c1 == c2) {
				System.out.println("Iguais");
				
			}else {	
				System.out.println("Diferentes");
			}
			
			

				
				
				
				
			
			
		
			
			
		
		
		
	}
	
	
}
