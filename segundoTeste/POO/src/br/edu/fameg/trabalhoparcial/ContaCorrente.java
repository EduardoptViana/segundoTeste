package br.edu.fameg.trabalhoparcial;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class ContaCorrente {
	protected int numero;
	protected String agencia;
	protected Correntista correntista;
	protected double saldo;
	protected String diretorioExtrato;

	public ContaCorrente(int numero, String agencia, Correntista correntista) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.correntista = correntista;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getDiretorioExtrato() {
		return diretorioExtrato;
	}

	public void setDiretorioExtrato(String diretorioExtrato) {
		File testeDir = new File(diretorioExtrato);

		if (testeDir.exists()) {
			this.diretorioExtrato = diretorioExtrato;
		} else {
			this.diretorioExtrato = System.getProperty("user.dir");
		}
	}

	@Override
	public String toString() {
		return "ContaCorrente [numero=" + numero + ", agencia=" + agencia + "]";
	}

	public void efetuarDeposito(double valorDeposito) throws IOException {

		double novoSaldo = getSaldo() + valorDeposito;
		this.setSaldo(novoSaldo);

		String observacao = "Dep�sito de R$" + valorDeposito;
		gravarExtrato(observacao);
	}

	protected void gravarExtrato(String mensagem) throws IOException {
		Date data = new Date();
		SimpleDateFormat ddmmaaaa = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

		Extrato extrato = new Extrato(this, ddmmaaaa.format(data), mensagem,
				this.getSaldo());
		extrato.gravarExtrato();
	}

	public abstract void efetuarSaque(double valorSaque) throws IOException;

	public abstract void efetuarTransferencia(ContaCorrente contaDestino,
			double valorTransferencia) throws IOException;

	protected boolean saldoInsuficiente(double saldo) {
		return (saldo < 0);
	}

	public void deletarExtrato() throws IOException {
		Extrato extrato = new Extrato(this);
		extrato.deletarExtrato();
	}

	public void imprimirExtrato() throws IOException {
		Extrato extrato = new Extrato(this);
		extrato.imprimirExtrato();
	}
}