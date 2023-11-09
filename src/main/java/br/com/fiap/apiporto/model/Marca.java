package br.com.fiap.apiporto.model;

public class Marca {
	private String nmMarca;
	
	public String getNmMarca() {
		return nmMarca;
	}
	public void setNmMarca(String nmMarca) {
		this.nmMarca = nmMarca;
	}
	public Marca(String nmMarca) {
		super();
		this.nmMarca = nmMarca;
	}
	public Marca() {
		super();
	}
	
}
