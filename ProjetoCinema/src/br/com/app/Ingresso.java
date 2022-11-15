package br.com.app;

import java.text.SimpleDateFormat;

public class Ingresso {

	private Integer id;
	private String data;
	private String filme;
	private Integer sala;
	private Integer cadeira;
	private Double preco;
	private String statusPagamento;
	private String cinema;
	private String nomeCliente;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getFilme() {
		return filme;
	}

	public void setFilme(String filme) {
		this.filme = filme;
	}

	public Integer getSala() {
		return sala;
	}

	public void setSala(Integer sala) {
		this.sala = sala;
	}

	public Integer getCadeira() {
		return cadeira;
	}

	public void setCadeira(Integer cadeira) {
		this.cadeira = cadeira;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getStatusPagamento() {
		return statusPagamento;
	}

	public String getCinema() {
		return cinema;
	}

	public void setCinema(String cinema) {
		this.cinema = cinema;
	}

	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	public SimpleDateFormat getFormatter() {
		return formatter;
	}

	public void setFormatter(SimpleDateFormat formatter) {
		this.formatter = formatter;
	}

}
