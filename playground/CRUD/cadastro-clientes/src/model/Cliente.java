package model;
	
public class Cliente {

	private String nome;
	private String profissao;
	private String cpf;

	public Cliente(String nome, String profissao, String cpf) {
		this.nome = nome;
		this.profissao = profissao;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		// Criar controle de CPF
		this.cpf = cpf;
	}
}
