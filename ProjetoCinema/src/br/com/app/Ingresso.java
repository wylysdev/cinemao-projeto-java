package br.com.app;

import java.text.SimpleDateFormat;

public class Ingresso {

	private Integer id;
	private String data;
	private Filme filme;
	private Sala sala;
	private Sala cadeira;
	private Double preco;
	private String statusPagamento;
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

}
