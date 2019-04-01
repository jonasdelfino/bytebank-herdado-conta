package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributavel {

	public static void main(String[] args) {
		ContaCorrente contaC = new ContaCorrente(222, 333);
		contaC.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto calcula = new CalculadorImposto();
		calcula.registra(contaC);
		calcula.registra(seguro);
		
		System.out.println(calcula.getTotalImposto());
	}

}
