package br.com.fiap.apiporto.model;

public class BikeIA {
	
	private String cdSerie;
	private String nmMarca;
	private String nmModelo;
	
	public BikeIA() {
		super();
	}
	public BikeIA(String cdSerie, String nmMarca, String nmModelo) {
		super();
		this.cdSerie = cdSerie;
		this.nmMarca = nmMarca;
		this.nmModelo = nmModelo;
	}
	public String getCdSerie() {
		return cdSerie;
	}
	public void setCdSerie(String cdSerie) {
		this.cdSerie = cdSerie;
	}
	public String getNmMarca() {
		return nmMarca;
	}
	public void setNmMarca(String nmMarca) {
		this.nmMarca = nmMarca;
	}
	public String getNmModelo() {
		return nmModelo;
	}
	public void setNmModelo(String nmModelo) {
		this.nmModelo = nmModelo;
	}
	
	

}
