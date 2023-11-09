package br.com.fiap.apiporto.model;

public class Modelo {
	
	private Long nrModelo;
	private String nmModelo;
	
	public String getNmModelo() {
		return nmModelo;
	}
	public void setNmModelo(String nmModelo) {
		this.nmModelo = nmModelo;
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
}
