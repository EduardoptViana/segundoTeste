package exemplo.interfaces;

public class Contratante implements Contrato, Impressora {

	@Override
	public String cumpreContrato() {

		return null;
	}

	@Override
	public int cumpreOutroContrato() {

		return 0;
	}

	@Override
	public void imprime() {

	}

	public void doStuff() {
	}
}
