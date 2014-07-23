package br.ifrn.tads.poo.acervo;
import java.util.Date;

public abstract class ItemAcervo {
	private double custo;
	private Date dataAluguel;
	private Date dataDevolucao;
	private int codigoItem;
	private boolean pago;
	
//--------------------------------contrutores------------------------------------------------//
	
	public ItemAcervo(double custo, int codigoItem, boolean pago){
		this.codigoItem = codigoItem;
		this.custo = custo;
		this.pago = pago;
	}
	
//------------------------maximo e minimo de livros que pode pegar -------------------------//
	public int getContaMaxima(){
		return 2;
	}
	public int getconntaMaximo(){
		return 4;
	}
	
//--------------------------devolver o livro------------------------------------------------//
	
	public double devolver(){
		return getContaMaxima();
	}
//-------------------------------gets e sets ------------------------------------------------//
	
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public Date getDataAluguel() {
		return dataAluguel;
	}
	public void setDataAluguel(Date dataAluguel) {
		this.dataAluguel = dataAluguel;
	}
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public int getCodigoItem() {
		return codigoItem;
	}
	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
}
