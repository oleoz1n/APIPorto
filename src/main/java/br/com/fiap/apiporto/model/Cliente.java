package br.com.fiap.apiporto.model;

import java.sql.Date;

public class Cliente {
	private int cdCliente;
	private String nm_cliente;
	private Date dtNascimento;
	private String rg;
	private String cpf;
	private String telefone;
	private String cep;
	private String dsEndereco;
	private String dsEmail;
	private String tpSeguro;
	
	public int getCdCliente() {
		return cdCliente;
	}
	public void setCdCliente(int cdCliente) {
		this.cdCliente = cdCliente;
	}
	public String getNm_cliente() {
		return nm_cliente;
	}
	public void setNm_cliente(String nm_cliente) {
		this.nm_cliente = nm_cliente;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getDsEndereco() {
		return dsEndereco;
	}
	public void setDsEndereco(String dsEndereco) {
		this.dsEndereco = dsEndereco;
	}
	public String getDsEmail() {
		return dsEmail;
	}
	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}
	public String getTpSeguro() {
		return tpSeguro;
	}
	public void setTpSeguro(String tpSeguro) {
		this.tpSeguro = tpSeguro;
	}
	public Cliente(int cdCliente, String nm_cliente, Date dtNascimento, String rg, String cpf, String telefone,
			String cep, String dsEndereco, String dsEmail, String tpSeguro) {
		super();
		this.cdCliente = cdCliente;
		this.nm_cliente = nm_cliente;
		this.dtNascimento = dtNascimento;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cep = cep;
		this.dsEndereco = dsEndereco;
		this.dsEmail = dsEmail;
		this.tpSeguro = tpSeguro;
	}
	public Cliente() {
		super();
	}
	
}
