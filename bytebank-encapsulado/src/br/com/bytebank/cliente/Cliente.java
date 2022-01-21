package br.com.bytebank.cliente;

public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	
	// Seters---------------------------------------------------------------------------------------------

		public void seterNome(String nome) {
			this.nome = nome;
		}

		public void seterCpf(String cpf) {
			this.cpf = cpf;
		}

		public void seterProfissao(String profissao) {
			this.profissao = profissao;
		}
		
	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getProfissao() {
		return this.profissao;
	}

	// Geters----------------------------------------------------------------------------------------------
	public void getDadosCliente() {
		System.out.println("---------------------------DADOS CLIENTE---------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Profissão: " + this.profissao);
		System.out.println("CPF: " + this.cpf);
	}

}
