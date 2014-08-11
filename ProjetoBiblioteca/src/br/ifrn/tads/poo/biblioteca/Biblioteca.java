package br.ifrn.tads.poo.biblioteca;

import java.util.Scanner;

public class Biblioteca {

	Scanner a = new Scanner(System.in);

	public void adiministrador(){
		System.out.println("============= bem vindo adiminidtrador  ========== ");
		System.out.println("============= escolha a opção que voce deseja ========== ");
		System.out.println("1 cadastrar Item");
		System.out.println("2 listar Acervo");
		System.out.println("3 listar Usuario ");
		System.out.println("4 listar listar itens Alugados ");//falta
		System.out.println("5 excluir item Acervo");
		System.out.println("6 excluir Usuario");//falta
		System.out.println("0 sair");

		//--------------  listar o menu de cadrastrar item --------------------------- //
		int	op = a.nextInt();	
		while (op != 0 ){
			switch (op) {
			case 1:
				cadastrarItem();
				break;

			default: 
				System.out.println("operaçao invalida");
				break;
			}
			break;
		} 
	}

	//-------------  menu usuario ------------- //

	public void usuario(){
		System.out.println("======================== o que voce deseja fazer ===================");
		System.out.println("1 fazer logim");
		System.out.println("2 cadastrar");
		System.out.println("0 sair");
		int c = a.nextInt();
		switch (c){
		case 1 :
			nome();
		case 2:
			cpf();
		default:
			break;	
		}
		System.out.print("============= cadastro fealizado com sucesso ========\n");
	}
	//----------------- menu item -------------------//

	public void cadastrarItem(){

		System.out.print("============= escolha uma das opções abaixo ========\n");
		System.out.println("1 Livro");
		System.out.println("2 apostila");
		System.out.println("0 sair");
		int ca = a.nextInt();

		switch (ca) {
		case 1:
			livro();
			break;
		case 2 :
			apostila();
		default:
			break;
		}
	}
	//------------------  menu livro -------------------------//
	public void livro(){
		System.out.print("============= digite que se pede ========\n");
		System.out.println("titulo");
		String titulo = a.next();
		System.out.println("autor");
		String autor = a.next();
		System.out.println("ISBN");
		String ISBN = a.next();
		System.out.println("editacao");
		String editacao = a.next();
		System.out.println("quantidade");
		String quantidade = a.next();
		System.out.println("livro cadrastrado com sucesso ... ");
	}
	//-----------------------  menu apostila -----------------------//
	public void apostila(){
		System.out.println(" titulo");
		String titulo = a.next();
		System.out.println(" autor");
		String autor = a.next();
		System.out.println(" quantidade");
		String quantidade = a.next();
		System.out.println("apostila cadrastrada com sucesso ... ");
	}
	//--------------------------------cadastro -------------------//

	public void fazercadastro() {
	}

	public void nome(){
		System.out.println("nome");
		String nome = a.next();
	}
	public void cpf(){
		System.out.println("cpf");
		String cpf = a.next();
	}
	public void c(){
		fazercadastro();
		int c = -1;
		while (c != 0 ){
			switch (c) {
			case 1:
				fazercadastro();
				break;

			default: 
				System.out.println("operaçao invalida");
				break;
			}
			break;
		} 
	}

	//----------- menu livro -------------------------//

	public void ca(){
		livro();
		int ca = -1;
		while (ca != 0 ){
			switch (ca) {
			case 1:
				cadastrarItem();
				break;

			default: 
				System.out.println("operaçao invalida");
				break;
			}
			break;
		} 
	}

	//-------------------gets e sets ---------------------------//
	private String nomedaBiblioteca;
	public String getNomedaBiblioteca() {
		return nomedaBiblioteca;
	}

	public void setNomedaBiblioteca(String nomedaBiblioteca) {
		this.nomedaBiblioteca = nomedaBiblioteca;
	}

}
