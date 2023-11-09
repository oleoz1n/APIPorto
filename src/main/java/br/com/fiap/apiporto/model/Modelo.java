package br.com.fiap.apiporto.model;

public class Modelo {
	
	private int cdModelo;
	private int cdMarca;
	private int nrModelo;
	
	public int getCdModelo() {
		return cdModelo;
	}
	public void setCdModelo(int cdModelo) {
		this.cdModelo = cdModelo;
	}
	public int getCdMarca() {
		return cdMarca;
	}
	public void setCdMarca(int cdMarca) {
		this.cdMarca = cdMarca;
	}
	public int getNrModelo() {
		return nrModelo;
	}
	public void setNrModelo(int nrModelo) {
		this.nrModelo = nrModelo;
	}
	public Modelo(int cdModelo, int cdMarca, int nrModelo) {
		super();
		this.cdModelo = cdModelo;
		this.cdMarca = cdMarca;
		this.nrModelo = nrModelo;
	}
	public Modelo() {
		super();
	}
		
}
