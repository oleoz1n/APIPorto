package br.com.fiap.apiporto.model;

public class Marca {
	@Override
	public String toString() {
		return "Marca [cdMarca=" + cdMarca + ", nmMarca=" + nmMarca + "]";
	}
	private int cdMarca;
	private String nmMarca;
	
	public int getCdMarca() {
		return cdMarca;
	}
	public void setCdMarca(int cdMarca) {
		this.cdMarca = cdMarca;
	}
	public String getNmMarca() {
		return nmMarca;
	}
	public void setNmMarca(String nmMarca) {
		this.nmMarca = nmMarca;
	}
	public Marca(int cdMarca, String nmMarca) {
		super();
		this.cdMarca = cdMarca;
		this.nmMarca = nmMarca;
	}
	public Marca() {
		super();
	}
	
	
}
