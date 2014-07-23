package br.ifrn.tads.usuario;

public class Usuario {
	private int codUsurio;
	private String nome;
	private String endereco;
	private String cpf;

	//--------------------- construtores ------------------//

	public Usuario(int codUsuario, String nome, String endereco, String cpf){

		this.codUsurio = codUsuario;
		this.cpf = cpf;
		this.endereco = endereco;
		this.nome = nome;
	}

	public void pagar(){

	}














	//-----------------------gets e sets ---------------------------------------------//

	public int getCodUsurio() {
		return codUsurio;
	}
	public void setCodUsurio(int codUsurio) {
		this.codUsurio = codUsurio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
