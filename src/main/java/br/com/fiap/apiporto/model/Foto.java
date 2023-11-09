package br.com.fiap.apiporto.model;

import java.sql.Date;

public class Foto {
	
	private int cdFoto;
	private int cdVistoria;
	private Date dtFoto;
	private String dsFoto;
	private String nmArquivo;
	private String dsPath;
	
	
	public int getCdFoto() {
		return cdFoto;
	}
	public void setCdFoto(int cdFoto) {
		this.cdFoto = cdFoto;
	}
	public int getCdVistoria() {
		return cdVistoria;
	}
	public void setCdVistoria(int cdVistoria) {
		this.cdVistoria = cdVistoria;
	}
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
	public String getNmArquivo() {
		return nmArquivo;
	}
	public void setNmArquivo(String nmArquivo) {
		this.nmArquivo = nmArquivo;
	}
	public String getDsPath() {
		return dsPath;
	}
	public void setDsPath(String dsPath) {
		this.dsPath = dsPath;
	}
	public Foto(int cdFoto, int cdVistoria, Date dtFoto, String dsFoto, String nmArquivo, String dsPath) {
		super();
		this.cdFoto = cdFoto;
		this.cdVistoria = cdVistoria;
		this.dtFoto = dtFoto;
		this.dsFoto = dsFoto;
		this.nmArquivo = nmArquivo;
		this.dsPath = dsPath;
	}
	public Foto() {
		super();
	}
	
	
	
}
