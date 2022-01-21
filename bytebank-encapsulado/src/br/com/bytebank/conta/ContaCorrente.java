package br.com.bytebank.conta;
public class ContaCorrente extends Conta {
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	@Override
	public boolean transfere(double valor, Conta destino) {
		double saldo = this.getSaldo();
		if (saldo >= valor){
			saldo -= (valor+0.25);
			this.deposito(saldo);
			destino.deposito(valor);
			return true;
		}else {
			return false;
		}
	}
	
}
