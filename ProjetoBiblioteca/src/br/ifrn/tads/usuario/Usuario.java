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
		//this.nome = nome;
	}
//------------ verificar se o cpf e valido ----------------------------------------------//
	
	public class Pessoa{
		private String nome, cpf;
		public Pessoa(String nome, String cpf) throws Exception{
			if(cpf.length() != 11)
				throw new Exception("cpf deve conter 11 digitos");
			for(int i = 0; i < cpf.length(); i++){
				char c = cpf.charAt(i);
				if(!Character.isDigit(c))
					throw new Exception("cpf deve conter só digitos");
				this.cpf = cpf;
				this.nome = nome;
			}
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
