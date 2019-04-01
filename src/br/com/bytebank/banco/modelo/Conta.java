package br.com.bytebank.banco.modelo;


/**
 * Classe representa a moldura de uma conta, seja 
 * poupan�a, corrente e etc
 * 
 * @author jonas.ferreira
 *
 */

public abstract class Conta {
		 //ATRIBUTOS
		protected double saldo;
		private int agencia;
		private int numero;
		private Cliente titular;
		private static int total = 0;
		
		
		/**
		 * Construtor para inicializar o objeto Conta a partir da
		 * agencia e do n�mero da conta
		 * 
		 * @param agencia
		 * @param numero
		 */
		public Conta(int agencia, int numero) {
			Conta.total++;
			//System.out.println("O total de conta � " + Conta.total);
			this.agencia = agencia;
			this.numero = numero;
//			this.saldo = 100;
			//System.out.println("Estou criando uma conta " + this.numero);
		}

		public abstract void deposita(double valor);
		
		/**
		 * Valor precisa ser maior do que o saldo  
		 * 
		 * @param valor
		 * @throws SaldoInsuficienteException
		 */
		public void saca(double valor) throws SaldoInsuficienteException{
			
			if(this.saldo < valor) {
				throw new SaldoInsuficienteException("Saldo: " + this.saldo  + ", valor: " + valor);
			} 
				this.saldo -= valor;
		}
		
		public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
			this.saca(valor);
				destino.deposita(valor);
		}
		
		public double getSaldo() {
			return this.saldo;
		}
		
		public int getNumero() {
			return this.numero;
		}
		
		public void setNumero(int numero) {
			if(numero <= 0) {
				System.out.println("N�o pode valor menor <= 0");
				return;
			}
			this.numero = numero;
		}
		
		public int getAgencia() {
			return this.agencia;
		}
		
		public void setAgencia(int agencia) {
			if(agencia <= 0) {
				System.out.println("N�o pode valor menor igual a 0");
				return;
			}
			this.agencia = agencia;
		}
		
		public Cliente getTitular() {
			return titular;
		}
		
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		
		public static int getTotal() {
			return Conta.total;
		}
		
		@Override
		public boolean equals(Object ref) {
			
			Conta outra = (Conta) ref;
			
			if(this.agencia != outra.agencia) {
				return false;
			}
			
			if(this.numero != outra.numero) {
				return false;
			}
			
			return true;

		}
		
		@Override
		public String toString() {
			return "N�mero: " + this.numero + ", Ag�ncia: " + this.agencia;
		}
		
		
}