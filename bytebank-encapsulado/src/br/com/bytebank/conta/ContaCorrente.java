package br.com.bytebank.conta;

import java.util.InputMismatchException;
import br.com.bytebank.cliente.Cliente;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero, Cliente cliente) {
		

		super(agencia,numero,cliente);
	

	}
	@Override
	public boolean transfere(double valor, Conta destino) {
		double saldo = this.getSaldo();
		if (saldo >= valor) {
			saldo -= (valor + 0.25);
			this.deposito(saldo);
			destino.deposito(valor);
			return true;
		} else {
			return false;
		}
	}

}
