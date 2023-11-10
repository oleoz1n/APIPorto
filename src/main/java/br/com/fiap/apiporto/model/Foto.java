package br.com.fiap.apiporto.model;

import java.sql.Date;

public class Foto {
	private String dsFoto;
	private Date dtFoto;
	private String urlFoto;
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
	public String getUrlFoto() {
		return urlFoto;
	}
	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}
	public Foto(String dsFoto, Date dtFoto, String urlFoto) {
		super();
		this.dsFoto = dsFoto;
		this.dtFoto = dtFoto;
		this.urlFoto = urlFoto;
	}
	public Foto() {
		super();
	}

}
