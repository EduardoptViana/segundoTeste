package br.edu.fameg.trabalhoparcial;

import java.io.IOException;

public class ContaGold extends ContaCorrente {

	public ContaGold(int numero, String agencia, Correntista correntista,
			double limiteSaque) {
		super(numero, agencia, correntista);
		this.limiteSaque = limiteSaque;
	}

	private double limiteSaque;

	public double getLimiteSaque() {
		return limiteSaque;
	}

	@Override
	public String toString() {
		return "ContaGold [limiteSaque= R$" + limiteSaque + ", numero="
				+ numero + ", agencia=" + agencia + "]";
	}

	@Override
	public void efetuarSaque(double valorSaque) throws IOException {
		if (saldoInsuficiente(getSaldo() - valorSaque)) {
			double valorExcedido = valorSaque - getSaldo();

			if (possueLimite(valorExcedido)) {
				finalizarSaque(valorSaque);
			} else {
				System.out.println("Limite Insuficiente para o Saque!");
			}
		} else {
			finalizarSaque(valorSaque);
		}
	}

	private void finalizarSaque(double valorSaque) throws IOException {
		setSaldo(getSaldo() - valorSaque);
		String observacao = "Saque de R$" + valorSaque;
		gravarExtrato(observacao);
	}

	private boolean possueLimite(double valorExcedido) {
		return valorExcedido <= getLimiteSaque();
	}

	@Override
	public void efetuarTransferencia(ContaCorrente conta2,
			double valorTransferencia) throws IOException {

		if (saldoInsuficiente(getSaldo() - valorTransferencia)) {
			double valorExcedido = valorTransferencia - getSaldo();

			if (possueLimite(valorExcedido)) {

				finalizarTransferencia(conta2, valorTransferencia);

			} else {
				System.out.println("Limite Insuficiente para a Transferencia!");
			}
		} else {
			finalizarTransferencia(conta2, valorTransferencia);
		}
	}

	private void finalizarTransferencia(ContaCorrente conta2,
			double valorTransferencia) throws IOException {

		setSaldo(getSaldo() - valorTransferencia);

		double novoSaldo2 = conta2.getSaldo() + valorTransferencia;
		conta2.setSaldo(novoSaldo2);

		String observacao = "Transferido para Conta " + conta2.getNumero()
				+ " R$" + valorTransferencia;
		gravarExtrato(observacao);

		observacao = "Transferido da Conta " + this.getNumero() + " R$"
				+ valorTransferencia;
		conta2.gravarExtrato(observacao);

	}

	public void imprimirSaldo() {
		System.out.println("Imprimindo Saldo da C/C: " + this.getAgencia()
				+ "-" + this.getNumero() + " Titular: "
				+ this.correntista.getNome());

		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Limite: " + this.getLimiteSaque() + "\n");
	}

}
