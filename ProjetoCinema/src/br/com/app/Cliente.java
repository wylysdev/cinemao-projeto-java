package br.com.app;

public class Cliente extends Humano {
	private Integer quantidade_transacoes;
	private Double valor_total_gasto;

	Cliente() {
		quantidade_transacoes = 0;
		valor_total_gasto = 0.0;
	}

	public Integer getQuantidade_transacoes() {
		return quantidade_transacoes;
	}

	public void setQuantidade_transacoes(Integer quantidade_transacoes) {
		this.quantidade_transacoes = quantidade_transacoes;
	}

	public Double getValor_total_gasto() {
		return valor_total_gasto;
	}

	public void setValor_total_gasto(Double valor_total_gasto) {
		this.valor_total_gasto = valor_total_gasto;
	}
}