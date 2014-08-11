package br.ifrn.tads.app;

import java.util.Scanner;

import br.ifrn.tads.poo.biblioteca.Biblioteca;

public class Main {

	public static void main(String[]args){

		System.out.println("===========BEM VINDO AO SISTEMA BIBLIOTECARIO======== ");

		System.out.println("digite 1 admistrador....!");
		System.out.println("Digite 2 usuario....!");

		Scanner m = new Scanner(System.in);
		int opcao = m.nextInt();
		switch (opcao) {

		case 1:
			Biblioteca biblioteca = new Biblioteca();
			biblioteca.adiministrador();
			break;

		case 2:
			Biblioteca biblioteca1 = new Biblioteca();
			biblioteca1.usuario();
			break;

		case 3:
			Biblioteca biblioteca3 = new Biblioteca();
			biblioteca3.cadastrarItem();
			break;
			
		case 4:
			Biblioteca biblioteca4 = new Biblioteca();
			biblioteca4.livro();

		case 5:
			Biblioteca biblioteca5 = new Biblioteca();
			biblioteca5.fazercadastro();
		default:
			break;
			

		}
	}
}
