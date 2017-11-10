package polimorfismo.exemplo2;

public class DescontoBolsaFamilia extends Desconto {

	@Override
	public double calcularDesconto(double valor) {

		return valor - (valor * 0.2);
	}

}
