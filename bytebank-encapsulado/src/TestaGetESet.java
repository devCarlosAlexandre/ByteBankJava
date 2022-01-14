import java.util.*;

public class TestaGetESet {

	public static void main(String[] args) {
		System.out.println("Olá seja bem-vindo ao Byte Bank!");
		Scanner entrada = new Scanner(System.in);
		// criando objeto do tipo cliente
		Cliente cliente = new Cliente();

		// criando objeto do tipo conta
		System.out.println("Informe numero da sua conta");
		int numeroConta = entrada.nextInt();

		System.out.println("Informe digito da sua conta");
		int digitoConta = entrada.nextInt();
		Conta conta = new ContaCorrente(numeroConta, digitoConta);
		//setando dados cliente
		cliente.seterNome(entrada.nextLine());
		System.out.println(cliente.getNome());

		conta.setTitular(cliente);
		System.out.println("Informe seu nome completo: ");
		String nomeCliente = entrada.nextLine();
		conta.getTitular().seterNome(nomeCliente);

		System.out.println("Informe sua profissão: ");
		conta.getTitular().seterProfissao(entrada.nextLine());

		System.out.println("Informe seu CPF: ");
		conta.getTitular().seterCpf(entrada.nextLine());

		conta.getDadosConta();

	}
}
