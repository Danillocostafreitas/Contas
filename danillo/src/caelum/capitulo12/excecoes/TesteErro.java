package caelum.capitulo12.excecoes;

import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteErro {

	public static void main(String[] args) {

		System.out.println("INICIO MAIN");
		try {
		metodo();
		} catch (NullPointerException e) {
			System.out.println("erro: " +e);
		}
		
		System.out.println("fIM DO MAIN");
	}

	static void metodo() {
		System.out.println("INICIO METODO1");
		
		metodo2();
		
		System.out.println("FIM DO METODO1");
	}

	static void metodo2() {
		System.out.println("INICIO DO METODO2");
		ContaCorrente cc = new ContaCorrente();

		for (int i = 0; i <= 15; i++) {

			cc.deposita(i + 1000);
			System.out.println(cc.getSaldo());
			if (i == 5) {
				cc = null;
			}

		}

	}
}
