package br.ifrn.tads.poo.acervo;

public class Apostila extends ItemAcervo  {
	public Apostila(double custo, int codigoItem, boolean pago) {
		super(custo, codigoItem, pago);
		// TODO Auto-generated constructor stub
	}
	private String titulo;
	private String autor;
	private int quantidade;

	//--------------------------gets e sets ----------------------------------//
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
