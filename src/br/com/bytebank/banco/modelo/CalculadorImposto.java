package br.com.bytebank.banco.modelo;

//br.com.bytebank.banco.modelo.CalculadorImposto => FQN
public class CalculadorImposto{

	private double totalImposto;
	
	//Todos que implementarem a interface Tributavel
	//podem ser utilizados, por meio deste método.
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}

	public double getTotalImposto() {
		return totalImposto;
	}
}
 