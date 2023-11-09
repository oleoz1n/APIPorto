package br.com.fiap.apiporto.model;

public class Bicicleta {
	private String cdSerie;
	private double vlBicicleta;
	private String tpBicicleta;
	
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
	public Bicicleta(String cdSerie, double vlBicicleta, String tpBicicleta) {
		super();
		this.cdSerie = cdSerie;
		this.vlBicicleta = vlBicicleta;
		this.tpBicicleta = tpBicicleta;
	}
	public Bicicleta() {
		super();
	}
	
}
