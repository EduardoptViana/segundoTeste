package abstractfactory;

public class DonCorleone extends PizzaFactory {

	@Override
	public Molho criarMolho() {

		return new MolhoApimentado();
	}

	@Override
	public Massa criarMassa() {
		return new MassaFina();
	}

}
