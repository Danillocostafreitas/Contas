package br.com.caelum.contas.modelo;

import danillo.Data;

public class Conta {

	private String titular;
	private int numero;
	private  String agencia;
	protected  double saldo;
	Data dataDeAbertura;

	public String getTipo() {
		return "Conta";
	}
	
	public void saca (double quantidade) {
		
		this.saldo-= quantidade;
		
		System.out.println("O saldo é: " + saldo );

	}
	
	public void deposita (double quantidade) {
		
		this.saldo += quantidade;
		
		System.out.println("O saldo é: " +saldo);
	}
	
	public void calcularRendidmento(double taxa) {
		
		 double novoSaldo = this.saldo * taxa;
		 saldo +=novoSaldo;
		System.out.println("O saldo é: " +saldo);
	}
		
	public void setTitular(String titular) {
			this.titular = titular;
	}
	public String getTitular() {
		
		return this.titular;
	}
	
	
	public void setNumero (int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getAgencia() {
		
		return this.agencia;
	}
	
	public void setSaldo(double valor) {
		this.saldo = valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void trasnfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
	public String toString () {
		return "[titular=" + titular + ", numero=" + numero + ", agencia = " +agencia +"]";
	}
	
		//void recuperarDadosParaImpressao() {
	//System.out.println();
	//System.out.println("--------------------");
	//System.out.println("O nome do titular: " +titular);
	//System.out.println("--------------------");
	//System.out.println("O numero da Agencia: " +agencia);
	//System.out.println("--------------------");
	//System.out.println("O numero da Conta: " +numero);
	//System.out.println("--------------------");
	//	System.out.println("O seu saldo é: " +saldo);
			//	System.out.println("--------------------");
		//}
		
		
}
		
		
//}
