package estudando.construtor;

public class Conta {
	
	private static int totalDeContas;
			
			Conta (){
				
				Conta.totalDeContas = Conta.totalDeContas +1;
		
				int total = Conta.getTotalDeContas();
				
				System.out.println(total);  
			}
	
			public static int getTotalDeContas() {
				
				return  Conta.totalDeContas;
				
				
			}
			
		}
	
	
	

