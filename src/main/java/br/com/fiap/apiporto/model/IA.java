package br.com.fiap.apiporto.model;

public class IA {
	
	private Foto foto;
	private Vistoria vistoria;
	private BikeIA bike;
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
	public BikeIA getBike() {
		return bike;
	}
	public void setBike(BikeIA bike) {
		this.bike = bike;
	}
	public IA(Foto foto, Vistoria vistoria, BikeIA bike) {
		super();
		this.foto = foto;
		this.vistoria = vistoria;
		this.bike = bike;
	}
	public IA() {
		super();
	}
	
}
