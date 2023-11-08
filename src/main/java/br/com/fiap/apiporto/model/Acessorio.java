package br.com.fiap.apiporto.model;

public class Acessorio {
	private int cdAcessorio;
	private int cdModelo;
	private String nmAcessorio;
	
	
	public int getCdAcessorio() {
		return cdAcessorio;
	}
	public void setCdAcessorio(int cdAcessorio) {
		this.cdAcessorio = cdAcessorio;
	}
	public int getCdModelo() {
		return cdModelo;
	}
	public void setCdModelo(int cdModelo) {
		this.cdModelo = cdModelo;
	}
	public String getNmAcessorio() {
		return nmAcessorio;
	}
	public void setNmAcessorio(String nmAcessorio) {
		this.nmAcessorio = nmAcessorio;
	}
	public Acessorio(int cdAcessorio, int cdModelo, String nmAcessorio) {
		super();
		this.cdAcessorio = cdAcessorio;
		this.cdModelo = cdModelo;
		this.nmAcessorio = nmAcessorio;
	}
	public Acessorio() {
		super();
	}
	
	
}
