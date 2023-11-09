package br.com.fiap.apiporto.model;

import java.sql.Date;

public class Vistoria {
	private Date dtVistoria;
	private String dsResultado;
	
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
	public Vistoria( Date dtVistoria, String dsResultado) {
		super();
		this.dtVistoria = dtVistoria;
		this.dsResultado = dsResultado;
	}
	public Vistoria() {
		super();
	}
	
}
