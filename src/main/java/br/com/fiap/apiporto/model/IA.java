package br.com.fiap.apiporto.model;

public class IA {
	@Override
	public String toString() {
		return "IA [foto=" + foto + ", vistoria=" + vistoria + "]";
	}
	private Foto foto;
	private Vistoria vistoria;
	public Foto getFoto() {
		return foto;
	}
	public void setFoto(Foto foto) {
		this.foto = foto;
	}
	public Vistoria getVistoria() {
		return vistoria;
	}
	public void setVistoria(Vistoria vistoria) {
		this.vistoria = vistoria;
	}
	public IA(Foto foto, Vistoria vistoria) {
		super();
		this.foto = foto;
		this.vistoria = vistoria;
	}
	public IA() {
		super();
	}
	
}
