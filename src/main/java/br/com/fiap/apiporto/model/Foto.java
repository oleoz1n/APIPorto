package br.com.fiap.apiporto.model;

import java.sql.Date;
import java.sql.Blob;

public class Foto {
	private Date dtFoto;
	private String dsFoto;
	private Blob fotoFrente;
	private Blob fotoLado;

	public Date getDtFoto() {
		return dtFoto;
	}
	public void setDtFoto(Date dtFoto) {
		this.dtFoto = dtFoto;
	}
	public String getDsFoto() {
		return dsFoto;
	}
	public void setDsFoto(String dsFoto) {
		this.dsFoto = dsFoto;
	}
	public Blob getFotoFrente() {
		return fotoFrente;
	}
	public void setFotoFrente(Blob fotoFrente) {
		this.fotoFrente = fotoFrente;
	}
	public Blob getFotoLado() {
		return fotoLado;
	}
	public void setFotoLado(Blob fotoLado) {
		this.fotoLado = fotoLado;
	}
	public Foto(Date dtFoto, String dsFoto, Blob fotoFrente, Blob fotoLado) {
		super();
		this.dtFoto = dtFoto;
		this.dsFoto = dsFoto;
		this.fotoFrente = fotoFrente;
		this.fotoLado = fotoLado;
	}
	public Foto() {
		super();
	}
	
	
	
}
