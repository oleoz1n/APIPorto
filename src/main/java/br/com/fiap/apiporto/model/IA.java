package br.com.fiap.apiporto.model;

public class IA {
	
	private Vistoria vistoria;
	private BikeIA bike;
	private Foto foto;
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
	public Foto getFoto() {
		return foto;
	}
	public void setFoto(Foto foto) {
		this.foto = foto;
	}
	public IA(Vistoria vistoria, BikeIA bike, Foto foto) {
		super();
		this.vistoria = vistoria;
		this.bike = bike;
		this.foto = foto;
	}
	public IA() {
		super();
	}
	
}
