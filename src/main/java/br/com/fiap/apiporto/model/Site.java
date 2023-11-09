package br.com.fiap.apiporto.model;

public class Site {
	private Acessorio acessorio;
	private Bicicleta bicicleta;
	private Cliente cliente;
	private Marca marca;
	private Modelo modelo;
	
	@Override
	public String toString() {
		return "Site [acessorio=" + acessorio + ", bicicleta=" + bicicleta + ", cliente=" + cliente + ", marca=" + marca
				+ ", modelo=" + modelo + "]";
	}
	public Acessorio getAcessorio() {
		return acessorio;
	}
	public void setAcessorio(Acessorio acessorio) {
		this.acessorio = acessorio;
	}
	public Bicicleta getBicicleta() {
		return bicicleta;
	}
	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	public Site(Acessorio acessorio, Bicicleta bicicleta, Cliente cliente, Marca marca, Modelo modelo) {
		super();
		this.acessorio = acessorio;
		this.bicicleta = bicicleta;
		this.cliente = cliente;
		this.marca = marca;
		this.modelo = modelo;
	}
	public Site() {
		super();
	}
	
	
	
}
