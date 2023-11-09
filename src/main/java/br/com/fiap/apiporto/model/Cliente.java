package br.com.fiap.apiporto.model;

import java.sql.Date;

public class Cliente {
	@Override
	public String toString() {
		return "Cliente [cdCliente=" + cdCliente + ", nmCliente" + nmCliente + ", dtNascimento=" + dtNascimento
				+ ", rg=" + rg + ", cpf=" + cpf + ", telefone=" + telefone + ", cep=" + cep + ", dsEndereco="
				+ dsEndereco + ", dsEmail=" + dsEmail + "]";
	}
	private int cdCliente;
	private String nmCliente;
	private Date dtNascimento;
	private String rg;
	private String cpf;
	private String telefone;
	private String cep;
	private String dsEndereco;
	private String dsEmail;
	
	public int getCdCliente() {
		return cdCliente;
	}
	public void setCdCliente(int cdCliente) {
		this.cdCliente = cdCliente;
	}
	public String getNmCliente() {
		return nmCliente;
	}
	public void setNmCliente(String nmCliente) {
		this.nmCliente = nmCliente;
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
	public Cliente(int cdCliente, String nmCliente, Date dtNascimento, String rg, String cpf, String telefone,
			String cep, String dsEndereco, String dsEmail) {
		super();
		this.cdCliente = cdCliente;
		this.nmCliente = nmCliente;
		this.dtNascimento = dtNascimento;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cep = cep;
		this.dsEndereco = dsEndereco;
		this.dsEmail = dsEmail;
	}
	
	public Cliente(String nmCliente, Date dtNascimento, String rg, String cpf, String telefone,
			String cep, String dsEndereco, String dsEmail) {
		super();
		this.nmCliente = nmCliente;
		this.dtNascimento = dtNascimento;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cep = cep;
		this.dsEndereco = dsEndereco;
		this.dsEmail = dsEmail;
	}
	
	public Cliente() {
		super();
	}
	
}
