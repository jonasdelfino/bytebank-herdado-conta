package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeRefencias {

	public static void main(String[] args) {

		
			GuardadorDeContas guardador = new GuardadorDeContas();

			Conta cc = new ContaCorrente(11, 22);
			guardador.adiciona(cc);
			
			Conta cc2 = new ContaCorrente(11, 44);
			guardador.adiciona(cc2);
			
			Conta cc3 = new ContaCorrente(11, 66);
			guardador.adiciona(cc3);
			
			int tamanho = guardador.getQuantidadeDeElementos();
			System.out.println(tamanho);
			
			Conta ref = (Conta) guardador.getReferencia(1);
			System.out.println(ref.getNumero());
	}

}
