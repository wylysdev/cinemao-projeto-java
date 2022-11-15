package br.com.app;

public class Filme {

	private String nome;
	private Integer ano;
	private Double duracao; //minutos
	private Humano nomeDiretor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Double getDuracao() {
		return duracao;
	}

	public void setDuracao(Double duracao) {
		this.duracao = duracao;
	}

	public Humano getNomeDiretor() {
		return nomeDiretor;
	}

	public void setNomeDiretor(Humano nomeDiretor) {
		this.nomeDiretor = nomeDiretor;
	}
}
