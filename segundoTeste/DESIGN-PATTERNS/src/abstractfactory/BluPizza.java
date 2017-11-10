package abstractfactory;

public class BluPizza extends PizzaFactory {

	@Override
	public Molho criarMolho() {
		return new MolhoAdocicado();
	}

	@Override
	public Massa criarMassa() {
		return new MassaGrossa();
	}

}
