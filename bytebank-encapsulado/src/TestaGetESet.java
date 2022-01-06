import java.util.*;

public class TestaGetESet {

	public static void main(String[] args) {
		System.out.println("Olá seja bem-vindo ao Byte Bank!");
		Scanner entrada = new Scanner(System.in);
		Cliente cliente = new Cliente();

		System.out.println("Informe seu numero de conta e digito respectivamente");
		Conta conta = new Conta(entrada.nextInt(), entrada.nextInt());
		conta.setTitular(cliente);
		System.out.print("Informe seu nome completo: ");
		cliente.seterNome(entrada.nextLine());

		// System.out.println(conta.getTitular().getNome()); ACESSA O LOCAL TITULAR E EM
		// SEGUIDA ACESSA O LOCAL CLIENTE
		System.out.print("Informe sua profissão: ");
		conta.getTitular().seterProfissao(entrada.nextLine());
		System.out.print("Informe seu CPF: ");
		conta.getTitular().seterCpf(entrada.nextLine());
		// conta.getTitular().getDadosCliente(); ACESSA SOMENTE DADOS DO CLIENTE
//		conta.getDadosConta();
//		Conta conta2 = new Conta(2514, 2017890);
//		Conta conta3 = new Conta(2574, 20157100);
		// System.out.println("O total de conta é: " + Conta.getTotal());
		conta.getDadosConta();
		conta.getTitular().getNome();

	}
}
