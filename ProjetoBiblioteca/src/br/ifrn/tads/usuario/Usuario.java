package br.ifrn.tads.usuario;

public class Usuario {
	private int codUsurio;
	private String nome;
	private String endereco;
	private String cpf;

	//-------------------------- construtores ------------------//

	public Usuario(int codUsuario, String nome, String endereco, String cpf)throws Exception {

		this.codUsurio = codUsuario;
		this.endereco = endereco;
		this.nome = nome;
		if(cpf.length() != 11)     //--------------------------------- vai verificar se o cpf e valido 
			throw new Exception("cpf deve conter 11 digitos");
		for(int i = 0; i < cpf.length(); i++){
			char c = cpf.charAt(i);
			if(!Character.isDigit(c))
				throw new Exception("cpf deve conter só numeros");
			this.cpf = cpf;
			this.nome = nome;
		}
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
