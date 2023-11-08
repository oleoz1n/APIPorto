package br.com.fiap.apiporto.model;

public class Bicicleta {
	private int cdBicicleta;
	private int cdCliente;
	private int cdCor;
	private int cdModelo;
	private String cdSerie;
	private double vlBicicleta;
	private String tpBicicleta;
	
	
	public int getCdBicicleta() {
		return cdBicicleta;
	}
	public void setCdBicicleta(int cdBicicleta) {
		this.cdBicicleta = cdBicicleta;
	}
	public int getCdCliente() {
		return cdCliente;
	}
	public void setCdCliente(int cdCliente) {
		this.cdCliente = cdCliente;
	}
	public int getCdCor() {
		return cdCor;
	}
	public void setCdCor(int cdCor) {
		this.cdCor = cdCor;
	}
	public int getCdModelo() {
		return cdModelo;
	}
	public void setCdModelo(int cdModelo) {
		this.cdModelo = cdModelo;
	}
	public String getCdSerie() {
		return cdSerie;
	}
	public void setCdSerie(String cdSerie) {
		this.cdSerie = cdSerie;
	}
	public double getVlBicicleta() {
		return vlBicicleta;
	}
	public void setVlBicicleta(double vlBicicleta) {
		this.vlBicicleta = vlBicicleta;
	}
	public String getTpBicicleta() {
		return tpBicicleta;
	}
	public void setTpBicicleta(String tpBicicleta) {
		this.tpBicicleta = tpBicicleta;
	}
	public Bicicleta(int cdBicicleta, int cdCliente, int cdCor, int cdModelo, String cdSerie, double vlBicicleta,
			String tpBicicleta) {
		super();
		this.cdBicicleta = cdBicicleta;
		this.cdCliente = cdCliente;
		this.cdCor = cdCor;
		this.cdModelo = cdModelo;
		this.cdSerie = cdSerie;
		this.vlBicicleta = vlBicicleta;
		this.tpBicicleta = tpBicicleta;
	}
	public Bicicleta() {
		super();
	}
	
}
