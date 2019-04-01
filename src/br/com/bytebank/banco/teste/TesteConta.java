package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteConta {

	public static void main(String[] args) throws SaldoInsuficienteException{
		//Full Qualified Name FQN
		ContaCorrente contaCorrente = new ContaCorrente(111, 223);
		contaCorrente.deposita(100.0);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(333, 445);
		contaPoupanca.deposita(200.0);
		
		contaCorrente.transfere(10.0, contaPoupanca);
		
		System.out.println("Conta Corrente: " + contaCorrente.getSaldo());
		System.out.println("Conta Poupança: " + contaPoupanca.getSaldo());
	}

}
