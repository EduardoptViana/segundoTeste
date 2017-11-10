package br.edu.fameg.trabalhoparcial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Extrato {
	private ContaCorrente conta;
	private String dataCompleta;
	private String mensagem;
	private double saldoHistorico;

	public Extrato(ContaCorrente conta, String dataCompleta, String mensagem,
			double saldoHistorico) {
		super();
		this.conta = conta;
		this.dataCompleta = dataCompleta;
		this.mensagem = mensagem;
		this.saldoHistorico = saldoHistorico;
	}

	public Extrato(ContaCorrente conta) {
		super();
		this.conta = conta;
	}

	public ContaCorrente getConta() {
		return conta;
	}

	public String getDataCompleta() {
		return dataCompleta;
	}

	public String getMensagem() {
		return mensagem;
	}

	public double getSaldoHistorico() {
		return saldoHistorico;
	}

	public void gravarExtrato() throws IOException {
		File arq = new File(this.getConta().getDiretorioExtrato(), this
				.getConta().getAgencia()
				+ "-"
				+ this.getConta().getNumero()
				+ ".txt");

		FileWriter gravarArq = new FileWriter(arq, true);

		gravarArq.write("(" + this.getDataCompleta() + ") "
				+ this.getMensagem() + " Saldo: R$" + this.getSaldoHistorico()
				+ " \n");
		gravarArq.close();
	}

	public void deletarExtrato() throws IOException {
		String nome = getConta().getDiretorioExtrato()
				+ getConta().getAgencia() + "-" + getConta().getNumero()
				+ ".txt";
		File f = new File(nome);
		f.delete();

		FileWriter gravarArq = new FileWriter(nome, true);

		gravarArq.write("Extrato da Ag/Conta " + getConta().getAgencia() + "-"
				+ getConta().getNumero() + " Titular: "
				+ getConta().correntista.getNome() + " \n");
		gravarArq.close();
	}

	public void imprimirExtrato() throws IOException {
		String nome = this.getConta().getDiretorioExtrato()
				+ this.getConta().getAgencia() + "-"
				+ this.getConta().getNumero() + ".txt";

		FileReader arq = new FileReader(nome);
		BufferedReader lerArq = new BufferedReader(arq);

		String[] arquivo = new String[100];

		boolean acabou = false;
		int linha = 0;
		do {
			String dadosLinha = lerArq.readLine();
			if (dadosLinha == null) {
				acabou = true;
			}

			linha++;
			arquivo[linha] = dadosLinha;
		} while (acabou == false);

		lerArq.close();

		System.out.println("Imprimindo Extrato da C/C: "
				+ this.getConta().getAgencia() + "-"
				+ this.getConta().getNumero() + " Titular: "
				+ this.getConta().correntista.getNome());

		for (int i = 0; i < arquivo.length; i++) {
			if (arquivo[i] != null) {
				System.out.println(arquivo[i]);
			}
		}
		System.out.println("\n");
	}
}
