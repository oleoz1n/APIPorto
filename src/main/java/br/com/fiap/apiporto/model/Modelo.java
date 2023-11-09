package br.com.fiap.apiporto.model;

public class Modelo {
	
	private int cdModelo;
	private int cdMarca;
	private Long nrModelo;
	private String nmModelo;
	
	public String getNmModelo() {
		return nmModelo;
	}
	public void setNmModelo(String nmModelo) {
		this.nmModelo = nmModelo;
	}
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
	public Long getNrModelo() {
		return nrModelo;
	}
	public void setNrModelo(Long nrModelo) {
		this.nrModelo = nrModelo;
	}
		
	public Modelo(Long nrModelo, String nmModelo) {
		super();
		this.nrModelo = nrModelo;
		this.nmModelo = nmModelo;
	}
	
	public Modelo() {
		super();
	}
	@Override
	public String toString() {
		return "Modelo [cdModelo=" + cdModelo + ", cdMarca=" + cdMarca + ", nrModelo=" + nrModelo + "]";
	}
		
}
