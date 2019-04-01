package br.com.bytebank.banco.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(11, 22);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(11, 33);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(11, 55);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(11, 66);
		lista.add(cc4);
		
		System.out.println("Tamanho" + lista.size());
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho" +lista.size());
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("-----------------");
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
		
	}

}
