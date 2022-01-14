
public abstract class  Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; // cria uma variavel do objeto.
	private static int total = 0; // cria uma variavel da classe conta.

	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		if (agencia <= 0) {
			System.out.println("Voce não pode iniciar uma conta com este numero de agencia!");
			return;
		}
		this.numero = numero;
		if (numero <= 0) {
			System.out.println("Voce não pode iniciar uma conta com este número de conta!");
			return;
		}

		System.out.println("Conta criada com sucesso!");
	}

	public void deposito(double valor) {
		if (valor <= 0) {
			System.out.println("Voce não pode depositar este valor!");
			return;
		}
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposito(valor);
			return true;
		}
		return false;

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}
	
	public int getAgencia(){
        return this.agencia;
    }

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void getDadosConta() {
		System.out.println("---------------------------DADOS CONTA---------------------------");
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo: R$" + this.saldo);
		this.titular.getDadosCliente();

	}

	public static int getTotal() {
		return Conta.total;
	}

}
