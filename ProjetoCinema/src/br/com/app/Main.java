package br.com.app;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		// ======================== DADOS EXEMPLOS ========================

		Scanner scanner = new Scanner(System.in);

		Cliente clienteDiretor = new Cliente();
		// SET DIRETOR 1 (5)
		clienteDiretor.setCpf(555555);
		clienteDiretor.setIdade(38);
		clienteDiretor.setNome("Will Smith");
		clienteDiretor.setQuantidade_transacoes(0);
		clienteDiretor.setValor_total_gasto(0.0);

		// SET CLIENTE 1 (5)
		Cliente cliente1 = new Cliente();

		cliente1.setCpf(444444);
		cliente1.setIdade(24);
		cliente1.setNome("Antonio Silva");
		cliente1.setQuantidade_transacoes(3);
		cliente1.setValor_total_gasto(40.0);

		// SET FILME 1 (4)
		Filme filme1 = new Filme();
		filme1.setNome("A bela e Fera");
		filme1.setAno(2001);
		filme1.setDuracao(200.0);
		filme1.setNomeDiretor(clienteDiretor);

		// SET FILME 2 (4)
		Filme filme2 = new Filme();
		filme2.setNome("Nope (Não! Não Olhe!)");
		filme2.setAno(2022);
		filme2.setDuracao(158.0);
		filme2.setNomeDiretor(clienteDiretor);

		// SET SALA 1 (2)
		Sala sala1 = new Sala();
		sala1.setId(1);
		sala1.setQtdCadeiras(40);

		// SET CINEMA 1 (2)

		Cinema cinema1 = new Cinema();
		Ingresso ingresso1 = cinema1.transacao(cliente1, filme1, sala1);

		// INGRESSO EXEMPLO
		monstrar_comprovante_ingresso(ingresso1);

		// ======================== COMPRE INGRESSO DO SEU FILME
		// ========================

		System.out.println("\n");

		System.out.println("=> AGORA EH HORA DE VOCÊ COMPRAR O SEU INGRESSO");

		// SEUS DADOS
		System.out.println("DIGITE SEU CPF \n");
		Integer cpf = scanner.nextInt();
		
		System.out.println("DIGITE SEU NOME \n");
		String nome_user = scanner.next();

		System.out.println("DIGITE SUA IDADE \n");
		Integer idade = scanner.nextInt();

		System.out.println("DIGITE QUANTAS VEZES JA COMPROU INGRESSOS \n");
		Integer qtd_transacoes = scanner.nextInt();

		Cliente voce_user = new Cliente();

		voce_user.setCpf(cpf);
		voce_user.setIdade(idade);
		voce_user.setNome(nome_user);
		voce_user.setQuantidade_transacoes(qtd_transacoes);
		voce_user.setValor_total_gasto(qtd_transacoes * 20.0); // considerando que um ingresso eh 20,

		// ESCOLHA SUA SEÇÃO E CADEIRA

		System.out.println("DIGITE O NÚMERO DA SALA DO FILME \n");
		Integer n_sala = scanner.nextInt();

		System.out.println("DIGITE A CADEIRA ESCOLHIDA \n");
		Integer n_cadeira = scanner.nextInt();

		Sala sala_escolhida = new Sala();
		sala_escolhida.setId(n_sala);
		sala_escolhida.setQtdCadeiras(n_cadeira);

		Ingresso ingresso2 = cinema1.transacao(voce_user, filme2, sala_escolhida);
		monstrar_comprovante_ingresso(ingresso2);

		scanner.close();

	}

	public static void monstrar_comprovante_ingresso(Ingresso ingresso) {
		System.out.println("======= COMPROVANTE DE PAGAMENTO INGRESSO =======\n");
		System.out.println("     Parabéns pela a compra "+ingresso.getNomeCliente()+". Tenha um bom Filme!\n");
		System.out.println("     " + ingresso.getFilme() + " 2D DUBLADO");
		System.out.println("     SALA: " + ingresso.getSala() + " | CADEIRA: " + ingresso.getCadeira + "\n");
		System.out.println(
				"     PAGAMENTO: " + ingresso.getStatusPagamento() + " | VALOR: " + ingresso.getPreco() + "\n");
		System.out.println("======= Petrolina - " + ingresso.getCinema() + " - " + ingresso.getData() + " =======");
	}
}
