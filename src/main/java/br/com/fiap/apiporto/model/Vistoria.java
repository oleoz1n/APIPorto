package br.com.fiap.apiporto.model;

import java.sql.Date;

public class Vistoria {
	private int cdVistoria;
	private int cdBicicleta;
	private Date dtVistoria;
	private String dsResultado;
	
	@Override
	public String toString() {
		return "Vistoria [cdVistoria=" + cdVistoria + ", cdBicicleta=" + cdBicicleta + ", dtVistoria=" + dtVistoria
				+ ", dsResultado=" + dsResultado + "]";
	}
	
	public int getCdVistoria() {
		return cdVistoria;
	}
	public void setCdVistoria(int cdVistoria) {
		this.cdVistoria = cdVistoria;
	}
	public int getCdBicicleta() {
		return cdBicicleta;
	}
	public void setCdBicicleta(int cdBicicleta) {
		this.cdBicicleta = cdBicicleta;
	}
	public Date getDtVistoria() {
		return dtVistoria;
	}
	public void setDtVistoria(Date dtVistoria) {
		this.dtVistoria = dtVistoria;
	}
	public String getDsResultado() {
		return dsResultado;
	}
	public void setDsResultado(String dsResultado) {
		this.dsResultado = dsResultado;
	}
	public Vistoria(int cdVistoria, int cdBicicleta, Date dtVistoria, String dsResultado) {
		super();
		this.cdVistoria = cdVistoria;
		this.cdBicicleta = cdBicicleta;
		this.dtVistoria = dtVistoria;
		this.dsResultado = dsResultado;
	}
	public Vistoria() {
		super();
	}
	
}
