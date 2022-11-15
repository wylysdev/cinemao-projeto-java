package br.com.app;

public class Cinema implements CinemaImpl {

	Cinema(){
		this.cnpj = 222222;
		this.nomeFantasia = "CINEMARK";
	}
	private Integer cnpj;
	private String nomeFantasia;

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	@Override
	public Ingresso transacao(Cliente cliente, Filme filme, Sala sala) {
		Ingresso comprovante_ingresso = new Ingresso();
		comprovante_ingresso.setId(1);
		comprovante_ingresso.setData("14/11/22");
		comprovante_ingresso.setFilme(filme.getNome());
		comprovante_ingresso.setSala(sala.getId());
		comprovante_ingresso.setCadeira(sala.getQtdCadeiras());
		comprovante_ingresso.setPreco(20.0);
		comprovante_ingresso.setStatusPagamento("APROVADO");
		comprovante_ingresso.setCinema(this.nomeFantasia);
		comprovante_ingresso.setNomeCliente(cliente.getNome());
		return comprovante_ingresso;
	}
	
	
}
