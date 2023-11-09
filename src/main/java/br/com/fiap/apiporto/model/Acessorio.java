package br.com.fiap.apiporto.model;

public class Acessorio {
	private int cdAcessorio;
	private int cdModelo;
	private int cdBicicleta;
	private String nmAcessorio;
	
	

	public Acessorio(int cdAcessorio, int cdModelo, int cdBicicleta, String nmAcessorio) {
		super();
		this.cdAcessorio = cdAcessorio;
		this.cdModelo = cdModelo;
		this.cdBicicleta = cdBicicleta;
		this.nmAcessorio = nmAcessorio;
	}



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



	public int getCdBicicleta() {
		return cdBicicleta;
	}



	public void setCdBicicleta(int cdBicicleta) {
		this.cdBicicleta = cdBicicleta;
	}



	public String getNmAcessorio() {
		return nmAcessorio;
	}



	public void setNmAcessorio(String nmAcessorio) {
		this.nmAcessorio = nmAcessorio;
	}



	public Acessorio() {
		super();
	}
	
	
}
