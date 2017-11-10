package br.edu.fameg.trabalhoparcial;

import java.io.IOException;

public class Testador {
	public static void main(String[] args) throws IOException {

		Correntista objCorrentista = new Correntista("Tiago", "085");
		ContaRegular objCC = new ContaRegular(1, "0045A", objCorrentista);

		objCC.setDiretorioExtrato("C:/Temp/");
		objCC.deletarExtrato();
		objCC.efetuarDeposito(1000);
		objCC.efetuarSaque(150);

		Correntista objCorrentista2 = new Correntista("Ana Paula", "089");
		ContaGold objCC2 = new ContaGold(2, "0045A", objCorrentista2, 100);

		objCC2.setDiretorioExtrato("C:/Temp/");
		objCC2.deletarExtrato();
		objCC.efetuarTransferencia(objCC2, 270.5);
		objCC2.efetuarSaque(300);
		objCC2.efetuarTransferencia(objCC, 20);
		objCC2.efetuarSaque(50.5);
		objCC2.efetuarDeposito(2000);

		objCC.imprimirExtrato();
		objCC2.imprimirExtrato();
		objCC.imprimirSaldo();
		objCC2.imprimirSaldo();

	}
}
