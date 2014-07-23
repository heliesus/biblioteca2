package br.ifrn.tads.poo.acervo;

public class Texto extends ItemAcervo  {
	public Texto(double custo, int codigoItem, boolean pago) {
		super(custo, codigoItem, pago);
		// TODO Auto-generated constructor stub
	}

	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
