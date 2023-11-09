package br.com.fiap.apiporto.model;

public class Bicicleta {
	
	private int cdBicicleta;
	private int cdCliente;
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
	public Bicicleta(String cdSerie, double vlBicicleta, String tpBicicleta) {
		super();
		this.cdSerie = cdSerie;
		this.vlBicicleta = vlBicicleta;
		this.tpBicicleta = tpBicicleta;
	}
	public Bicicleta() {
		super();
	}
	@Override
	public String toString() {
		return "Bicicleta [cdBicicleta=" + cdBicicleta + ", cdCliente=" + cdCliente + ", cdModelo=" + cdModelo
				+ ", cdSerie=" + cdSerie + ", vlBicicleta=" + vlBicicleta + ", tpBicicleta=" + tpBicicleta + "]";
	}
	
}
