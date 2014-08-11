package br.ifrn.tads.poo.acervo;

public class Livro extends ItemAcervo {

	public Livro(double custo, int codigoItem, boolean pago) {
		super(custo, codigoItem, pago);
		// TODO Auto-generated constructor stub
	}
	private String titulo;
	private String autor;
	private String isbn;
	private Integer edicao;
	private int quantidade;
	
//--------------------------------gets e sets -------------------------------------------//
	
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
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Integer getEdicao() {
		return edicao;
	}
	public void setEdicao(Integer edicao) {
		this.edicao = edicao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
