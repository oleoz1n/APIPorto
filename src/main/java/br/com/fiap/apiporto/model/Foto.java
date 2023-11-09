package br.com.fiap.apiporto.model;

import java.sql.Date;

public class Foto {
	private String dsFoto;
	private Date dtFoto;
	
	public String getDsFoto() {
		return dsFoto;
	}
	public void setDsFoto(String dsFoto) {
		this.dsFoto = dsFoto;
	}
	public Date getDtFoto() {
		return dtFoto;
	}
	public void setDtFoto(Date dtFoto) {
		this.dtFoto = dtFoto;
	}
	
	
	public Foto() {
		super();
	}

}
