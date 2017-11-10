package br.edu.fameg.trabalhoparcial;

import java.io.IOException;

public class ContaRegular extends ContaCorrente {

	public ContaRegular(int numero, String agencia, Correntista correntista) {
		super(numero, agencia, correntista);
	}

	@Override
	public void efetuarSaque(double valorSaque) throws IOException {
		double novoSaldo = getSaldo() - valorSaque;
		if (saldoInsuficiente(novoSaldo)) {
			System.out.println("Saldo insuficiente");
		} else {
			setSaldo(novoSaldo);
		}

		String observacao = "Saque de R$" + valorSaque;
		gravarExtrato(observacao);
	}

	@Override
	public void efetuarTransferencia(ContaCorrente conta2,
			double valorTransferencia) throws IOException {

		double novoSaldo = getSaldo() - valorTransferencia;
		if (saldoInsuficiente(novoSaldo)) {
			System.out.println("Saldo insuficiente");
		} else {
			setSaldo(novoSaldo);

			double novoSaldo2 = conta2.getSaldo() + valorTransferencia;
			conta2.setSaldo(novoSaldo2);

			String observacao = "Transferido para Conta " + conta2.getNumero()
					+ " R$" + valorTransferencia;
			gravarExtrato(observacao);

			observacao = "Transferido da Conta " + this.getNumero() + " R$"
					+ valorTransferencia + "";
			conta2.gravarExtrato(observacao);
		}
	}

	public void imprimirSaldo() {
		System.out.println("Imprimindo Saldo da C/C: " + this.getAgencia()
				+ "-" + this.getNumero() + " Titular: "
				+ this.correntista.getNome());

		System.out.println("Saldo: " + this.getSaldo() + "\n");
	}

}
